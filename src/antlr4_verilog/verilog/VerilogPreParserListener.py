# Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4/verilog/verilog/VerilogPreParser.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .VerilogPreParser import VerilogPreParser
else:
    from VerilogPreParser import VerilogPreParser

# This class defines a complete listener for a parse tree produced by VerilogPreParser.
class VerilogPreParserListener(ParseTreeListener):

    # Enter a parse tree produced by VerilogPreParser#source_text.
    def enterSource_text(self, ctx:VerilogPreParser.Source_textContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#source_text.
    def exitSource_text(self, ctx:VerilogPreParser.Source_textContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#compiler_directive.
    def enterCompiler_directive(self, ctx:VerilogPreParser.Compiler_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#compiler_directive.
    def exitCompiler_directive(self, ctx:VerilogPreParser.Compiler_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#begin_keywords_directive.
    def enterBegin_keywords_directive(self, ctx:VerilogPreParser.Begin_keywords_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#begin_keywords_directive.
    def exitBegin_keywords_directive(self, ctx:VerilogPreParser.Begin_keywords_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#celldefine_directive.
    def enterCelldefine_directive(self, ctx:VerilogPreParser.Celldefine_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#celldefine_directive.
    def exitCelldefine_directive(self, ctx:VerilogPreParser.Celldefine_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#default_nettype_directive.
    def enterDefault_nettype_directive(self, ctx:VerilogPreParser.Default_nettype_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#default_nettype_directive.
    def exitDefault_nettype_directive(self, ctx:VerilogPreParser.Default_nettype_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#endcelldefine_directive.
    def enterEndcelldefine_directive(self, ctx:VerilogPreParser.Endcelldefine_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#endcelldefine_directive.
    def exitEndcelldefine_directive(self, ctx:VerilogPreParser.Endcelldefine_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#end_keywords_directive.
    def enterEnd_keywords_directive(self, ctx:VerilogPreParser.End_keywords_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#end_keywords_directive.
    def exitEnd_keywords_directive(self, ctx:VerilogPreParser.End_keywords_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#ifdef_directive.
    def enterIfdef_directive(self, ctx:VerilogPreParser.Ifdef_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#ifdef_directive.
    def exitIfdef_directive(self, ctx:VerilogPreParser.Ifdef_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#ifndef_directive.
    def enterIfndef_directive(self, ctx:VerilogPreParser.Ifndef_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#ifndef_directive.
    def exitIfndef_directive(self, ctx:VerilogPreParser.Ifndef_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#include_directive.
    def enterInclude_directive(self, ctx:VerilogPreParser.Include_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#include_directive.
    def exitInclude_directive(self, ctx:VerilogPreParser.Include_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#line_directive.
    def enterLine_directive(self, ctx:VerilogPreParser.Line_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#line_directive.
    def exitLine_directive(self, ctx:VerilogPreParser.Line_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#nounconnected_drive_directive.
    def enterNounconnected_drive_directive(self, ctx:VerilogPreParser.Nounconnected_drive_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#nounconnected_drive_directive.
    def exitNounconnected_drive_directive(self, ctx:VerilogPreParser.Nounconnected_drive_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#pragma_directive.
    def enterPragma_directive(self, ctx:VerilogPreParser.Pragma_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#pragma_directive.
    def exitPragma_directive(self, ctx:VerilogPreParser.Pragma_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#resetall_directive.
    def enterResetall_directive(self, ctx:VerilogPreParser.Resetall_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#resetall_directive.
    def exitResetall_directive(self, ctx:VerilogPreParser.Resetall_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#text_macro_definition.
    def enterText_macro_definition(self, ctx:VerilogPreParser.Text_macro_definitionContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#text_macro_definition.
    def exitText_macro_definition(self, ctx:VerilogPreParser.Text_macro_definitionContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#text_macro_usage.
    def enterText_macro_usage(self, ctx:VerilogPreParser.Text_macro_usageContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#text_macro_usage.
    def exitText_macro_usage(self, ctx:VerilogPreParser.Text_macro_usageContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#timescale_directive.
    def enterTimescale_directive(self, ctx:VerilogPreParser.Timescale_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#timescale_directive.
    def exitTimescale_directive(self, ctx:VerilogPreParser.Timescale_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#unconnected_drive_directive.
    def enterUnconnected_drive_directive(self, ctx:VerilogPreParser.Unconnected_drive_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#unconnected_drive_directive.
    def exitUnconnected_drive_directive(self, ctx:VerilogPreParser.Unconnected_drive_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#undef_directive.
    def enterUndef_directive(self, ctx:VerilogPreParser.Undef_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#undef_directive.
    def exitUndef_directive(self, ctx:VerilogPreParser.Undef_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#elsif_directive.
    def enterElsif_directive(self, ctx:VerilogPreParser.Elsif_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#elsif_directive.
    def exitElsif_directive(self, ctx:VerilogPreParser.Elsif_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#else_directive.
    def enterElse_directive(self, ctx:VerilogPreParser.Else_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#else_directive.
    def exitElse_directive(self, ctx:VerilogPreParser.Else_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#endif_directive.
    def enterEndif_directive(self, ctx:VerilogPreParser.Endif_directiveContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#endif_directive.
    def exitEndif_directive(self, ctx:VerilogPreParser.Endif_directiveContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#text_macro_identifier.
    def enterText_macro_identifier(self, ctx:VerilogPreParser.Text_macro_identifierContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#text_macro_identifier.
    def exitText_macro_identifier(self, ctx:VerilogPreParser.Text_macro_identifierContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#ifdef_group_of_lines.
    def enterIfdef_group_of_lines(self, ctx:VerilogPreParser.Ifdef_group_of_linesContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#ifdef_group_of_lines.
    def exitIfdef_group_of_lines(self, ctx:VerilogPreParser.Ifdef_group_of_linesContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#ifndef_group_of_lines.
    def enterIfndef_group_of_lines(self, ctx:VerilogPreParser.Ifndef_group_of_linesContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#ifndef_group_of_lines.
    def exitIfndef_group_of_lines(self, ctx:VerilogPreParser.Ifndef_group_of_linesContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#elsif_group_of_lines.
    def enterElsif_group_of_lines(self, ctx:VerilogPreParser.Elsif_group_of_linesContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#elsif_group_of_lines.
    def exitElsif_group_of_lines(self, ctx:VerilogPreParser.Elsif_group_of_linesContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#else_group_of_lines.
    def enterElse_group_of_lines(self, ctx:VerilogPreParser.Else_group_of_linesContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#else_group_of_lines.
    def exitElse_group_of_lines(self, ctx:VerilogPreParser.Else_group_of_linesContext):
        pass


    # Enter a parse tree produced by VerilogPreParser#macro_text.
    def enterMacro_text(self, ctx:VerilogPreParser.Macro_textContext):
        pass

    # Exit a parse tree produced by VerilogPreParser#macro_text.
    def exitMacro_text(self, ctx:VerilogPreParser.Macro_textContext):
        pass



del VerilogPreParser