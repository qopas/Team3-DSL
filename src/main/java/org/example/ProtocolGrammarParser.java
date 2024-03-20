package org.example;// Generated from ProtocolGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProtocolGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		IDENTIFIER=10, STRING=11;
	public static final int
		RULE_protocol = 0, RULE_agent_definitions = 1, RULE_agent_definition = 2, 
		RULE_agent_name = 3, RULE_agent_type = 4, RULE_message_definitions = 5, 
		RULE_message_definition = 6, RULE_message_name = 7, RULE_message_type = 8, 
		RULE_message_properties = 9, RULE_message_property = 10, RULE_prompt_value = 11, 
		RULE_description_value = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"protocol", "agent_definitions", "agent_definition", "agent_name", "agent_type", 
			"message_definitions", "message_definition", "message_name", "message_type", 
			"message_properties", "message_property", "prompt_value", "description_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Agent'", "':'", "';'", "'Message'", "'Text'", "'Audio'", "'Image'", 
			"'Prompt:'", "'Description:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "IDENTIFIER", 
			"STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ProtocolGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProtocolGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProtocolContext extends ParserRuleContext {
		public Agent_definitionsContext agent_definitions() {
			return getRuleContext(Agent_definitionsContext.class,0);
		}
		public Message_definitionsContext message_definitions() {
			return getRuleContext(Message_definitionsContext.class,0);
		}
		public ProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener) ((ProtocolGrammarListener)listener).enterProtocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitProtocol(this);
		}
	}

	public final ProtocolContext protocol() throws RecognitionException {
		ProtocolContext _localctx = new ProtocolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_protocol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			agent_definitions();
			setState(27);
			message_definitions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Agent_definitionsContext extends ParserRuleContext {
		public List<Agent_definitionContext> agent_definition() {
			return getRuleContexts(Agent_definitionContext.class);
		}
		public Agent_definitionContext agent_definition(int i) {
			return getRuleContext(Agent_definitionContext.class,i);
		}
		public Agent_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agent_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterAgent_definitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitAgent_definitions(this);
		}
	}

	public final Agent_definitionsContext agent_definitions() throws RecognitionException {
		Agent_definitionsContext _localctx = new Agent_definitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_agent_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				agent_definition();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Agent_definitionContext extends ParserRuleContext {
		public Agent_nameContext agent_name() {
			return getRuleContext(Agent_nameContext.class,0);
		}
		public Agent_typeContext agent_type() {
			return getRuleContext(Agent_typeContext.class,0);
		}
		public Agent_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agent_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterAgent_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitAgent_definition(this);
		}
	}

	public final Agent_definitionContext agent_definition() throws RecognitionException {
		Agent_definitionContext _localctx = new Agent_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_agent_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			agent_name();
			setState(36);
			match(T__1);
			setState(37);
			agent_type();
			setState(38);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Agent_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProtocolGrammarParser.IDENTIFIER, 0); }
		public Agent_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agent_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterAgent_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitAgent_name(this);
		}
	}

	public final Agent_nameContext agent_name() throws RecognitionException {
		Agent_nameContext _localctx = new Agent_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_agent_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Agent_typeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProtocolGrammarParser.IDENTIFIER, 0); }
		public Agent_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agent_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterAgent_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitAgent_type(this);
		}
	}

	public final Agent_typeContext agent_type() throws RecognitionException {
		Agent_typeContext _localctx = new Agent_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_agent_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Message_definitionsContext extends ParserRuleContext {
		public List<Message_definitionContext> message_definition() {
			return getRuleContexts(Message_definitionContext.class);
		}
		public Message_definitionContext message_definition(int i) {
			return getRuleContext(Message_definitionContext.class,i);
		}
		public Message_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterMessage_definitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitMessage_definitions(this);
		}
	}

	public final Message_definitionsContext message_definitions() throws RecognitionException {
		Message_definitionsContext _localctx = new Message_definitionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_message_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				message_definition();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Message_definitionContext extends ParserRuleContext {
		public Message_nameContext message_name() {
			return getRuleContext(Message_nameContext.class,0);
		}
		public Message_typeContext message_type() {
			return getRuleContext(Message_typeContext.class,0);
		}
		public Message_propertiesContext message_properties() {
			return getRuleContext(Message_propertiesContext.class,0);
		}
		public Message_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterMessage_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitMessage_definition(this);
		}
	}

	public final Message_definitionContext message_definition() throws RecognitionException {
		Message_definitionContext _localctx = new Message_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_message_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__3);
			setState(50);
			message_name();
			setState(51);
			match(T__1);
			setState(52);
			message_type();
			setState(53);
			message_properties();
			setState(54);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Message_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProtocolGrammarParser.IDENTIFIER, 0); }
		public Message_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterMessage_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitMessage_name(this);
		}
	}

	public final Message_nameContext message_name() throws RecognitionException {
		Message_nameContext _localctx = new Message_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_message_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Message_typeContext extends ParserRuleContext {
		public Message_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterMessage_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitMessage_type(this);
		}
	}

	public final Message_typeContext message_type() throws RecognitionException {
		Message_typeContext _localctx = new Message_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_message_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Message_propertiesContext extends ParserRuleContext {
		public List<Message_propertyContext> message_property() {
			return getRuleContexts(Message_propertyContext.class);
		}
		public Message_propertyContext message_property(int i) {
			return getRuleContext(Message_propertyContext.class,i);
		}
		public Message_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterMessage_properties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitMessage_properties(this);
		}
	}

	public final Message_propertiesContext message_properties() throws RecognitionException {
		Message_propertiesContext _localctx = new Message_propertiesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_message_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				message_property();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==T__8 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Message_propertyContext extends ParserRuleContext {
		public Prompt_valueContext prompt_value() {
			return getRuleContext(Prompt_valueContext.class,0);
		}
		public Description_valueContext description_value() {
			return getRuleContext(Description_valueContext.class,0);
		}
		public Message_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterMessage_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitMessage_property(this);
		}
	}

	public final Message_propertyContext message_property() throws RecognitionException {
		Message_propertyContext _localctx = new Message_propertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_message_property);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__7);
				setState(66);
				prompt_value();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__8);
				setState(68);
				description_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prompt_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ProtocolGrammarParser.STRING, 0); }
		public Prompt_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prompt_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterPrompt_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitPrompt_value(this);
		}
	}

	public final Prompt_valueContext prompt_value() throws RecognitionException {
		Prompt_valueContext _localctx = new Prompt_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prompt_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Description_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ProtocolGrammarParser.STRING, 0); }
		public Description_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).enterDescription_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtocolGrammarListener ) ((ProtocolGrammarListener)listener).exitDescription_value(this);
		}
	}

	public final Description_valueContext description_value() throws RecognitionException {
		Description_valueContext _localctx = new Description_valueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_description_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000bL\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"\u001f\b\u0001\u000b\u0001\f\u0001 \u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0004\u0005.\b\u0005\u000b\u0005\f\u0005/\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004\t>\b\t\u000b"+
		"\t\f\t?\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nF\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\u0005"+
		"\u0007B\u0000\u001a\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000"+
		"\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000"+
		"\b*\u0001\u0000\u0000\u0000\n-\u0001\u0000\u0000\u0000\f1\u0001\u0000"+
		"\u0000\u0000\u000e8\u0001\u0000\u0000\u0000\u0010:\u0001\u0000\u0000\u0000"+
		"\u0012=\u0001\u0000\u0000\u0000\u0014E\u0001\u0000\u0000\u0000\u0016G"+
		"\u0001\u0000\u0000\u0000\u0018I\u0001\u0000\u0000\u0000\u001a\u001b\u0003"+
		"\u0002\u0001\u0000\u001b\u001c\u0003\n\u0005\u0000\u001c\u0001\u0001\u0000"+
		"\u0000\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"#\u0005\u0001"+
		"\u0000\u0000#$\u0003\u0006\u0003\u0000$%\u0005\u0002\u0000\u0000%&\u0003"+
		"\b\u0004\u0000&\'\u0005\u0003\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000"+
		"()\u0005\n\u0000\u0000)\u0007\u0001\u0000\u0000\u0000*+\u0005\n\u0000"+
		"\u0000+\t\u0001\u0000\u0000\u0000,.\u0003\f\u0006\u0000-,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u00000\u000b\u0001\u0000\u0000\u000012\u0005\u0004\u0000"+
		"\u000023\u0003\u000e\u0007\u000034\u0005\u0002\u0000\u000045\u0003\u0010"+
		"\b\u000056\u0003\u0012\t\u000067\u0005\u0003\u0000\u00007\r\u0001\u0000"+
		"\u0000\u000089\u0005\n\u0000\u00009\u000f\u0001\u0000\u0000\u0000:;\u0007"+
		"\u0000\u0000\u0000;\u0011\u0001\u0000\u0000\u0000<>\u0003\u0014\n\u0000"+
		"=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@\u0013\u0001\u0000\u0000\u0000AB\u0005"+
		"\b\u0000\u0000BF\u0003\u0016\u000b\u0000CD\u0005\t\u0000\u0000DF\u0003"+
		"\u0018\f\u0000EA\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000F\u0015"+
		"\u0001\u0000\u0000\u0000GH\u0005\u000b\u0000\u0000H\u0017\u0001\u0000"+
		"\u0000\u0000IJ\u0005\u000b\u0000\u0000J\u0019\u0001\u0000\u0000\u0000"+
		"\u0004 /?E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}