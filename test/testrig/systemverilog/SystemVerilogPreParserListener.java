// Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4-2/verilog/systemverilog/SystemVerilogPreParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SystemVerilogPreParser}.
 */
public interface SystemVerilogPreParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#source_text}.
	 * @param ctx the parse tree
	 */
	void enterSource_text(SystemVerilogPreParser.Source_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#source_text}.
	 * @param ctx the parse tree
	 */
	void exitSource_text(SystemVerilogPreParser.Source_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_directive(SystemVerilogPreParser.Compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_directive(SystemVerilogPreParser.Compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#file_directive}.
	 * @param ctx the parse tree
	 */
	void enterFile_directive(SystemVerilogPreParser.File_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#file_directive}.
	 * @param ctx the parse tree
	 */
	void exitFile_directive(SystemVerilogPreParser.File_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#line_directive_}.
	 * @param ctx the parse tree
	 */
	void enterLine_directive_(SystemVerilogPreParser.Line_directive_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#line_directive_}.
	 * @param ctx the parse tree
	 */
	void exitLine_directive_(SystemVerilogPreParser.Line_directive_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#begin_keywords_directive}.
	 * @param ctx the parse tree
	 */
	void enterBegin_keywords_directive(SystemVerilogPreParser.Begin_keywords_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#begin_keywords_directive}.
	 * @param ctx the parse tree
	 */
	void exitBegin_keywords_directive(SystemVerilogPreParser.Begin_keywords_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#celldefine_directive}.
	 * @param ctx the parse tree
	 */
	void enterCelldefine_directive(SystemVerilogPreParser.Celldefine_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#celldefine_directive}.
	 * @param ctx the parse tree
	 */
	void exitCelldefine_directive(SystemVerilogPreParser.Celldefine_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#default_nettype_directive}.
	 * @param ctx the parse tree
	 */
	void enterDefault_nettype_directive(SystemVerilogPreParser.Default_nettype_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#default_nettype_directive}.
	 * @param ctx the parse tree
	 */
	void exitDefault_nettype_directive(SystemVerilogPreParser.Default_nettype_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#endcelldefine_directive}.
	 * @param ctx the parse tree
	 */
	void enterEndcelldefine_directive(SystemVerilogPreParser.Endcelldefine_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#endcelldefine_directive}.
	 * @param ctx the parse tree
	 */
	void exitEndcelldefine_directive(SystemVerilogPreParser.Endcelldefine_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#end_keywords_directive}.
	 * @param ctx the parse tree
	 */
	void enterEnd_keywords_directive(SystemVerilogPreParser.End_keywords_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#end_keywords_directive}.
	 * @param ctx the parse tree
	 */
	void exitEnd_keywords_directive(SystemVerilogPreParser.End_keywords_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#ifdef_directive}.
	 * @param ctx the parse tree
	 */
	void enterIfdef_directive(SystemVerilogPreParser.Ifdef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#ifdef_directive}.
	 * @param ctx the parse tree
	 */
	void exitIfdef_directive(SystemVerilogPreParser.Ifdef_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#ifndef_directive}.
	 * @param ctx the parse tree
	 */
	void enterIfndef_directive(SystemVerilogPreParser.Ifndef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#ifndef_directive}.
	 * @param ctx the parse tree
	 */
	void exitIfndef_directive(SystemVerilogPreParser.Ifndef_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#include_directive}.
	 * @param ctx the parse tree
	 */
	void enterInclude_directive(SystemVerilogPreParser.Include_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#include_directive}.
	 * @param ctx the parse tree
	 */
	void exitInclude_directive(SystemVerilogPreParser.Include_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#line_directive}.
	 * @param ctx the parse tree
	 */
	void enterLine_directive(SystemVerilogPreParser.Line_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#line_directive}.
	 * @param ctx the parse tree
	 */
	void exitLine_directive(SystemVerilogPreParser.Line_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#nounconnected_drive_directive}.
	 * @param ctx the parse tree
	 */
	void enterNounconnected_drive_directive(SystemVerilogPreParser.Nounconnected_drive_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#nounconnected_drive_directive}.
	 * @param ctx the parse tree
	 */
	void exitNounconnected_drive_directive(SystemVerilogPreParser.Nounconnected_drive_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#pragma_directive}.
	 * @param ctx the parse tree
	 */
	void enterPragma_directive(SystemVerilogPreParser.Pragma_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#pragma_directive}.
	 * @param ctx the parse tree
	 */
	void exitPragma_directive(SystemVerilogPreParser.Pragma_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#resetall_directive}.
	 * @param ctx the parse tree
	 */
	void enterResetall_directive(SystemVerilogPreParser.Resetall_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#resetall_directive}.
	 * @param ctx the parse tree
	 */
	void exitResetall_directive(SystemVerilogPreParser.Resetall_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#text_macro_definition}.
	 * @param ctx the parse tree
	 */
	void enterText_macro_definition(SystemVerilogPreParser.Text_macro_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#text_macro_definition}.
	 * @param ctx the parse tree
	 */
	void exitText_macro_definition(SystemVerilogPreParser.Text_macro_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#text_macro_usage}.
	 * @param ctx the parse tree
	 */
	void enterText_macro_usage(SystemVerilogPreParser.Text_macro_usageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#text_macro_usage}.
	 * @param ctx the parse tree
	 */
	void exitText_macro_usage(SystemVerilogPreParser.Text_macro_usageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#timescale_directive}.
	 * @param ctx the parse tree
	 */
	void enterTimescale_directive(SystemVerilogPreParser.Timescale_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#timescale_directive}.
	 * @param ctx the parse tree
	 */
	void exitTimescale_directive(SystemVerilogPreParser.Timescale_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#unconnected_drive_directive}.
	 * @param ctx the parse tree
	 */
	void enterUnconnected_drive_directive(SystemVerilogPreParser.Unconnected_drive_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#unconnected_drive_directive}.
	 * @param ctx the parse tree
	 */
	void exitUnconnected_drive_directive(SystemVerilogPreParser.Unconnected_drive_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#undef_directive}.
	 * @param ctx the parse tree
	 */
	void enterUndef_directive(SystemVerilogPreParser.Undef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#undef_directive}.
	 * @param ctx the parse tree
	 */
	void exitUndef_directive(SystemVerilogPreParser.Undef_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#undefineall_directive}.
	 * @param ctx the parse tree
	 */
	void enterUndefineall_directive(SystemVerilogPreParser.Undefineall_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#undefineall_directive}.
	 * @param ctx the parse tree
	 */
	void exitUndefineall_directive(SystemVerilogPreParser.Undefineall_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#elsif_directive}.
	 * @param ctx the parse tree
	 */
	void enterElsif_directive(SystemVerilogPreParser.Elsif_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#elsif_directive}.
	 * @param ctx the parse tree
	 */
	void exitElsif_directive(SystemVerilogPreParser.Elsif_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#else_directive}.
	 * @param ctx the parse tree
	 */
	void enterElse_directive(SystemVerilogPreParser.Else_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#else_directive}.
	 * @param ctx the parse tree
	 */
	void exitElse_directive(SystemVerilogPreParser.Else_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#endif_directive}.
	 * @param ctx the parse tree
	 */
	void enterEndif_directive(SystemVerilogPreParser.Endif_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#endif_directive}.
	 * @param ctx the parse tree
	 */
	void exitEndif_directive(SystemVerilogPreParser.Endif_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#text_macro_identifier}.
	 * @param ctx the parse tree
	 */
	void enterText_macro_identifier(SystemVerilogPreParser.Text_macro_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#text_macro_identifier}.
	 * @param ctx the parse tree
	 */
	void exitText_macro_identifier(SystemVerilogPreParser.Text_macro_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#ifdef_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void enterIfdef_group_of_lines(SystemVerilogPreParser.Ifdef_group_of_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#ifdef_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void exitIfdef_group_of_lines(SystemVerilogPreParser.Ifdef_group_of_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#ifndef_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void enterIfndef_group_of_lines(SystemVerilogPreParser.Ifndef_group_of_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#ifndef_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void exitIfndef_group_of_lines(SystemVerilogPreParser.Ifndef_group_of_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#elsif_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void enterElsif_group_of_lines(SystemVerilogPreParser.Elsif_group_of_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#elsif_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void exitElsif_group_of_lines(SystemVerilogPreParser.Elsif_group_of_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#else_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void enterElse_group_of_lines(SystemVerilogPreParser.Else_group_of_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#else_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void exitElse_group_of_lines(SystemVerilogPreParser.Else_group_of_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogPreParser#macro_text}.
	 * @param ctx the parse tree
	 */
	void enterMacro_text(SystemVerilogPreParser.Macro_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogPreParser#macro_text}.
	 * @param ctx the parse tree
	 */
	void exitMacro_text(SystemVerilogPreParser.Macro_textContext ctx);
}