# Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4/verilog/verilog/VerilogPreParser.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .VerilogPreParser import VerilogPreParser
else:
    from VerilogPreParser import VerilogPreParser

# This class defines a complete generic visitor for a parse tree produced by VerilogPreParser.

class VerilogPreParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by VerilogPreParser#source_text.
    def visitSource_text(self, ctx:VerilogPreParser.Source_textContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#compiler_directive.
    def visitCompiler_directive(self, ctx:VerilogPreParser.Compiler_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#begin_keywords_directive.
    def visitBegin_keywords_directive(self, ctx:VerilogPreParser.Begin_keywords_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#celldefine_directive.
    def visitCelldefine_directive(self, ctx:VerilogPreParser.Celldefine_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#default_nettype_directive.
    def visitDefault_nettype_directive(self, ctx:VerilogPreParser.Default_nettype_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#endcelldefine_directive.
    def visitEndcelldefine_directive(self, ctx:VerilogPreParser.Endcelldefine_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#end_keywords_directive.
    def visitEnd_keywords_directive(self, ctx:VerilogPreParser.End_keywords_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#ifdef_directive.
    def visitIfdef_directive(self, ctx:VerilogPreParser.Ifdef_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#ifndef_directive.
    def visitIfndef_directive(self, ctx:VerilogPreParser.Ifndef_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#include_directive.
    def visitInclude_directive(self, ctx:VerilogPreParser.Include_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#line_directive.
    def visitLine_directive(self, ctx:VerilogPreParser.Line_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#nounconnected_drive_directive.
    def visitNounconnected_drive_directive(self, ctx:VerilogPreParser.Nounconnected_drive_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#pragma_directive.
    def visitPragma_directive(self, ctx:VerilogPreParser.Pragma_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#resetall_directive.
    def visitResetall_directive(self, ctx:VerilogPreParser.Resetall_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#text_macro_definition.
    def visitText_macro_definition(self, ctx:VerilogPreParser.Text_macro_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#text_macro_usage.
    def visitText_macro_usage(self, ctx:VerilogPreParser.Text_macro_usageContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#timescale_directive.
    def visitTimescale_directive(self, ctx:VerilogPreParser.Timescale_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#unconnected_drive_directive.
    def visitUnconnected_drive_directive(self, ctx:VerilogPreParser.Unconnected_drive_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#undef_directive.
    def visitUndef_directive(self, ctx:VerilogPreParser.Undef_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#elsif_directive.
    def visitElsif_directive(self, ctx:VerilogPreParser.Elsif_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#else_directive.
    def visitElse_directive(self, ctx:VerilogPreParser.Else_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#endif_directive.
    def visitEndif_directive(self, ctx:VerilogPreParser.Endif_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#text_macro_identifier.
    def visitText_macro_identifier(self, ctx:VerilogPreParser.Text_macro_identifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#ifdef_group_of_lines.
    def visitIfdef_group_of_lines(self, ctx:VerilogPreParser.Ifdef_group_of_linesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#ifndef_group_of_lines.
    def visitIfndef_group_of_lines(self, ctx:VerilogPreParser.Ifndef_group_of_linesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#elsif_group_of_lines.
    def visitElsif_group_of_lines(self, ctx:VerilogPreParser.Elsif_group_of_linesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#else_group_of_lines.
    def visitElse_group_of_lines(self, ctx:VerilogPreParser.Else_group_of_linesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by VerilogPreParser#macro_text.
    def visitMacro_text(self, ctx:VerilogPreParser.Macro_textContext):
        return self.visitChildren(ctx)



del VerilogPreParser