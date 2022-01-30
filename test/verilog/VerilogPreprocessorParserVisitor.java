// Generated from /home/mtdsousa/workspace/antlr4-verilog/extra/grammars-v4/verilog/verilog/VerilogPreprocessorParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VerilogPreprocessorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VerilogPreprocessorParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#source_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_text(VerilogPreprocessorParser.Source_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_directive(VerilogPreprocessorParser.Compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#celldefine_compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCelldefine_compiler_directive(VerilogPreprocessorParser.Celldefine_compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#endcelldefine_compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndcelldefine_compiler_directive(VerilogPreprocessorParser.Endcelldefine_compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#default_nettype_compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_nettype_compiler_directive(VerilogPreprocessorParser.Default_nettype_compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#default_nettype_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_nettype_value(VerilogPreprocessorParser.Default_nettype_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#text_macro_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_macro_definition(VerilogPreprocessorParser.Text_macro_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#text_macro_usage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_macro_usage(VerilogPreprocessorParser.Text_macro_usageContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#macro_list_of_actual_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_list_of_actual_arguments(VerilogPreprocessorParser.Macro_list_of_actual_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#text_macro_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_macro_identifier(VerilogPreprocessorParser.Text_macro_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#undefine_compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndefine_compiler_directive(VerilogPreprocessorParser.Undefine_compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#ifdef_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdef_directive(VerilogPreprocessorParser.Ifdef_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#ifndef_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfndef_directive(VerilogPreprocessorParser.Ifndef_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#elsif_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_directive(VerilogPreprocessorParser.Elsif_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#else_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_directive(VerilogPreprocessorParser.Else_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#endif_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndif_directive(VerilogPreprocessorParser.Endif_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#include_compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_compiler_directive(VerilogPreprocessorParser.Include_compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(VerilogPreprocessorParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#resetall_compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetall_compiler_directive(VerilogPreprocessorParser.Resetall_compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#line_compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_compiler_directive(VerilogPreprocessorParser.Line_compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#line_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_number(VerilogPreprocessorParser.Line_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#line_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_level(VerilogPreprocessorParser.Line_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#timescale_compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimescale_compiler_directive(VerilogPreprocessorParser.Timescale_compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#time_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_literal(VerilogPreprocessorParser.Time_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#time_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_number(VerilogPreprocessorParser.Time_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#time_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_unit(VerilogPreprocessorParser.Time_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#unconnected_drive_compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconnected_drive_compiler_directive(VerilogPreprocessorParser.Unconnected_drive_compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#unconnected_drive_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconnected_drive_value(VerilogPreprocessorParser.Unconnected_drive_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#nounconnected_drive_compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounconnected_drive_compiler_directive(VerilogPreprocessorParser.Nounconnected_drive_compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#keywords_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywords_directive(VerilogPreprocessorParser.Keywords_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#version_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion_specifier(VerilogPreprocessorParser.Version_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreprocessorParser#endkeywords_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndkeywords_directive(VerilogPreprocessorParser.Endkeywords_directiveContext ctx);
}