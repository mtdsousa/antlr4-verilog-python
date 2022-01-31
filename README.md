# ANTLR4 Verilog Grammar Files
Generated files from ANTLR4 for Verilog parsing

## Tutorial
Install this Python package
```
python3 -m pip install antlr4_verilog
# python3 -m pip install dist/latest.whl
``` 

Use your own listener to walk through the AST:
```python
design = '''
    module ha(a, b, sum, c);
        input a, b;
        output sum, c;

        assign sum = a ^ b;
        assign c = a & b;
    endmodule
'''

class ModuleIdentifierListener(VerilogParserListener.VerilogParserListener):
    def exitModule_declaration(self, ctx):
        self.identifier = ctx.module_identifier().getText()

lexer = VerilogLexer.VerilogLexer(InputStream(design))
stream = CommonTokenStream(lexer)
parser = VerilogParser.VerilogParser(stream)

tree = parser.source_text()
listener = ModuleIdentifierListener()
walker = ParseTreeWalker()
walker.walk(listener, tree)
print(listener.identifier) # 'ha'
```
> Take a look at other listener methods for [Verilog](src/antlr4_verilog/verilog/VerilogParserListener.py) and [SystemVerilog](src/antlr4_verilog/systemverilog/SystemVerilogParserListener.py)

## How to generate those files

System requirements (Ubuntu):
```
sudo apt-get install -y default-jre
sudo apt-get install -y default-jdk
sudo apt-get install -y curl
```

1. Get ANTLR4:
```bash
curl https://www.antlr.org/download/antlr-4.9-complete.jar -o extra/antlr-4.9-complete.jar
```

2. Get ANTLR grammars:
```
git clone https://github.com/antlr/grammars-v4.git extra/grammars-v4
```

3. Call ANTLR for Verilog grammar:
```
java -Xmx500M -cp "extra/antlr-4.9-complete.jar:${CLASSPATH}" org.antlr.v4.Tool -Dlanguage=Python3 -visitor `pwd`/extra/grammars-v4/verilog/verilog/VerilogLexer.g4 `pwd`/extra/grammars-v4/verilog/verilog/VerilogParser.g4 `pwd`/extra/grammars-v4/verilog/verilog/VerilogPreprocessorParser.g4 -o antlr4-verilog/verilog
```

3. Call ANTLR for SystemVerilog grammar:
```
java -Xmx500M -cp "extra/antlr-4.9-complete.jar:${CLASSPATH}" org.antlr.v4.Tool -Dlanguage=Python3 -visitor `pwd`/extra/grammars-v4/verilog/systemverilog/SystemVerilogLexer.g4 `pwd`/extra/grammars-v4/verilog/systemverilog/SystemVerilogParser.g4 -o antlr4-verilog/systemverilog
```

## How to test the grammar

1. Generate Java files:
```
java -Xmx500M -cp "extra/antlr-4.9-complete.jar:${CLASSPATH}" org.antlr.v4.Tool -Dlanguage=Java -visitor `pwd`/extra/grammars-v4/verilog/verilog/VerilogLexer.g4 `pwd`/extra/grammars-v4/verilog/verilog/VerilogParser.g4 `pwd`/extra/grammars-v4/verilog/verilog/VerilogPreprocessorParser.g4 -o test/testrig/verilog
```
```
java -Xmx500M -cp "extra/antlr-4.9-complete.jar:${CLASSPATH}" org.antlr.v4.Tool -Dlanguage=Java -visitor `pwd`/extra/grammars-v4/verilog/systemverilog/SystemVerilogLexer.g4 `pwd`/extra/grammars-v4/verilog/systemverilog/SystemVerilogParser.g4 -o test/testrig/systemverilog
```

2. Compile these recently generated files:
```
javac -cp "extra/antlr-4.9-complete.jar:${CLASSPATH}" test/testrig/verilog/*.java
```
```
javac -cp "extra/antlr-4.9-complete.jar:${CLASSPATH}" test/testrig/systemverilog/*.java
```

3. Create JAR files:
``` 
jar cf test/testrig/verilog.jar -C test/testrig/verilog .
```
``` 
jar cf test/testrig/systemverilog.jar -C test/testrig/systemverilog .
```

4. Finally, for `test.v` and `test.sv` files:
```
java -Xmx500M -cp "extra/antlr-4.9-complete.jar:test/testrig/verilog.jar:${CLASSPATH}" org.antlr.v4.gui.TestRig Verilog source_text test/testrig/test.v -tree
```
```
java -Xmx500M -cp "extra/antlr-4.9-complete.jar:test/testrig/systemverilog.jar:${CLASSPATH}" org.antlr.v4.gui.TestRig SystemVerilog source_text test/testrig/test.sv -tree
```
> You can use `-gui` to test it interactively
