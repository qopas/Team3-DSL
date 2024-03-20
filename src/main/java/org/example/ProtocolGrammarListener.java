package org.example;// Generated from ProtocolGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProtocolGrammarParser}.
 */
public interface ProtocolGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#protocol}.
	 * @param ctx the parse tree
	 */
	void enterProtocol(ProtocolGrammarParser.ProtocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#protocol}.
	 * @param ctx the parse tree
	 */
	void exitProtocol(ProtocolGrammarParser.ProtocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#agent_definitions}.
	 * @param ctx the parse tree
	 */
	void enterAgent_definitions(ProtocolGrammarParser.Agent_definitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#agent_definitions}.
	 * @param ctx the parse tree
	 */
	void exitAgent_definitions(ProtocolGrammarParser.Agent_definitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#agent_definition}.
	 * @param ctx the parse tree
	 */
	void enterAgent_definition(ProtocolGrammarParser.Agent_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#agent_definition}.
	 * @param ctx the parse tree
	 */
	void exitAgent_definition(ProtocolGrammarParser.Agent_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#agent_name}.
	 * @param ctx the parse tree
	 */
	void enterAgent_name(ProtocolGrammarParser.Agent_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#agent_name}.
	 * @param ctx the parse tree
	 */
	void exitAgent_name(ProtocolGrammarParser.Agent_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#agent_type}.
	 * @param ctx the parse tree
	 */
	void enterAgent_type(ProtocolGrammarParser.Agent_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#agent_type}.
	 * @param ctx the parse tree
	 */
	void exitAgent_type(ProtocolGrammarParser.Agent_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#message_definitions}.
	 * @param ctx the parse tree
	 */
	void enterMessage_definitions(ProtocolGrammarParser.Message_definitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#message_definitions}.
	 * @param ctx the parse tree
	 */
	void exitMessage_definitions(ProtocolGrammarParser.Message_definitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#message_definition}.
	 * @param ctx the parse tree
	 */
	void enterMessage_definition(ProtocolGrammarParser.Message_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#message_definition}.
	 * @param ctx the parse tree
	 */
	void exitMessage_definition(ProtocolGrammarParser.Message_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#message_name}.
	 * @param ctx the parse tree
	 */
	void enterMessage_name(ProtocolGrammarParser.Message_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#message_name}.
	 * @param ctx the parse tree
	 */
	void exitMessage_name(ProtocolGrammarParser.Message_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#message_type}.
	 * @param ctx the parse tree
	 */
	void enterMessage_type(ProtocolGrammarParser.Message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#message_type}.
	 * @param ctx the parse tree
	 */
	void exitMessage_type(ProtocolGrammarParser.Message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#message_properties}.
	 * @param ctx the parse tree
	 */
	void enterMessage_properties(ProtocolGrammarParser.Message_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#message_properties}.
	 * @param ctx the parse tree
	 */
	void exitMessage_properties(ProtocolGrammarParser.Message_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#message_property}.
	 * @param ctx the parse tree
	 */
	void enterMessage_property(ProtocolGrammarParser.Message_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#message_property}.
	 * @param ctx the parse tree
	 */
	void exitMessage_property(ProtocolGrammarParser.Message_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#prompt_value}.
	 * @param ctx the parse tree
	 */
	void enterPrompt_value(ProtocolGrammarParser.Prompt_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#prompt_value}.
	 * @param ctx the parse tree
	 */
	void exitPrompt_value(ProtocolGrammarParser.Prompt_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProtocolGrammarParser#description_value}.
	 * @param ctx the parse tree
	 */
	void enterDescription_value(ProtocolGrammarParser.Description_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProtocolGrammarParser#description_value}.
	 * @param ctx the parse tree
	 */
	void exitDescription_value(ProtocolGrammarParser.Description_valueContext ctx);
}