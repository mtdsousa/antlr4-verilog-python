// Generated from /home/mtdsousa/workspace/antlr4-verilog/extra/grammars-v4/verilog/verilog/VerilogPreprocessorParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VerilogPreprocessorParser}.
 */
public interface VerilogPreprocessorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#source_text}.
	 * @param ctx the parse tree
	 */
	void enterSource_text(VerilogPreprocessorParser.Source_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#source_text}.
	 * @param ctx the parse tree
	 */
	void exitSource_text(VerilogPreprocessorParser.Source_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_directive(VerilogPreprocessorParser.Compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_directive(VerilogPreprocessorParser.Compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#celldefine_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterCelldefine_compiler_directive(VerilogPreprocessorParser.Celldefine_compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#celldefine_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitCelldefine_compiler_directive(VerilogPreprocessorParser.Celldefine_compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#endcelldefine_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterEndcelldefine_compiler_directive(VerilogPreprocessorParser.Endcelldefine_compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#endcelldefine_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitEndcelldefine_compiler_directive(VerilogPreprocessorParser.Endcelldefine_compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#default_nettype_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterDefault_nettype_compiler_directive(VerilogPreprocessorParser.Default_nettype_compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#default_nettype_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitDefault_nettype_compiler_directive(VerilogPreprocessorParser.Default_nettype_compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#default_nettype_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_nettype_value(VerilogPreprocessorParser.Default_nettype_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#default_nettype_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_nettype_value(VerilogPreprocessorParser.Default_nettype_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#text_macro_definition}.
	 * @param ctx the parse tree
	 */
	void enterText_macro_definition(VerilogPreprocessorParser.Text_macro_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#text_macro_definition}.
	 * @param ctx the parse tree
	 */
	void exitText_macro_definition(VerilogPreprocessorParser.Text_macro_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#text_macro_usage}.
	 * @param ctx the parse tree
	 */
	void enterText_macro_usage(VerilogPreprocessorParser.Text_macro_usageContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#text_macro_usage}.
	 * @param ctx the parse tree
	 */
	void exitText_macro_usage(VerilogPreprocessorParser.Text_macro_usageContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#macro_list_of_actual_arguments}.
	 * @param ctx the parse tree
	 */
	void enterMacro_list_of_actual_arguments(VerilogPreprocessorParser.Macro_list_of_actual_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#macro_list_of_actual_arguments}.
	 * @param ctx the parse tree
	 */
	void exitMacro_list_of_actual_arguments(VerilogPreprocessorParser.Macro_list_of_actual_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#text_macro_identifier}.
	 * @param ctx the parse tree
	 */
	void enterText_macro_identifier(VerilogPreprocessorParser.Text_macro_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#text_macro_identifier}.
	 * @param ctx the parse tree
	 */
	void exitText_macro_identifier(VerilogPreprocessorParser.Text_macro_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#undefine_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterUndefine_compiler_directive(VerilogPreprocessorParser.Undefine_compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#undefine_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitUndefine_compiler_directive(VerilogPreprocessorParser.Undefine_compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#ifdef_directive}.
	 * @param ctx the parse tree
	 */
	void enterIfdef_directive(VerilogPreprocessorParser.Ifdef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#ifdef_directive}.
	 * @param ctx the parse tree
	 */
	void exitIfdef_directive(VerilogPreprocessorParser.Ifdef_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#ifndef_directive}.
	 * @param ctx the parse tree
	 */
	void enterIfndef_directive(VerilogPreprocessorParser.Ifndef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#ifndef_directive}.
	 * @param ctx the parse tree
	 */
	void exitIfndef_directive(VerilogPreprocessorParser.Ifndef_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#elsif_directive}.
	 * @param ctx the parse tree
	 */
	void enterElsif_directive(VerilogPreprocessorParser.Elsif_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#elsif_directive}.
	 * @param ctx the parse tree
	 */
	void exitElsif_directive(VerilogPreprocessorParser.Elsif_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#else_directive}.
	 * @param ctx the parse tree
	 */
	void enterElse_directive(VerilogPreprocessorParser.Else_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#else_directive}.
	 * @param ctx the parse tree
	 */
	void exitElse_directive(VerilogPreprocessorParser.Else_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#endif_directive}.
	 * @param ctx the parse tree
	 */
	void enterEndif_directive(VerilogPreprocessorParser.Endif_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#endif_directive}.
	 * @param ctx the parse tree
	 */
	void exitEndif_directive(VerilogPreprocessorParser.Endif_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#include_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterInclude_compiler_directive(VerilogPreprocessorParser.Include_compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#include_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitInclude_compiler_directive(VerilogPreprocessorParser.Include_compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(VerilogPreprocessorParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(VerilogPreprocessorParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#resetall_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterResetall_compiler_directive(VerilogPreprocessorParser.Resetall_compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#resetall_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitResetall_compiler_directive(VerilogPreprocessorParser.Resetall_compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#line_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterLine_compiler_directive(VerilogPreprocessorParser.Line_compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#line_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitLine_compiler_directive(VerilogPreprocessorParser.Line_compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#line_number}.
	 * @param ctx the parse tree
	 */
	void enterLine_number(VerilogPreprocessorParser.Line_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#line_number}.
	 * @param ctx the parse tree
	 */
	void exitLine_number(VerilogPreprocessorParser.Line_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#line_level}.
	 * @param ctx the parse tree
	 */
	void enterLine_level(VerilogPreprocessorParser.Line_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#line_level}.
	 * @param ctx the parse tree
	 */
	void exitLine_level(VerilogPreprocessorParser.Line_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#timescale_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterTimescale_compiler_directive(VerilogPreprocessorParser.Timescale_compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#timescale_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitTimescale_compiler_directive(VerilogPreprocessorParser.Timescale_compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#time_literal}.
	 * @param ctx the parse tree
	 */
	void enterTime_literal(VerilogPreprocessorParser.Time_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#time_literal}.
	 * @param ctx the parse tree
	 */
	void exitTime_literal(VerilogPreprocessorParser.Time_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#time_number}.
	 * @param ctx the parse tree
	 */
	void enterTime_number(VerilogPreprocessorParser.Time_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#time_number}.
	 * @param ctx the parse tree
	 */
	void exitTime_number(VerilogPreprocessorParser.Time_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#time_unit}.
	 * @param ctx the parse tree
	 */
	void enterTime_unit(VerilogPreprocessorParser.Time_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#time_unit}.
	 * @param ctx the parse tree
	 */
	void exitTime_unit(VerilogPreprocessorParser.Time_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#unconnected_drive_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterUnconnected_drive_compiler_directive(VerilogPreprocessorParser.Unconnected_drive_compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#unconnected_drive_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitUnconnected_drive_compiler_directive(VerilogPreprocessorParser.Unconnected_drive_compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#unconnected_drive_value}.
	 * @param ctx the parse tree
	 */
	void enterUnconnected_drive_value(VerilogPreprocessorParser.Unconnected_drive_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#unconnected_drive_value}.
	 * @param ctx the parse tree
	 */
	void exitUnconnected_drive_value(VerilogPreprocessorParser.Unconnected_drive_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#nounconnected_drive_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterNounconnected_drive_compiler_directive(VerilogPreprocessorParser.Nounconnected_drive_compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#nounconnected_drive_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitNounconnected_drive_compiler_directive(VerilogPreprocessorParser.Nounconnected_drive_compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#keywords_directive}.
	 * @param ctx the parse tree
	 */
	void enterKeywords_directive(VerilogPreprocessorParser.Keywords_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#keywords_directive}.
	 * @param ctx the parse tree
	 */
	void exitKeywords_directive(VerilogPreprocessorParser.Keywords_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#version_specifier}.
	 * @param ctx the parse tree
	 */
	void enterVersion_specifier(VerilogPreprocessorParser.Version_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#version_specifier}.
	 * @param ctx the parse tree
	 */
	void exitVersion_specifier(VerilogPreprocessorParser.Version_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogPreprocessorParser#endkeywords_directive}.
	 * @param ctx the parse tree
	 */
	void enterEndkeywords_directive(VerilogPreprocessorParser.Endkeywords_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogPreprocessorParser#endkeywords_directive}.
	 * @param ctx the parse tree
	 */
	void exitEndkeywords_directive(VerilogPreprocessorParser.Endkeywords_directiveContext ctx);
}