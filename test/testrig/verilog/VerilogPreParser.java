// Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4/verilog/verilog/VerilogPreParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VerilogPreParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EM=1, EMEQ=2, EMEQEQ=3, DQ=4, HA=5, DL=6, DLFULLSKEW=7, DLHOLD=8, DLNOCHANGE=9, 
		DLPERIOD=10, DLRECOVERY=11, DLRECREM=12, DLREMOVAL=13, DLSETUP=14, DLSETUPHOLD=15, 
		DLSKEW=16, DLTIMESKEW=17, DLWIDTH=18, MO=19, AM=20, AMAM=21, AMAMAM=22, 
		AP=23, LP=24, RP=25, AS=26, ASAS=27, ASSL=28, ASGT=29, PL=30, PLCL=31, 
		CO=32, MI=33, MICL=34, MIGT=35, DT=36, SL=37, SLAS=38, SLSL=39, CL=40, 
		SC=41, LT=42, LTLT=43, LTLTLT=44, LTEQ=45, EQ=46, EQEQ=47, EQEQEQ=48, 
		EQGT=49, GT=50, GTEQ=51, GTGT=52, GTGTGT=53, QM=54, AT=55, PATHPULSEDL=56, 
		LB=57, RB=58, CA=59, CATI=60, GA=61, ALWAYS=62, AND=63, ASSIGN=64, AUTOMATIC=65, 
		BEGIN=66, BUF=67, BUFIFZERO=68, BUFIFONE=69, CASE=70, CASEX=71, CASEZ=72, 
		CELL=73, CMOS=74, CONFIG=75, DEASSIGN=76, DEFAULT=77, DEFPARAM=78, DESIGN=79, 
		DISABLE=80, EDGE=81, ELSE=82, END=83, ENDCASE=84, ENDCONFIG=85, ENDFUNCTION=86, 
		ENDGENERATE=87, ENDMODULE=88, ENDPRIMITIVE=89, ENDSPECIFY=90, ENDTABLE=91, 
		ENDTASK=92, EVENT=93, FOR=94, FORCE=95, FOREVER=96, FORK=97, FUNCTION=98, 
		GENERATE=99, GENVAR=100, HIGHZZERO=101, HIGHZONE=102, IF=103, IFNONE=104, 
		INCLUDE=105, INITIAL=106, INOUT=107, INPUT=108, INSTANCE=109, INTEGER=110, 
		JOIN=111, LARGE=112, LIBLIST=113, LIBRARY=114, LOCALPARAM=115, MACROMODULE=116, 
		MEDIUM=117, MODULE=118, NAND=119, NEGEDGE=120, NMOS=121, NOR=122, NOSHOWCANCELLED=123, 
		NOT=124, NOTIFZERO=125, NOTIFONE=126, OR=127, OUTPUT=128, PARAMETER=129, 
		PMOS=130, POSEDGE=131, PRIMITIVE=132, PULLZERO=133, PULLONE=134, PULLDOWN=135, 
		PULLUP=136, PULSESTYLE_ONDETECT=137, PULSESTYLE_ONEVENT=138, RCMOS=139, 
		REAL=140, REALTIME=141, REG=142, RELEASE=143, REPEAT=144, RNMOS=145, RPMOS=146, 
		RTRAN=147, RTRANIFZERO=148, RTRANIFONE=149, SCALARED=150, SHOWCANCELLED=151, 
		SIGNED=152, SMALL=153, SPECIFY=154, SPECPARAM=155, STRONGZERO=156, STRONGONE=157, 
		SUPPLYZERO=158, SUPPLYONE=159, TABLE=160, TASK=161, TIME=162, TRAN=163, 
		TRANIFZERO=164, TRANIFONE=165, TRI=166, TRIZERO=167, TRIONE=168, TRIAND=169, 
		TRIOR=170, TRIREG=171, USE=172, UWIRE=173, VECTORED=174, WAIT=175, WAND=176, 
		WEAKZERO=177, WEAKONE=178, WHILE=179, WIRE=180, WOR=181, XNOR=182, XOR=183, 
		LC=184, VL=185, VLVL=186, RC=187, TI=188, TIAM=189, TICA=190, TIVL=191, 
		DECIMAL_NUMBER=192, BINARY_NUMBER=193, OCTAL_NUMBER=194, HEX_NUMBER=195, 
		REAL_NUMBER=196, STRING=197, COMMENT=198, ESCAPED_IDENTIFIER=199, SIMPLE_IDENTIFIER=200, 
		SYSTEM_TF_IDENTIFIER=201, WHITE_SPACE=202, MIINCDIR=203, FILE_PATH_SPEC=204, 
		OUTPUT_OR_LEVEL_SYMBOL=205, LEVEL_ONLY_SYMBOL=206, EDGE_SYMBOL=207, EDGE_DESCRIPTOR=208, 
		BEGIN_KEYWORDS_DIRECTIVE=209, CELLDEFINE_DIRECTIVE=210, DEFAULT_NETTYPE_DIRECTIVE=211, 
		DEFINE_DIRECTIVE=212, ELSE_DIRECTIVE=213, ELSIF_DIRECTIVE=214, END_KEYWORDS_DIRECTIVE=215, 
		ENDCELLDEFINE_DIRECTIVE=216, ENDIF_DIRECTIVE=217, IFDEF_DIRECTIVE=218, 
		IFNDEF_DIRECTIVE=219, INCLUDE_DIRECTIVE=220, LINE_DIRECTIVE=221, NOUNCONNECTED_DRIVE_DIRECTIVE=222, 
		PRAGMA_DIRECTIVE=223, RESETALL_DIRECTIVE=224, TIMESCALE_DIRECTIVE=225, 
		UNCONNECTED_DRIVE_DIRECTIVE=226, UNDEF_DIRECTIVE=227, MACRO_USAGE=228, 
		DIRECTIVE_TEXT=229, DIRECTIVE_IDENTIFIER=230, DIRECTIVE_COMMENT=231, DIRECTIVE_WHITE_SPACE=232, 
		DIRECTIVE_NEWLINE=233, MACRO_TEXT=234, MACRO_ESC_NEWLINE=235, SOURCE_TEXT=236;
	public static final int
		RULE_source_text = 0, RULE_compiler_directive = 1, RULE_begin_keywords_directive = 2, 
		RULE_celldefine_directive = 3, RULE_default_nettype_directive = 4, RULE_endcelldefine_directive = 5, 
		RULE_end_keywords_directive = 6, RULE_ifdef_directive = 7, RULE_ifndef_directive = 8, 
		RULE_include_directive = 9, RULE_line_directive = 10, RULE_nounconnected_drive_directive = 11, 
		RULE_pragma_directive = 12, RULE_resetall_directive = 13, RULE_text_macro_definition = 14, 
		RULE_text_macro_usage = 15, RULE_timescale_directive = 16, RULE_unconnected_drive_directive = 17, 
		RULE_undef_directive = 18, RULE_elsif_directive = 19, RULE_else_directive = 20, 
		RULE_endif_directive = 21, RULE_text_macro_identifier = 22, RULE_ifdef_group_of_lines = 23, 
		RULE_ifndef_group_of_lines = 24, RULE_elsif_group_of_lines = 25, RULE_else_group_of_lines = 26, 
		RULE_macro_text = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"source_text", "compiler_directive", "begin_keywords_directive", "celldefine_directive", 
			"default_nettype_directive", "endcelldefine_directive", "end_keywords_directive", 
			"ifdef_directive", "ifndef_directive", "include_directive", "line_directive", 
			"nounconnected_drive_directive", "pragma_directive", "resetall_directive", 
			"text_macro_definition", "text_macro_usage", "timescale_directive", "unconnected_drive_directive", 
			"undef_directive", "elsif_directive", "else_directive", "endif_directive", 
			"text_macro_identifier", "ifdef_group_of_lines", "ifndef_group_of_lines", 
			"elsif_group_of_lines", "else_group_of_lines", "macro_text"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'!='", "'!=='", "'\"'", "'#'", "'$'", "'$fullskew'", "'$hold'", 
			"'$nochange'", "'$period'", "'$recovery'", "'$recrem'", "'$removal'", 
			"'$setup'", "'$setuphold'", "'$skew'", "'$timeskew'", "'$width'", "'%'", 
			"'&'", "'&&'", "'&&&'", "'''", "'('", "')'", "'*'", "'**'", "'*/'", "'*>'", 
			"'+'", "'+:'", "','", "'-'", "'-:'", "'->'", "'.'", "'/'", "'/*'", "'//'", 
			"':'", "';'", "'<'", "'<<'", "'<<<'", "'<='", "'='", "'=='", "'==='", 
			"'=>'", "'>'", "'>='", "'>>'", "'>>>'", "'?'", "'@'", "'PATHPULSE$'", 
			"'['", "']'", "'^'", "'^~'", null, "'always'", "'and'", "'assign'", "'automatic'", 
			"'begin'", "'buf'", "'bufif0'", "'bufif1'", "'case'", "'casex'", "'casez'", 
			"'cell'", "'cmos'", "'config'", "'deassign'", "'default'", "'defparam'", 
			"'design'", "'disable'", "'edge'", "'else'", "'end'", "'endcase'", "'endconfig'", 
			"'endfunction'", "'endgenerate'", "'endmodule'", "'endprimitive'", "'endspecify'", 
			"'endtable'", "'endtask'", "'event'", "'for'", "'force'", "'forever'", 
			"'fork'", "'function'", "'generate'", "'genvar'", "'highz0'", "'highz1'", 
			"'if'", "'ifnone'", "'include'", "'initial'", "'inout'", "'input'", "'instance'", 
			"'integer'", "'join'", "'large'", "'liblist'", "'library'", "'localparam'", 
			"'macromodule'", "'medium'", "'module'", "'nand'", "'negedge'", "'nmos'", 
			"'nor'", "'noshowcancelled'", "'not'", "'notif0'", "'notif1'", "'or'", 
			"'output'", "'parameter'", "'pmos'", "'posedge'", "'primitive'", "'pull0'", 
			"'pull1'", "'pulldown'", "'pullup'", "'pulsestyle_ondetect'", "'pulsestyle_onevent'", 
			"'rcmos'", "'real'", "'realtime'", "'reg'", "'release'", "'repeat'", 
			"'rnmos'", "'rpmos'", "'rtran'", "'rtranif0'", "'rtranif1'", "'scalared'", 
			"'showcancelled'", "'signed'", "'small'", "'specify'", "'specparam'", 
			"'strong0'", "'strong1'", "'supply0'", "'supply1'", "'table'", "'task'", 
			"'time'", "'tran'", "'tranif0'", "'tranif1'", "'tri'", "'tri0'", "'tri1'", 
			"'triand'", "'trior'", "'trireg'", "'use'", "'uwire'", "'vectored'", 
			"'wait'", "'wand'", "'weak0'", "'weak1'", "'while'", "'wire'", "'wor'", 
			"'xnor'", "'xor'", "'{'", "'|'", "'||'", "'}'", "'~'", "'~&'", "'~^'", 
			"'~|'", null, null, null, null, null, null, null, null, null, null, null, 
			"'-incdir'", null, null, null, null, null, null, "'celldefine'", null, 
			null, null, null, "'end_keywords'", "'endcelldefine'", null, null, null, 
			null, null, "'nounconnected_drive'", null, "'resetall'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EM", "EMEQ", "EMEQEQ", "DQ", "HA", "DL", "DLFULLSKEW", "DLHOLD", 
			"DLNOCHANGE", "DLPERIOD", "DLRECOVERY", "DLRECREM", "DLREMOVAL", "DLSETUP", 
			"DLSETUPHOLD", "DLSKEW", "DLTIMESKEW", "DLWIDTH", "MO", "AM", "AMAM", 
			"AMAMAM", "AP", "LP", "RP", "AS", "ASAS", "ASSL", "ASGT", "PL", "PLCL", 
			"CO", "MI", "MICL", "MIGT", "DT", "SL", "SLAS", "SLSL", "CL", "SC", "LT", 
			"LTLT", "LTLTLT", "LTEQ", "EQ", "EQEQ", "EQEQEQ", "EQGT", "GT", "GTEQ", 
			"GTGT", "GTGTGT", "QM", "AT", "PATHPULSEDL", "LB", "RB", "CA", "CATI", 
			"GA", "ALWAYS", "AND", "ASSIGN", "AUTOMATIC", "BEGIN", "BUF", "BUFIFZERO", 
			"BUFIFONE", "CASE", "CASEX", "CASEZ", "CELL", "CMOS", "CONFIG", "DEASSIGN", 
			"DEFAULT", "DEFPARAM", "DESIGN", "DISABLE", "EDGE", "ELSE", "END", "ENDCASE", 
			"ENDCONFIG", "ENDFUNCTION", "ENDGENERATE", "ENDMODULE", "ENDPRIMITIVE", 
			"ENDSPECIFY", "ENDTABLE", "ENDTASK", "EVENT", "FOR", "FORCE", "FOREVER", 
			"FORK", "FUNCTION", "GENERATE", "GENVAR", "HIGHZZERO", "HIGHZONE", "IF", 
			"IFNONE", "INCLUDE", "INITIAL", "INOUT", "INPUT", "INSTANCE", "INTEGER", 
			"JOIN", "LARGE", "LIBLIST", "LIBRARY", "LOCALPARAM", "MACROMODULE", "MEDIUM", 
			"MODULE", "NAND", "NEGEDGE", "NMOS", "NOR", "NOSHOWCANCELLED", "NOT", 
			"NOTIFZERO", "NOTIFONE", "OR", "OUTPUT", "PARAMETER", "PMOS", "POSEDGE", 
			"PRIMITIVE", "PULLZERO", "PULLONE", "PULLDOWN", "PULLUP", "PULSESTYLE_ONDETECT", 
			"PULSESTYLE_ONEVENT", "RCMOS", "REAL", "REALTIME", "REG", "RELEASE", 
			"REPEAT", "RNMOS", "RPMOS", "RTRAN", "RTRANIFZERO", "RTRANIFONE", "SCALARED", 
			"SHOWCANCELLED", "SIGNED", "SMALL", "SPECIFY", "SPECPARAM", "STRONGZERO", 
			"STRONGONE", "SUPPLYZERO", "SUPPLYONE", "TABLE", "TASK", "TIME", "TRAN", 
			"TRANIFZERO", "TRANIFONE", "TRI", "TRIZERO", "TRIONE", "TRIAND", "TRIOR", 
			"TRIREG", "USE", "UWIRE", "VECTORED", "WAIT", "WAND", "WEAKZERO", "WEAKONE", 
			"WHILE", "WIRE", "WOR", "XNOR", "XOR", "LC", "VL", "VLVL", "RC", "TI", 
			"TIAM", "TICA", "TIVL", "DECIMAL_NUMBER", "BINARY_NUMBER", "OCTAL_NUMBER", 
			"HEX_NUMBER", "REAL_NUMBER", "STRING", "COMMENT", "ESCAPED_IDENTIFIER", 
			"SIMPLE_IDENTIFIER", "SYSTEM_TF_IDENTIFIER", "WHITE_SPACE", "MIINCDIR", 
			"FILE_PATH_SPEC", "OUTPUT_OR_LEVEL_SYMBOL", "LEVEL_ONLY_SYMBOL", "EDGE_SYMBOL", 
			"EDGE_DESCRIPTOR", "BEGIN_KEYWORDS_DIRECTIVE", "CELLDEFINE_DIRECTIVE", 
			"DEFAULT_NETTYPE_DIRECTIVE", "DEFINE_DIRECTIVE", "ELSE_DIRECTIVE", "ELSIF_DIRECTIVE", 
			"END_KEYWORDS_DIRECTIVE", "ENDCELLDEFINE_DIRECTIVE", "ENDIF_DIRECTIVE", 
			"IFDEF_DIRECTIVE", "IFNDEF_DIRECTIVE", "INCLUDE_DIRECTIVE", "LINE_DIRECTIVE", 
			"NOUNCONNECTED_DRIVE_DIRECTIVE", "PRAGMA_DIRECTIVE", "RESETALL_DIRECTIVE", 
			"TIMESCALE_DIRECTIVE", "UNCONNECTED_DRIVE_DIRECTIVE", "UNDEF_DIRECTIVE", 
			"MACRO_USAGE", "DIRECTIVE_TEXT", "DIRECTIVE_IDENTIFIER", "DIRECTIVE_COMMENT", 
			"DIRECTIVE_WHITE_SPACE", "DIRECTIVE_NEWLINE", "MACRO_TEXT", "MACRO_ESC_NEWLINE", 
			"SOURCE_TEXT"
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
	public String getGrammarFileName() { return "VerilogPreParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VerilogPreParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Source_textContext extends ParserRuleContext {
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Source_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterSource_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitSource_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitSource_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_textContext source_text() throws RecognitionException {
		Source_textContext _localctx = new Source_textContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GA) {
				{
				{
				setState(56);
				compiler_directive();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Compiler_directiveContext extends ParserRuleContext {
		public Begin_keywords_directiveContext begin_keywords_directive() {
			return getRuleContext(Begin_keywords_directiveContext.class,0);
		}
		public Celldefine_directiveContext celldefine_directive() {
			return getRuleContext(Celldefine_directiveContext.class,0);
		}
		public Default_nettype_directiveContext default_nettype_directive() {
			return getRuleContext(Default_nettype_directiveContext.class,0);
		}
		public Endcelldefine_directiveContext endcelldefine_directive() {
			return getRuleContext(Endcelldefine_directiveContext.class,0);
		}
		public End_keywords_directiveContext end_keywords_directive() {
			return getRuleContext(End_keywords_directiveContext.class,0);
		}
		public Ifdef_directiveContext ifdef_directive() {
			return getRuleContext(Ifdef_directiveContext.class,0);
		}
		public Ifndef_directiveContext ifndef_directive() {
			return getRuleContext(Ifndef_directiveContext.class,0);
		}
		public Include_directiveContext include_directive() {
			return getRuleContext(Include_directiveContext.class,0);
		}
		public Line_directiveContext line_directive() {
			return getRuleContext(Line_directiveContext.class,0);
		}
		public Nounconnected_drive_directiveContext nounconnected_drive_directive() {
			return getRuleContext(Nounconnected_drive_directiveContext.class,0);
		}
		public Pragma_directiveContext pragma_directive() {
			return getRuleContext(Pragma_directiveContext.class,0);
		}
		public Resetall_directiveContext resetall_directive() {
			return getRuleContext(Resetall_directiveContext.class,0);
		}
		public Text_macro_definitionContext text_macro_definition() {
			return getRuleContext(Text_macro_definitionContext.class,0);
		}
		public Text_macro_usageContext text_macro_usage() {
			return getRuleContext(Text_macro_usageContext.class,0);
		}
		public Timescale_directiveContext timescale_directive() {
			return getRuleContext(Timescale_directiveContext.class,0);
		}
		public Unconnected_drive_directiveContext unconnected_drive_directive() {
			return getRuleContext(Unconnected_drive_directiveContext.class,0);
		}
		public Undef_directiveContext undef_directive() {
			return getRuleContext(Undef_directiveContext.class,0);
		}
		public Compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterCompiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitCompiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitCompiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compiler_directiveContext compiler_directive() throws RecognitionException {
		Compiler_directiveContext _localctx = new Compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compiler_directive);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				begin_keywords_directive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				celldefine_directive();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				default_nettype_directive();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				endcelldefine_directive();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				end_keywords_directive();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				ifdef_directive();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				ifndef_directive();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				include_directive();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				line_directive();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(71);
				nounconnected_drive_directive();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(72);
				pragma_directive();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(73);
				resetall_directive();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(74);
				text_macro_definition();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(75);
				text_macro_usage();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(76);
				timescale_directive();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(77);
				unconnected_drive_directive();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(78);
				undef_directive();
				}
				break;
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

	public static class Begin_keywords_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode BEGIN_KEYWORDS_DIRECTIVE() { return getToken(VerilogPreParser.BEGIN_KEYWORDS_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Begin_keywords_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_keywords_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterBegin_keywords_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitBegin_keywords_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitBegin_keywords_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_keywords_directiveContext begin_keywords_directive() throws RecognitionException {
		Begin_keywords_directiveContext _localctx = new Begin_keywords_directiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_keywords_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(GA);
			setState(82);
			match(BEGIN_KEYWORDS_DIRECTIVE);
			setState(83);
			match(DIRECTIVE_TEXT);
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

	public static class Celldefine_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode CELLDEFINE_DIRECTIVE() { return getToken(VerilogPreParser.CELLDEFINE_DIRECTIVE, 0); }
		public Celldefine_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_celldefine_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterCelldefine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitCelldefine_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitCelldefine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Celldefine_directiveContext celldefine_directive() throws RecognitionException {
		Celldefine_directiveContext _localctx = new Celldefine_directiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_celldefine_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(GA);
			setState(86);
			match(CELLDEFINE_DIRECTIVE);
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

	public static class Default_nettype_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode DEFAULT_NETTYPE_DIRECTIVE() { return getToken(VerilogPreParser.DEFAULT_NETTYPE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Default_nettype_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_nettype_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterDefault_nettype_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitDefault_nettype_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitDefault_nettype_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_nettype_directiveContext default_nettype_directive() throws RecognitionException {
		Default_nettype_directiveContext _localctx = new Default_nettype_directiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_default_nettype_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(GA);
			setState(89);
			match(DEFAULT_NETTYPE_DIRECTIVE);
			setState(90);
			match(DIRECTIVE_TEXT);
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

	public static class Endcelldefine_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode ENDCELLDEFINE_DIRECTIVE() { return getToken(VerilogPreParser.ENDCELLDEFINE_DIRECTIVE, 0); }
		public Endcelldefine_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endcelldefine_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterEndcelldefine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitEndcelldefine_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitEndcelldefine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endcelldefine_directiveContext endcelldefine_directive() throws RecognitionException {
		Endcelldefine_directiveContext _localctx = new Endcelldefine_directiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_endcelldefine_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(GA);
			setState(93);
			match(ENDCELLDEFINE_DIRECTIVE);
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

	public static class End_keywords_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode END_KEYWORDS_DIRECTIVE() { return getToken(VerilogPreParser.END_KEYWORDS_DIRECTIVE, 0); }
		public End_keywords_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_keywords_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterEnd_keywords_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitEnd_keywords_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitEnd_keywords_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_keywords_directiveContext end_keywords_directive() throws RecognitionException {
		End_keywords_directiveContext _localctx = new End_keywords_directiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_end_keywords_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(GA);
			setState(96);
			match(END_KEYWORDS_DIRECTIVE);
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

	public static class Ifdef_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode IFDEF_DIRECTIVE() { return getToken(VerilogPreParser.IFDEF_DIRECTIVE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Ifdef_group_of_linesContext ifdef_group_of_lines() {
			return getRuleContext(Ifdef_group_of_linesContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public List<Elsif_directiveContext> elsif_directive() {
			return getRuleContexts(Elsif_directiveContext.class);
		}
		public Elsif_directiveContext elsif_directive(int i) {
			return getRuleContext(Elsif_directiveContext.class,i);
		}
		public Else_directiveContext else_directive() {
			return getRuleContext(Else_directiveContext.class,0);
		}
		public Ifdef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdef_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterIfdef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitIfdef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitIfdef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifdef_directiveContext ifdef_directive() throws RecognitionException {
		Ifdef_directiveContext _localctx = new Ifdef_directiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifdef_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(GA);
			setState(99);
			match(IFDEF_DIRECTIVE);
			setState(100);
			text_macro_identifier();
			setState(101);
			ifdef_group_of_lines();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					elsif_directive();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(108);
				else_directive();
				}
				break;
			}
			setState(111);
			endif_directive();
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

	public static class Ifndef_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode IFNDEF_DIRECTIVE() { return getToken(VerilogPreParser.IFNDEF_DIRECTIVE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Ifndef_group_of_linesContext ifndef_group_of_lines() {
			return getRuleContext(Ifndef_group_of_linesContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public List<Elsif_directiveContext> elsif_directive() {
			return getRuleContexts(Elsif_directiveContext.class);
		}
		public Elsif_directiveContext elsif_directive(int i) {
			return getRuleContext(Elsif_directiveContext.class,i);
		}
		public Else_directiveContext else_directive() {
			return getRuleContext(Else_directiveContext.class,0);
		}
		public Ifndef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifndef_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterIfndef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitIfndef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitIfndef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifndef_directiveContext ifndef_directive() throws RecognitionException {
		Ifndef_directiveContext _localctx = new Ifndef_directiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifndef_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(GA);
			setState(114);
			match(IFNDEF_DIRECTIVE);
			setState(115);
			text_macro_identifier();
			setState(116);
			ifndef_group_of_lines();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					elsif_directive();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(123);
				else_directive();
				}
				break;
			}
			setState(126);
			endif_directive();
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

	public static class Include_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode INCLUDE_DIRECTIVE() { return getToken(VerilogPreParser.INCLUDE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Include_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterInclude_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitInclude_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitInclude_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Include_directiveContext include_directive() throws RecognitionException {
		Include_directiveContext _localctx = new Include_directiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_include_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(GA);
			setState(129);
			match(INCLUDE_DIRECTIVE);
			setState(130);
			match(DIRECTIVE_TEXT);
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

	public static class Line_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode LINE_DIRECTIVE() { return getToken(VerilogPreParser.LINE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Line_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterLine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitLine_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitLine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_directiveContext line_directive() throws RecognitionException {
		Line_directiveContext _localctx = new Line_directiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_line_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(GA);
			setState(133);
			match(LINE_DIRECTIVE);
			setState(134);
			match(DIRECTIVE_TEXT);
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

	public static class Nounconnected_drive_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode NOUNCONNECTED_DRIVE_DIRECTIVE() { return getToken(VerilogPreParser.NOUNCONNECTED_DRIVE_DIRECTIVE, 0); }
		public Nounconnected_drive_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounconnected_drive_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterNounconnected_drive_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitNounconnected_drive_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitNounconnected_drive_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nounconnected_drive_directiveContext nounconnected_drive_directive() throws RecognitionException {
		Nounconnected_drive_directiveContext _localctx = new Nounconnected_drive_directiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nounconnected_drive_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(GA);
			setState(137);
			match(NOUNCONNECTED_DRIVE_DIRECTIVE);
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

	public static class Pragma_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode PRAGMA_DIRECTIVE() { return getToken(VerilogPreParser.PRAGMA_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Pragma_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterPragma_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitPragma_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitPragma_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_directiveContext pragma_directive() throws RecognitionException {
		Pragma_directiveContext _localctx = new Pragma_directiveContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pragma_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(GA);
			setState(140);
			match(PRAGMA_DIRECTIVE);
			setState(141);
			match(DIRECTIVE_TEXT);
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

	public static class Resetall_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode RESETALL_DIRECTIVE() { return getToken(VerilogPreParser.RESETALL_DIRECTIVE, 0); }
		public Resetall_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetall_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterResetall_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitResetall_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitResetall_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resetall_directiveContext resetall_directive() throws RecognitionException {
		Resetall_directiveContext _localctx = new Resetall_directiveContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_resetall_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(GA);
			setState(144);
			match(RESETALL_DIRECTIVE);
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

	public static class Text_macro_definitionContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode DEFINE_DIRECTIVE() { return getToken(VerilogPreParser.DEFINE_DIRECTIVE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Macro_textContext macro_text() {
			return getRuleContext(Macro_textContext.class,0);
		}
		public Text_macro_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_macro_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterText_macro_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitText_macro_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitText_macro_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_definitionContext text_macro_definition() throws RecognitionException {
		Text_macro_definitionContext _localctx = new Text_macro_definitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_text_macro_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(GA);
			setState(147);
			match(DEFINE_DIRECTIVE);
			setState(148);
			text_macro_identifier();
			setState(149);
			macro_text();
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

	public static class Text_macro_usageContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode MACRO_USAGE() { return getToken(VerilogPreParser.MACRO_USAGE, 0); }
		public Text_macro_usageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_macro_usage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterText_macro_usage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitText_macro_usage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitText_macro_usage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_usageContext text_macro_usage() throws RecognitionException {
		Text_macro_usageContext _localctx = new Text_macro_usageContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_text_macro_usage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(GA);
			setState(152);
			match(MACRO_USAGE);
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

	public static class Timescale_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode TIMESCALE_DIRECTIVE() { return getToken(VerilogPreParser.TIMESCALE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Timescale_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timescale_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterTimescale_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitTimescale_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitTimescale_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timescale_directiveContext timescale_directive() throws RecognitionException {
		Timescale_directiveContext _localctx = new Timescale_directiveContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_timescale_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(GA);
			setState(155);
			match(TIMESCALE_DIRECTIVE);
			setState(156);
			match(DIRECTIVE_TEXT);
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

	public static class Unconnected_drive_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode UNCONNECTED_DRIVE_DIRECTIVE() { return getToken(VerilogPreParser.UNCONNECTED_DRIVE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(VerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Unconnected_drive_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconnected_drive_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterUnconnected_drive_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitUnconnected_drive_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitUnconnected_drive_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unconnected_drive_directiveContext unconnected_drive_directive() throws RecognitionException {
		Unconnected_drive_directiveContext _localctx = new Unconnected_drive_directiveContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unconnected_drive_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(GA);
			setState(159);
			match(UNCONNECTED_DRIVE_DIRECTIVE);
			setState(160);
			match(DIRECTIVE_TEXT);
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

	public static class Undef_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode UNDEF_DIRECTIVE() { return getToken(VerilogPreParser.UNDEF_DIRECTIVE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Undef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undef_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterUndef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitUndef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitUndef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Undef_directiveContext undef_directive() throws RecognitionException {
		Undef_directiveContext _localctx = new Undef_directiveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_undef_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(GA);
			setState(163);
			match(UNDEF_DIRECTIVE);
			setState(164);
			text_macro_identifier();
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

	public static class Elsif_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode ELSIF_DIRECTIVE() { return getToken(VerilogPreParser.ELSIF_DIRECTIVE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Elsif_group_of_linesContext elsif_group_of_lines() {
			return getRuleContext(Elsif_group_of_linesContext.class,0);
		}
		public Elsif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterElsif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitElsif_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitElsif_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elsif_directiveContext elsif_directive() throws RecognitionException {
		Elsif_directiveContext _localctx = new Elsif_directiveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elsif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(GA);
			setState(167);
			match(ELSIF_DIRECTIVE);
			setState(168);
			text_macro_identifier();
			setState(169);
			elsif_group_of_lines();
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

	public static class Else_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode ELSE_DIRECTIVE() { return getToken(VerilogPreParser.ELSE_DIRECTIVE, 0); }
		public Else_group_of_linesContext else_group_of_lines() {
			return getRuleContext(Else_group_of_linesContext.class,0);
		}
		public Else_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterElse_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitElse_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitElse_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_directiveContext else_directive() throws RecognitionException {
		Else_directiveContext _localctx = new Else_directiveContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_else_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(GA);
			setState(172);
			match(ELSE_DIRECTIVE);
			setState(173);
			else_group_of_lines();
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

	public static class Endif_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(VerilogPreParser.GA, 0); }
		public TerminalNode ENDIF_DIRECTIVE() { return getToken(VerilogPreParser.ENDIF_DIRECTIVE, 0); }
		public Endif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterEndif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitEndif_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitEndif_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endif_directiveContext endif_directive() throws RecognitionException {
		Endif_directiveContext _localctx = new Endif_directiveContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_endif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(GA);
			setState(176);
			match(ENDIF_DIRECTIVE);
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

	public static class Text_macro_identifierContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_IDENTIFIER() { return getToken(VerilogPreParser.DIRECTIVE_IDENTIFIER, 0); }
		public Text_macro_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_macro_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterText_macro_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitText_macro_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitText_macro_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_identifierContext text_macro_identifier() throws RecognitionException {
		Text_macro_identifierContext _localctx = new Text_macro_identifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_text_macro_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(DIRECTIVE_IDENTIFIER);
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

	public static class Ifdef_group_of_linesContext extends ParserRuleContext {
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Ifdef_group_of_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdef_group_of_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterIfdef_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitIfdef_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitIfdef_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifdef_group_of_linesContext ifdef_group_of_lines() throws RecognitionException {
		Ifdef_group_of_linesContext _localctx = new Ifdef_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifdef_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(182);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(180);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(181);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Ifndef_group_of_linesContext extends ParserRuleContext {
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Ifndef_group_of_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifndef_group_of_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterIfndef_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitIfndef_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitIfndef_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifndef_group_of_linesContext ifndef_group_of_lines() throws RecognitionException {
		Ifndef_group_of_linesContext _localctx = new Ifndef_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifndef_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(189);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(187);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(188);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Elsif_group_of_linesContext extends ParserRuleContext {
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Elsif_group_of_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_group_of_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterElsif_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitElsif_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitElsif_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elsif_group_of_linesContext elsif_group_of_lines() throws RecognitionException {
		Elsif_group_of_linesContext _localctx = new Elsif_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elsif_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(196);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(194);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(195);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Else_group_of_linesContext extends ParserRuleContext {
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Else_group_of_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_group_of_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterElse_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitElse_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitElse_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_group_of_linesContext else_group_of_lines() throws RecognitionException {
		Else_group_of_linesContext _localctx = new Else_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_else_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(203);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(201);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(202);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Macro_textContext extends ParserRuleContext {
		public List<TerminalNode> MACRO_TEXT() { return getTokens(VerilogPreParser.MACRO_TEXT); }
		public TerminalNode MACRO_TEXT(int i) {
			return getToken(VerilogPreParser.MACRO_TEXT, i);
		}
		public List<TerminalNode> MACRO_ESC_NEWLINE() { return getTokens(VerilogPreParser.MACRO_ESC_NEWLINE); }
		public TerminalNode MACRO_ESC_NEWLINE(int i) {
			return getToken(VerilogPreParser.MACRO_ESC_NEWLINE, i);
		}
		public Macro_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).enterMacro_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreParserListener ) ((VerilogPreParserListener)listener).exitMacro_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreParserVisitor ) return ((VerilogPreParserVisitor<? extends T>)visitor).visitMacro_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_textContext macro_text() throws RecognitionException {
		Macro_textContext _localctx = new Macro_textContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_macro_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MACRO_TEXT || _la==MACRO_ESC_NEWLINE) {
				{
				{
				setState(208);
				_la = _input.LA(1);
				if ( !(_la==MACRO_TEXT || _la==MACRO_ESC_NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\u0004\u0001\u00ec\u00d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0001\u0000\u0005\u0000:\b\u0000\n\u0000\f\u0000=\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001P\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007h\b"+
		"\u0007\n\u0007\f\u0007k\t\u0007\u0001\u0007\u0003\u0007n\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bw\b"+
		"\b\n\b\f\bz\t\b\u0001\b\u0003\b}\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u00b7\b\u0017\n\u0017\f\u0017\u00ba\t\u0017\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u00be\b\u0018\n\u0018\f\u0018\u00c1\t\u0018\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u00c5\b\u0019\n\u0019\f\u0019\u00c8\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u00cc\b\u001a\n\u001a\f\u001a\u00cf\t\u001a\u0001\u001b"+
		"\u0005\u001b\u00d2\b\u001b\n\u001b\f\u001b\u00d5\t\u001b\u0001\u001b\u0000"+
		"\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0001\u0001\u0000\u00ea\u00eb"+
		"\u00d8\u0000;\u0001\u0000\u0000\u0000\u0002O\u0001\u0000\u0000\u0000\u0004"+
		"Q\u0001\u0000\u0000\u0000\u0006U\u0001\u0000\u0000\u0000\bX\u0001\u0000"+
		"\u0000\u0000\n\\\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000\u000e"+
		"b\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012\u0080\u0001"+
		"\u0000\u0000\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u0088\u0001"+
		"\u0000\u0000\u0000\u0018\u008b\u0001\u0000\u0000\u0000\u001a\u008f\u0001"+
		"\u0000\u0000\u0000\u001c\u0092\u0001\u0000\u0000\u0000\u001e\u0097\u0001"+
		"\u0000\u0000\u0000 \u009a\u0001\u0000\u0000\u0000\"\u009e\u0001\u0000"+
		"\u0000\u0000$\u00a2\u0001\u0000\u0000\u0000&\u00a6\u0001\u0000\u0000\u0000"+
		"(\u00ab\u0001\u0000\u0000\u0000*\u00af\u0001\u0000\u0000\u0000,\u00b2"+
		"\u0001\u0000\u0000\u0000.\u00b8\u0001\u0000\u0000\u00000\u00bf\u0001\u0000"+
		"\u0000\u00002\u00c6\u0001\u0000\u0000\u00004\u00cd\u0001\u0000\u0000\u0000"+
		"6\u00d3\u0001\u0000\u0000\u00008:\u0003\u0002\u0001\u000098\u0001\u0000"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<\u0001\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>P\u0003\u0004\u0002\u0000?P\u0003\u0006\u0003\u0000@P\u0003\b\u0004"+
		"\u0000AP\u0003\n\u0005\u0000BP\u0003\f\u0006\u0000CP\u0003\u000e\u0007"+
		"\u0000DP\u0003\u0010\b\u0000EP\u0003\u0012\t\u0000FP\u0003\u0014\n\u0000"+
		"GP\u0003\u0016\u000b\u0000HP\u0003\u0018\f\u0000IP\u0003\u001a\r\u0000"+
		"JP\u0003\u001c\u000e\u0000KP\u0003\u001e\u000f\u0000LP\u0003 \u0010\u0000"+
		"MP\u0003\"\u0011\u0000NP\u0003$\u0012\u0000O>\u0001\u0000\u0000\u0000"+
		"O?\u0001\u0000\u0000\u0000O@\u0001\u0000\u0000\u0000OA\u0001\u0000\u0000"+
		"\u0000OB\u0001\u0000\u0000\u0000OC\u0001\u0000\u0000\u0000OD\u0001\u0000"+
		"\u0000\u0000OE\u0001\u0000\u0000\u0000OF\u0001\u0000\u0000\u0000OG\u0001"+
		"\u0000\u0000\u0000OH\u0001\u0000\u0000\u0000OI\u0001\u0000\u0000\u0000"+
		"OJ\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0003\u0001"+
		"\u0000\u0000\u0000QR\u0005=\u0000\u0000RS\u0005\u00d1\u0000\u0000ST\u0005"+
		"\u00e5\u0000\u0000T\u0005\u0001\u0000\u0000\u0000UV\u0005=\u0000\u0000"+
		"VW\u0005\u00d2\u0000\u0000W\u0007\u0001\u0000\u0000\u0000XY\u0005=\u0000"+
		"\u0000YZ\u0005\u00d3\u0000\u0000Z[\u0005\u00e5\u0000\u0000[\t\u0001\u0000"+
		"\u0000\u0000\\]\u0005=\u0000\u0000]^\u0005\u00d8\u0000\u0000^\u000b\u0001"+
		"\u0000\u0000\u0000_`\u0005=\u0000\u0000`a\u0005\u00d7\u0000\u0000a\r\u0001"+
		"\u0000\u0000\u0000bc\u0005=\u0000\u0000cd\u0005\u00da\u0000\u0000de\u0003"+
		",\u0016\u0000ei\u0003.\u0017\u0000fh\u0003&\u0013\u0000gf\u0001\u0000"+
		"\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"ln\u0003(\u0014\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000op\u0003*\u0015\u0000p\u000f\u0001\u0000\u0000"+
		"\u0000qr\u0005=\u0000\u0000rs\u0005\u00db\u0000\u0000st\u0003,\u0016\u0000"+
		"tx\u00030\u0018\u0000uw\u0003&\u0013\u0000vu\u0001\u0000\u0000\u0000w"+
		"z\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{}\u0003(\u0014"+
		"\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u007f\u0003*\u0015\u0000\u007f\u0011\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005=\u0000\u0000\u0081\u0082\u0005\u00dc\u0000\u0000\u0082"+
		"\u0083\u0005\u00e5\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005=\u0000\u0000\u0085\u0086\u0005\u00dd\u0000\u0000\u0086\u0087"+
		"\u0005\u00e5\u0000\u0000\u0087\u0015\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005=\u0000\u0000\u0089\u008a\u0005\u00de\u0000\u0000\u008a\u0017\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005=\u0000\u0000\u008c\u008d\u0005\u00df"+
		"\u0000\u0000\u008d\u008e\u0005\u00e5\u0000\u0000\u008e\u0019\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005=\u0000\u0000\u0090\u0091\u0005\u00e0\u0000"+
		"\u0000\u0091\u001b\u0001\u0000\u0000\u0000\u0092\u0093\u0005=\u0000\u0000"+
		"\u0093\u0094\u0005\u00d4\u0000\u0000\u0094\u0095\u0003,\u0016\u0000\u0095"+
		"\u0096\u00036\u001b\u0000\u0096\u001d\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005=\u0000\u0000\u0098\u0099\u0005\u00e4\u0000\u0000\u0099\u001f\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005=\u0000\u0000\u009b\u009c\u0005\u00e1"+
		"\u0000\u0000\u009c\u009d\u0005\u00e5\u0000\u0000\u009d!\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005=\u0000\u0000\u009f\u00a0\u0005\u00e2\u0000\u0000"+
		"\u00a0\u00a1\u0005\u00e5\u0000\u0000\u00a1#\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005=\u0000\u0000\u00a3\u00a4\u0005\u00e3\u0000\u0000\u00a4\u00a5"+
		"\u0003,\u0016\u0000\u00a5%\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005="+
		"\u0000\u0000\u00a7\u00a8\u0005\u00d6\u0000\u0000\u00a8\u00a9\u0003,\u0016"+
		"\u0000\u00a9\u00aa\u00032\u0019\u0000\u00aa\'\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0005=\u0000\u0000\u00ac\u00ad\u0005\u00d5\u0000\u0000\u00ad"+
		"\u00ae\u00034\u001a\u0000\u00ae)\u0001\u0000\u0000\u0000\u00af\u00b0\u0005"+
		"=\u0000\u0000\u00b0\u00b1\u0005\u00d9\u0000\u0000\u00b1+\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005\u00e6\u0000\u0000\u00b3-\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b7\u0005\u00ec\u0000\u0000\u00b5\u00b7\u0003\u0002\u0001\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9/\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be\u0005\u00ec\u0000\u0000\u00bc"+
		"\u00be\u0003\u0002\u0001\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"1\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0005\u00ec\u0000\u0000\u00c3\u00c5\u0003\u0002\u0001\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c73\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cc\u0005\u00ec\u0000\u0000\u00ca\u00cc\u0003"+
		"\u0002\u0001\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce5\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d2\u0007\u0000"+
		"\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d47\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u000f;Oimx|\u00b6\u00b8\u00bd\u00bf\u00c4\u00c6\u00cb\u00cd\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}