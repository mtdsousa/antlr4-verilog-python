// Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4-2/verilog/systemverilog/SystemVerilogPreParser.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EM=1, EMEQ=2, EMEQEQ=3, EMEQQM=4, DQ=5, DQDPIDQ=6, DQDPIMICDQ=7, HA=8, 
		HAHA=9, HAMIHA=10, HAZERO=11, HAEQHA=12, DL=13, DLERROR=14, DLFATAL=15, 
		DLFULLSKEW=16, DLHOLD=17, DLINFO=18, DLNOCHANGE=19, DLPERIOD=20, DLRECOVERY=21, 
		DLRECREM=22, DLREMOVAL=23, DLROOTDT=24, DLSETUP=25, DLSETUPHOLD=26, DLSKEW=27, 
		DLTIMESKEW=28, DLUNIT=29, DLWARNING=30, DLWIDTH=31, MO=32, MOEQ=33, AM=34, 
		AMAM=35, AMAMAM=36, AMEQ=37, LP=38, RP=39, AS=40, ASAS=41, ASSL=42, ASCLCLAS=43, 
		ASEQ=44, ASGT=45, PL=46, PLPL=47, PLCL=48, PLEQ=49, CO=50, MI=51, MIMI=52, 
		MICL=53, MIEQ=54, MIGT=55, MIGTGT=56, MIINCDIR=57, DT=58, DTAS=59, SL=60, 
		SLAS=61, SLSL=62, SLEQ=63, ONESTEP=64, CL=65, CLSL=66, CLCL=67, CLEQ=68, 
		SC=69, LT=70, LTMIGT=71, LTLT=72, LTLTLT=73, LTLTLTEQ=74, LTLTEQ=75, LTEQ=76, 
		EQ=77, EQEQ=78, EQEQEQ=79, EQEQQM=80, EQGT=81, GT=82, GTEQ=83, GTGT=84, 
		GTGTEQ=85, GTGTGT=86, GTGTGTEQ=87, QM=88, AT=89, ATAT=90, PATHPULSEDL=91, 
		LB=92, BSAP=93, RB=94, CA=95, CAEQ=96, CATI=97, GA=98, ACCEPT_ON=99, ALIAS=100, 
		ALWAYS=101, ALWAYS_COMB=102, ALWAYS_FF=103, ALWAYS_LATCH=104, AND=105, 
		ASSERT=106, ASSIGN=107, ASSUME=108, AUTOMATIC=109, BEFORE=110, BEGIN=111, 
		BIND=112, BINS=113, BINSOF=114, BIT=115, BREAK=116, BUF=117, BUFIFZERO=118, 
		BUFIFONE=119, BYTE=120, CASE=121, CASEX=122, CASEZ=123, CELL=124, CHANDLE=125, 
		CHECKER=126, CLASS=127, CLOCKING=128, CMOS=129, CONFIG=130, CONST=131, 
		CONSTRAINT=132, CONTEXT=133, CONTINUE=134, COVER=135, COVERGROUP=136, 
		COVERPOINT=137, CROSS=138, DEASSIGN=139, DEFAULT=140, DEFPARAM=141, DESIGN=142, 
		DISABLE=143, DIST=144, DO=145, EDGE=146, ELSE=147, END=148, ENDCASE=149, 
		ENDCHECKER=150, ENDCLASS=151, ENDCLOCKING=152, ENDCONFIG=153, ENDFUNCTION=154, 
		ENDGENERATE=155, ENDGROUP=156, ENDINTERFACE=157, ENDMODULE=158, ENDPACKAGE=159, 
		ENDPRIMITIVE=160, ENDPROGRAM=161, ENDPROPERTY=162, ENDSEQUENCE=163, ENDSPECIFY=164, 
		ENDTABLE=165, ENDTASK=166, ENUM=167, EVENT=168, EXPECT=169, EXPORT=170, 
		EXTENDS=171, EXTERN=172, FINAL=173, FIRST_MATCH=174, FOR=175, FORCE=176, 
		FOREACH=177, FOREVER=178, FORK=179, FORKJOIN=180, FUNCTION=181, GENERATE=182, 
		GENVAR=183, GLOBAL=184, HIGHZZERO=185, HIGHZONE=186, IF=187, IFF=188, 
		IFNONE=189, IGNORE_BINS=190, ILLEGAL_BINS=191, IMPLEMENTS=192, IMPLIES=193, 
		IMPORT=194, INCLUDE=195, INITIAL=196, INOUT=197, INPUT=198, INSIDE=199, 
		INSTANCE=200, INT=201, INTEGER=202, INTERCONNECT=203, INTERFACE=204, INTERSECT=205, 
		JOIN=206, JOIN_ANY=207, JOIN_NONE=208, LARGE=209, LET=210, LIBLIST=211, 
		LIBRARY=212, LOCAL=213, LOCALPARAM=214, LOGIC=215, LONGINT=216, MACROMODULE=217, 
		MATCHES=218, MEDIUM=219, MODPORT=220, MODULE=221, NAND=222, NEGEDGE=223, 
		NETTYPE=224, NEW=225, NEXTTIME=226, NMOS=227, NOR=228, NOSHOWCANCELLED=229, 
		NOT=230, NOTIFZERO=231, NOTIFONE=232, NULL=233, OPTIONDT=234, OR=235, 
		OUTPUT=236, PACKAGE=237, PACKED=238, PARAMETER=239, PMOS=240, POSEDGE=241, 
		PRIMITIVE=242, PRIORITY=243, PROGRAM=244, PROPERTY=245, PROTECTED=246, 
		PULLZERO=247, PULLONE=248, PULLDOWN=249, PULLUP=250, PULSESTYLE_ONDETECT=251, 
		PULSESTYLE_ONEVENT=252, PURE=253, RAND=254, RANDC=255, RANDCASE=256, RANDOMIZE=257, 
		RANDSEQUENCE=258, RCMOS=259, REAL=260, REALTIME=261, REF=262, REG=263, 
		REJECT_ON=264, RELEASE=265, REPEAT=266, RESTRICT=267, RETURN=268, RNMOS=269, 
		RPMOS=270, RTRAN=271, RTRANIFZERO=272, RTRANIFONE=273, S_ALWAYS=274, S_EVENTUALLY=275, 
		S_NEXTTIME=276, S_UNTIL=277, S_UNTIL_WITH=278, SAMPLE=279, SCALARED=280, 
		SEQUENCE=281, SHORTINT=282, SHORTREAL=283, SHOWCANCELLED=284, SIGNED=285, 
		SMALL=286, SOFT=287, SOLVE=288, SPECIFY=289, SPECPARAM=290, STATIC=291, 
		STD=292, STRING=293, STRONG=294, STRONGZERO=295, STRONGONE=296, STRUCT=297, 
		SUPER=298, SUPPLYZERO=299, SUPPLYONE=300, SYNC_ACCEPT_ON=301, SYNC_REJECT_ON=302, 
		TABLE=303, TAGGED=304, TASK=305, THIS=306, THROUGHOUT=307, TIME=308, TIMEPRECISION=309, 
		TIMEUNIT=310, TRAN=311, TRANIFZERO=312, TRANIFONE=313, TRI=314, TRIZERO=315, 
		TRIONE=316, TRIAND=317, TRIOR=318, TRIREG=319, TYPE=320, TYPE_OPTIONDT=321, 
		TYPEDEF=322, UNION=323, UNIQUE=324, UNIQUEZERO=325, UNSIGNED=326, UNTIL=327, 
		UNTIL_WITH=328, UNTYPED=329, USE=330, UWIRE=331, VAR=332, VECTORED=333, 
		VIRTUAL=334, VOID=335, WAIT=336, WAIT_ORDER=337, WAND=338, WEAK=339, WEAKZERO=340, 
		WEAKONE=341, WHILE=342, WILDCARD=343, WIRE=344, WITH=345, WITHIN=346, 
		WOR=347, XNOR=348, XOR=349, LC=350, VL=351, VLMIGT=352, VLEQ=353, VLEQGT=354, 
		VLVL=355, RC=356, TI=357, TIAM=358, TICA=359, TIVL=360, TIME_LITERAL=361, 
		DECIMAL_NUMBER=362, BINARY_NUMBER=363, OCTAL_NUMBER=364, HEX_NUMBER=365, 
		REAL_NUMBER=366, UNBASED_UNSIZED_LITERAL=367, STRING_LITERAL=368, COMMENT=369, 
		ESCAPED_IDENTIFIER=370, SIMPLE_IDENTIFIER=371, SYSTEM_TF_IDENTIFIER=372, 
		WHITE_SPACE=373, FILE_PATH_SPEC=374, FINISH_NUMBER=375, INIT_VAL=376, 
		OUTPUT_SYMBOL=377, LEVEL_SYMBOL=378, EDGE_SYMBOL=379, EDGE_DESCRIPTOR=380, 
		SCALAR_CONSTANT=381, FILE_DIRECTIVE=382, LINE_DIRECTIVE_=383, BEGIN_KEYWORDS_DIRECTIVE=384, 
		CELLDEFINE_DIRECTIVE=385, DEFAULT_NETTYPE_DIRECTIVE=386, DEFINE_DIRECTIVE=387, 
		ELSE_DIRECTIVE=388, ELSIF_DIRECTIVE=389, END_KEYWORDS_DIRECTIVE=390, ENDCELLDEFINE_DIRECTIVE=391, 
		ENDIF_DIRECTIVE=392, IFDEF_DIRECTIVE=393, IFNDEF_DIRECTIVE=394, INCLUDE_DIRECTIVE=395, 
		LINE_DIRECTIVE=396, NOUNCONNECTED_DRIVE_DIRECTIVE=397, PRAGMA_DIRECTIVE=398, 
		RESETALL_DIRECTIVE=399, TIMESCALE_DIRECTIVE=400, UNCONNECTED_DRIVE_DIRECTIVE=401, 
		UNDEF_DIRECTIVE=402, UNDEFINEALL_DIRECTIVE=403, MACRO_USAGE=404, DIRECTIVE_TEXT=405, 
		DIRECTIVE_IDENTIFIER=406, DIRECTIVE_COMMENT=407, DIRECTIVE_WHITE_SPACE=408, 
		DIRECTIVE_NEWLINE=409, MACRO_TEXT=410, MT_ESC_NEWLINE=411, SOURCE_TEXT=412;
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
			"'#'", "'##'", "'#-#'", "'#0'", "'#=#'", "'$'", "'$error'", "'$fatal'", 
			"'$fullskew'", "'$hold'", "'$info'", "'$nochange'", "'$period'", "'$recovery'", 
			"'$recrem'", "'$removal'", "'$root.'", "'$setup'", "'$setuphold'", "'$skew'", 
			"'$timeskew'", "'$unit'", "'$warning'", "'$width'", "'%'", "'%='", "'&'", 
			"'&&'", "'&&&'", "'&='", "'('", "')'", "'*'", "'**'", "'*/'", "'*::*'", 
			"'*='", "'*>'", "'+'", "'++'", "'+:'", "'+='", "','", "'-'", "'--'", 
			"'-:'", "'-='", "'->'", "'->>'", "'-incdir'", "'.'", "'.*'", "'/'", "'/*'", 
			"'//'", "'/='", "'1step'", "':'", "':/'", "'::'", "':='", "';'", "'<'", 
			"'<->'", "'<<'", "'<<<'", "'<<<='", "'<<='", "'<='", "'='", "'=='", "'==='", 
			"'==?'", "'=>'", "'>'", "'>='", "'>>'", "'>>='", "'>>>'", "'>>>='", "'?'", 
			"'@'", "'@@'", "'PATHPULSE$'", "'['", "'''", "']'", "'^'", "'^='", "'^~'", 
			null, "'accept_on'", "'alias'", "'always'", "'always_comb'", "'always_ff'", 
			"'always_latch'", "'and'", "'assert'", "'assign'", "'assume'", "'automatic'", 
			"'before'", "'begin'", "'bind'", "'bins'", "'binsof'", "'bit'", "'break'", 
			"'buf'", "'bufif0'", "'bufif1'", "'byte'", "'case'", "'casex'", "'casez'", 
			"'cell'", "'chandle'", "'checker'", "'class'", "'clocking'", "'cmos'", 
			"'config'", "'const'", "'constraint'", "'context'", "'continue'", "'cover'", 
			"'covergroup'", "'coverpoint'", "'cross'", "'deassign'", "'default'", 
			"'defparam'", "'design'", "'disable'", "'dist'", "'do'", "'edge'", "'else'", 
			"'end'", "'endcase'", "'endchecker'", "'endclass'", "'endclocking'", 
			"'endconfig'", "'endfunction'", "'endgenerate'", "'endgroup'", "'endinterface'", 
			"'endmodule'", "'endpackage'", "'endprimitive'", "'endprogram'", "'endproperty'", 
			"'endsequence'", "'endspecify'", "'endtable'", "'endtask'", "'enum'", 
			"'event'", "'expect'", "'export'", "'extends'", "'extern'", "'final'", 
			"'first_match'", "'for'", "'force'", "'foreach'", "'forever'", "'fork'", 
			"'forkjoin'", "'function'", "'generate'", "'genvar'", "'global'", "'highz0'", 
			"'highz1'", "'if'", "'iff'", "'ifnone'", "'ignore_bins'", "'illegal_bins'", 
			"'implements'", "'implies'", "'import'", "'include'", "'initial'", "'inout'", 
			"'input'", "'inside'", "'instance'", "'int'", "'integer'", "'interconnect'", 
			"'interface'", "'intersect'", "'join'", "'join_any'", "'join_none'", 
			"'large'", "'let'", "'liblist'", "'library'", "'local'", "'localparam'", 
			"'logic'", "'longint'", "'macromodule'", "'matches'", "'medium'", "'modport'", 
			"'module'", "'nand'", "'negedge'", "'nettype'", "'new'", "'nexttime'", 
			"'nmos'", "'nor'", "'noshowcancelled'", "'not'", "'notif0'", "'notif1'", 
			"'null'", "'option.'", "'or'", "'output'", "'package'", "'packed'", "'parameter'", 
			"'pmos'", "'posedge'", "'primitive'", "'priority'", "'program'", "'property'", 
			"'protected'", "'pull0'", "'pull1'", "'pulldown'", "'pullup'", "'pulsestyle_ondetect'", 
			"'pulsestyle_onevent'", "'pure'", "'rand'", "'randc'", "'randcase'", 
			"'randomize'", "'randsequence'", "'rcmos'", "'real'", "'realtime'", "'ref'", 
			"'reg'", "'reject_on'", "'release'", "'repeat'", "'restrict'", "'return'", 
			"'rnmos'", "'rpmos'", "'rtran'", "'rtranif0'", "'rtranif1'", "'s_always'", 
			"'s_eventually'", "'s_nexttime'", "'s_until'", "'s_until_with'", "'sample'", 
			"'scalared'", "'sequence'", "'shortint'", "'shortreal'", "'showcancelled'", 
			"'signed'", "'small'", "'soft'", "'solve'", "'specify'", "'specparam'", 
			"'static'", "'std'", "'string'", "'strong'", "'strong0'", "'strong1'", 
			"'struct'", "'super'", "'supply0'", "'supply1'", "'sync_accept_on'", 
			"'sync_reject_on'", "'table'", "'tagged'", "'task'", "'this'", "'throughout'", 
			"'time'", "'timeprecision'", "'timeunit'", "'tran'", "'tranif0'", "'tranif1'", 
			"'tri'", "'tri0'", "'tri1'", "'triand'", "'trior'", "'trireg'", "'type'", 
			"'type_option.'", "'typedef'", "'union'", "'unique'", "'unique0'", "'unsigned'", 
			"'until'", "'until_with'", "'untyped'", "'use'", "'uwire'", "'var'", 
			"'vectored'", "'virtual'", "'void'", "'wait'", "'wait_order'", "'wand'", 
			"'weak'", "'weak0'", "'weak1'", "'while'", "'wildcard'", "'wire'", "'with'", 
			"'within'", "'wor'", "'xnor'", "'xor'", "'{'", "'|'", "'|->'", "'|='", 
			"'|=>'", "'||'", "'}'", "'~'", "'~&'", "'~^'", "'~|'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'__FILE__'", "'__LINE__'", null, 
			"'celldefine'", null, null, null, null, "'end_keywords'", "'endcelldefine'", 
			null, null, null, null, null, "'nounconnected_drive'", null, "'resetall'", 
			null, null, null, "'undefineall'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EM", "EMEQ", "EMEQEQ", "EMEQQM", "DQ", "DQDPIDQ", "DQDPIMICDQ", 
			"HA", "HAHA", "HAMIHA", "HAZERO", "HAEQHA", "DL", "DLERROR", "DLFATAL", 
			"DLFULLSKEW", "DLHOLD", "DLINFO", "DLNOCHANGE", "DLPERIOD", "DLRECOVERY", 
			"DLRECREM", "DLREMOVAL", "DLROOTDT", "DLSETUP", "DLSETUPHOLD", "DLSKEW", 
			"DLTIMESKEW", "DLUNIT", "DLWARNING", "DLWIDTH", "MO", "MOEQ", "AM", "AMAM", 
			"AMAMAM", "AMEQ", "LP", "RP", "AS", "ASAS", "ASSL", "ASCLCLAS", "ASEQ", 
			"ASGT", "PL", "PLPL", "PLCL", "PLEQ", "CO", "MI", "MIMI", "MICL", "MIEQ", 
			"MIGT", "MIGTGT", "MIINCDIR", "DT", "DTAS", "SL", "SLAS", "SLSL", "SLEQ", 
			"ONESTEP", "CL", "CLSL", "CLCL", "CLEQ", "SC", "LT", "LTMIGT", "LTLT", 
			"LTLTLT", "LTLTLTEQ", "LTLTEQ", "LTEQ", "EQ", "EQEQ", "EQEQEQ", "EQEQQM", 
			"EQGT", "GT", "GTEQ", "GTGT", "GTGTEQ", "GTGTGT", "GTGTGTEQ", "QM", "AT", 
			"ATAT", "PATHPULSEDL", "LB", "BSAP", "RB", "CA", "CAEQ", "CATI", "GA", 
			"ACCEPT_ON", "ALIAS", "ALWAYS", "ALWAYS_COMB", "ALWAYS_FF", "ALWAYS_LATCH", 
			"AND", "ASSERT", "ASSIGN", "ASSUME", "AUTOMATIC", "BEFORE", "BEGIN", 
			"BIND", "BINS", "BINSOF", "BIT", "BREAK", "BUF", "BUFIFZERO", "BUFIFONE", 
			"BYTE", "CASE", "CASEX", "CASEZ", "CELL", "CHANDLE", "CHECKER", "CLASS", 
			"CLOCKING", "CMOS", "CONFIG", "CONST", "CONSTRAINT", "CONTEXT", "CONTINUE", 
			"COVER", "COVERGROUP", "COVERPOINT", "CROSS", "DEASSIGN", "DEFAULT", 
			"DEFPARAM", "DESIGN", "DISABLE", "DIST", "DO", "EDGE", "ELSE", "END", 
			"ENDCASE", "ENDCHECKER", "ENDCLASS", "ENDCLOCKING", "ENDCONFIG", "ENDFUNCTION", 
			"ENDGENERATE", "ENDGROUP", "ENDINTERFACE", "ENDMODULE", "ENDPACKAGE", 
			"ENDPRIMITIVE", "ENDPROGRAM", "ENDPROPERTY", "ENDSEQUENCE", "ENDSPECIFY", 
			"ENDTABLE", "ENDTASK", "ENUM", "EVENT", "EXPECT", "EXPORT", "EXTENDS", 
			"EXTERN", "FINAL", "FIRST_MATCH", "FOR", "FORCE", "FOREACH", "FOREVER", 
			"FORK", "FORKJOIN", "FUNCTION", "GENERATE", "GENVAR", "GLOBAL", "HIGHZZERO", 
			"HIGHZONE", "IF", "IFF", "IFNONE", "IGNORE_BINS", "ILLEGAL_BINS", "IMPLEMENTS", 
			"IMPLIES", "IMPORT", "INCLUDE", "INITIAL", "INOUT", "INPUT", "INSIDE", 
			"INSTANCE", "INT", "INTEGER", "INTERCONNECT", "INTERFACE", "INTERSECT", 
			"JOIN", "JOIN_ANY", "JOIN_NONE", "LARGE", "LET", "LIBLIST", "LIBRARY", 
			"LOCAL", "LOCALPARAM", "LOGIC", "LONGINT", "MACROMODULE", "MATCHES", 
			"MEDIUM", "MODPORT", "MODULE", "NAND", "NEGEDGE", "NETTYPE", "NEW", "NEXTTIME", 
			"NMOS", "NOR", "NOSHOWCANCELLED", "NOT", "NOTIFZERO", "NOTIFONE", "NULL", 
			"OPTIONDT", "OR", "OUTPUT", "PACKAGE", "PACKED", "PARAMETER", "PMOS", 
			"POSEDGE", "PRIMITIVE", "PRIORITY", "PROGRAM", "PROPERTY", "PROTECTED", 
			"PULLZERO", "PULLONE", "PULLDOWN", "PULLUP", "PULSESTYLE_ONDETECT", "PULSESTYLE_ONEVENT", 
			"PURE", "RAND", "RANDC", "RANDCASE", "RANDOMIZE", "RANDSEQUENCE", "RCMOS", 
			"REAL", "REALTIME", "REF", "REG", "REJECT_ON", "RELEASE", "REPEAT", "RESTRICT", 
			"RETURN", "RNMOS", "RPMOS", "RTRAN", "RTRANIFZERO", "RTRANIFONE", "S_ALWAYS", 
			"S_EVENTUALLY", "S_NEXTTIME", "S_UNTIL", "S_UNTIL_WITH", "SAMPLE", "SCALARED", 
			"SEQUENCE", "SHORTINT", "SHORTREAL", "SHOWCANCELLED", "SIGNED", "SMALL", 
			"SOFT", "SOLVE", "SPECIFY", "SPECPARAM", "STATIC", "STD", "STRING", "STRONG", 
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
			"SYSTEM_TF_IDENTIFIER", "WHITE_SPACE", "FILE_PATH_SPEC", "FINISH_NUMBER", 
			"INIT_VAL", "OUTPUT_SYMBOL", "LEVEL_SYMBOL", "EDGE_SYMBOL", "EDGE_DESCRIPTOR", 
			"SCALAR_CONSTANT", "FILE_DIRECTIVE", "LINE_DIRECTIVE_", "BEGIN_KEYWORDS_DIRECTIVE", 
			"CELLDEFINE_DIRECTIVE", "DEFAULT_NETTYPE_DIRECTIVE", "DEFINE_DIRECTIVE", 
			"ELSE_DIRECTIVE", "ELSIF_DIRECTIVE", "END_KEYWORDS_DIRECTIVE", "ENDCELLDEFINE_DIRECTIVE", 
			"ENDIF_DIRECTIVE", "IFDEF_DIRECTIVE", "IFNDEF_DIRECTIVE", "INCLUDE_DIRECTIVE", 
			"LINE_DIRECTIVE", "NOUNCONNECTED_DRIVE_DIRECTIVE", "PRAGMA_DIRECTIVE", 
			"RESETALL_DIRECTIVE", "TIMESCALE_DIRECTIVE", "UNCONNECTED_DRIVE_DIRECTIVE", 
			"UNDEF_DIRECTIVE", "UNDEFINEALL_DIRECTIVE", "MACRO_USAGE", "DIRECTIVE_TEXT", 
			"DIRECTIVE_IDENTIFIER", "DIRECTIVE_COMMENT", "DIRECTIVE_WHITE_SPACE", 
			"DIRECTIVE_NEWLINE", "MACRO_TEXT", "MT_ESC_NEWLINE", "SOURCE_TEXT"
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
			while (_la==MACRO_TEXT) {
				{
				{
				setState(226);
				match(MACRO_TEXT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u019e\u00eb\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\7\13y\n\13\f\13\16\13|\13\13\3\13\5\13\177\n\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u0088\n\f\f\f\16\f\u008b\13\f\3\f\5\f"+
		"\u008e\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\7\34\u00cb\n\34\f\34\16\34\u00ce\13\34\3\35\3\35"+
		"\7\35\u00d2\n\35\f\35\16\35\u00d5\13\35\3\36\3\36\7\36\u00d9\n\36\f\36"+
		"\16\36\u00dc\13\36\3\37\3\37\7\37\u00e0\n\37\f\37\16\37\u00e3\13\37\3"+
		" \7 \u00e6\n \f \16 \u00e9\13 \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>\2\2\2\u00ec\2C\3\2\2\2\4Z\3\2\2\2\6\\"+
		"\3\2\2\2\b_\3\2\2\2\nb\3\2\2\2\ff\3\2\2\2\16i\3\2\2\2\20m\3\2\2\2\22p"+
		"\3\2\2\2\24s\3\2\2\2\26\u0082\3\2\2\2\30\u0091\3\2\2\2\32\u0095\3\2\2"+
		"\2\34\u0099\3\2\2\2\36\u009c\3\2\2\2 \u00a0\3\2\2\2\"\u00a3\3\2\2\2$\u00a8"+
		"\3\2\2\2&\u00ab\3\2\2\2(\u00af\3\2\2\2*\u00b3\3\2\2\2,\u00b7\3\2\2\2."+
		"\u00ba\3\2\2\2\60\u00bf\3\2\2\2\62\u00c3\3\2\2\2\64\u00c6\3\2\2\2\66\u00cc"+
		"\3\2\2\28\u00d3\3\2\2\2:\u00da\3\2\2\2<\u00e1\3\2\2\2>\u00e7\3\2\2\2@"+
		"B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EC\3\2\2\2"+
		"F[\5\6\4\2G[\5\b\5\2H[\5\n\6\2I[\5\f\7\2J[\5\16\b\2K[\5\20\t\2L[\5\22"+
		"\n\2M[\5\24\13\2N[\5\26\f\2O[\5\30\r\2P[\5\32\16\2Q[\5\34\17\2R[\5\36"+
		"\20\2S[\5 \21\2T[\5\"\22\2U[\5$\23\2V[\5&\24\2W[\5(\25\2X[\5*\26\2Y[\5"+
		",\27\2ZF\3\2\2\2ZG\3\2\2\2ZH\3\2\2\2ZI\3\2\2\2ZJ\3\2\2\2ZK\3\2\2\2ZL\3"+
		"\2\2\2ZM\3\2\2\2ZN\3\2\2\2ZO\3\2\2\2ZP\3\2\2\2ZQ\3\2\2\2ZR\3\2\2\2ZS\3"+
		"\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\5"+
		"\3\2\2\2\\]\7d\2\2]^\7\u0180\2\2^\7\3\2\2\2_`\7d\2\2`a\7\u0181\2\2a\t"+
		"\3\2\2\2bc\7d\2\2cd\7\u0182\2\2de\7\u0197\2\2e\13\3\2\2\2fg\7d\2\2gh\7"+
		"\u0183\2\2h\r\3\2\2\2ij\7d\2\2jk\7\u0184\2\2kl\7\u0197\2\2l\17\3\2\2\2"+
		"mn\7d\2\2no\7\u0189\2\2o\21\3\2\2\2pq\7d\2\2qr\7\u0188\2\2r\23\3\2\2\2"+
		"st\7d\2\2tu\7\u018b\2\2uv\5\64\33\2vz\5\66\34\2wy\5.\30\2xw\3\2\2\2y|"+
		"\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}\177\5\60\31\2~}\3\2"+
		"\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\5\62\32\2\u0081\25\3\2"+
		"\2\2\u0082\u0083\7d\2\2\u0083\u0084\7\u018c\2\2\u0084\u0085\5\64\33\2"+
		"\u0085\u0089\58\35\2\u0086\u0088\5.\30\2\u0087\u0086\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008e\5\60\31\2\u008d\u008c\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\5\62\32\2\u0090\27\3\2\2\2\u0091"+
		"\u0092\7d\2\2\u0092\u0093\7\u018d\2\2\u0093\u0094\7\u0197\2\2\u0094\31"+
		"\3\2\2\2\u0095\u0096\7d\2\2\u0096\u0097\7\u018e\2\2\u0097\u0098\7\u0197"+
		"\2\2\u0098\33\3\2\2\2\u0099\u009a\7d\2\2\u009a\u009b\7\u018f\2\2\u009b"+
		"\35\3\2\2\2\u009c\u009d\7d\2\2\u009d\u009e\7\u0190\2\2\u009e\u009f\7\u0197"+
		"\2\2\u009f\37\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7\u0191\2\2\u00a2"+
		"!\3\2\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5\7\u0185\2\2\u00a5\u00a6\5\64"+
		"\33\2\u00a6\u00a7\5> \2\u00a7#\3\2\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa"+
		"\7\u0196\2\2\u00aa%\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7\u0192\2\2"+
		"\u00ad\u00ae\7\u0197\2\2\u00ae\'\3\2\2\2\u00af\u00b0\7d\2\2\u00b0\u00b1"+
		"\7\u0193\2\2\u00b1\u00b2\7\u0197\2\2\u00b2)\3\2\2\2\u00b3\u00b4\7d\2\2"+
		"\u00b4\u00b5\7\u0194\2\2\u00b5\u00b6\5\64\33\2\u00b6+\3\2\2\2\u00b7\u00b8"+
		"\7d\2\2\u00b8\u00b9\7\u0195\2\2\u00b9-\3\2\2\2\u00ba\u00bb\7d\2\2\u00bb"+
		"\u00bc\7\u0187\2\2\u00bc\u00bd\5\64\33\2\u00bd\u00be\5:\36\2\u00be/\3"+
		"\2\2\2\u00bf\u00c0\7d\2\2\u00c0\u00c1\7\u0186\2\2\u00c1\u00c2\5<\37\2"+
		"\u00c2\61\3\2\2\2\u00c3\u00c4\7d\2\2\u00c4\u00c5\7\u018a\2\2\u00c5\63"+
		"\3\2\2\2\u00c6\u00c7\7\u0198\2\2\u00c7\65\3\2\2\2\u00c8\u00cb\7\u019e"+
		"\2\2\u00c9\u00cb\5\4\3\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\67\3\2\2"+
		"\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\7\u019e\2\2\u00d0\u00d2\5\4\3\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d49\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9"+
		"\7\u019e\2\2\u00d7\u00d9\5\4\3\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2"+
		"\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db;"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\7\u019e\2\2\u00de\u00e0\5\4\3"+
		"\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2=\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e6\7\u019c\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8?\3\2\2\2\u00e9\u00e7\3\2\2\2\21CZz"+
		"~\u0089\u008d\u00ca\u00cc\u00d1\u00d3\u00d8\u00da\u00df\u00e1\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}