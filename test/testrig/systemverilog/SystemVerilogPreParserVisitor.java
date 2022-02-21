// Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4-2/verilog/systemverilog/SystemVerilogPreParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SystemVerilogPreParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SystemVerilogPreParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#source_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_text(SystemVerilogPreParser.Source_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_directive(SystemVerilogPreParser.Compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#file_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_directive(SystemVerilogPreParser.File_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#line_directive_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_directive_(SystemVerilogPreParser.Line_directive_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#begin_keywords_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_keywords_directive(SystemVerilogPreParser.Begin_keywords_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#celldefine_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCelldefine_directive(SystemVerilogPreParser.Celldefine_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#default_nettype_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_nettype_directive(SystemVerilogPreParser.Default_nettype_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#endcelldefine_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndcelldefine_directive(SystemVerilogPreParser.Endcelldefine_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#end_keywords_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_keywords_directive(SystemVerilogPreParser.End_keywords_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#ifdef_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdef_directive(SystemVerilogPreParser.Ifdef_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#ifndef_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfndef_directive(SystemVerilogPreParser.Ifndef_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#include_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_directive(SystemVerilogPreParser.Include_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#line_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_directive(SystemVerilogPreParser.Line_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#nounconnected_drive_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounconnected_drive_directive(SystemVerilogPreParser.Nounconnected_drive_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#pragma_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_directive(SystemVerilogPreParser.Pragma_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#resetall_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetall_directive(SystemVerilogPreParser.Resetall_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#text_macro_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_macro_definition(SystemVerilogPreParser.Text_macro_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#text_macro_usage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_macro_usage(SystemVerilogPreParser.Text_macro_usageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#timescale_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimescale_directive(SystemVerilogPreParser.Timescale_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#unconnected_drive_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconnected_drive_directive(SystemVerilogPreParser.Unconnected_drive_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#undef_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndef_directive(SystemVerilogPreParser.Undef_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#undefineall_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndefineall_directive(SystemVerilogPreParser.Undefineall_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#elsif_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_directive(SystemVerilogPreParser.Elsif_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#else_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_directive(SystemVerilogPreParser.Else_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#endif_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndif_directive(SystemVerilogPreParser.Endif_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#text_macro_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_macro_identifier(SystemVerilogPreParser.Text_macro_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#ifdef_group_of_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdef_group_of_lines(SystemVerilogPreParser.Ifdef_group_of_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#ifndef_group_of_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfndef_group_of_lines(SystemVerilogPreParser.Ifndef_group_of_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#elsif_group_of_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_group_of_lines(SystemVerilogPreParser.Elsif_group_of_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#else_group_of_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_group_of_lines(SystemVerilogPreParser.Else_group_of_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogPreParser#macro_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_text(SystemVerilogPreParser.Macro_textContext ctx);
}