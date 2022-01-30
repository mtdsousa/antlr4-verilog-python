# ANTLR4 Verilog Grammar Files
Generated files from ANTLR4 for Verilog language and Python as target.

## Generating parser files

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

## Testing grammar

1. Generate Java files:
```
java -Xmx500M -cp "extra/antlr-4.9-complete.jar:${CLASSPATH}" org.antlr.v4.Tool -Dlanguage=Java -visitor `pwd`/extra/grammars-v4/verilog/verilog/VerilogLexer.g4 `pwd`/extra/grammars-v4/verilog/verilog/VerilogParser.g4 `pwd`/extra/grammars-v4/verilog/verilog/VerilogPreprocessorParser.g4 -o test/verilog
```
```
java -Xmx500M -cp "extra/antlr-4.9-complete.jar:${CLASSPATH}" org.antlr.v4.Tool -Dlanguage=Java -visitor `pwd`/extra/grammars-v4/verilog/systemverilog/SystemVerilogLexer.g4 `pwd`/extra/grammars-v4/verilog/systemverilog/SystemVerilogParser.g4 -o test/systemverilog
```

2. Compile these recently generated files:
```
javac -cp "extra/antlr-4.9-complete.jar:${CLASSPATH}" test/verilog/*.java
```
```
javac -cp "extra/antlr-4.9-complete.jar:${CLASSPATH}" test/systemverilog/*.java
```

3. Create JAR files:
``` 
jar cf test/verilog.jar -C test/verilog .
```
``` 
jar cf test/systemverilog.jar -C test/systemverilog .
```

4. Finally, for `test.v` and `test.sv` files:
```
java -Xmx500M -cp "extra/antlr-4.9-complete.jar:test/verilog.jar:${CLASSPATH}" org.antlr.v4.gui.TestRig Verilog source_text test/test.v -tree
```
```
java -Xmx500M -cp "extra/antlr-4.9-complete.jar:test/systemverilog.jar:${CLASSPATH}" org.antlr.v4.gui.TestRig SystemVerilog source_text test/test.sv -tree
```
> You can use `-gui` to test it interactively
