// Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4/verilog/verilog/VerilogPreParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VerilogPreParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VerilogPreParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#source_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_text(VerilogPreParser.Source_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_directive(VerilogPreParser.Compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#begin_keywords_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_keywords_directive(VerilogPreParser.Begin_keywords_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#celldefine_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCelldefine_directive(VerilogPreParser.Celldefine_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#default_nettype_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_nettype_directive(VerilogPreParser.Default_nettype_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#endcelldefine_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndcelldefine_directive(VerilogPreParser.Endcelldefine_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#end_keywords_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_keywords_directive(VerilogPreParser.End_keywords_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#ifdef_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdef_directive(VerilogPreParser.Ifdef_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#ifndef_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfndef_directive(VerilogPreParser.Ifndef_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#include_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_directive(VerilogPreParser.Include_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#line_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_directive(VerilogPreParser.Line_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#nounconnected_drive_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounconnected_drive_directive(VerilogPreParser.Nounconnected_drive_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#pragma_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_directive(VerilogPreParser.Pragma_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#resetall_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetall_directive(VerilogPreParser.Resetall_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#text_macro_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_macro_definition(VerilogPreParser.Text_macro_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#text_macro_usage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_macro_usage(VerilogPreParser.Text_macro_usageContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#timescale_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimescale_directive(VerilogPreParser.Timescale_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#unconnected_drive_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconnected_drive_directive(VerilogPreParser.Unconnected_drive_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#undef_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndef_directive(VerilogPreParser.Undef_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#elsif_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_directive(VerilogPreParser.Elsif_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#else_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_directive(VerilogPreParser.Else_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#endif_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndif_directive(VerilogPreParser.Endif_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#text_macro_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_macro_identifier(VerilogPreParser.Text_macro_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#ifdef_group_of_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdef_group_of_lines(VerilogPreParser.Ifdef_group_of_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#ifndef_group_of_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfndef_group_of_lines(VerilogPreParser.Ifndef_group_of_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#elsif_group_of_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_group_of_lines(VerilogPreParser.Elsif_group_of_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#else_group_of_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_group_of_lines(VerilogPreParser.Else_group_of_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogPreParser#macro_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_text(VerilogPreParser.Macro_textContext ctx);
}