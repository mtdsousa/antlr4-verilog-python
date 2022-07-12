// Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4/verilog/systemverilog/SystemVerilogPreParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SystemVerilogPreParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EM=1, EMEQ=2, EMEQEQ=3, EMEQQM=4, DQ=5, DQDPIDQ=6, DQDPIMICDQ=7, HA=8, 
		HAHA=9, HAMIHA=10, HAEQHA=11, DL=12, DLERROR=13, DLFATAL=14, DLFULLSKEW=15, 
		DLHOLD=16, DLINFO=17, DLNOCHANGE=18, DLPERIOD=19, DLRECOVERY=20, DLRECREM=21, 
		DLREMOVAL=22, DLROOTDT=23, DLSETUP=24, DLSETUPHOLD=25, DLSKEW=26, DLTIMESKEW=27, 
		DLUNIT=28, DLWARNING=29, DLWIDTH=30, MO=31, MOEQ=32, AM=33, AMAM=34, AMAMAM=35, 
		AMEQ=36, AP=37, LP=38, RP=39, AS=40, ASAS=41, ASSL=42, ASCLCLAS=43, ASEQ=44, 
		ASGT=45, PL=46, PLPL=47, PLCL=48, PLEQ=49, CO=50, MI=51, MIMI=52, MICL=53, 
		MIEQ=54, MIGT=55, MIGTGT=56, DT=57, DTAS=58, SL=59, SLAS=60, SLSL=61, 
		SLEQ=62, ONESTEP=63, CL=64, CLSL=65, CLCL=66, CLEQ=67, SC=68, LT=69, LTMIGT=70, 
		LTLT=71, LTLTLT=72, LTLTLTEQ=73, LTLTEQ=74, LTEQ=75, EQ=76, EQEQ=77, EQEQEQ=78, 
		EQEQQM=79, EQGT=80, GT=81, GTEQ=82, GTGT=83, GTGTEQ=84, GTGTGT=85, GTGTGTEQ=86, 
		QM=87, AT=88, ATAT=89, PATHPULSEDL=90, LB=91, RB=92, CA=93, CAEQ=94, CATI=95, 
		GA=96, ACCEPT_ON=97, ALIAS=98, ALWAYS=99, ALWAYS_COMB=100, ALWAYS_FF=101, 
		ALWAYS_LATCH=102, AND=103, ASSERT=104, ASSIGN=105, ASSUME=106, AUTOMATIC=107, 
		BEFORE=108, BEGIN=109, BIND=110, BINS=111, BINSOF=112, BIT=113, BREAK=114, 
		BUF=115, BUFIFZERO=116, BUFIFONE=117, BYTE=118, CASE=119, CASEX=120, CASEZ=121, 
		CELL=122, CHANDLE=123, CHECKER=124, CLASS=125, CLOCKING=126, CMOS=127, 
		CONFIG=128, CONST=129, CONSTRAINT=130, CONTEXT=131, CONTINUE=132, COVER=133, 
		COVERGROUP=134, COVERPOINT=135, CROSS=136, DEASSIGN=137, DEFAULT=138, 
		DEFPARAM=139, DESIGN=140, DISABLE=141, DIST=142, DO=143, EDGE=144, ELSE=145, 
		END=146, ENDCASE=147, ENDCHECKER=148, ENDCLASS=149, ENDCLOCKING=150, ENDCONFIG=151, 
		ENDFUNCTION=152, ENDGENERATE=153, ENDGROUP=154, ENDINTERFACE=155, ENDMODULE=156, 
		ENDPACKAGE=157, ENDPRIMITIVE=158, ENDPROGRAM=159, ENDPROPERTY=160, ENDSEQUENCE=161, 
		ENDSPECIFY=162, ENDTABLE=163, ENDTASK=164, ENUM=165, EVENT=166, EXPECT=167, 
		EXPORT=168, EXTENDS=169, EXTERN=170, FINAL=171, FIRST_MATCH=172, FOR=173, 
		FORCE=174, FOREACH=175, FOREVER=176, FORK=177, FORKJOIN=178, FUNCTION=179, 
		GENERATE=180, GENVAR=181, GLOBAL=182, HIGHZZERO=183, HIGHZONE=184, IF=185, 
		IFF=186, IFNONE=187, IGNORE_BINS=188, ILLEGAL_BINS=189, IMPLEMENTS=190, 
		IMPLIES=191, IMPORT=192, INCLUDE=193, INITIAL=194, INOUT=195, INPUT=196, 
		INSIDE=197, INSTANCE=198, INT=199, INTEGER=200, INTERCONNECT=201, INTERFACE=202, 
		INTERSECT=203, JOIN=204, JOIN_ANY=205, JOIN_NONE=206, LARGE=207, LET=208, 
		LIBLIST=209, LIBRARY=210, LOCAL=211, LOCALPARAM=212, LOGIC=213, LONGINT=214, 
		MACROMODULE=215, MATCHES=216, MEDIUM=217, MODPORT=218, MODULE=219, NAND=220, 
		NEGEDGE=221, NETTYPE=222, NEW=223, NEXTTIME=224, NMOS=225, NOR=226, NOSHOWCANCELLED=227, 
		NOT=228, NOTIFZERO=229, NOTIFONE=230, NULL=231, OPTIONDT=232, OR=233, 
		OUTPUT=234, PACKAGE=235, PACKED=236, PARAMETER=237, PMOS=238, POSEDGE=239, 
		PRIMITIVE=240, PRIORITY=241, PROGRAM=242, PROPERTY=243, PROTECTED=244, 
		PULLZERO=245, PULLONE=246, PULLDOWN=247, PULLUP=248, PULSESTYLE_ONDETECT=249, 
		PULSESTYLE_ONEVENT=250, PURE=251, RAND=252, RANDC=253, RANDCASE=254, RANDOMIZE=255, 
		RANDSEQUENCE=256, RCMOS=257, REAL=258, REALTIME=259, REF=260, REG=261, 
		REJECT_ON=262, RELEASE=263, REPEAT=264, RESTRICT=265, RETURN=266, RNMOS=267, 
		RPMOS=268, RTRAN=269, RTRANIFZERO=270, RTRANIFONE=271, S_ALWAYS=272, S_EVENTUALLY=273, 
		S_NEXTTIME=274, S_UNTIL=275, S_UNTIL_WITH=276, SAMPLE=277, SCALARED=278, 
		SEQUENCE=279, SHORTINT=280, SHORTREAL=281, SHOWCANCELLED=282, SIGNED=283, 
		SMALL=284, SOFT=285, SOLVE=286, SPECIFY=287, SPECPARAM=288, STATIC=289, 
		STD=290, STRING=291, STRONG=292, STRONGZERO=293, STRONGONE=294, STRUCT=295, 
		SUPER=296, SUPPLYZERO=297, SUPPLYONE=298, SYNC_ACCEPT_ON=299, SYNC_REJECT_ON=300, 
		TABLE=301, TAGGED=302, TASK=303, THIS=304, THROUGHOUT=305, TIME=306, TIMEPRECISION=307, 
		TIMEUNIT=308, TRAN=309, TRANIFZERO=310, TRANIFONE=311, TRI=312, TRIZERO=313, 
		TRIONE=314, TRIAND=315, TRIOR=316, TRIREG=317, TYPE=318, TYPE_OPTIONDT=319, 
		TYPEDEF=320, UNION=321, UNIQUE=322, UNIQUEZERO=323, UNSIGNED=324, UNTIL=325, 
		UNTIL_WITH=326, UNTYPED=327, USE=328, UWIRE=329, VAR=330, VECTORED=331, 
		VIRTUAL=332, VOID=333, WAIT=334, WAIT_ORDER=335, WAND=336, WEAK=337, WEAKZERO=338, 
		WEAKONE=339, WHILE=340, WILDCARD=341, WIRE=342, WITH=343, WITHIN=344, 
		WOR=345, XNOR=346, XOR=347, LC=348, VL=349, VLMIGT=350, VLEQ=351, VLEQGT=352, 
		VLVL=353, RC=354, TI=355, TIAM=356, TICA=357, TIVL=358, TIME_LITERAL=359, 
		DECIMAL_NUMBER=360, BINARY_NUMBER=361, OCTAL_NUMBER=362, HEX_NUMBER=363, 
		REAL_NUMBER=364, UNBASED_UNSIZED_LITERAL=365, STRING_LITERAL=366, COMMENT=367, 
		ESCAPED_IDENTIFIER=368, SIMPLE_IDENTIFIER=369, SYSTEM_TF_IDENTIFIER=370, 
		WHITE_SPACE=371, ZERO_OR_ONE_Z_OR_X=372, MIINCDIR=373, FILE_PATH_SPEC=374, 
		OUTPUT_OR_LEVEL_SYMBOL=375, LEVEL_ONLY_SYMBOL=376, EDGE_SYMBOL=377, FILE_DIRECTIVE=378, 
		LINE_DIRECTIVE_=379, BEGIN_KEYWORDS_DIRECTIVE=380, CELLDEFINE_DIRECTIVE=381, 
		DEFAULT_NETTYPE_DIRECTIVE=382, DEFINE_DIRECTIVE=383, ELSE_DIRECTIVE=384, 
		ELSIF_DIRECTIVE=385, END_KEYWORDS_DIRECTIVE=386, ENDCELLDEFINE_DIRECTIVE=387, 
		ENDIF_DIRECTIVE=388, IFDEF_DIRECTIVE=389, IFNDEF_DIRECTIVE=390, INCLUDE_DIRECTIVE=391, 
		LINE_DIRECTIVE=392, NOUNCONNECTED_DRIVE_DIRECTIVE=393, PRAGMA_DIRECTIVE=394, 
		RESETALL_DIRECTIVE=395, TIMESCALE_DIRECTIVE=396, UNCONNECTED_DRIVE_DIRECTIVE=397, 
		UNDEF_DIRECTIVE=398, UNDEFINEALL_DIRECTIVE=399, MACRO_USAGE=400, DIRECTIVE_TEXT=401, 
		DIRECTIVE_IDENTIFIER=402, DIRECTIVE_COMMENT=403, DIRECTIVE_WHITE_SPACE=404, 
		DIRECTIVE_NEWLINE=405, MACRO_TEXT=406, MACRO_ESC_NEWLINE=407, SOURCE_TEXT=408;
	public static final int
		RULE_source_text = 0, RULE_compiler_directive = 1, RULE_file_directive = 2, 
		RULE_line_directive_ = 3, RULE_begin_keywords_directive = 4, RULE_celldefine_directive = 5, 
		RULE_default_nettype_directive = 6, RULE_endcelldefine_directive = 7, 
		RULE_end_keywords_directive = 8, RULE_ifdef_directive = 9, RULE_ifndef_directive = 10, 
		RULE_include_directive = 11, RULE_line_directive = 12, RULE_nounconnected_drive_directive = 13, 
		RULE_pragma_directive = 14, RULE_resetall_directive = 15, RULE_text_macro_definition = 16, 
		RULE_text_macro_usage = 17, RULE_timescale_directive = 18, RULE_unconnected_drive_directive = 19, 
		RULE_undef_directive = 20, RULE_undefineall_directive = 21, RULE_elsif_directive = 22, 
		RULE_else_directive = 23, RULE_endif_directive = 24, RULE_text_macro_identifier = 25, 
		RULE_ifdef_group_of_lines = 26, RULE_ifndef_group_of_lines = 27, RULE_elsif_group_of_lines = 28, 
		RULE_else_group_of_lines = 29, RULE_macro_text = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"source_text", "compiler_directive", "file_directive", "line_directive_", 
			"begin_keywords_directive", "celldefine_directive", "default_nettype_directive", 
			"endcelldefine_directive", "end_keywords_directive", "ifdef_directive", 
			"ifndef_directive", "include_directive", "line_directive", "nounconnected_drive_directive", 
			"pragma_directive", "resetall_directive", "text_macro_definition", "text_macro_usage", 
			"timescale_directive", "unconnected_drive_directive", "undef_directive", 
			"undefineall_directive", "elsif_directive", "else_directive", "endif_directive", 
			"text_macro_identifier", "ifdef_group_of_lines", "ifndef_group_of_lines", 
			"elsif_group_of_lines", "else_group_of_lines", "macro_text"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'!='", "'!=='", "'!=?'", "'\"'", "'\"DPI\"'", "'\"DPI-C\"'", 
			"'#'", "'##'", "'#-#'", "'#=#'", "'$'", "'$error'", "'$fatal'", "'$fullskew'", 
			"'$hold'", "'$info'", "'$nochange'", "'$period'", "'$recovery'", "'$recrem'", 
			"'$removal'", "'$root.'", "'$setup'", "'$setuphold'", "'$skew'", "'$timeskew'", 
			"'$unit'", "'$warning'", "'$width'", "'%'", "'%='", "'&'", "'&&'", "'&&&'", 
			"'&='", "'''", "'('", "')'", "'*'", "'**'", "'*/'", "'*::*'", "'*='", 
			"'*>'", "'+'", "'++'", "'+:'", "'+='", "','", "'-'", "'--'", "'-:'", 
			"'-='", "'->'", "'->>'", "'.'", "'.*'", "'/'", "'/*'", "'//'", "'/='", 
			"'1step'", "':'", "':/'", "'::'", "':='", "';'", "'<'", "'<->'", "'<<'", 
			"'<<<'", "'<<<='", "'<<='", "'<='", "'='", "'=='", "'==='", "'==?'", 
			"'=>'", "'>'", "'>='", "'>>'", "'>>='", "'>>>'", "'>>>='", "'?'", "'@'", 
			"'@@'", "'PATHPULSE$'", "'['", "']'", "'^'", "'^='", "'^~'", null, "'accept_on'", 
			"'alias'", "'always'", "'always_comb'", "'always_ff'", "'always_latch'", 
			"'and'", "'assert'", "'assign'", "'assume'", "'automatic'", "'before'", 
			"'begin'", "'bind'", "'bins'", "'binsof'", "'bit'", "'break'", "'buf'", 
			"'bufif0'", "'bufif1'", "'byte'", "'case'", "'casex'", "'casez'", "'cell'", 
			"'chandle'", "'checker'", "'class'", "'clocking'", "'cmos'", "'config'", 
			"'const'", "'constraint'", "'context'", "'continue'", "'cover'", "'covergroup'", 
			"'coverpoint'", "'cross'", "'deassign'", "'default'", "'defparam'", "'design'", 
			"'disable'", "'dist'", "'do'", "'edge'", "'else'", "'end'", "'endcase'", 
			"'endchecker'", "'endclass'", "'endclocking'", "'endconfig'", "'endfunction'", 
			"'endgenerate'", "'endgroup'", "'endinterface'", "'endmodule'", "'endpackage'", 
			"'endprimitive'", "'endprogram'", "'endproperty'", "'endsequence'", "'endspecify'", 
			"'endtable'", "'endtask'", "'enum'", "'event'", "'expect'", "'export'", 
			"'extends'", "'extern'", "'final'", "'first_match'", "'for'", "'force'", 
			"'foreach'", "'forever'", "'fork'", "'forkjoin'", "'function'", "'generate'", 
			"'genvar'", "'global'", "'highz0'", "'highz1'", "'if'", "'iff'", "'ifnone'", 
			"'ignore_bins'", "'illegal_bins'", "'implements'", "'implies'", "'import'", 
			"'include'", "'initial'", "'inout'", "'input'", "'inside'", "'instance'", 
			"'int'", "'integer'", "'interconnect'", "'interface'", "'intersect'", 
			"'join'", "'join_any'", "'join_none'", "'large'", "'let'", "'liblist'", 
			"'library'", "'local'", "'localparam'", "'logic'", "'longint'", "'macromodule'", 
			"'matches'", "'medium'", "'modport'", "'module'", "'nand'", "'negedge'", 
			"'nettype'", "'new'", "'nexttime'", "'nmos'", "'nor'", "'noshowcancelled'", 
			"'not'", "'notif0'", "'notif1'", "'null'", "'option.'", "'or'", "'output'", 
			"'package'", "'packed'", "'parameter'", "'pmos'", "'posedge'", "'primitive'", 
			"'priority'", "'program'", "'property'", "'protected'", "'pull0'", "'pull1'", 
			"'pulldown'", "'pullup'", "'pulsestyle_ondetect'", "'pulsestyle_onevent'", 
			"'pure'", "'rand'", "'randc'", "'randcase'", "'randomize'", "'randsequence'", 
			"'rcmos'", "'real'", "'realtime'", "'ref'", "'reg'", "'reject_on'", "'release'", 
			"'repeat'", "'restrict'", "'return'", "'rnmos'", "'rpmos'", "'rtran'", 
			"'rtranif0'", "'rtranif1'", "'s_always'", "'s_eventually'", "'s_nexttime'", 
			"'s_until'", "'s_until_with'", "'sample'", "'scalared'", "'sequence'", 
			"'shortint'", "'shortreal'", "'showcancelled'", "'signed'", "'small'", 
			"'soft'", "'solve'", "'specify'", "'specparam'", "'static'", "'std'", 
			"'string'", "'strong'", "'strong0'", "'strong1'", "'struct'", "'super'", 
			"'supply0'", "'supply1'", "'sync_accept_on'", "'sync_reject_on'", "'table'", 
			"'tagged'", "'task'", "'this'", "'throughout'", "'time'", "'timeprecision'", 
			"'timeunit'", "'tran'", "'tranif0'", "'tranif1'", "'tri'", "'tri0'", 
			"'tri1'", "'triand'", "'trior'", "'trireg'", "'type'", "'type_option.'", 
			"'typedef'", "'union'", "'unique'", "'unique0'", "'unsigned'", "'until'", 
			"'until_with'", "'untyped'", "'use'", "'uwire'", "'var'", "'vectored'", 
			"'virtual'", "'void'", "'wait'", "'wait_order'", "'wand'", "'weak'", 
			"'weak0'", "'weak1'", "'while'", "'wildcard'", "'wire'", "'with'", "'within'", 
			"'wor'", "'xnor'", "'xor'", "'{'", "'|'", "'|->'", "'|='", "'|=>'", "'||'", 
			"'}'", "'~'", "'~&'", "'~^'", "'~|'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'-incdir'", null, null, 
			null, null, "'__FILE__'", "'__LINE__'", null, "'celldefine'", null, null, 
			null, null, "'end_keywords'", "'endcelldefine'", null, null, null, null, 
			null, "'nounconnected_drive'", null, "'resetall'", null, null, null, 
			"'undefineall'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EM", "EMEQ", "EMEQEQ", "EMEQQM", "DQ", "DQDPIDQ", "DQDPIMICDQ", 
			"HA", "HAHA", "HAMIHA", "HAEQHA", "DL", "DLERROR", "DLFATAL", "DLFULLSKEW", 
			"DLHOLD", "DLINFO", "DLNOCHANGE", "DLPERIOD", "DLRECOVERY", "DLRECREM", 
			"DLREMOVAL", "DLROOTDT", "DLSETUP", "DLSETUPHOLD", "DLSKEW", "DLTIMESKEW", 
			"DLUNIT", "DLWARNING", "DLWIDTH", "MO", "MOEQ", "AM", "AMAM", "AMAMAM", 
			"AMEQ", "AP", "LP", "RP", "AS", "ASAS", "ASSL", "ASCLCLAS", "ASEQ", "ASGT", 
			"PL", "PLPL", "PLCL", "PLEQ", "CO", "MI", "MIMI", "MICL", "MIEQ", "MIGT", 
			"MIGTGT", "DT", "DTAS", "SL", "SLAS", "SLSL", "SLEQ", "ONESTEP", "CL", 
			"CLSL", "CLCL", "CLEQ", "SC", "LT", "LTMIGT", "LTLT", "LTLTLT", "LTLTLTEQ", 
			"LTLTEQ", "LTEQ", "EQ", "EQEQ", "EQEQEQ", "EQEQQM", "EQGT", "GT", "GTEQ", 
			"GTGT", "GTGTEQ", "GTGTGT", "GTGTGTEQ", "QM", "AT", "ATAT", "PATHPULSEDL", 
			"LB", "RB", "CA", "CAEQ", "CATI", "GA", "ACCEPT_ON", "ALIAS", "ALWAYS", 
			"ALWAYS_COMB", "ALWAYS_FF", "ALWAYS_LATCH", "AND", "ASSERT", "ASSIGN", 
			"ASSUME", "AUTOMATIC", "BEFORE", "BEGIN", "BIND", "BINS", "BINSOF", "BIT", 
			"BREAK", "BUF", "BUFIFZERO", "BUFIFONE", "BYTE", "CASE", "CASEX", "CASEZ", 
			"CELL", "CHANDLE", "CHECKER", "CLASS", "CLOCKING", "CMOS", "CONFIG", 
			"CONST", "CONSTRAINT", "CONTEXT", "CONTINUE", "COVER", "COVERGROUP", 
			"COVERPOINT", "CROSS", "DEASSIGN", "DEFAULT", "DEFPARAM", "DESIGN", "DISABLE", 
			"DIST", "DO", "EDGE", "ELSE", "END", "ENDCASE", "ENDCHECKER", "ENDCLASS", 
			"ENDCLOCKING", "ENDCONFIG", "ENDFUNCTION", "ENDGENERATE", "ENDGROUP", 
			"ENDINTERFACE", "ENDMODULE", "ENDPACKAGE", "ENDPRIMITIVE", "ENDPROGRAM", 
			"ENDPROPERTY", "ENDSEQUENCE", "ENDSPECIFY", "ENDTABLE", "ENDTASK", "ENUM", 
			"EVENT", "EXPECT", "EXPORT", "EXTENDS", "EXTERN", "FINAL", "FIRST_MATCH", 
			"FOR", "FORCE", "FOREACH", "FOREVER", "FORK", "FORKJOIN", "FUNCTION", 
			"GENERATE", "GENVAR", "GLOBAL", "HIGHZZERO", "HIGHZONE", "IF", "IFF", 
			"IFNONE", "IGNORE_BINS", "ILLEGAL_BINS", "IMPLEMENTS", "IMPLIES", "IMPORT", 
			"INCLUDE", "INITIAL", "INOUT", "INPUT", "INSIDE", "INSTANCE", "INT", 
			"INTEGER", "INTERCONNECT", "INTERFACE", "INTERSECT", "JOIN", "JOIN_ANY", 
			"JOIN_NONE", "LARGE", "LET", "LIBLIST", "LIBRARY", "LOCAL", "LOCALPARAM", 
			"LOGIC", "LONGINT", "MACROMODULE", "MATCHES", "MEDIUM", "MODPORT", "MODULE", 
			"NAND", "NEGEDGE", "NETTYPE", "NEW", "NEXTTIME", "NMOS", "NOR", "NOSHOWCANCELLED", 
			"NOT", "NOTIFZERO", "NOTIFONE", "NULL", "OPTIONDT", "OR", "OUTPUT", "PACKAGE", 
			"PACKED", "PARAMETER", "PMOS", "POSEDGE", "PRIMITIVE", "PRIORITY", "PROGRAM", 
			"PROPERTY", "PROTECTED", "PULLZERO", "PULLONE", "PULLDOWN", "PULLUP", 
			"PULSESTYLE_ONDETECT", "PULSESTYLE_ONEVENT", "PURE", "RAND", "RANDC", 
			"RANDCASE", "RANDOMIZE", "RANDSEQUENCE", "RCMOS", "REAL", "REALTIME", 
			"REF", "REG", "REJECT_ON", "RELEASE", "REPEAT", "RESTRICT", "RETURN", 
			"RNMOS", "RPMOS", "RTRAN", "RTRANIFZERO", "RTRANIFONE", "S_ALWAYS", "S_EVENTUALLY", 
			"S_NEXTTIME", "S_UNTIL", "S_UNTIL_WITH", "SAMPLE", "SCALARED", "SEQUENCE", 
			"SHORTINT", "SHORTREAL", "SHOWCANCELLED", "SIGNED", "SMALL", "SOFT", 
			"SOLVE", "SPECIFY", "SPECPARAM", "STATIC", "STD", "STRING", "STRONG", 
			"STRONGZERO", "STRONGONE", "STRUCT", "SUPER", "SUPPLYZERO", "SUPPLYONE", 
			"SYNC_ACCEPT_ON", "SYNC_REJECT_ON", "TABLE", "TAGGED", "TASK", "THIS", 
			"THROUGHOUT", "TIME", "TIMEPRECISION", "TIMEUNIT", "TRAN", "TRANIFZERO", 
			"TRANIFONE", "TRI", "TRIZERO", "TRIONE", "TRIAND", "TRIOR", "TRIREG", 
			"TYPE", "TYPE_OPTIONDT", "TYPEDEF", "UNION", "UNIQUE", "UNIQUEZERO", 
			"UNSIGNED", "UNTIL", "UNTIL_WITH", "UNTYPED", "USE", "UWIRE", "VAR", 
			"VECTORED", "VIRTUAL", "VOID", "WAIT", "WAIT_ORDER", "WAND", "WEAK", 
			"WEAKZERO", "WEAKONE", "WHILE", "WILDCARD", "WIRE", "WITH", "WITHIN", 
			"WOR", "XNOR", "XOR", "LC", "VL", "VLMIGT", "VLEQ", "VLEQGT", "VLVL", 
			"RC", "TI", "TIAM", "TICA", "TIVL", "TIME_LITERAL", "DECIMAL_NUMBER", 
			"BINARY_NUMBER", "OCTAL_NUMBER", "HEX_NUMBER", "REAL_NUMBER", "UNBASED_UNSIZED_LITERAL", 
			"STRING_LITERAL", "COMMENT", "ESCAPED_IDENTIFIER", "SIMPLE_IDENTIFIER", 
			"SYSTEM_TF_IDENTIFIER", "WHITE_SPACE", "ZERO_OR_ONE_Z_OR_X", "MIINCDIR", 
			"FILE_PATH_SPEC", "OUTPUT_OR_LEVEL_SYMBOL", "LEVEL_ONLY_SYMBOL", "EDGE_SYMBOL", 
			"FILE_DIRECTIVE", "LINE_DIRECTIVE_", "BEGIN_KEYWORDS_DIRECTIVE", "CELLDEFINE_DIRECTIVE", 
			"DEFAULT_NETTYPE_DIRECTIVE", "DEFINE_DIRECTIVE", "ELSE_DIRECTIVE", "ELSIF_DIRECTIVE", 
			"END_KEYWORDS_DIRECTIVE", "ENDCELLDEFINE_DIRECTIVE", "ENDIF_DIRECTIVE", 
			"IFDEF_DIRECTIVE", "IFNDEF_DIRECTIVE", "INCLUDE_DIRECTIVE", "LINE_DIRECTIVE", 
			"NOUNCONNECTED_DRIVE_DIRECTIVE", "PRAGMA_DIRECTIVE", "RESETALL_DIRECTIVE", 
			"TIMESCALE_DIRECTIVE", "UNCONNECTED_DRIVE_DIRECTIVE", "UNDEF_DIRECTIVE", 
			"UNDEFINEALL_DIRECTIVE", "MACRO_USAGE", "DIRECTIVE_TEXT", "DIRECTIVE_IDENTIFIER", 
			"DIRECTIVE_COMMENT", "DIRECTIVE_WHITE_SPACE", "DIRECTIVE_NEWLINE", "MACRO_TEXT", 
			"MACRO_ESC_NEWLINE", "SOURCE_TEXT"
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
	public String getGrammarFileName() { return "SystemVerilogPreParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SystemVerilogPreParser(TokenStream input) {
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
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterSource_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitSource_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitSource_text(this);
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GA) {
				{
				{
				setState(62);
				compiler_directive();
				}
				}
				setState(67);
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
		public File_directiveContext file_directive() {
			return getRuleContext(File_directiveContext.class,0);
		}
		public Line_directive_Context line_directive_() {
			return getRuleContext(Line_directive_Context.class,0);
		}
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
		public Undefineall_directiveContext undefineall_directive() {
			return getRuleContext(Undefineall_directiveContext.class,0);
		}
		public Compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterCompiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitCompiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitCompiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compiler_directiveContext compiler_directive() throws RecognitionException {
		Compiler_directiveContext _localctx = new Compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compiler_directive);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				file_directive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				line_directive_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				begin_keywords_directive();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				celldefine_directive();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				default_nettype_directive();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				endcelldefine_directive();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				end_keywords_directive();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				ifdef_directive();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				ifndef_directive();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(77);
				include_directive();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(78);
				line_directive();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(79);
				nounconnected_drive_directive();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(80);
				pragma_directive();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(81);
				resetall_directive();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(82);
				text_macro_definition();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(83);
				text_macro_usage();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(84);
				timescale_directive();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(85);
				unconnected_drive_directive();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(86);
				undef_directive();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(87);
				undefineall_directive();
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

	public static class File_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode FILE_DIRECTIVE() { return getToken(SystemVerilogPreParser.FILE_DIRECTIVE, 0); }
		public File_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterFile_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitFile_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitFile_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_directiveContext file_directive() throws RecognitionException {
		File_directiveContext _localctx = new File_directiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_file_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(GA);
			setState(91);
			match(FILE_DIRECTIVE);
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

	public static class Line_directive_Context extends ParserRuleContext {
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode LINE_DIRECTIVE_() { return getToken(SystemVerilogPreParser.LINE_DIRECTIVE_, 0); }
		public Line_directive_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_directive_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterLine_directive_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitLine_directive_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitLine_directive_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_directive_Context line_directive_() throws RecognitionException {
		Line_directive_Context _localctx = new Line_directive_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_line_directive_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(GA);
			setState(94);
			match(LINE_DIRECTIVE_);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode BEGIN_KEYWORDS_DIRECTIVE() { return getToken(SystemVerilogPreParser.BEGIN_KEYWORDS_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Begin_keywords_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_keywords_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterBegin_keywords_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitBegin_keywords_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitBegin_keywords_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_keywords_directiveContext begin_keywords_directive() throws RecognitionException {
		Begin_keywords_directiveContext _localctx = new Begin_keywords_directiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_begin_keywords_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(GA);
			setState(97);
			match(BEGIN_KEYWORDS_DIRECTIVE);
			setState(98);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode CELLDEFINE_DIRECTIVE() { return getToken(SystemVerilogPreParser.CELLDEFINE_DIRECTIVE, 0); }
		public Celldefine_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_celldefine_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterCelldefine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitCelldefine_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitCelldefine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Celldefine_directiveContext celldefine_directive() throws RecognitionException {
		Celldefine_directiveContext _localctx = new Celldefine_directiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_celldefine_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(GA);
			setState(101);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode DEFAULT_NETTYPE_DIRECTIVE() { return getToken(SystemVerilogPreParser.DEFAULT_NETTYPE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Default_nettype_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_nettype_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterDefault_nettype_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitDefault_nettype_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitDefault_nettype_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_nettype_directiveContext default_nettype_directive() throws RecognitionException {
		Default_nettype_directiveContext _localctx = new Default_nettype_directiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_default_nettype_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(GA);
			setState(104);
			match(DEFAULT_NETTYPE_DIRECTIVE);
			setState(105);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode ENDCELLDEFINE_DIRECTIVE() { return getToken(SystemVerilogPreParser.ENDCELLDEFINE_DIRECTIVE, 0); }
		public Endcelldefine_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endcelldefine_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterEndcelldefine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitEndcelldefine_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitEndcelldefine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endcelldefine_directiveContext endcelldefine_directive() throws RecognitionException {
		Endcelldefine_directiveContext _localctx = new Endcelldefine_directiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_endcelldefine_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(GA);
			setState(108);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode END_KEYWORDS_DIRECTIVE() { return getToken(SystemVerilogPreParser.END_KEYWORDS_DIRECTIVE, 0); }
		public End_keywords_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_keywords_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterEnd_keywords_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitEnd_keywords_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitEnd_keywords_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_keywords_directiveContext end_keywords_directive() throws RecognitionException {
		End_keywords_directiveContext _localctx = new End_keywords_directiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_end_keywords_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(GA);
			setState(111);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode IFDEF_DIRECTIVE() { return getToken(SystemVerilogPreParser.IFDEF_DIRECTIVE, 0); }
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
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterIfdef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitIfdef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitIfdef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifdef_directiveContext ifdef_directive() throws RecognitionException {
		Ifdef_directiveContext _localctx = new Ifdef_directiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifdef_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(GA);
			setState(114);
			match(IFDEF_DIRECTIVE);
			setState(115);
			text_macro_identifier();
			setState(116);
			ifdef_group_of_lines();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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

	public static class Ifndef_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode IFNDEF_DIRECTIVE() { return getToken(SystemVerilogPreParser.IFNDEF_DIRECTIVE, 0); }
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
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterIfndef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitIfndef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitIfndef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifndef_directiveContext ifndef_directive() throws RecognitionException {
		Ifndef_directiveContext _localctx = new Ifndef_directiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifndef_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(GA);
			setState(129);
			match(IFNDEF_DIRECTIVE);
			setState(130);
			text_macro_identifier();
			setState(131);
			ifndef_group_of_lines();
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					elsif_directive();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(138);
				else_directive();
				}
				break;
			}
			setState(141);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode INCLUDE_DIRECTIVE() { return getToken(SystemVerilogPreParser.INCLUDE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Include_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterInclude_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitInclude_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitInclude_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Include_directiveContext include_directive() throws RecognitionException {
		Include_directiveContext _localctx = new Include_directiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_include_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(GA);
			setState(144);
			match(INCLUDE_DIRECTIVE);
			setState(145);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode LINE_DIRECTIVE() { return getToken(SystemVerilogPreParser.LINE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Line_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterLine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitLine_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitLine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_directiveContext line_directive() throws RecognitionException {
		Line_directiveContext _localctx = new Line_directiveContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_line_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(GA);
			setState(148);
			match(LINE_DIRECTIVE);
			setState(149);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode NOUNCONNECTED_DRIVE_DIRECTIVE() { return getToken(SystemVerilogPreParser.NOUNCONNECTED_DRIVE_DIRECTIVE, 0); }
		public Nounconnected_drive_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounconnected_drive_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterNounconnected_drive_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitNounconnected_drive_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitNounconnected_drive_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nounconnected_drive_directiveContext nounconnected_drive_directive() throws RecognitionException {
		Nounconnected_drive_directiveContext _localctx = new Nounconnected_drive_directiveContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nounconnected_drive_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(GA);
			setState(152);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode PRAGMA_DIRECTIVE() { return getToken(SystemVerilogPreParser.PRAGMA_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Pragma_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterPragma_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitPragma_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitPragma_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_directiveContext pragma_directive() throws RecognitionException {
		Pragma_directiveContext _localctx = new Pragma_directiveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pragma_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(GA);
			setState(155);
			match(PRAGMA_DIRECTIVE);
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

	public static class Resetall_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode RESETALL_DIRECTIVE() { return getToken(SystemVerilogPreParser.RESETALL_DIRECTIVE, 0); }
		public Resetall_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetall_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterResetall_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitResetall_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitResetall_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resetall_directiveContext resetall_directive() throws RecognitionException {
		Resetall_directiveContext _localctx = new Resetall_directiveContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_resetall_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(GA);
			setState(159);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode DEFINE_DIRECTIVE() { return getToken(SystemVerilogPreParser.DEFINE_DIRECTIVE, 0); }
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
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterText_macro_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitText_macro_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitText_macro_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_definitionContext text_macro_definition() throws RecognitionException {
		Text_macro_definitionContext _localctx = new Text_macro_definitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_text_macro_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(GA);
			setState(162);
			match(DEFINE_DIRECTIVE);
			setState(163);
			text_macro_identifier();
			setState(164);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode MACRO_USAGE() { return getToken(SystemVerilogPreParser.MACRO_USAGE, 0); }
		public Text_macro_usageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_macro_usage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterText_macro_usage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitText_macro_usage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitText_macro_usage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_usageContext text_macro_usage() throws RecognitionException {
		Text_macro_usageContext _localctx = new Text_macro_usageContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_text_macro_usage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(GA);
			setState(167);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode TIMESCALE_DIRECTIVE() { return getToken(SystemVerilogPreParser.TIMESCALE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Timescale_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timescale_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterTimescale_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitTimescale_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitTimescale_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timescale_directiveContext timescale_directive() throws RecognitionException {
		Timescale_directiveContext _localctx = new Timescale_directiveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_timescale_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(GA);
			setState(170);
			match(TIMESCALE_DIRECTIVE);
			setState(171);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode UNCONNECTED_DRIVE_DIRECTIVE() { return getToken(SystemVerilogPreParser.UNCONNECTED_DRIVE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_TEXT() { return getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0); }
		public Unconnected_drive_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconnected_drive_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterUnconnected_drive_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitUnconnected_drive_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitUnconnected_drive_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unconnected_drive_directiveContext unconnected_drive_directive() throws RecognitionException {
		Unconnected_drive_directiveContext _localctx = new Unconnected_drive_directiveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unconnected_drive_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(GA);
			setState(174);
			match(UNCONNECTED_DRIVE_DIRECTIVE);
			setState(175);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode UNDEF_DIRECTIVE() { return getToken(SystemVerilogPreParser.UNDEF_DIRECTIVE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Undef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undef_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterUndef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitUndef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitUndef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Undef_directiveContext undef_directive() throws RecognitionException {
		Undef_directiveContext _localctx = new Undef_directiveContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_undef_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(GA);
			setState(178);
			match(UNDEF_DIRECTIVE);
			setState(179);
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

	public static class Undefineall_directiveContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode UNDEFINEALL_DIRECTIVE() { return getToken(SystemVerilogPreParser.UNDEFINEALL_DIRECTIVE, 0); }
		public Undefineall_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undefineall_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterUndefineall_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitUndefineall_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitUndefineall_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Undefineall_directiveContext undefineall_directive() throws RecognitionException {
		Undefineall_directiveContext _localctx = new Undefineall_directiveContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_undefineall_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(GA);
			setState(182);
			match(UNDEFINEALL_DIRECTIVE);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode ELSIF_DIRECTIVE() { return getToken(SystemVerilogPreParser.ELSIF_DIRECTIVE, 0); }
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
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterElsif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitElsif_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitElsif_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elsif_directiveContext elsif_directive() throws RecognitionException {
		Elsif_directiveContext _localctx = new Elsif_directiveContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elsif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(GA);
			setState(185);
			match(ELSIF_DIRECTIVE);
			setState(186);
			text_macro_identifier();
			setState(187);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode ELSE_DIRECTIVE() { return getToken(SystemVerilogPreParser.ELSE_DIRECTIVE, 0); }
		public Else_group_of_linesContext else_group_of_lines() {
			return getRuleContext(Else_group_of_linesContext.class,0);
		}
		public Else_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterElse_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitElse_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitElse_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_directiveContext else_directive() throws RecognitionException {
		Else_directiveContext _localctx = new Else_directiveContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_else_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(GA);
			setState(190);
			match(ELSE_DIRECTIVE);
			setState(191);
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
		public TerminalNode GA() { return getToken(SystemVerilogPreParser.GA, 0); }
		public TerminalNode ENDIF_DIRECTIVE() { return getToken(SystemVerilogPreParser.ENDIF_DIRECTIVE, 0); }
		public Endif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterEndif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitEndif_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitEndif_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endif_directiveContext endif_directive() throws RecognitionException {
		Endif_directiveContext _localctx = new Endif_directiveContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_endif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(GA);
			setState(194);
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
		public TerminalNode DIRECTIVE_IDENTIFIER() { return getToken(SystemVerilogPreParser.DIRECTIVE_IDENTIFIER, 0); }
		public Text_macro_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_macro_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterText_macro_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitText_macro_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitText_macro_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_identifierContext text_macro_identifier() throws RecognitionException {
		Text_macro_identifierContext _localctx = new Text_macro_identifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_text_macro_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(SystemVerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(SystemVerilogPreParser.SOURCE_TEXT, i);
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
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterIfdef_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitIfdef_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitIfdef_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifdef_group_of_linesContext ifdef_group_of_lines() throws RecognitionException {
		Ifdef_group_of_linesContext _localctx = new Ifdef_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifdef_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(200);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(198);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(199);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(204);
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
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(SystemVerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(SystemVerilogPreParser.SOURCE_TEXT, i);
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
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterIfndef_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitIfndef_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitIfndef_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifndef_group_of_linesContext ifndef_group_of_lines() throws RecognitionException {
		Ifndef_group_of_linesContext _localctx = new Ifndef_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifndef_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(207);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(205);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(206);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(211);
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
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(SystemVerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(SystemVerilogPreParser.SOURCE_TEXT, i);
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
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterElsif_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitElsif_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitElsif_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elsif_group_of_linesContext elsif_group_of_lines() throws RecognitionException {
		Elsif_group_of_linesContext _localctx = new Elsif_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elsif_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(214);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(212);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(213);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(218);
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
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(SystemVerilogPreParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(SystemVerilogPreParser.SOURCE_TEXT, i);
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
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterElse_group_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitElse_group_of_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitElse_group_of_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_group_of_linesContext else_group_of_lines() throws RecognitionException {
		Else_group_of_linesContext _localctx = new Else_group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_else_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(221);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(219);
						match(SOURCE_TEXT);
						}
						break;
					case GA:
						{
						setState(220);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(225);
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
		public List<TerminalNode> MACRO_TEXT() { return getTokens(SystemVerilogPreParser.MACRO_TEXT); }
		public TerminalNode MACRO_TEXT(int i) {
			return getToken(SystemVerilogPreParser.MACRO_TEXT, i);
		}
		public List<TerminalNode> MACRO_ESC_NEWLINE() { return getTokens(SystemVerilogPreParser.MACRO_ESC_NEWLINE); }
		public TerminalNode MACRO_ESC_NEWLINE(int i) {
			return getToken(SystemVerilogPreParser.MACRO_ESC_NEWLINE, i);
		}
		public Macro_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).enterMacro_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SystemVerilogPreParserListener ) ((SystemVerilogPreParserListener)listener).exitMacro_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SystemVerilogPreParserVisitor ) return ((SystemVerilogPreParserVisitor<? extends T>)visitor).visitMacro_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_textContext macro_text() throws RecognitionException {
		Macro_textContext _localctx = new Macro_textContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_macro_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MACRO_TEXT || _la==MACRO_ESC_NEWLINE) {
				{
				{
				setState(226);
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
				setState(231);
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
		"\u0004\u0001\u0198\u00e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0001\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001Y\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tw\b"+
		"\t\n\t\f\tz\t\t\u0001\t\u0003\t}\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0086\b\n\n\n\f\n\u0089\t\n\u0001\n\u0003\n"+
		"\u008c\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u00c9\b\u001a\n\u001a\f\u001a"+
		"\u00cc\t\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u00d0\b\u001b\n\u001b"+
		"\f\u001b\u00d3\t\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u00d7\b\u001c"+
		"\n\u001c\f\u001c\u00da\t\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u00de"+
		"\b\u001d\n\u001d\f\u001d\u00e1\t\u001d\u0001\u001e\u0005\u001e\u00e4\b"+
		"\u001e\n\u001e\f\u001e\u00e7\t\u001e\u0001\u001e\u0000\u0000\u001f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<\u0000\u0001\u0001\u0000\u0196\u0197\u00ea\u0000"+
		"A\u0001\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004Z\u0001"+
		"\u0000\u0000\u0000\u0006]\u0001\u0000\u0000\u0000\b`\u0001\u0000\u0000"+
		"\u0000\nd\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000ek\u0001"+
		"\u0000\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012q\u0001\u0000\u0000"+
		"\u0000\u0014\u0080\u0001\u0000\u0000\u0000\u0016\u008f\u0001\u0000\u0000"+
		"\u0000\u0018\u0093\u0001\u0000\u0000\u0000\u001a\u0097\u0001\u0000\u0000"+
		"\u0000\u001c\u009a\u0001\u0000\u0000\u0000\u001e\u009e\u0001\u0000\u0000"+
		"\u0000 \u00a1\u0001\u0000\u0000\u0000\"\u00a6\u0001\u0000\u0000\u0000"+
		"$\u00a9\u0001\u0000\u0000\u0000&\u00ad\u0001\u0000\u0000\u0000(\u00b1"+
		"\u0001\u0000\u0000\u0000*\u00b5\u0001\u0000\u0000\u0000,\u00b8\u0001\u0000"+
		"\u0000\u0000.\u00bd\u0001\u0000\u0000\u00000\u00c1\u0001\u0000\u0000\u0000"+
		"2\u00c4\u0001\u0000\u0000\u00004\u00ca\u0001\u0000\u0000\u00006\u00d1"+
		"\u0001\u0000\u0000\u00008\u00d8\u0001\u0000\u0000\u0000:\u00df\u0001\u0000"+
		"\u0000\u0000<\u00e5\u0001\u0000\u0000\u0000>@\u0003\u0002\u0001\u0000"+
		"?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000B\u0001\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000DY\u0003\u0004\u0002\u0000EY\u0003\u0006\u0003\u0000"+
		"FY\u0003\b\u0004\u0000GY\u0003\n\u0005\u0000HY\u0003\f\u0006\u0000IY\u0003"+
		"\u000e\u0007\u0000JY\u0003\u0010\b\u0000KY\u0003\u0012\t\u0000LY\u0003"+
		"\u0014\n\u0000MY\u0003\u0016\u000b\u0000NY\u0003\u0018\f\u0000OY\u0003"+
		"\u001a\r\u0000PY\u0003\u001c\u000e\u0000QY\u0003\u001e\u000f\u0000RY\u0003"+
		" \u0010\u0000SY\u0003\"\u0011\u0000TY\u0003$\u0012\u0000UY\u0003&\u0013"+
		"\u0000VY\u0003(\u0014\u0000WY\u0003*\u0015\u0000XD\u0001\u0000\u0000\u0000"+
		"XE\u0001\u0000\u0000\u0000XF\u0001\u0000\u0000\u0000XG\u0001\u0000\u0000"+
		"\u0000XH\u0001\u0000\u0000\u0000XI\u0001\u0000\u0000\u0000XJ\u0001\u0000"+
		"\u0000\u0000XK\u0001\u0000\u0000\u0000XL\u0001\u0000\u0000\u0000XM\u0001"+
		"\u0000\u0000\u0000XN\u0001\u0000\u0000\u0000XO\u0001\u0000\u0000\u0000"+
		"XP\u0001\u0000\u0000\u0000XQ\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000"+
		"\u0000XS\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000XU\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u0003"+
		"\u0001\u0000\u0000\u0000Z[\u0005`\u0000\u0000[\\\u0005\u017a\u0000\u0000"+
		"\\\u0005\u0001\u0000\u0000\u0000]^\u0005`\u0000\u0000^_\u0005\u017b\u0000"+
		"\u0000_\u0007\u0001\u0000\u0000\u0000`a\u0005`\u0000\u0000ab\u0005\u017c"+
		"\u0000\u0000bc\u0005\u0191\u0000\u0000c\t\u0001\u0000\u0000\u0000de\u0005"+
		"`\u0000\u0000ef\u0005\u017d\u0000\u0000f\u000b\u0001\u0000\u0000\u0000"+
		"gh\u0005`\u0000\u0000hi\u0005\u017e\u0000\u0000ij\u0005\u0191\u0000\u0000"+
		"j\r\u0001\u0000\u0000\u0000kl\u0005`\u0000\u0000lm\u0005\u0183\u0000\u0000"+
		"m\u000f\u0001\u0000\u0000\u0000no\u0005`\u0000\u0000op\u0005\u0182\u0000"+
		"\u0000p\u0011\u0001\u0000\u0000\u0000qr\u0005`\u0000\u0000rs\u0005\u0185"+
		"\u0000\u0000st\u00032\u0019\u0000tx\u00034\u001a\u0000uw\u0003,\u0016"+
		"\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{}\u0003.\u0017\u0000|{\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u00030\u0018\u0000"+
		"\u007f\u0013\u0001\u0000\u0000\u0000\u0080\u0081\u0005`\u0000\u0000\u0081"+
		"\u0082\u0005\u0186\u0000\u0000\u0082\u0083\u00032\u0019\u0000\u0083\u0087"+
		"\u00036\u001b\u0000\u0084\u0086\u0003,\u0016\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008c\u0003.\u0017"+
		"\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u00030\u0018\u0000"+
		"\u008e\u0015\u0001\u0000\u0000\u0000\u008f\u0090\u0005`\u0000\u0000\u0090"+
		"\u0091\u0005\u0187\u0000\u0000\u0091\u0092\u0005\u0191\u0000\u0000\u0092"+
		"\u0017\u0001\u0000\u0000\u0000\u0093\u0094\u0005`\u0000\u0000\u0094\u0095"+
		"\u0005\u0188\u0000\u0000\u0095\u0096\u0005\u0191\u0000\u0000\u0096\u0019"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005`\u0000\u0000\u0098\u0099\u0005"+
		"\u0189\u0000\u0000\u0099\u001b\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"`\u0000\u0000\u009b\u009c\u0005\u018a\u0000\u0000\u009c\u009d\u0005\u0191"+
		"\u0000\u0000\u009d\u001d\u0001\u0000\u0000\u0000\u009e\u009f\u0005`\u0000"+
		"\u0000\u009f\u00a0\u0005\u018b\u0000\u0000\u00a0\u001f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005`\u0000\u0000\u00a2\u00a3\u0005\u017f\u0000\u0000"+
		"\u00a3\u00a4\u00032\u0019\u0000\u00a4\u00a5\u0003<\u001e\u0000\u00a5!"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005`\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0190\u0000\u0000\u00a8#\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005`\u0000"+
		"\u0000\u00aa\u00ab\u0005\u018c\u0000\u0000\u00ab\u00ac\u0005\u0191\u0000"+
		"\u0000\u00ac%\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005`\u0000\u0000\u00ae"+
		"\u00af\u0005\u018d\u0000\u0000\u00af\u00b0\u0005\u0191\u0000\u0000\u00b0"+
		"\'\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005`\u0000\u0000\u00b2\u00b3"+
		"\u0005\u018e\u0000\u0000\u00b3\u00b4\u00032\u0019\u0000\u00b4)\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005`\u0000\u0000\u00b6\u00b7\u0005\u018f\u0000"+
		"\u0000\u00b7+\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005`\u0000\u0000\u00b9"+
		"\u00ba\u0005\u0181\u0000\u0000\u00ba\u00bb\u00032\u0019\u0000\u00bb\u00bc"+
		"\u00038\u001c\u0000\u00bc-\u0001\u0000\u0000\u0000\u00bd\u00be\u0005`"+
		"\u0000\u0000\u00be\u00bf\u0005\u0180\u0000\u0000\u00bf\u00c0\u0003:\u001d"+
		"\u0000\u00c0/\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005`\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0184\u0000\u0000\u00c31\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0005\u0192\u0000\u0000\u00c53\u0001\u0000\u0000\u0000\u00c6\u00c9\u0005"+
		"\u0198\u0000\u0000\u00c7\u00c9\u0003\u0002\u0001\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb5\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d0\u0005\u0198\u0000\u0000\u00ce\u00d0\u0003\u0002"+
		"\u0001\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d27\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d7\u0005\u0198\u0000"+
		"\u0000\u00d5\u00d7\u0003\u0002\u0001\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d99\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000"+
		"\u00db\u00de\u0005\u0198\u0000\u0000\u00dc\u00de\u0003\u0002\u0001\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0;\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e2\u00e4\u0007\u0000\u0000\u0000\u00e3"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"=\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u000fAX"+
		"x|\u0087\u008b\u00c8\u00ca\u00cf\u00d1\u00d6\u00d8\u00dd\u00df\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}