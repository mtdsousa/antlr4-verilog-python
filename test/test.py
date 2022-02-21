'''
Copyright (c) 2022 Marco Diniz Sousa

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

'''
import unittest

from antlr4_verilog import InputStream, CommonTokenStream, ParseTreeWalker
from antlr4_verilog.verilog import VerilogLexer, VerilogParser, VerilogParserListener
from antlr4_verilog.systemverilog import SystemVerilogLexer, SystemVerilogParser, SystemVerilogParserListener

class TestVerilog(unittest.TestCase):
    def setUp(self):
        design = '''
            module ha(a, b, sum, c);
                input a, b;
                output sum, c;

                assign sum = a ^ b;
                assign c = a & b;
            endmodule
        '''
        lexer = VerilogLexer(InputStream(design))
        stream = CommonTokenStream(lexer)
        parser = VerilogParser(stream)
        self.tree = parser.source_text()
        self.walker = ParseTreeWalker()

    def test_module_identifier(self):
        class ModuleIdentifierListener(VerilogParserListener):
            def exitModule_declaration(self, ctx):
                self.identifier = ctx.module_identifier().getText()

        listener = ModuleIdentifierListener()
        self.walker.walk(listener, self.tree)
        self.assertEqual(listener.identifier, 'ha')

    def test_module_inputs(self):
        class ModuleInputListener(VerilogParserListener):
            def __init__(self):
                self.declarations = []
            def exitInput_declaration(self, ctx):
                for child in ctx.list_of_port_identifiers().getChildren():
                    if isinstance(child, VerilogParser.Port_identifierContext):
                        self.declarations.append(child.identifier().getText())
                    

        listener = ModuleInputListener()
        self.walker.walk(listener, self.tree)
        self.assertEqual(listener.declarations, ['a', 'b'])

class TestSystemVerilog(unittest.TestCase):
    def setUp(self):
        design = '''
            module hello;
                string s = "Hello";
                initial begin
                    $display("%s", s);
                end
            endmodule            
        '''
        lexer = SystemVerilogLexer(InputStream(design))
        stream = CommonTokenStream(lexer)
        parser = SystemVerilogParser(stream)
        self.tree = parser.source_text()
        self.walker = ParseTreeWalker()

    def test_module_identifier(self):
        class ModuleIdentifierListener(SystemVerilogParserListener):
            def exitModule_declaration(self, ctx):
                self.identifier = ctx.module_ansi_header().module_identifier().getText()

        listener = ModuleIdentifierListener()
        self.walker.walk(listener, self.tree)
        self.assertEqual(listener.identifier, 'hello')

    def test_variable_assignment(self):
        class VariableAssignmentListener(SystemVerilogParserListener):
            def exitVariable_decl_assignment(self, ctx):
                self.identifier = ctx.variable_identifier().getText()
                self.expression = ctx.expression().getText()
        
        listener = VariableAssignmentListener()
        self.walker.walk(listener, self.tree)
        self.assertEqual(listener.identifier, 's')
        self.assertEqual(listener.expression, '"Hello"')

    def test_system_task(self):
        class SystemTaskListener(SystemVerilogParserListener):
            def exitSystem_tf_call(self, ctx):
                self.identifier = ctx.system_tf_identifier().getText()
        
        listener = SystemTaskListener()
        self.walker.walk(listener, self.tree)
        self.assertEqual(listener.identifier, '$display')

if __name__ == '__main__':
    unittest.main()
