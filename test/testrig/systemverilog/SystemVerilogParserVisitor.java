// Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4-2/verilog/systemverilog/SystemVerilogParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SystemVerilogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SystemVerilogParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#library_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_text(SystemVerilogParser.Library_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#library_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_description(SystemVerilogParser.Library_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#library_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_declaration(SystemVerilogParser.Library_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#include_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_statement(SystemVerilogParser.Include_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#file_path_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_path_spec(SystemVerilogParser.File_path_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#source_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_text(SystemVerilogParser.Source_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(SystemVerilogParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_nonansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_nonansi_header(SystemVerilogParser.Module_nonansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_ansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_ansi_header(SystemVerilogParser.Module_ansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_declaration(SystemVerilogParser.Module_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_keyword(SystemVerilogParser.Module_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration(SystemVerilogParser.Interface_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_nonansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_nonansi_header(SystemVerilogParser.Interface_nonansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_ansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_ansi_header(SystemVerilogParser.Interface_ansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#program_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_declaration(SystemVerilogParser.Program_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#program_nonansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_nonansi_header(SystemVerilogParser.Program_nonansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#program_ansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_ansi_header(SystemVerilogParser.Program_ansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#checker_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_declaration(SystemVerilogParser.Checker_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(SystemVerilogParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_class_type(SystemVerilogParser.Interface_class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_class_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_class_item(SystemVerilogParser.Interface_class_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_class_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_class_method(SystemVerilogParser.Interface_class_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declaration(SystemVerilogParser.Package_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#timeunits_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeunits_declaration(SystemVerilogParser.Timeunits_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parameter_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_port_list(SystemVerilogParser.Parameter_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parameter_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_port_declaration(SystemVerilogParser.Parameter_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_ports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_ports(SystemVerilogParser.List_of_portsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_port_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_declarations(SystemVerilogParser.List_of_port_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_declaration(SystemVerilogParser.Port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(SystemVerilogParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#port_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_expression(SystemVerilogParser.Port_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#port_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_reference(SystemVerilogParser.Port_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#port_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_direction(SystemVerilogParser.Port_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_port_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_port_header(SystemVerilogParser.Net_port_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_port_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_port_header(SystemVerilogParser.Variable_port_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_port_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_port_header(SystemVerilogParser.Interface_port_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ansi_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnsi_port_declaration(SystemVerilogParser.Ansi_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#elaboration_system_task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboration_system_task(SystemVerilogParser.Elaboration_system_taskContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#finish_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinish_number(SystemVerilogParser.Finish_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_common_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_common_item(SystemVerilogParser.Module_common_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_item(SystemVerilogParser.Module_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_or_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_or_generate_item(SystemVerilogParser.Module_or_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_or_generate_item_declaration(SystemVerilogParser.Module_or_generate_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#non_port_module_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_port_module_item(SystemVerilogParser.Non_port_module_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parameter_override}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_override(SystemVerilogParser.Parameter_overrideContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bind_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_directive(SystemVerilogParser.Bind_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bind_target_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_target_scope(SystemVerilogParser.Bind_target_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bind_target_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_target_instance(SystemVerilogParser.Bind_target_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bind_target_instance_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_target_instance_list(SystemVerilogParser.Bind_target_instance_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bind_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_instantiation(SystemVerilogParser.Bind_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#config_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_declaration(SystemVerilogParser.Config_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#design_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesign_statement(SystemVerilogParser.Design_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#config_rule_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_rule_statement(SystemVerilogParser.Config_rule_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_clause(SystemVerilogParser.Default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#inst_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_clause(SystemVerilogParser.Inst_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#inst_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_name(SystemVerilogParser.Inst_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cell_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_clause(SystemVerilogParser.Cell_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#liblist_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiblist_clause(SystemVerilogParser.Liblist_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#use_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_clause(SystemVerilogParser.Use_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_or_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_or_generate_item(SystemVerilogParser.Interface_or_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#extern_tf_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_tf_declaration(SystemVerilogParser.Extern_tf_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_item(SystemVerilogParser.Interface_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#non_port_interface_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_port_interface_item(SystemVerilogParser.Non_port_interface_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#program_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_item(SystemVerilogParser.Program_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#non_port_program_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_port_program_item(SystemVerilogParser.Non_port_program_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#program_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_generate_item(SystemVerilogParser.Program_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#checker_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_port_list(SystemVerilogParser.Checker_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#checker_port_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_port_item(SystemVerilogParser.Checker_port_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#checker_port_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_port_direction(SystemVerilogParser.Checker_port_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#checker_or_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_or_generate_item(SystemVerilogParser.Checker_or_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#checker_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_or_generate_item_declaration(SystemVerilogParser.Checker_or_generate_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#checker_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_generate_item(SystemVerilogParser.Checker_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_item(SystemVerilogParser.Class_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_property(SystemVerilogParser.Class_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_method(SystemVerilogParser.Class_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_constructor_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_constructor_prototype(SystemVerilogParser.Class_constructor_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_constraint(SystemVerilogParser.Class_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_item_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_item_qualifier(SystemVerilogParser.Class_item_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_qualifier(SystemVerilogParser.Property_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#random_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom_qualifier(SystemVerilogParser.Random_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#method_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_qualifier(SystemVerilogParser.Method_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#method_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_prototype(SystemVerilogParser.Method_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_constructor_declaration(SystemVerilogParser.Class_constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constraint_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_declaration(SystemVerilogParser.Constraint_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constraint_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_block(SystemVerilogParser.Constraint_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constraint_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_block_item(SystemVerilogParser.Constraint_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#solve_before_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolve_before_list(SystemVerilogParser.Solve_before_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constraint_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_primary(SystemVerilogParser.Constraint_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constraint_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_expression(SystemVerilogParser.Constraint_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#uniqueness_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueness_constraint(SystemVerilogParser.Uniqueness_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constraint_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_set(SystemVerilogParser.Constraint_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dist_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDist_list(SystemVerilogParser.Dist_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dist_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDist_item(SystemVerilogParser.Dist_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dist_weight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDist_weight(SystemVerilogParser.Dist_weightContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constraint_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_prototype(SystemVerilogParser.Constraint_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constraint_prototype_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_prototype_qualifier(SystemVerilogParser.Constraint_prototype_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#extern_constraint_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_constraint_declaration(SystemVerilogParser.Extern_constraint_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(SystemVerilogParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_item(SystemVerilogParser.Package_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_or_generate_item_declaration(SystemVerilogParser.Package_or_generate_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#anonymous_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_program(SystemVerilogParser.Anonymous_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#anonymous_program_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_program_item(SystemVerilogParser.Anonymous_program_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#local_parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_parameter_declaration(SystemVerilogParser.Local_parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(SystemVerilogParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#specparam_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecparam_declaration(SystemVerilogParser.Specparam_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#inout_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInout_declaration(SystemVerilogParser.Inout_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#input_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_declaration(SystemVerilogParser.Input_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#output_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_declaration(SystemVerilogParser.Output_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_port_declaration(SystemVerilogParser.Interface_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ref_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_declaration(SystemVerilogParser.Ref_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#data_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_declaration(SystemVerilogParser.Data_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_import_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_import_declaration(SystemVerilogParser.Package_import_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_import_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_import_item(SystemVerilogParser.Package_import_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_export_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_export_declaration(SystemVerilogParser.Package_export_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#genvar_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_declaration(SystemVerilogParser.Genvar_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_declaration(SystemVerilogParser.Net_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(SystemVerilogParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_type_declaration(SystemVerilogParser.Net_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#lifetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLifetime(SystemVerilogParser.LifetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(SystemVerilogParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#data_type_or_implicit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_or_implicit(SystemVerilogParser.Data_type_or_implicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#implicit_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_data_type(SystemVerilogParser.Implicit_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enum_base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_base_type(SystemVerilogParser.Enum_base_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enum_name_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_name_declaration(SystemVerilogParser.Enum_name_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_scope(SystemVerilogParser.Class_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(SystemVerilogParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#integer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_type(SystemVerilogParser.Integer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#integer_atom_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_atom_type(SystemVerilogParser.Integer_atom_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#integer_vector_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_vector_type(SystemVerilogParser.Integer_vector_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#non_integer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_integer_type(SystemVerilogParser.Non_integer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_type(SystemVerilogParser.Net_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_port_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_port_type(SystemVerilogParser.Net_port_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_port_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_port_type(SystemVerilogParser.Variable_port_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#var_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_data_type(SystemVerilogParser.Var_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#signing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigning(SystemVerilogParser.SigningContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(SystemVerilogParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#struct_union_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_union_member(SystemVerilogParser.Struct_union_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#data_type_or_void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_or_void(SystemVerilogParser.Data_type_or_voidContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#struct_union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_union(SystemVerilogParser.Struct_unionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#type_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_reference(SystemVerilogParser.Type_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#drive_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrive_strength(SystemVerilogParser.Drive_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#strength0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrength0(SystemVerilogParser.Strength0Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#strength1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrength1(SystemVerilogParser.Strength1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#charge_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharge_strength(SystemVerilogParser.Charge_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#delay3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay3(SystemVerilogParser.Delay3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#delay2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay2(SystemVerilogParser.Delay2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#delay_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_value(SystemVerilogParser.Delay_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_defparam_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_defparam_assignments(SystemVerilogParser.List_of_defparam_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_genvar_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_genvar_identifiers(SystemVerilogParser.List_of_genvar_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_interface_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_interface_identifiers(SystemVerilogParser.List_of_interface_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_net_decl_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_net_decl_assignments(SystemVerilogParser.List_of_net_decl_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_param_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_param_assignments(SystemVerilogParser.List_of_param_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_identifiers(SystemVerilogParser.List_of_port_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_udp_port_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_udp_port_identifiers(SystemVerilogParser.List_of_udp_port_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_specparam_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_specparam_assignments(SystemVerilogParser.List_of_specparam_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_tf_variable_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_tf_variable_identifiers(SystemVerilogParser.List_of_tf_variable_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_type_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_type_assignments(SystemVerilogParser.List_of_type_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_variable_decl_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_decl_assignments(SystemVerilogParser.List_of_variable_decl_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_variable_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_identifiers(SystemVerilogParser.List_of_variable_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_variable_port_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_port_identifiers(SystemVerilogParser.List_of_variable_port_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#defparam_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefparam_assignment(SystemVerilogParser.Defparam_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_decl_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_decl_assignment(SystemVerilogParser.Net_decl_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#param_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_assignment(SystemVerilogParser.Param_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#specparam_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecparam_assignment(SystemVerilogParser.Specparam_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#type_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_assignment(SystemVerilogParser.Type_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pulse_control_specparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulse_control_specparam(SystemVerilogParser.Pulse_control_specparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#error_limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_limit_value(SystemVerilogParser.Error_limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#reject_limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReject_limit_value(SystemVerilogParser.Reject_limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_value(SystemVerilogParser.Limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_decl_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_assignment(SystemVerilogParser.Variable_decl_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_new}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_new(SystemVerilogParser.Class_newContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dynamic_array_new}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_array_new(SystemVerilogParser.Dynamic_array_newContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unpacked_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpacked_dimension(SystemVerilogParser.Unpacked_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#packed_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPacked_dimension(SystemVerilogParser.Packed_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#associative_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociative_dimension(SystemVerilogParser.Associative_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_dimension(SystemVerilogParser.Variable_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#queue_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_dimension(SystemVerilogParser.Queue_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unsized_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsized_dimension(SystemVerilogParser.Unsized_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_data_type_or_implicit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_data_type_or_implicit(SystemVerilogParser.Function_data_type_or_implicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(SystemVerilogParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_body_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body_declaration(SystemVerilogParser.Function_body_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_prototype(SystemVerilogParser.Function_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dpi_import_export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_import_export(SystemVerilogParser.Dpi_import_exportContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dpi_spec_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_spec_string(SystemVerilogParser.Dpi_spec_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dpi_function_import_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_function_import_property(SystemVerilogParser.Dpi_function_import_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dpi_task_import_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_task_import_property(SystemVerilogParser.Dpi_task_import_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dpi_function_proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_function_proto(SystemVerilogParser.Dpi_function_protoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dpi_task_proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_task_proto(SystemVerilogParser.Dpi_task_protoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_declaration(SystemVerilogParser.Task_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_body_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_body_declaration(SystemVerilogParser.Task_body_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tf_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_item_declaration(SystemVerilogParser.Tf_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tf_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_port_list(SystemVerilogParser.Tf_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tf_port_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_port_item(SystemVerilogParser.Tf_port_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tf_port_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_port_direction(SystemVerilogParser.Tf_port_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tf_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_port_declaration(SystemVerilogParser.Tf_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_prototype(SystemVerilogParser.Task_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#block_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item_declaration(SystemVerilogParser.Block_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#modport_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_declaration(SystemVerilogParser.Modport_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#modport_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_item(SystemVerilogParser.Modport_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#modport_ports_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_ports_declaration(SystemVerilogParser.Modport_ports_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#modport_clocking_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_clocking_declaration(SystemVerilogParser.Modport_clocking_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#modport_simple_ports_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_simple_ports_declaration(SystemVerilogParser.Modport_simple_ports_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#modport_simple_port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_simple_port(SystemVerilogParser.Modport_simple_portContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#modport_tf_ports_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_tf_ports_declaration(SystemVerilogParser.Modport_tf_ports_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#modport_tf_port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_tf_port(SystemVerilogParser.Modport_tf_portContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#import_export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_export(SystemVerilogParser.Import_exportContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#concurrent_assertion_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_assertion_item(SystemVerilogParser.Concurrent_assertion_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#concurrent_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_assertion_statement(SystemVerilogParser.Concurrent_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assert_property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_property_statement(SystemVerilogParser.Assert_property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assume_property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssume_property_statement(SystemVerilogParser.Assume_property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cover_property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCover_property_statement(SystemVerilogParser.Cover_property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#expect_property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpect_property_statement(SystemVerilogParser.Expect_property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cover_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCover_sequence_statement(SystemVerilogParser.Cover_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#restrict_property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestrict_property_statement(SystemVerilogParser.Restrict_property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_instance(SystemVerilogParser.Property_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_list_of_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_list_of_arguments(SystemVerilogParser.Property_list_of_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_actual_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_actual_arg(SystemVerilogParser.Property_actual_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assertion_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion_item_declaration(SystemVerilogParser.Assertion_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration(SystemVerilogParser.Property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_port_list(SystemVerilogParser.Property_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_port_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_port_item(SystemVerilogParser.Property_port_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_lvar_port_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_lvar_port_direction(SystemVerilogParser.Property_lvar_port_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_formal_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_formal_type(SystemVerilogParser.Property_formal_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_spec(SystemVerilogParser.Property_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_expr(SystemVerilogParser.Property_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_case_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_case_item(SystemVerilogParser.Property_case_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_declaration(SystemVerilogParser.Sequence_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_port_list(SystemVerilogParser.Sequence_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_port_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_port_item(SystemVerilogParser.Sequence_port_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_lvar_port_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_lvar_port_direction(SystemVerilogParser.Sequence_lvar_port_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_formal_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_formal_type(SystemVerilogParser.Sequence_formal_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_expr(SystemVerilogParser.Sequence_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cycle_delay_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_delay_range(SystemVerilogParser.Cycle_delay_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_method_call(SystemVerilogParser.Sequence_method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_match_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_match_item(SystemVerilogParser.Sequence_match_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_instance(SystemVerilogParser.Sequence_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_list_of_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_list_of_arguments(SystemVerilogParser.Sequence_list_of_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_actual_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_actual_arg(SystemVerilogParser.Sequence_actual_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#boolean_abbrev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_abbrev(SystemVerilogParser.Boolean_abbrevContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_abbrev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_abbrev(SystemVerilogParser.Sequence_abbrevContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#consecutive_repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsecutive_repetition(SystemVerilogParser.Consecutive_repetitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#non_consecutive_repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_consecutive_repetition(SystemVerilogParser.Non_consecutive_repetitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#goto_repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_repetition(SystemVerilogParser.Goto_repetitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#const_or_range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_or_range_expression(SystemVerilogParser.Const_or_range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cycle_delay_const_range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_delay_const_range_expression(SystemVerilogParser.Cycle_delay_const_range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#expression_or_dist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_or_dist(SystemVerilogParser.Expression_or_distContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assertion_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion_variable_declaration(SystemVerilogParser.Assertion_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#covergroup_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCovergroup_declaration(SystemVerilogParser.Covergroup_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#coverage_spec_or_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverage_spec_or_option(SystemVerilogParser.Coverage_spec_or_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#coverage_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverage_option(SystemVerilogParser.Coverage_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#coverage_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverage_spec(SystemVerilogParser.Coverage_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#coverage_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverage_event(SystemVerilogParser.Coverage_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#block_event_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_event_expression(SystemVerilogParser.Block_event_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_btf_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_btf_identifier(SystemVerilogParser.Hierarchical_btf_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cover_point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCover_point(SystemVerilogParser.Cover_pointContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bins_or_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_or_empty(SystemVerilogParser.Bins_or_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bins_or_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_or_options(SystemVerilogParser.Bins_or_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bins_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_keyword(SystemVerilogParser.Bins_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#trans_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_list(SystemVerilogParser.Trans_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#trans_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_set(SystemVerilogParser.Trans_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#trans_range_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_range_list(SystemVerilogParser.Trans_range_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#trans_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_item(SystemVerilogParser.Trans_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#repeat_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_range(SystemVerilogParser.Repeat_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cover_cross}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCover_cross(SystemVerilogParser.Cover_crossContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_cross_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_cross_items(SystemVerilogParser.List_of_cross_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cross_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_item(SystemVerilogParser.Cross_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cross_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_body(SystemVerilogParser.Cross_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cross_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_body_item(SystemVerilogParser.Cross_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bins_selection_or_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_selection_or_option(SystemVerilogParser.Bins_selection_or_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bins_selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_selection(SystemVerilogParser.Bins_selectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#select_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_expression(SystemVerilogParser.Select_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#select_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_condition(SystemVerilogParser.Select_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bins_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_expression(SystemVerilogParser.Bins_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#covergroup_range_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCovergroup_range_list(SystemVerilogParser.Covergroup_range_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#covergroup_value_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCovergroup_value_range(SystemVerilogParser.Covergroup_value_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#with_covergroup_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_covergroup_expression(SystemVerilogParser.With_covergroup_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#set_covergroup_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_covergroup_expression(SystemVerilogParser.Set_covergroup_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#integer_covergroup_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_covergroup_expression(SystemVerilogParser.Integer_covergroup_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cross_set_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_set_expression(SystemVerilogParser.Cross_set_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#covergroup_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCovergroup_expression(SystemVerilogParser.Covergroup_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#let_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_declaration(SystemVerilogParser.Let_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#let_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_identifier(SystemVerilogParser.Let_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#let_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_port_list(SystemVerilogParser.Let_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#let_port_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_port_item(SystemVerilogParser.Let_port_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#let_formal_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_formal_type(SystemVerilogParser.Let_formal_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#let_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_expression(SystemVerilogParser.Let_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#let_list_of_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_list_of_arguments(SystemVerilogParser.Let_list_of_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#let_actual_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_actual_arg(SystemVerilogParser.Let_actual_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#gate_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGate_instantiation(SystemVerilogParser.Gate_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cmos_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmos_switch_instance(SystemVerilogParser.Cmos_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enable_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_gate_instance(SystemVerilogParser.Enable_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#mos_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMos_switch_instance(SystemVerilogParser.Mos_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_input_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_input_gate_instance(SystemVerilogParser.N_input_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_output_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_output_gate_instance(SystemVerilogParser.N_output_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_switch_instance(SystemVerilogParser.Pass_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_enable_switch_instance(SystemVerilogParser.Pass_enable_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pull_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPull_gate_instance(SystemVerilogParser.Pull_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pulldown_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulldown_strength(SystemVerilogParser.Pulldown_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pullup_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullup_strength(SystemVerilogParser.Pullup_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enable_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_terminal(SystemVerilogParser.Enable_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#inout_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInout_terminal(SystemVerilogParser.Inout_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#input_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_terminal(SystemVerilogParser.Input_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ncontrol_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNcontrol_terminal(SystemVerilogParser.Ncontrol_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#output_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_terminal(SystemVerilogParser.Output_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pcontrol_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPcontrol_terminal(SystemVerilogParser.Pcontrol_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cmos_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmos_switchtype(SystemVerilogParser.Cmos_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enable_gatetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_gatetype(SystemVerilogParser.Enable_gatetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#mos_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMos_switchtype(SystemVerilogParser.Mos_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_input_gatetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_input_gatetype(SystemVerilogParser.N_input_gatetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_output_gatetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_output_gatetype(SystemVerilogParser.N_output_gatetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_en_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_en_switchtype(SystemVerilogParser.Pass_en_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_switchtype(SystemVerilogParser.Pass_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_instantiation(SystemVerilogParser.Module_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parameter_value_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_value_assignment(SystemVerilogParser.Parameter_value_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_parameter_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_parameter_assignments(SystemVerilogParser.List_of_parameter_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ordered_parameter_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered_parameter_assignment(SystemVerilogParser.Ordered_parameter_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#named_parameter_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_parameter_assignment(SystemVerilogParser.Named_parameter_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_instance(SystemVerilogParser.Hierarchical_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#name_of_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_of_instance(SystemVerilogParser.Name_of_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_connections(SystemVerilogParser.List_of_port_connectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ordered_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered_port_connection(SystemVerilogParser.Ordered_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#named_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_port_connection(SystemVerilogParser.Named_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_instantiation(SystemVerilogParser.Interface_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#program_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_instantiation(SystemVerilogParser.Program_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#checker_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_instantiation(SystemVerilogParser.Checker_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_checker_port_connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_checker_port_connections(SystemVerilogParser.List_of_checker_port_connectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ordered_checker_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered_checker_port_connection(SystemVerilogParser.Ordered_checker_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#named_checker_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_checker_port_connection(SystemVerilogParser.Named_checker_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_region}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_region(SystemVerilogParser.Generate_regionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#loop_generate_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_generate_construct(SystemVerilogParser.Loop_generate_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#genvar_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_initialization(SystemVerilogParser.Genvar_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#genvar_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_iteration(SystemVerilogParser.Genvar_iterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#conditional_generate_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_generate_construct(SystemVerilogParser.Conditional_generate_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#if_generate_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_generate_construct(SystemVerilogParser.If_generate_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_generate_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_generate_construct(SystemVerilogParser.Case_generate_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_generate_item(SystemVerilogParser.Case_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_block(SystemVerilogParser.Generate_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_item(SystemVerilogParser.Generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_nonansi_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_nonansi_declaration(SystemVerilogParser.Udp_nonansi_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_ansi_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_ansi_declaration(SystemVerilogParser.Udp_ansi_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_declaration(SystemVerilogParser.Udp_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_port_list(SystemVerilogParser.Udp_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_declaration_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_declaration_port_list(SystemVerilogParser.Udp_declaration_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_port_declaration(SystemVerilogParser.Udp_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_output_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_output_declaration(SystemVerilogParser.Udp_output_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_input_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_input_declaration(SystemVerilogParser.Udp_input_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_reg_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_reg_declaration(SystemVerilogParser.Udp_reg_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_body(SystemVerilogParser.Udp_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#combinational_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinational_body(SystemVerilogParser.Combinational_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#combinational_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinational_entry(SystemVerilogParser.Combinational_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequential_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequential_body(SystemVerilogParser.Sequential_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_initial_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_initial_statement(SystemVerilogParser.Udp_initial_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#init_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_val(SystemVerilogParser.Init_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequential_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequential_entry(SystemVerilogParser.Sequential_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#seq_input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_input_list(SystemVerilogParser.Seq_input_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#level_input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel_input_list(SystemVerilogParser.Level_input_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#edge_input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_input_list(SystemVerilogParser.Edge_input_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#edge_indicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_indicator(SystemVerilogParser.Edge_indicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#current_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_state(SystemVerilogParser.Current_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#next_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_state(SystemVerilogParser.Next_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#output_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_symbol(SystemVerilogParser.Output_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#level_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel_symbol(SystemVerilogParser.Level_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#edge_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_symbol(SystemVerilogParser.Edge_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_instantiation(SystemVerilogParser.Udp_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_instance(SystemVerilogParser.Udp_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#continuous_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuous_assign(SystemVerilogParser.Continuous_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_net_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_net_assignments(SystemVerilogParser.List_of_net_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_variable_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_assignments(SystemVerilogParser.List_of_variable_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_alias(SystemVerilogParser.Net_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_assignment(SystemVerilogParser.Net_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#initial_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_construct(SystemVerilogParser.Initial_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#always_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlways_construct(SystemVerilogParser.Always_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#always_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlways_keyword(SystemVerilogParser.Always_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#final_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_construct(SystemVerilogParser.Final_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#blocking_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocking_assignment(SystemVerilogParser.Blocking_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#operator_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_assignment(SystemVerilogParser.Operator_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(SystemVerilogParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#nonblocking_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonblocking_assignment(SystemVerilogParser.Nonblocking_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#procedural_continuous_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_continuous_assignment(SystemVerilogParser.Procedural_continuous_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(SystemVerilogParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#action_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_block(SystemVerilogParser.Action_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#seq_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_block(SystemVerilogParser.Seq_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#par_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_block(SystemVerilogParser.Par_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#join_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_keyword(SystemVerilogParser.Join_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#statement_or_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_or_null(SystemVerilogParser.Statement_or_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SystemVerilogParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#statement_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_item(SystemVerilogParser.Statement_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement(SystemVerilogParser.Function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_statement_or_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement_or_null(SystemVerilogParser.Function_statement_or_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_identifier_list(SystemVerilogParser.Variable_identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#procedural_timing_control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_timing_control_statement(SystemVerilogParser.Procedural_timing_control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#delay_or_event_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_or_event_control(SystemVerilogParser.Delay_or_event_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#delay_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_control(SystemVerilogParser.Delay_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_control(SystemVerilogParser.Event_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_expression(SystemVerilogParser.Event_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#procedural_timing_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_timing_control(SystemVerilogParser.Procedural_timing_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(SystemVerilogParser.Jump_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#wait_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_statement(SystemVerilogParser.Wait_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_trigger(SystemVerilogParser.Event_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#disable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisable_statement(SystemVerilogParser.Disable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(SystemVerilogParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unique_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_priority(SystemVerilogParser.Unique_priorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cond_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_predicate(SystemVerilogParser.Cond_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#expression_or_cond_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_or_cond_pattern(SystemVerilogParser.Expression_or_cond_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cond_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_pattern(SystemVerilogParser.Cond_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(SystemVerilogParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_keyword(SystemVerilogParser.Case_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(SystemVerilogParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item(SystemVerilogParser.Case_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_pattern_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_pattern_item(SystemVerilogParser.Case_pattern_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_inside_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_inside_item(SystemVerilogParser.Case_inside_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_item_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item_expression(SystemVerilogParser.Case_item_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#randcase_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandcase_statement(SystemVerilogParser.Randcase_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#randcase_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandcase_item(SystemVerilogParser.Randcase_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#open_range_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_range_list(SystemVerilogParser.Open_range_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#open_value_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_value_range(SystemVerilogParser.Open_value_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(SystemVerilogParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assignment_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern(SystemVerilogParser.Assignment_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#structure_pattern_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_pattern_key(SystemVerilogParser.Structure_pattern_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#array_pattern_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_pattern_key(SystemVerilogParser.Array_pattern_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assignment_pattern_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern_key(SystemVerilogParser.Assignment_pattern_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assignment_pattern_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern_expression(SystemVerilogParser.Assignment_pattern_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assignment_pattern_expression_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern_expression_type(SystemVerilogParser.Assignment_pattern_expression_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_assignment_pattern_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_assignment_pattern_expression(SystemVerilogParser.Constant_assignment_pattern_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assignment_pattern_net_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern_net_lvalue(SystemVerilogParser.Assignment_pattern_net_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assignment_pattern_variable_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern_variable_lvalue(SystemVerilogParser.Assignment_pattern_variable_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(SystemVerilogParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#for_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_initialization(SystemVerilogParser.For_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#for_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_variable_declaration(SystemVerilogParser.For_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#for_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_step(SystemVerilogParser.For_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#for_step_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_step_assignment(SystemVerilogParser.For_step_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#loop_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_variables(SystemVerilogParser.Loop_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#subroutine_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_call_statement(SystemVerilogParser.Subroutine_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assertion_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion_item(SystemVerilogParser.Assertion_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#deferred_immediate_assertion_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_immediate_assertion_item(SystemVerilogParser.Deferred_immediate_assertion_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#procedural_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_assertion_statement(SystemVerilogParser.Procedural_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#immediate_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmediate_assertion_statement(SystemVerilogParser.Immediate_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#simple_immediate_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_immediate_assertion_statement(SystemVerilogParser.Simple_immediate_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#simple_immediate_assert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_immediate_assert_statement(SystemVerilogParser.Simple_immediate_assert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#simple_immediate_assume_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_immediate_assume_statement(SystemVerilogParser.Simple_immediate_assume_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#simple_immediate_cover_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_immediate_cover_statement(SystemVerilogParser.Simple_immediate_cover_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#deferred_immediate_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_immediate_assertion_statement(SystemVerilogParser.Deferred_immediate_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#deferred_immediate_assert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_immediate_assert_statement(SystemVerilogParser.Deferred_immediate_assert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#deferred_immediate_assume_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_immediate_assume_statement(SystemVerilogParser.Deferred_immediate_assume_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#deferred_immediate_cover_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_immediate_cover_statement(SystemVerilogParser.Deferred_immediate_cover_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#clocking_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_declaration(SystemVerilogParser.Clocking_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#clocking_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_event(SystemVerilogParser.Clocking_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#clocking_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_item(SystemVerilogParser.Clocking_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#default_skew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_skew(SystemVerilogParser.Default_skewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#clocking_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_direction(SystemVerilogParser.Clocking_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_clocking_decl_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_clocking_decl_assign(SystemVerilogParser.List_of_clocking_decl_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#clocking_decl_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_decl_assign(SystemVerilogParser.Clocking_decl_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#clocking_skew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_skew(SystemVerilogParser.Clocking_skewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#clocking_drive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_drive(SystemVerilogParser.Clocking_driveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cycle_delay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_delay(SystemVerilogParser.Cycle_delayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#clockvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockvar(SystemVerilogParser.ClockvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#clockvar_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockvar_expression(SystemVerilogParser.Clockvar_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#randsequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandsequence_statement(SystemVerilogParser.Randsequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#production}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduction(SystemVerilogParser.ProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#rs_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_rule(SystemVerilogParser.Rs_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#rs_production_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_production_list(SystemVerilogParser.Rs_production_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#weight_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeight_specification(SystemVerilogParser.Weight_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#rs_code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_code_block(SystemVerilogParser.Rs_code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#rs_prod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_prod(SystemVerilogParser.Rs_prodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#production_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduction_item(SystemVerilogParser.Production_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#rs_if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_if_else(SystemVerilogParser.Rs_if_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#rs_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_repeat(SystemVerilogParser.Rs_repeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#rs_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_case(SystemVerilogParser.Rs_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#rs_case_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_case_item(SystemVerilogParser.Rs_case_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#specify_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_block(SystemVerilogParser.Specify_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#specify_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_item(SystemVerilogParser.Specify_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pulsestyle_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulsestyle_declaration(SystemVerilogParser.Pulsestyle_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#showcancelled_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowcancelled_declaration(SystemVerilogParser.Showcancelled_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_declaration(SystemVerilogParser.Path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#simple_path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_path_declaration(SystemVerilogParser.Simple_path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parallel_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_path_description(SystemVerilogParser.Parallel_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#full_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_path_description(SystemVerilogParser.Full_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_path_inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_path_inputs(SystemVerilogParser.List_of_path_inputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_path_outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_path_outputs(SystemVerilogParser.List_of_path_outputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#specify_input_terminal_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_input_terminal_descriptor(SystemVerilogParser.Specify_input_terminal_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#specify_output_terminal_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_output_terminal_descriptor(SystemVerilogParser.Specify_output_terminal_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#input_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_identifier(SystemVerilogParser.Input_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#output_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_identifier(SystemVerilogParser.Output_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#path_delay_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_delay_value(SystemVerilogParser.Path_delay_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_path_delay_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_path_delay_expressions(SystemVerilogParser.List_of_path_delay_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#t_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_path_delay_expression(SystemVerilogParser.T_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#trise_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrise_path_delay_expression(SystemVerilogParser.Trise_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tfall_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfall_path_delay_expression(SystemVerilogParser.Tfall_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tz_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTz_path_delay_expression(SystemVerilogParser.Tz_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#t01_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT01_path_delay_expression(SystemVerilogParser.T01_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#t10_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT10_path_delay_expression(SystemVerilogParser.T10_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#t0z_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT0z_path_delay_expression(SystemVerilogParser.T0z_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tz1_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTz1_path_delay_expression(SystemVerilogParser.Tz1_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#t1z_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT1z_path_delay_expression(SystemVerilogParser.T1z_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tz0_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTz0_path_delay_expression(SystemVerilogParser.Tz0_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#t0x_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT0x_path_delay_expression(SystemVerilogParser.T0x_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tx1_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTx1_path_delay_expression(SystemVerilogParser.Tx1_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#t1x_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT1x_path_delay_expression(SystemVerilogParser.T1x_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tx0_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTx0_path_delay_expression(SystemVerilogParser.Tx0_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#txz_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxz_path_delay_expression(SystemVerilogParser.Txz_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tzx_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzx_path_delay_expression(SystemVerilogParser.Tzx_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_delay_expression(SystemVerilogParser.Path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#edge_sensitive_path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_sensitive_path_declaration(SystemVerilogParser.Edge_sensitive_path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parallel_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_edge_sensitive_path_description(SystemVerilogParser.Parallel_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#full_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_edge_sensitive_path_description(SystemVerilogParser.Full_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#data_source_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_source_expression(SystemVerilogParser.Data_source_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#edge_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_identifier(SystemVerilogParser.Edge_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#state_dependent_path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_dependent_path_declaration(SystemVerilogParser.State_dependent_path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#polarity_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolarity_operator(SystemVerilogParser.Polarity_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#system_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_timing_check(SystemVerilogParser.System_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#setup_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetup_timing_check(SystemVerilogParser.Setup_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hold_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHold_timing_check(SystemVerilogParser.Hold_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#setuphold_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetuphold_timing_check(SystemVerilogParser.Setuphold_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#recovery_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecovery_timing_check(SystemVerilogParser.Recovery_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#removal_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoval_timing_check(SystemVerilogParser.Removal_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#recrem_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecrem_timing_check(SystemVerilogParser.Recrem_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#skew_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkew_timing_check(SystemVerilogParser.Skew_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#timeskew_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeskew_timing_check(SystemVerilogParser.Timeskew_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#fullskew_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullskew_timing_check(SystemVerilogParser.Fullskew_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#period_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriod_timing_check(SystemVerilogParser.Period_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#width_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth_timing_check(SystemVerilogParser.Width_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#nochange_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNochange_timing_check(SystemVerilogParser.Nochange_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#timecheck_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimecheck_condition(SystemVerilogParser.Timecheck_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#controlled_reference_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlled_reference_event(SystemVerilogParser.Controlled_reference_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#data_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_event(SystemVerilogParser.Data_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#delayed_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayed_data(SystemVerilogParser.Delayed_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#delayed_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayed_reference(SystemVerilogParser.Delayed_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#end_edge_offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_edge_offset(SystemVerilogParser.End_edge_offsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_based_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_based_flag(SystemVerilogParser.Event_based_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#notifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifier(SystemVerilogParser.NotifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#reference_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_event(SystemVerilogParser.Reference_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#remain_active_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemain_active_flag(SystemVerilogParser.Remain_active_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#timestamp_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_condition(SystemVerilogParser.Timestamp_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#start_edge_offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_edge_offset(SystemVerilogParser.Start_edge_offsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#threshold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreshold(SystemVerilogParser.ThresholdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#timing_check_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_check_limit(SystemVerilogParser.Timing_check_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#timing_check_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_check_event(SystemVerilogParser.Timing_check_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#controlled_timing_check_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlled_timing_check_event(SystemVerilogParser.Controlled_timing_check_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#timing_check_event_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_check_event_control(SystemVerilogParser.Timing_check_event_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#specify_terminal_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_terminal_descriptor(SystemVerilogParser.Specify_terminal_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#edge_control_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_control_specifier(SystemVerilogParser.Edge_control_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#edge_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_descriptor(SystemVerilogParser.Edge_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#timing_check_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_check_condition(SystemVerilogParser.Timing_check_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#scalar_timing_check_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_timing_check_condition(SystemVerilogParser.Scalar_timing_check_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#scalar_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_constant(SystemVerilogParser.Scalar_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(SystemVerilogParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_concatenation(SystemVerilogParser.Constant_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_multiple_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_multiple_concatenation(SystemVerilogParser.Constant_multiple_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_path_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_concatenation(SystemVerilogParser.Module_path_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_path_multiple_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_multiple_concatenation(SystemVerilogParser.Module_path_multiple_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#multiple_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_concatenation(SystemVerilogParser.Multiple_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#streaming_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreaming_concatenation(SystemVerilogParser.Streaming_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#stream_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_operator(SystemVerilogParser.Stream_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#slice_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice_size(SystemVerilogParser.Slice_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#stream_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_concatenation(SystemVerilogParser.Stream_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#stream_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_expression(SystemVerilogParser.Stream_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#array_range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_range_expression(SystemVerilogParser.Array_range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#empty_unpacked_array_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_unpacked_array_concatenation(SystemVerilogParser.Empty_unpacked_array_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tf_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_call(SystemVerilogParser.Tf_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#system_tf_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_tf_call(SystemVerilogParser.System_tf_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#subroutine_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_call(SystemVerilogParser.Subroutine_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_subroutine_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_subroutine_call(SystemVerilogParser.Function_subroutine_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_arguments(SystemVerilogParser.List_of_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(SystemVerilogParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#method_call_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_body(SystemVerilogParser.Method_call_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#built_in_method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_in_method_call(SystemVerilogParser.Built_in_method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#array_manipulation_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_manipulation_call(SystemVerilogParser.Array_manipulation_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#randomize_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomize_call(SystemVerilogParser.Randomize_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#method_call_root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_root(SystemVerilogParser.Method_call_rootContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#array_method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_method_name(SystemVerilogParser.Array_method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#inc_or_dec_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_or_dec_expression(SystemVerilogParser.Inc_or_dec_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(SystemVerilogParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_mintypmax_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_mintypmax_expression(SystemVerilogParser.Constant_mintypmax_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_param_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_param_expression(SystemVerilogParser.Constant_param_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#param_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_expression(SystemVerilogParser.Param_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_range_expression(SystemVerilogParser.Constant_range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_part_select_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_part_select_range(SystemVerilogParser.Constant_part_select_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_range(SystemVerilogParser.Constant_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_indexed_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_indexed_range(SystemVerilogParser.Constant_indexed_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SystemVerilogParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#value_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_range(SystemVerilogParser.Value_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMintypmax_expression(SystemVerilogParser.Mintypmax_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_expression(SystemVerilogParser.Module_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_path_mintypmax_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_mintypmax_expression(SystemVerilogParser.Module_path_mintypmax_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#part_select_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart_select_range(SystemVerilogParser.Part_select_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#indexed_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_range(SystemVerilogParser.Indexed_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#genvar_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_expression(SystemVerilogParser.Genvar_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_primary(SystemVerilogParser.Constant_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_path_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_primary(SystemVerilogParser.Module_path_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(SystemVerilogParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_qualifier(SystemVerilogParser.Class_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_expression(SystemVerilogParser.Range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#primary_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_literal(SystemVerilogParser.Primary_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#time_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_literal(SystemVerilogParser.Time_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#implicit_class_handle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_class_handle(SystemVerilogParser.Implicit_class_handleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bit_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_select(SystemVerilogParser.Bit_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#select_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_(SystemVerilogParser.Select_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#nonrange_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonrange_select(SystemVerilogParser.Nonrange_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_bit_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_bit_select(SystemVerilogParser.Constant_bit_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_select(SystemVerilogParser.Constant_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_let_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_let_expression(SystemVerilogParser.Constant_let_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_lvalue(SystemVerilogParser.Net_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_lvalue(SystemVerilogParser.Variable_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#nonrange_variable_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonrange_variable_lvalue(SystemVerilogParser.Nonrange_variable_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SystemVerilogParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(SystemVerilogParser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#inc_or_dec_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_or_dec_operator(SystemVerilogParser.Inc_or_dec_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unary_module_path_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_module_path_operator(SystemVerilogParser.Unary_module_path_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#binary_module_path_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_module_path_operator(SystemVerilogParser.Binary_module_path_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SystemVerilogParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#integral_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegral_number(SystemVerilogParser.Integral_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#decimal_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_number(SystemVerilogParser.Decimal_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#binary_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_number(SystemVerilogParser.Binary_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#octal_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_number(SystemVerilogParser.Octal_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hex_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex_number(SystemVerilogParser.Hex_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#real_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_number(SystemVerilogParser.Real_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unsigned_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_number(SystemVerilogParser.Unsigned_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unbased_unsized_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnbased_unsized_literal(SystemVerilogParser.Unbased_unsized_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(SystemVerilogParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attribute_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_instance(SystemVerilogParser.Attribute_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_spec(SystemVerilogParser.Attr_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_name(SystemVerilogParser.Attr_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#array_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_identifier(SystemVerilogParser.Array_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_identifier(SystemVerilogParser.Block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bin_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_identifier(SystemVerilogParser.Bin_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#c_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_identifier(SystemVerilogParser.C_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cell_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_identifier(SystemVerilogParser.Cell_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#checker_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_identifier(SystemVerilogParser.Checker_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_identifier(SystemVerilogParser.Class_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#class_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_variable_identifier(SystemVerilogParser.Class_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#clocking_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_identifier(SystemVerilogParser.Clocking_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#config_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_identifier(SystemVerilogParser.Config_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#const_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_identifier(SystemVerilogParser.Const_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constraint_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_identifier(SystemVerilogParser.Constraint_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#covergroup_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCovergroup_identifier(SystemVerilogParser.Covergroup_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#covergroup_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCovergroup_variable_identifier(SystemVerilogParser.Covergroup_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cover_point_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCover_point_identifier(SystemVerilogParser.Cover_point_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cross_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_identifier(SystemVerilogParser.Cross_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dynamic_array_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_array_variable_identifier(SystemVerilogParser.Dynamic_array_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enum_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_identifier(SystemVerilogParser.Enum_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#escaped_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped_identifier(SystemVerilogParser.Escaped_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#formal_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_identifier(SystemVerilogParser.Formal_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#formal_port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_port_identifier(SystemVerilogParser.Formal_port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_identifier(SystemVerilogParser.Function_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_block_identifier(SystemVerilogParser.Generate_block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#genvar_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_identifier(SystemVerilogParser.Genvar_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_array_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_array_identifier(SystemVerilogParser.Hierarchical_array_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_block_identifier(SystemVerilogParser.Hierarchical_block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_event_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_event_identifier(SystemVerilogParser.Hierarchical_event_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_identifier(SystemVerilogParser.Hierarchical_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_net_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_net_identifier(SystemVerilogParser.Hierarchical_net_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_parameter_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_parameter_identifier(SystemVerilogParser.Hierarchical_parameter_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_property_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_property_identifier(SystemVerilogParser.Hierarchical_property_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_sequence_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_sequence_identifier(SystemVerilogParser.Hierarchical_sequence_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_task_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_task_identifier(SystemVerilogParser.Hierarchical_task_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_tf_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_tf_identifier(SystemVerilogParser.Hierarchical_tf_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_variable_identifier(SystemVerilogParser.Hierarchical_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SystemVerilogParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#index_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_variable_identifier(SystemVerilogParser.Index_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_identifier(SystemVerilogParser.Interface_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#interface_instance_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_instance_identifier(SystemVerilogParser.Interface_instance_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#inout_port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInout_port_identifier(SystemVerilogParser.Inout_port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#input_port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_port_identifier(SystemVerilogParser.Input_port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#instance_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_identifier(SystemVerilogParser.Instance_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#library_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_identifier(SystemVerilogParser.Library_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#member_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_identifier(SystemVerilogParser.Member_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#method_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_identifier(SystemVerilogParser.Method_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#modport_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_identifier(SystemVerilogParser.Modport_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_identifier(SystemVerilogParser.Module_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_identifier(SystemVerilogParser.Net_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_type_identifier(SystemVerilogParser.Net_type_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#output_port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_port_identifier(SystemVerilogParser.Output_port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_identifier(SystemVerilogParser.Package_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_scope(SystemVerilogParser.Package_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parameter_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_identifier(SystemVerilogParser.Parameter_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_identifier(SystemVerilogParser.Port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#production_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduction_identifier(SystemVerilogParser.Production_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#program_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_identifier(SystemVerilogParser.Program_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_identifier(SystemVerilogParser.Property_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ps_class_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_class_identifier(SystemVerilogParser.Ps_class_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ps_covergroup_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_covergroup_identifier(SystemVerilogParser.Ps_covergroup_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ps_checker_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_checker_identifier(SystemVerilogParser.Ps_checker_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ps_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_identifier(SystemVerilogParser.Ps_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ps_or_hierarchical_array_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_or_hierarchical_array_identifier(SystemVerilogParser.Ps_or_hierarchical_array_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ps_or_hierarchical_net_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_or_hierarchical_net_identifier(SystemVerilogParser.Ps_or_hierarchical_net_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ps_or_hierarchical_property_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_or_hierarchical_property_identifier(SystemVerilogParser.Ps_or_hierarchical_property_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ps_or_hierarchical_sequence_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_or_hierarchical_sequence_identifier(SystemVerilogParser.Ps_or_hierarchical_sequence_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ps_or_hierarchical_tf_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_or_hierarchical_tf_identifier(SystemVerilogParser.Ps_or_hierarchical_tf_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ps_parameter_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_parameter_identifier(SystemVerilogParser.Ps_parameter_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ps_type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_type_identifier(SystemVerilogParser.Ps_type_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sequence_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_identifier(SystemVerilogParser.Sequence_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#signal_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_identifier(SystemVerilogParser.Signal_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#simple_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_identifier(SystemVerilogParser.Simple_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#specparam_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecparam_identifier(SystemVerilogParser.Specparam_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#system_tf_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_tf_identifier(SystemVerilogParser.System_tf_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_identifier(SystemVerilogParser.Task_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tf_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_identifier(SystemVerilogParser.Tf_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#terminal_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal_identifier(SystemVerilogParser.Terminal_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#topmodule_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopmodule_identifier(SystemVerilogParser.Topmodule_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_identifier(SystemVerilogParser.Type_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#udp_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_identifier(SystemVerilogParser.Udp_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_identifier(SystemVerilogParser.Variable_identifierContext ctx);
}