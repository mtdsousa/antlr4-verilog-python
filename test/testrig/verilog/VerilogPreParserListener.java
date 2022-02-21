// Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4-2/verilog/verilog/VerilogPreParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VerilogPreParser}.
 */
public interface VerilogPreParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#source_text}.
	 * @param ctx the parse tree
	 */
	void enterSource_text(VerilogPreParser.Source_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#source_text}.
	 * @param ctx the parse tree
	 */
	void exitSource_text(VerilogPreParser.Source_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_directive(VerilogPreParser.Compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_directive(VerilogPreParser.Compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#begin_keywords_directive}.
	 * @param ctx the parse tree
	 */
	void enterBegin_keywords_directive(VerilogPreParser.Begin_keywords_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#begin_keywords_directive}.
	 * @param ctx the parse tree
	 */
	void exitBegin_keywords_directive(VerilogPreParser.Begin_keywords_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#celldefine_directive}.
	 * @param ctx the parse tree
	 */
	void enterCelldefine_directive(VerilogPreParser.Celldefine_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#celldefine_directive}.
	 * @param ctx the parse tree
	 */
	void exitCelldefine_directive(VerilogPreParser.Celldefine_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#default_nettype_directive}.
	 * @param ctx the parse tree
	 */
	void enterDefault_nettype_directive(VerilogPreParser.Default_nettype_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#default_nettype_directive}.
	 * @param ctx the parse tree
	 */
	void exitDefault_nettype_directive(VerilogPreParser.Default_nettype_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#endcelldefine_directive}.
	 * @param ctx the parse tree
	 */
	void enterEndcelldefine_directive(VerilogPreParser.Endcelldefine_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#endcelldefine_directive}.
	 * @param ctx the parse tree
	 */
	void exitEndcelldefine_directive(VerilogPreParser.Endcelldefine_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#end_keywords_directive}.
	 * @param ctx the parse tree
	 */
	void enterEnd_keywords_directive(VerilogPreParser.End_keywords_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#end_keywords_directive}.
	 * @param ctx the parse tree
	 */
	void exitEnd_keywords_directive(VerilogPreParser.End_keywords_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#ifdef_directive}.
	 * @param ctx the parse tree
	 */
	void enterIfdef_directive(VerilogPreParser.Ifdef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#ifdef_directive}.
	 * @param ctx the parse tree
	 */
	void exitIfdef_directive(VerilogPreParser.Ifdef_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#ifndef_directive}.
	 * @param ctx the parse tree
	 */
	void enterIfndef_directive(VerilogPreParser.Ifndef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#ifndef_directive}.
	 * @param ctx the parse tree
	 */
	void exitIfndef_directive(VerilogPreParser.Ifndef_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#include_directive}.
	 * @param ctx the parse tree
	 */
	void enterInclude_directive(VerilogPreParser.Include_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#include_directive}.
	 * @param ctx the parse tree
	 */
	void exitInclude_directive(VerilogPreParser.Include_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#line_directive}.
	 * @param ctx the parse tree
	 */
	void enterLine_directive(VerilogPreParser.Line_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#line_directive}.
	 * @param ctx the parse tree
	 */
	void exitLine_directive(VerilogPreParser.Line_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#nounconnected_drive_directive}.
	 * @param ctx the parse tree
	 */
	void enterNounconnected_drive_directive(VerilogPreParser.Nounconnected_drive_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#nounconnected_drive_directive}.
	 * @param ctx the parse tree
	 */
	void exitNounconnected_drive_directive(VerilogPreParser.Nounconnected_drive_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#pragma_directive}.
	 * @param ctx the parse tree
	 */
	void enterPragma_directive(VerilogPreParser.Pragma_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#pragma_directive}.
	 * @param ctx the parse tree
	 */
	void exitPragma_directive(VerilogPreParser.Pragma_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#resetall_directive}.
	 * @param ctx the parse tree
	 */
	void enterResetall_directive(VerilogPreParser.Resetall_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#resetall_directive}.
	 * @param ctx the parse tree
	 */
	void exitResetall_directive(VerilogPreParser.Resetall_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#text_macro_definition}.
	 * @param ctx the parse tree
	 */
	void enterText_macro_definition(VerilogPreParser.Text_macro_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#text_macro_definition}.
	 * @param ctx the parse tree
	 */
	void exitText_macro_definition(VerilogPreParser.Text_macro_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#text_macro_usage}.
	 * @param ctx the parse tree
	 */
	void enterText_macro_usage(VerilogPreParser.Text_macro_usageContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#text_macro_usage}.
	 * @param ctx the parse tree
	 */
	void exitText_macro_usage(VerilogPreParser.Text_macro_usageContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#timescale_directive}.
	 * @param ctx the parse tree
	 */
	void enterTimescale_directive(VerilogPreParser.Timescale_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#timescale_directive}.
	 * @param ctx the parse tree
	 */
	void exitTimescale_directive(VerilogPreParser.Timescale_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#unconnected_drive_directive}.
	 * @param ctx the parse tree
	 */
	void enterUnconnected_drive_directive(VerilogPreParser.Unconnected_drive_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#unconnected_drive_directive}.
	 * @param ctx the parse tree
	 */
	void exitUnconnected_drive_directive(VerilogPreParser.Unconnected_drive_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#undef_directive}.
	 * @param ctx the parse tree
	 */
	void enterUndef_directive(VerilogPreParser.Undef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#undef_directive}.
	 * @param ctx the parse tree
	 */
	void exitUndef_directive(VerilogPreParser.Undef_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#elsif_directive}.
	 * @param ctx the parse tree
	 */
	void enterElsif_directive(VerilogPreParser.Elsif_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#elsif_directive}.
	 * @param ctx the parse tree
	 */
	void exitElsif_directive(VerilogPreParser.Elsif_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#else_directive}.
	 * @param ctx the parse tree
	 */
	void enterElse_directive(VerilogPreParser.Else_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#else_directive}.
	 * @param ctx the parse tree
	 */
	void exitElse_directive(VerilogPreParser.Else_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#endif_directive}.
	 * @param ctx the parse tree
	 */
	void enterEndif_directive(VerilogPreParser.Endif_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#endif_directive}.
	 * @param ctx the parse tree
	 */
	void exitEndif_directive(VerilogPreParser.Endif_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#text_macro_identifier}.
	 * @param ctx the parse tree
	 */
	void enterText_macro_identifier(VerilogPreParser.Text_macro_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#text_macro_identifier}.
	 * @param ctx the parse tree
	 */
	void exitText_macro_identifier(VerilogPreParser.Text_macro_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#ifdef_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void enterIfdef_group_of_lines(VerilogPreParser.Ifdef_group_of_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#ifdef_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void exitIfdef_group_of_lines(VerilogPreParser.Ifdef_group_of_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#ifndef_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void enterIfndef_group_of_lines(VerilogPreParser.Ifndef_group_of_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#ifndef_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void exitIfndef_group_of_lines(VerilogPreParser.Ifndef_group_of_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#elsif_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void enterElsif_group_of_lines(VerilogPreParser.Elsif_group_of_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#elsif_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void exitElsif_group_of_lines(VerilogPreParser.Elsif_group_of_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#else_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void enterElse_group_of_lines(VerilogPreParser.Else_group_of_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#else_group_of_lines}.
	 * @param ctx the parse tree
	 */
	void exitElse_group_of_lines(VerilogPreParser.Else_group_of_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreParser#macro_text}.
	 * @param ctx the parse tree
	 */
	void enterMacro_text(VerilogPreParser.Macro_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreParser#macro_text}.
	 * @param ctx the parse tree
	 */
	void exitMacro_text(VerilogPreParser.Macro_textContext ctx);
}