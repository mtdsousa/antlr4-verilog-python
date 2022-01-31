// Generated from /home/mtdsousa/workspace/antlr4-verilog/extra/grammars-v4/verilog/verilog/VerilogPreprocessorParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VerilogPreprocessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALWAYS=1, AND=2, ASSIGN=3, AUTOMATIC=4, BEGIN=5, BUF=6, BUFIF0=7, BUFIF1=8, 
		CASE=9, CASEX=10, CASEZ=11, CELL=12, CMOS=13, CONFIG=14, DEASSIGN=15, 
		DEFAULT=16, DEFPARAM=17, DESIGN=18, DISABLE=19, EDGE=20, ELSE=21, END=22, 
		ENDCASE=23, ENDCONFIG=24, ENDFUNCTION=25, ENDGENERATE=26, ENDMODULE=27, 
		ENDPRIMITIVE=28, ENDSPECIFY=29, ENDTABLE=30, ENDTASK=31, EVENT=32, FOR=33, 
		FORCE=34, FOREVER=35, FORK=36, FUNCTION=37, GENERATE=38, GENVAR=39, HIGHZ0=40, 
		HIGHZ1=41, IF=42, IFNONE=43, INCDIR=44, INCLUDE=45, INITIAL=46, INOUT=47, 
		INPUT=48, INSTANCE=49, INTEGER=50, JOIN=51, LARGE=52, LIBLIST=53, LIBRARY=54, 
		LOCALPARAM=55, MACROMODULE=56, MEDIUM=57, MODULE=58, NAND=59, NEGEDGE=60, 
		NMOS=61, NOR=62, NOSHOWCANCELLED=63, NOT=64, NOTIF0=65, NOTIF1=66, OR=67, 
		OUTPUT=68, PARAMETER=69, PMOS=70, POSEDGE=71, PRIMITIVE=72, PULL0=73, 
		PULL1=74, PULLDOWN=75, PULLUP=76, PULSESTYLE_ONEVENT=77, PULSESTYLE_ONDETECT=78, 
		RCMOS=79, REAL=80, REALTIME=81, REG=82, RELEASE=83, REPEAT=84, RNMOS=85, 
		RPMOS=86, RTRAN=87, RTRANIF0=88, RTRANIF1=89, SCALARED=90, SHOWCANCELLED=91, 
		SIGNED=92, SMALL=93, SPECIFY=94, SPECPARAM=95, STRONG0=96, STRONG1=97, 
		SUPPLY0=98, SUPPLY1=99, TABLE=100, TASK=101, TIME=102, TRAN=103, TRANIF0=104, 
		TRANIF1=105, TRI=106, TRI0=107, TRI1=108, TRIAND=109, TRIOR=110, TRIREG=111, 
		UNSIGNED=112, USE=113, UWIRE=114, VECTORED=115, WAIT=116, WAND=117, WEAK0=118, 
		WEAK1=119, WHILE=120, WIRE=121, WOR=122, XNOR=123, XOR=124, DOLLAR_DISPLAY=125, 
		DOLLAR_DISPLAYB=126, DOLLAR_DISPLAYH=127, DOLLAR_DISPLAYO=128, DOLLAR_WRITE=129, 
		DOLLAR_WRITEB=130, DOLLAR_WRITEH=131, DOLLAR_WRITEO=132, DOLLAR_STROBE=133, 
		DOLLAR_STROBEB=134, DOLLAR_STROBEH=135, DOLLAR_STROBEO=136, DOLLAR_MONITOR=137, 
		DOLLAR_MONITORB=138, DOLLAR_MONITORH=139, DOLLAR_MONITORO=140, DOLLAR_MONITOROFF=141, 
		DOLLAR_MONITORON=142, DOLLAR_FCLOSE=143, DOLLAR_FDISPLAY=144, DOLLAR_FDISPLAYB=145, 
		DOLLAR_FDISPLAYH=146, DOLLAR_FDISPLAYO=147, DOLLAR_FSTROBE=148, DOLLAR_FSTROBEB=149, 
		DOLLAR_FSTROBEH=150, DOLLAR_FSTROBEO=151, DOLLAR_SWRITE=152, DOLLAR_SWRITEB=153, 
		DOLLAR_SWRITEH=154, DOLLAR_SWRITEO=155, DOLLAR_FSCANF=156, DOLLAR_FREAD=157, 
		DOLLAR_FSEEK=158, DOLLAR_FFLUSH=159, DOLLAR_FEOF=160, DOLLAR_SDF_ANNOTATE=161, 
		DOLLAR_FOPEN=162, DOLLAR_FWRITE=163, DOLLAR_FWRITEB=164, DOLLAR_FWRITEH=165, 
		DOLLAR_FWRITEO=166, DOLLAR_FMONITOR=167, DOLLAR_FMONITORB=168, DOLLAR_FMONITORH=169, 
		DOLLAR_FMONITORO=170, DOLLAR_SFORMAT=171, DOLLAR_FGETC=172, DOLLAR_UNGETC=173, 
		DOLLAR_FGETS=174, DOLLAR_SSCANF=175, DOLLAR_REWIND=176, DOLLAR_FTELL=177, 
		DOLLAR_FERROR=178, DOLLAR_READMEMB=179, DOLLAR_READMEMH=180, DOLLAR_PRINTTIMESCALE=181, 
		DOLLAR_TIMEFORMAT=182, DOLLAR_FINISH=183, DOLLAR_STOP=184, DOLLAR_ASYNC_AND_ARRAY=185, 
		DOLLAR_ASYNC_NAND_ARRAY=186, DOLLAR_ASYNC_OR_ARRAY=187, DOLLAR_ASYNC_NOR_ARRAY=188, 
		DOLLAR_SYNC_AND_ARRAY=189, DOLLAR_SYNC_NAND_ARRAY=190, DOLLAR_SYNC_OR_ARRAY=191, 
		DOLLAR_SYNC_NOR_ARRAY=192, DOLLAR_ASYNC_AND_PLANE=193, DOLLAR_ASYNC_NAND_PLANE=194, 
		DOLLAR_ASYNC_OR_PLANE=195, DOLLAR_ASYNC_NOR_PLANE=196, DOLLAR_SYNC_AND_PLANE=197, 
		DOLLAR_SYNC_NAND_PLANE=198, DOLLAR_SYNC_OR_PLANE=199, DOLLAR_SYNC_NOR_PLANE=200, 
		DOLLAR_Q_INITIALIZE=201, DOLLAR_Q_REMOVE=202, DOLLAR_Q_EXAM=203, DOLLAR_Q_ADD=204, 
		DOLLAR_Q_FULL=205, DOLLAR_REALTIME=206, DOLLAR_TIME=207, DOLLAR_STIME=208, 
		DOLLAR_BITSTOREAL=209, DOLLAR_ITOR=210, DOLLAR_SIGNED=211, DOLLAR_REALTOBITS=212, 
		DOLLAR_RTOI=213, DOLLAR_UNSIGNED=214, DOLLAR_RANDOM=215, DOLLAR_DIST_ERLANG=216, 
		DOLLAR_DIST_NORMAL=217, DOLLAR_DIST_T=218, DOLLAR_DIST_CHI_SQUARE=219, 
		DOLLAR_DIST_EXPONENTIAL=220, DOLLAR_DIST_POISSON=221, DOLLAR_DIST_UNIFORM=222, 
		DOLLAR_TEST_PLUSARGS=223, DOLLAR_VALUE_PLUSARGS=224, DOLLAR_CLOG2=225, 
		DOLLAR_LN=226, DOLLAR_LOG10=227, DOLLAR_EXP=228, DOLLAR_SQRT=229, DOLLAR_POW=230, 
		DOLLAR_FLOOR=231, DOLLAR_CEIL=232, DOLLAR_SIN=233, DOLLAR_COS=234, DOLLAR_TAN=235, 
		DOLLAR_ASIN=236, DOLLAR_ACOS=237, DOLLAR_ATAN=238, DOLLAR_ATAN2=239, DOLLAR_HYPOT=240, 
		DOLLAR_SINH=241, DOLLAR_COSH=242, DOLLAR_TANH=243, DOLLAR_ASINH=244, DOLLAR_ACOSH=245, 
		DOLLAR_ATANH=246, DOLLAR_DUMPFILE=247, DOLLAR_DUMPVARS=248, DOLLAR_DUMPOFF=249, 
		DOLLAR_DUMPON=250, DOLLAR_DUMPALL=251, DOLLAR_DUMPLIMIT=252, DOLLAR_DUMPFLUSH=253, 
		DOLLAR_END=254, DOLLAR_COMMENT=255, DOLLAR_DATE=256, DOLLAR_ENDDEFINITIONS=257, 
		DOLLAR_SCOPE=258, DOLLAR_TIMESCALE=259, DOLLAR_UPSCOPE=260, DOLLAR_VAR=261, 
		DOLLAR_VERSION=262, DOLLAR_DUMPPORTS=263, DOLLAR_DUMPPORTSOFF=264, DOLLAR_DUMPPORTSON=265, 
		DOLLAR_DUMPPORTSALL=266, DOLLAR_DUMPPORTSLIMIT=267, DOLLAR_DUMPPORTSFLUSH=268, 
		DOLLAR_VCDCLOSE=269, DOLLAR_SETUP=270, DOLLAR_HOLD=271, DOLLAR_SETUPHOLD=272, 
		DOLLAR_RECOVERY=273, DOLLAR_REMOVAL=274, DOLLAR_RECREM=275, DOLLAR_SKEW=276, 
		DOLLAR_TIMESKEW=277, DOLLAR_FULLSKEW=278, DOLLAR_PERIOD=279, DOLLAR_WIDTH=280, 
		DOLLAR_NOCHANGE=281, REAL_NUMBER=282, DECIMAL_NUMBER=283, BINARY_NUMBER=284, 
		OCTAL_NUMBER=285, HEX_NUMBER=286, STRING=287, ONE_LINE_COMMENT=288, BLOCK_COMMENT=289, 
		ESCAPED_IDENTIFIER=290, SIMPLE_IDENTIFIER=291, SYSTEM_TF_IDENTIFIER=292, 
		WHITE_SPACE_REGION=293, LEFT_PARENTHESIS=294, RIGHT_PARENTHESIS=295, LEFT_BRACKET=296, 
		RIGHT_BRACKET=297, LEFT_BRACE=298, RIGHT_BRACE=299, PLUS=300, MINUS=301, 
		EXCLAMATION_MARK=302, TILDE=303, AMPERSAND=304, TILDE_AMPERSAND=305, VERTICAL_BAR=306, 
		TILDE_VERTICAL_BAR=307, CARET=308, TILDE_CARET=309, CARET_TILDE=310, ASTERISK=311, 
		PERCENT=312, DOUBLE_EQUAL=313, EXCLAMATION_MARK_EQUAL=314, TRIPLE_EQUAL=315, 
		EXCLAMATION_MARK_DOUBLE_EQUAL=316, DOUBLE_AMPERSAND=317, DOUBLE_VERTICAL_BAR=318, 
		DOUBLE_ASTERISK=319, LESS_THAN=320, LESS_THAN_EQUAL=321, GREATER_THAN=322, 
		GREATER_THAN_EQUAL=323, DOUBLE_GREATER_THAN=324, DOUBLE_LESS_THAN=325, 
		TRIPLE_GREATER_THAN=326, TRIPLE_LESS_THAN=327, DOT=328, COMMA=329, COLON=330, 
		SEMICOLON=331, SLASH=332, EQUAL=333, QUESTION_MARK=334, AT=335, HASH=336, 
		GRAVE_ACCENT=337, PLUS_COLON=338, MINUS_COLON=339, MINUS_GREATER_THAN=340, 
		EQUAL_GREATER_THAN=341, ASTERISK_GREATER_THAN=342, TRIPLE_AMPERSAND=343, 
		PATHPULSE_DOLLAR=344, FILE_PATH_SPEC=345, MINUS_INCDIR=346, LIBRARY_NEWLINE=347, 
		DIRECTIVE_BEGIN_KEYWORDS=348, DIRECTIVE_CELLDEFINE=349, DIRECTIVE_DEFAULT_NETTYPE=350, 
		DIRECTIVE_DEFINE=351, DIRECTIVE_ELSE=352, DIRECTIVE_ELSIF=353, DIRECTIVE_END_KEYWORDS=354, 
		DIRECTIVE_ENDCELLDEFINE=355, DIRECTIVE_ENDIF=356, DIRECTIVE_IFDEF=357, 
		DIRECTIVE_IFNDEF=358, DIRECTIVE_INCLUDE=359, DIRECTIVE_LINE=360, DIRECTIVE_NOUNCONNECTED_DRIVE=361, 
		DIRECTIVE_RESETALL=362, DIRECTIVE_TIMESCALE=363, DIRECTIVE_UNCONNECTED_DRIVE=364, 
		DIRECTIVE_UNDEF=365, DEFAULT_NETTYPE_VALUE=366, TIME_UNIT=367, UNCONNECTED_DRIVE_VALUE=368, 
		DIRECTIVE_NUMBER=369, DIRECTIVE_STRING=370, DIRECTIVE_IDENTIFIER=371, 
		DIRECTIVE_SLASH=372, DIRECTIVE_COMMENT=373, DIRECTIVE_WHITE_SPACE=374, 
		DIRECTIVE_NEWLINE=375, MACRO_TEXT=376, MACRO_TEXT_BACKSLASH_NEWLINE=377, 
		DIRECTIVE_LIST_OF_ARGUMENTS=378, MACRO_USAGE_BACKSLASH_NEWLINE=379, ANY_OTHER_TOKEN=380, 
		SOURCE_TEXT=381, SOURCE_TEXT_BACKSLASH_NEWLINE=382;
	public static final int
		RULE_source_text = 0, RULE_compiler_directive = 1, RULE_celldefine_compiler_directive = 2, 
		RULE_endcelldefine_compiler_directive = 3, RULE_default_nettype_compiler_directive = 4, 
		RULE_default_nettype_value = 5, RULE_text_macro_definition = 6, RULE_text_macro_usage = 7, 
		RULE_macro_list_of_actual_arguments = 8, RULE_text_macro_identifier = 9, 
		RULE_undefine_compiler_directive = 10, RULE_ifdef_directive = 11, RULE_ifndef_directive = 12, 
		RULE_elsif_directive = 13, RULE_else_directive = 14, RULE_endif_directive = 15, 
		RULE_include_compiler_directive = 16, RULE_filename = 17, RULE_resetall_compiler_directive = 18, 
		RULE_line_compiler_directive = 19, RULE_line_number = 20, RULE_line_level = 21, 
		RULE_timescale_compiler_directive = 22, RULE_time_literal = 23, RULE_time_number = 24, 
		RULE_time_unit = 25, RULE_unconnected_drive_compiler_directive = 26, RULE_unconnected_drive_value = 27, 
		RULE_nounconnected_drive_compiler_directive = 28, RULE_keywords_directive = 29, 
		RULE_version_specifier = 30, RULE_endkeywords_directive = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"source_text", "compiler_directive", "celldefine_compiler_directive", 
			"endcelldefine_compiler_directive", "default_nettype_compiler_directive", 
			"default_nettype_value", "text_macro_definition", "text_macro_usage", 
			"macro_list_of_actual_arguments", "text_macro_identifier", "undefine_compiler_directive", 
			"ifdef_directive", "ifndef_directive", "elsif_directive", "else_directive", 
			"endif_directive", "include_compiler_directive", "filename", "resetall_compiler_directive", 
			"line_compiler_directive", "line_number", "line_level", "timescale_compiler_directive", 
			"time_literal", "time_number", "time_unit", "unconnected_drive_compiler_directive", 
			"unconnected_drive_value", "nounconnected_drive_compiler_directive", 
			"keywords_directive", "version_specifier", "endkeywords_directive"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'always'", "'and'", "'assign'", "'automatic'", "'begin'", "'buf'", 
			"'bufif0'", "'bufif1'", "'case'", "'casex'", "'casez'", "'cell'", "'cmos'", 
			"'config'", "'deassign'", "'default'", "'defparam'", "'design'", "'disable'", 
			"'edge'", "'else'", "'end'", "'endcase'", "'endconfig'", "'endfunction'", 
			"'endgenerate'", "'endmodule'", "'endprimitive'", "'endspecify'", "'endtable'", 
			"'endtask'", "'event'", "'for'", "'force'", "'forever'", "'fork'", "'function'", 
			"'generate'", "'genvar'", "'highz0'", "'highz1'", "'if'", "'ifnone'", 
			"'incdir'", null, "'initial'", "'inout'", "'input'", "'instance'", "'integer'", 
			"'join'", "'large'", "'liblist'", "'library'", "'localparam'", "'macromodule'", 
			"'medium'", "'module'", "'nand'", "'negedge'", "'nmos'", "'nor'", "'noshowcancelled'", 
			"'not'", "'notif0'", "'notif1'", "'or'", "'output'", "'parameter'", "'pmos'", 
			"'posedge'", "'primitive'", "'pull0'", "'pull1'", "'pulldown'", "'pullup'", 
			"'pulsestyle_onevent'", "'pulsestyle_ondetect'", "'rcmos'", "'real'", 
			"'realtime'", "'reg'", "'release'", "'repeat'", "'rnmos'", "'rpmos'", 
			"'rtran'", "'rtranif0'", "'rtranif1'", "'scalared'", "'showcancelled'", 
			"'signed'", "'small'", "'specify'", "'specparam'", "'strong0'", "'strong1'", 
			"'supply0'", "'supply1'", "'table'", "'task'", "'time'", "'tran'", "'tranif0'", 
			"'tranif1'", "'tri'", "'tri0'", "'tri1'", "'triand'", "'trior'", "'trireg'", 
			"'unsigned'", "'use'", "'uwire'", "'vectored'", "'wait'", "'wand'", "'weak0'", 
			"'weak1'", "'while'", "'wire'", "'wor'", "'xnor'", "'xor'", "'$display'", 
			"'$displayb'", "'$displayh'", "'$displayo'", "'$write'", "'$writeb'", 
			"'$writeh'", "'$writeo'", "'$strobe'", "'$strobeb'", "'$strobeh'", "'$strobeo'", 
			"'$monitor'", "'$monitorb'", "'$monitorh'", "'$monitoro'", "'$monitoroff'", 
			"'$monitoron'", "'$fclose'", "'$fdisplay'", "'$fdisplayb'", "'$fdisplayh'", 
			"'$fdisplayo'", "'$fstrobe'", "'$fstrobeb'", "'$fstrobeh'", "'$fstrobeo'", 
			"'$swrite'", "'$swriteb'", "'$swriteh'", "'$swriteo'", "'$fscanf'", "'$fread'", 
			"'$fseek'", "'$fflush'", "'$feof'", "'$sdf_annotate'", "'$fopen'", "'$fwrite'", 
			"'$fwriteb'", "'$fwriteh'", "'$fwriteo'", "'$fmonitor'", "'$fmonitorb'", 
			"'$fmonitorh'", "'$fmonitoro'", "'$sformat'", "'$fgetc'", "'$ungetc'", 
			"'$fgets'", "'$sscanf'", "'$rewind'", "'$ftell'", "'$ferror'", "'$readmemb'", 
			"'$readmemh'", "'$printtimescale'", "'$timeformat'", "'$finish'", "'$stop'", 
			"'$async$and$array'", "'$async$nand$array'", "'$async$or$array'", "'$async$nor$array'", 
			"'$sync$and$array'", "'$sync$nand$array'", "'$sync$or$array'", "'$sync$nor$array'", 
			"'$async$and$plane'", "'$async$nand$plane'", "'$async$or$plane'", "'$async$nor$plane'", 
			"'$sync$and$plane'", "'$sync$nand$plane'", "'$sync$or$plane'", "'$sync$nor$plane'", 
			"'$q_initialize'", "'$q_remove'", "'$q_exam'", "'$q_add'", "'$q_full'", 
			"'$realtime'", "'$time'", "'$stime'", "'$bitstoreal'", "'$itor'", "'$signed'", 
			"'$realtobits'", "'$rtoi'", "'$unsigned'", "'$random'", "'$dist_erlang'", 
			"'$dist_normal'", "'$dist_t'", "'$dist_chi_square'", "'$dist_exponential'", 
			"'$dist_poisson'", "'$dist_uniform'", "'$test$plusargs'", "'$value$plusargs'", 
			"'$clog2'", "'$ln'", "'$log10'", "'$exp'", "'$sqrt'", "'$pow'", "'$floor'", 
			"'$ceil'", "'$sin'", "'$cos'", "'$tan'", "'$asin'", "'$acos'", "'$atan'", 
			"'$atan2'", "'$hypot'", "'$sinh'", "'$cosh'", "'$tanh'", "'$asinh'", 
			"'$acosh'", "'$atanh'", "'$dumpfile'", "'$dumpvars'", "'$dumpoff'", "'$dumpon'", 
			"'$dumpall'", "'$dumplimit'", "'$dumpflush'", "'$end'", "'$comment'", 
			"'$date'", "'$enddefinitions'", "'$scope'", "'$timescale'", "'$upscope'", 
			"'$var'", "'$version'", "'$dumpports'", "'$dumpportsoff'", "'$dumpportson'", 
			"'$dumpportsall'", "'$dumpportslimit'", "'$dumpportsflush'", "'$vcdclose'", 
			"'$setup'", "'$hold'", "'$setuphold'", "'$recovery'", "'$removal'", "'$recrem'", 
			"'$skew'", "'$timeskew'", "'$fullskew'", "'$period'", "'$width'", "'$nochange'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'!'", "'~'", 
			"'&'", "'~&'", "'|'", "'~|'", "'^'", "'~^'", "'^~'", "'*'", "'%'", "'=='", 
			"'!='", "'==='", "'!=='", "'&&'", "'||'", "'**'", "'<'", "'<='", "'>'", 
			"'>='", "'>>'", "'<<'", "'>>>'", "'<<<'", "'.'", null, "':'", "';'", 
			null, "'='", "'?'", "'@'", "'#'", null, "'+:'", "'-:'", "'->'", "'=>'", 
			"'*>'", "'&&&'", "'PATHPULSE$'", null, "'-incdir'", null, "'begin_keywords'", 
			"'celldefine'", "'default_nettype'", null, null, null, "'end_keywords'", 
			"'endcelldefine'", "'endif'", null, null, null, "'line'", "'nounconnected_drive'", 
			"'resetall'", "'timescale'", "'unconnected_drive'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALWAYS", "AND", "ASSIGN", "AUTOMATIC", "BEGIN", "BUF", "BUFIF0", 
			"BUFIF1", "CASE", "CASEX", "CASEZ", "CELL", "CMOS", "CONFIG", "DEASSIGN", 
			"DEFAULT", "DEFPARAM", "DESIGN", "DISABLE", "EDGE", "ELSE", "END", "ENDCASE", 
			"ENDCONFIG", "ENDFUNCTION", "ENDGENERATE", "ENDMODULE", "ENDPRIMITIVE", 
			"ENDSPECIFY", "ENDTABLE", "ENDTASK", "EVENT", "FOR", "FORCE", "FOREVER", 
			"FORK", "FUNCTION", "GENERATE", "GENVAR", "HIGHZ0", "HIGHZ1", "IF", "IFNONE", 
			"INCDIR", "INCLUDE", "INITIAL", "INOUT", "INPUT", "INSTANCE", "INTEGER", 
			"JOIN", "LARGE", "LIBLIST", "LIBRARY", "LOCALPARAM", "MACROMODULE", "MEDIUM", 
			"MODULE", "NAND", "NEGEDGE", "NMOS", "NOR", "NOSHOWCANCELLED", "NOT", 
			"NOTIF0", "NOTIF1", "OR", "OUTPUT", "PARAMETER", "PMOS", "POSEDGE", "PRIMITIVE", 
			"PULL0", "PULL1", "PULLDOWN", "PULLUP", "PULSESTYLE_ONEVENT", "PULSESTYLE_ONDETECT", 
			"RCMOS", "REAL", "REALTIME", "REG", "RELEASE", "REPEAT", "RNMOS", "RPMOS", 
			"RTRAN", "RTRANIF0", "RTRANIF1", "SCALARED", "SHOWCANCELLED", "SIGNED", 
			"SMALL", "SPECIFY", "SPECPARAM", "STRONG0", "STRONG1", "SUPPLY0", "SUPPLY1", 
			"TABLE", "TASK", "TIME", "TRAN", "TRANIF0", "TRANIF1", "TRI", "TRI0", 
			"TRI1", "TRIAND", "TRIOR", "TRIREG", "UNSIGNED", "USE", "UWIRE", "VECTORED", 
			"WAIT", "WAND", "WEAK0", "WEAK1", "WHILE", "WIRE", "WOR", "XNOR", "XOR", 
			"DOLLAR_DISPLAY", "DOLLAR_DISPLAYB", "DOLLAR_DISPLAYH", "DOLLAR_DISPLAYO", 
			"DOLLAR_WRITE", "DOLLAR_WRITEB", "DOLLAR_WRITEH", "DOLLAR_WRITEO", "DOLLAR_STROBE", 
			"DOLLAR_STROBEB", "DOLLAR_STROBEH", "DOLLAR_STROBEO", "DOLLAR_MONITOR", 
			"DOLLAR_MONITORB", "DOLLAR_MONITORH", "DOLLAR_MONITORO", "DOLLAR_MONITOROFF", 
			"DOLLAR_MONITORON", "DOLLAR_FCLOSE", "DOLLAR_FDISPLAY", "DOLLAR_FDISPLAYB", 
			"DOLLAR_FDISPLAYH", "DOLLAR_FDISPLAYO", "DOLLAR_FSTROBE", "DOLLAR_FSTROBEB", 
			"DOLLAR_FSTROBEH", "DOLLAR_FSTROBEO", "DOLLAR_SWRITE", "DOLLAR_SWRITEB", 
			"DOLLAR_SWRITEH", "DOLLAR_SWRITEO", "DOLLAR_FSCANF", "DOLLAR_FREAD", 
			"DOLLAR_FSEEK", "DOLLAR_FFLUSH", "DOLLAR_FEOF", "DOLLAR_SDF_ANNOTATE", 
			"DOLLAR_FOPEN", "DOLLAR_FWRITE", "DOLLAR_FWRITEB", "DOLLAR_FWRITEH", 
			"DOLLAR_FWRITEO", "DOLLAR_FMONITOR", "DOLLAR_FMONITORB", "DOLLAR_FMONITORH", 
			"DOLLAR_FMONITORO", "DOLLAR_SFORMAT", "DOLLAR_FGETC", "DOLLAR_UNGETC", 
			"DOLLAR_FGETS", "DOLLAR_SSCANF", "DOLLAR_REWIND", "DOLLAR_FTELL", "DOLLAR_FERROR", 
			"DOLLAR_READMEMB", "DOLLAR_READMEMH", "DOLLAR_PRINTTIMESCALE", "DOLLAR_TIMEFORMAT", 
			"DOLLAR_FINISH", "DOLLAR_STOP", "DOLLAR_ASYNC_AND_ARRAY", "DOLLAR_ASYNC_NAND_ARRAY", 
			"DOLLAR_ASYNC_OR_ARRAY", "DOLLAR_ASYNC_NOR_ARRAY", "DOLLAR_SYNC_AND_ARRAY", 
			"DOLLAR_SYNC_NAND_ARRAY", "DOLLAR_SYNC_OR_ARRAY", "DOLLAR_SYNC_NOR_ARRAY", 
			"DOLLAR_ASYNC_AND_PLANE", "DOLLAR_ASYNC_NAND_PLANE", "DOLLAR_ASYNC_OR_PLANE", 
			"DOLLAR_ASYNC_NOR_PLANE", "DOLLAR_SYNC_AND_PLANE", "DOLLAR_SYNC_NAND_PLANE", 
			"DOLLAR_SYNC_OR_PLANE", "DOLLAR_SYNC_NOR_PLANE", "DOLLAR_Q_INITIALIZE", 
			"DOLLAR_Q_REMOVE", "DOLLAR_Q_EXAM", "DOLLAR_Q_ADD", "DOLLAR_Q_FULL", 
			"DOLLAR_REALTIME", "DOLLAR_TIME", "DOLLAR_STIME", "DOLLAR_BITSTOREAL", 
			"DOLLAR_ITOR", "DOLLAR_SIGNED", "DOLLAR_REALTOBITS", "DOLLAR_RTOI", "DOLLAR_UNSIGNED", 
			"DOLLAR_RANDOM", "DOLLAR_DIST_ERLANG", "DOLLAR_DIST_NORMAL", "DOLLAR_DIST_T", 
			"DOLLAR_DIST_CHI_SQUARE", "DOLLAR_DIST_EXPONENTIAL", "DOLLAR_DIST_POISSON", 
			"DOLLAR_DIST_UNIFORM", "DOLLAR_TEST_PLUSARGS", "DOLLAR_VALUE_PLUSARGS", 
			"DOLLAR_CLOG2", "DOLLAR_LN", "DOLLAR_LOG10", "DOLLAR_EXP", "DOLLAR_SQRT", 
			"DOLLAR_POW", "DOLLAR_FLOOR", "DOLLAR_CEIL", "DOLLAR_SIN", "DOLLAR_COS", 
			"DOLLAR_TAN", "DOLLAR_ASIN", "DOLLAR_ACOS", "DOLLAR_ATAN", "DOLLAR_ATAN2", 
			"DOLLAR_HYPOT", "DOLLAR_SINH", "DOLLAR_COSH", "DOLLAR_TANH", "DOLLAR_ASINH", 
			"DOLLAR_ACOSH", "DOLLAR_ATANH", "DOLLAR_DUMPFILE", "DOLLAR_DUMPVARS", 
			"DOLLAR_DUMPOFF", "DOLLAR_DUMPON", "DOLLAR_DUMPALL", "DOLLAR_DUMPLIMIT", 
			"DOLLAR_DUMPFLUSH", "DOLLAR_END", "DOLLAR_COMMENT", "DOLLAR_DATE", "DOLLAR_ENDDEFINITIONS", 
			"DOLLAR_SCOPE", "DOLLAR_TIMESCALE", "DOLLAR_UPSCOPE", "DOLLAR_VAR", "DOLLAR_VERSION", 
			"DOLLAR_DUMPPORTS", "DOLLAR_DUMPPORTSOFF", "DOLLAR_DUMPPORTSON", "DOLLAR_DUMPPORTSALL", 
			"DOLLAR_DUMPPORTSLIMIT", "DOLLAR_DUMPPORTSFLUSH", "DOLLAR_VCDCLOSE", 
			"DOLLAR_SETUP", "DOLLAR_HOLD", "DOLLAR_SETUPHOLD", "DOLLAR_RECOVERY", 
			"DOLLAR_REMOVAL", "DOLLAR_RECREM", "DOLLAR_SKEW", "DOLLAR_TIMESKEW", 
			"DOLLAR_FULLSKEW", "DOLLAR_PERIOD", "DOLLAR_WIDTH", "DOLLAR_NOCHANGE", 
			"REAL_NUMBER", "DECIMAL_NUMBER", "BINARY_NUMBER", "OCTAL_NUMBER", "HEX_NUMBER", 
			"STRING", "ONE_LINE_COMMENT", "BLOCK_COMMENT", "ESCAPED_IDENTIFIER", 
			"SIMPLE_IDENTIFIER", "SYSTEM_TF_IDENTIFIER", "WHITE_SPACE_REGION", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", 
			"PLUS", "MINUS", "EXCLAMATION_MARK", "TILDE", "AMPERSAND", "TILDE_AMPERSAND", 
			"VERTICAL_BAR", "TILDE_VERTICAL_BAR", "CARET", "TILDE_CARET", "CARET_TILDE", 
			"ASTERISK", "PERCENT", "DOUBLE_EQUAL", "EXCLAMATION_MARK_EQUAL", "TRIPLE_EQUAL", 
			"EXCLAMATION_MARK_DOUBLE_EQUAL", "DOUBLE_AMPERSAND", "DOUBLE_VERTICAL_BAR", 
			"DOUBLE_ASTERISK", "LESS_THAN", "LESS_THAN_EQUAL", "GREATER_THAN", "GREATER_THAN_EQUAL", 
			"DOUBLE_GREATER_THAN", "DOUBLE_LESS_THAN", "TRIPLE_GREATER_THAN", "TRIPLE_LESS_THAN", 
			"DOT", "COMMA", "COLON", "SEMICOLON", "SLASH", "EQUAL", "QUESTION_MARK", 
			"AT", "HASH", "GRAVE_ACCENT", "PLUS_COLON", "MINUS_COLON", "MINUS_GREATER_THAN", 
			"EQUAL_GREATER_THAN", "ASTERISK_GREATER_THAN", "TRIPLE_AMPERSAND", "PATHPULSE_DOLLAR", 
			"FILE_PATH_SPEC", "MINUS_INCDIR", "LIBRARY_NEWLINE", "DIRECTIVE_BEGIN_KEYWORDS", 
			"DIRECTIVE_CELLDEFINE", "DIRECTIVE_DEFAULT_NETTYPE", "DIRECTIVE_DEFINE", 
			"DIRECTIVE_ELSE", "DIRECTIVE_ELSIF", "DIRECTIVE_END_KEYWORDS", "DIRECTIVE_ENDCELLDEFINE", 
			"DIRECTIVE_ENDIF", "DIRECTIVE_IFDEF", "DIRECTIVE_IFNDEF", "DIRECTIVE_INCLUDE", 
			"DIRECTIVE_LINE", "DIRECTIVE_NOUNCONNECTED_DRIVE", "DIRECTIVE_RESETALL", 
			"DIRECTIVE_TIMESCALE", "DIRECTIVE_UNCONNECTED_DRIVE", "DIRECTIVE_UNDEF", 
			"DEFAULT_NETTYPE_VALUE", "TIME_UNIT", "UNCONNECTED_DRIVE_VALUE", "DIRECTIVE_NUMBER", 
			"DIRECTIVE_STRING", "DIRECTIVE_IDENTIFIER", "DIRECTIVE_SLASH", "DIRECTIVE_COMMENT", 
			"DIRECTIVE_WHITE_SPACE", "DIRECTIVE_NEWLINE", "MACRO_TEXT", "MACRO_TEXT_BACKSLASH_NEWLINE", 
			"DIRECTIVE_LIST_OF_ARGUMENTS", "MACRO_USAGE_BACKSLASH_NEWLINE", "ANY_OTHER_TOKEN", 
			"SOURCE_TEXT", "SOURCE_TEXT_BACKSLASH_NEWLINE"
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
	public String getGrammarFileName() { return "VerilogPreprocessorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VerilogPreprocessorParser(TokenStream input) {
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
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterSource_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitSource_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitSource_text(this);
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GRAVE_ACCENT) {
				{
				{
				setState(64);
				compiler_directive();
				}
				}
				setState(69);
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
		public Celldefine_compiler_directiveContext celldefine_compiler_directive() {
			return getRuleContext(Celldefine_compiler_directiveContext.class,0);
		}
		public Endcelldefine_compiler_directiveContext endcelldefine_compiler_directive() {
			return getRuleContext(Endcelldefine_compiler_directiveContext.class,0);
		}
		public Default_nettype_compiler_directiveContext default_nettype_compiler_directive() {
			return getRuleContext(Default_nettype_compiler_directiveContext.class,0);
		}
		public Text_macro_definitionContext text_macro_definition() {
			return getRuleContext(Text_macro_definitionContext.class,0);
		}
		public Text_macro_usageContext text_macro_usage() {
			return getRuleContext(Text_macro_usageContext.class,0);
		}
		public Undefine_compiler_directiveContext undefine_compiler_directive() {
			return getRuleContext(Undefine_compiler_directiveContext.class,0);
		}
		public Ifdef_directiveContext ifdef_directive() {
			return getRuleContext(Ifdef_directiveContext.class,0);
		}
		public Ifndef_directiveContext ifndef_directive() {
			return getRuleContext(Ifndef_directiveContext.class,0);
		}
		public Include_compiler_directiveContext include_compiler_directive() {
			return getRuleContext(Include_compiler_directiveContext.class,0);
		}
		public Resetall_compiler_directiveContext resetall_compiler_directive() {
			return getRuleContext(Resetall_compiler_directiveContext.class,0);
		}
		public Line_compiler_directiveContext line_compiler_directive() {
			return getRuleContext(Line_compiler_directiveContext.class,0);
		}
		public Timescale_compiler_directiveContext timescale_compiler_directive() {
			return getRuleContext(Timescale_compiler_directiveContext.class,0);
		}
		public Unconnected_drive_compiler_directiveContext unconnected_drive_compiler_directive() {
			return getRuleContext(Unconnected_drive_compiler_directiveContext.class,0);
		}
		public Nounconnected_drive_compiler_directiveContext nounconnected_drive_compiler_directive() {
			return getRuleContext(Nounconnected_drive_compiler_directiveContext.class,0);
		}
		public Keywords_directiveContext keywords_directive() {
			return getRuleContext(Keywords_directiveContext.class,0);
		}
		public Endkeywords_directiveContext endkeywords_directive() {
			return getRuleContext(Endkeywords_directiveContext.class,0);
		}
		public Compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterCompiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitCompiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitCompiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compiler_directiveContext compiler_directive() throws RecognitionException {
		Compiler_directiveContext _localctx = new Compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compiler_directive);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				celldefine_compiler_directive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				endcelldefine_compiler_directive();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				default_nettype_compiler_directive();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				text_macro_definition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				text_macro_usage();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				undefine_compiler_directive();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				ifdef_directive();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				ifndef_directive();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				include_compiler_directive();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				resetall_compiler_directive();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(80);
				line_compiler_directive();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(81);
				timescale_compiler_directive();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(82);
				unconnected_drive_compiler_directive();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(83);
				nounconnected_drive_compiler_directive();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(84);
				keywords_directive();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(85);
				endkeywords_directive();
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

	public static class Celldefine_compiler_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_CELLDEFINE() { return getToken(VerilogPreprocessorParser.DIRECTIVE_CELLDEFINE, 0); }
		public Celldefine_compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_celldefine_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterCelldefine_compiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitCelldefine_compiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitCelldefine_compiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Celldefine_compiler_directiveContext celldefine_compiler_directive() throws RecognitionException {
		Celldefine_compiler_directiveContext _localctx = new Celldefine_compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_celldefine_compiler_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(GRAVE_ACCENT);
			setState(89);
			match(DIRECTIVE_CELLDEFINE);
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

	public static class Endcelldefine_compiler_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_ENDCELLDEFINE() { return getToken(VerilogPreprocessorParser.DIRECTIVE_ENDCELLDEFINE, 0); }
		public Endcelldefine_compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endcelldefine_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterEndcelldefine_compiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitEndcelldefine_compiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitEndcelldefine_compiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endcelldefine_compiler_directiveContext endcelldefine_compiler_directive() throws RecognitionException {
		Endcelldefine_compiler_directiveContext _localctx = new Endcelldefine_compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_endcelldefine_compiler_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(GRAVE_ACCENT);
			setState(92);
			match(DIRECTIVE_ENDCELLDEFINE);
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

	public static class Default_nettype_compiler_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_DEFAULT_NETTYPE() { return getToken(VerilogPreprocessorParser.DIRECTIVE_DEFAULT_NETTYPE, 0); }
		public Default_nettype_valueContext default_nettype_value() {
			return getRuleContext(Default_nettype_valueContext.class,0);
		}
		public Default_nettype_compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_nettype_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterDefault_nettype_compiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitDefault_nettype_compiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitDefault_nettype_compiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_nettype_compiler_directiveContext default_nettype_compiler_directive() throws RecognitionException {
		Default_nettype_compiler_directiveContext _localctx = new Default_nettype_compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_default_nettype_compiler_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(GRAVE_ACCENT);
			setState(95);
			match(DIRECTIVE_DEFAULT_NETTYPE);
			setState(96);
			default_nettype_value();
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

	public static class Default_nettype_valueContext extends ParserRuleContext {
		public TerminalNode DEFAULT_NETTYPE_VALUE() { return getToken(VerilogPreprocessorParser.DEFAULT_NETTYPE_VALUE, 0); }
		public Default_nettype_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_nettype_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterDefault_nettype_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitDefault_nettype_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitDefault_nettype_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_nettype_valueContext default_nettype_value() throws RecognitionException {
		Default_nettype_valueContext _localctx = new Default_nettype_valueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_default_nettype_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DEFAULT_NETTYPE_VALUE);
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
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_DEFINE() { return getToken(VerilogPreprocessorParser.DIRECTIVE_DEFINE, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public List<TerminalNode> MACRO_TEXT() { return getTokens(VerilogPreprocessorParser.MACRO_TEXT); }
		public TerminalNode MACRO_TEXT(int i) {
			return getToken(VerilogPreprocessorParser.MACRO_TEXT, i);
		}
		public List<TerminalNode> MACRO_TEXT_BACKSLASH_NEWLINE() { return getTokens(VerilogPreprocessorParser.MACRO_TEXT_BACKSLASH_NEWLINE); }
		public TerminalNode MACRO_TEXT_BACKSLASH_NEWLINE(int i) {
			return getToken(VerilogPreprocessorParser.MACRO_TEXT_BACKSLASH_NEWLINE, i);
		}
		public Text_macro_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_macro_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterText_macro_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitText_macro_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitText_macro_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_definitionContext text_macro_definition() throws RecognitionException {
		Text_macro_definitionContext _localctx = new Text_macro_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_text_macro_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(GRAVE_ACCENT);
			setState(101);
			match(DIRECTIVE_DEFINE);
			setState(102);
			text_macro_identifier();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MACRO_TEXT || _la==MACRO_TEXT_BACKSLASH_NEWLINE) {
				{
				{
				setState(103);
				_la = _input.LA(1);
				if ( !(_la==MACRO_TEXT || _la==MACRO_TEXT_BACKSLASH_NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(108);
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

	public static class Text_macro_usageContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Macro_list_of_actual_argumentsContext macro_list_of_actual_arguments() {
			return getRuleContext(Macro_list_of_actual_argumentsContext.class,0);
		}
		public Text_macro_usageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_macro_usage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterText_macro_usage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitText_macro_usage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitText_macro_usage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_usageContext text_macro_usage() throws RecognitionException {
		Text_macro_usageContext _localctx = new Text_macro_usageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_text_macro_usage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(GRAVE_ACCENT);
			setState(110);
			text_macro_identifier();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIRECTIVE_LIST_OF_ARGUMENTS) {
				{
				setState(111);
				macro_list_of_actual_arguments();
				}
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

	public static class Macro_list_of_actual_argumentsContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_LIST_OF_ARGUMENTS() { return getToken(VerilogPreprocessorParser.DIRECTIVE_LIST_OF_ARGUMENTS, 0); }
		public Macro_list_of_actual_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_list_of_actual_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterMacro_list_of_actual_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitMacro_list_of_actual_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitMacro_list_of_actual_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_list_of_actual_argumentsContext macro_list_of_actual_arguments() throws RecognitionException {
		Macro_list_of_actual_argumentsContext _localctx = new Macro_list_of_actual_argumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_macro_list_of_actual_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(DIRECTIVE_LIST_OF_ARGUMENTS);
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
		public TerminalNode DIRECTIVE_IDENTIFIER() { return getToken(VerilogPreprocessorParser.DIRECTIVE_IDENTIFIER, 0); }
		public Text_macro_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_macro_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterText_macro_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitText_macro_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitText_macro_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_macro_identifierContext text_macro_identifier() throws RecognitionException {
		Text_macro_identifierContext _localctx = new Text_macro_identifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_text_macro_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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

	public static class Undefine_compiler_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_UNDEF() { return getToken(VerilogPreprocessorParser.DIRECTIVE_UNDEF, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Undefine_compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undefine_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterUndefine_compiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitUndefine_compiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitUndefine_compiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Undefine_compiler_directiveContext undefine_compiler_directive() throws RecognitionException {
		Undefine_compiler_directiveContext _localctx = new Undefine_compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_undefine_compiler_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(GRAVE_ACCENT);
			setState(119);
			match(DIRECTIVE_UNDEF);
			setState(120);
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

	public static class Ifdef_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_IFDEF() { return getToken(VerilogPreprocessorParser.DIRECTIVE_IFDEF, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreprocessorParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreprocessorParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
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
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterIfdef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitIfdef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitIfdef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifdef_directiveContext ifdef_directive() throws RecognitionException {
		Ifdef_directiveContext _localctx = new Ifdef_directiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifdef_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(GRAVE_ACCENT);
			setState(123);
			match(DIRECTIVE_IFDEF);
			setState(124);
			text_macro_identifier();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(127);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(125);
						match(SOURCE_TEXT);
						}
						break;
					case GRAVE_ACCENT:
						{
						setState(126);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
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

	public static class Ifndef_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_IFNDEF() { return getToken(VerilogPreprocessorParser.DIRECTIVE_IFNDEF, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreprocessorParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreprocessorParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
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
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterIfndef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitIfndef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitIfndef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifndef_directiveContext ifndef_directive() throws RecognitionException {
		Ifndef_directiveContext _localctx = new Ifndef_directiveContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifndef_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(GRAVE_ACCENT);
			setState(144);
			match(DIRECTIVE_IFNDEF);
			setState(145);
			text_macro_identifier();
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(148);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(146);
						match(SOURCE_TEXT);
						}
						break;
					case GRAVE_ACCENT:
						{
						setState(147);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					elsif_directive();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(159);
				else_directive();
				}
				break;
			}
			setState(162);
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

	public static class Elsif_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_ELSIF() { return getToken(VerilogPreprocessorParser.DIRECTIVE_ELSIF, 0); }
		public Text_macro_identifierContext text_macro_identifier() {
			return getRuleContext(Text_macro_identifierContext.class,0);
		}
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreprocessorParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreprocessorParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Elsif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterElsif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitElsif_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitElsif_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elsif_directiveContext elsif_directive() throws RecognitionException {
		Elsif_directiveContext _localctx = new Elsif_directiveContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elsif_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(GRAVE_ACCENT);
			setState(165);
			match(DIRECTIVE_ELSIF);
			setState(166);
			text_macro_identifier();
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(169);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(167);
						match(SOURCE_TEXT);
						}
						break;
					case GRAVE_ACCENT:
						{
						setState(168);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(173);
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

	public static class Else_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_ELSE() { return getToken(VerilogPreprocessorParser.DIRECTIVE_ELSE, 0); }
		public List<TerminalNode> SOURCE_TEXT() { return getTokens(VerilogPreprocessorParser.SOURCE_TEXT); }
		public TerminalNode SOURCE_TEXT(int i) {
			return getToken(VerilogPreprocessorParser.SOURCE_TEXT, i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Else_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterElse_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitElse_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitElse_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_directiveContext else_directive() throws RecognitionException {
		Else_directiveContext _localctx = new Else_directiveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(GRAVE_ACCENT);
			setState(175);
			match(DIRECTIVE_ELSE);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(178);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SOURCE_TEXT:
						{
						setState(176);
						match(SOURCE_TEXT);
						}
						break;
					case GRAVE_ACCENT:
						{
						setState(177);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Endif_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_ENDIF() { return getToken(VerilogPreprocessorParser.DIRECTIVE_ENDIF, 0); }
		public Endif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterEndif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitEndif_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitEndif_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endif_directiveContext endif_directive() throws RecognitionException {
		Endif_directiveContext _localctx = new Endif_directiveContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_endif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(GRAVE_ACCENT);
			setState(184);
			match(DIRECTIVE_ENDIF);
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

	public static class Include_compiler_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_INCLUDE() { return getToken(VerilogPreprocessorParser.DIRECTIVE_INCLUDE, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Include_compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterInclude_compiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitInclude_compiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitInclude_compiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Include_compiler_directiveContext include_compiler_directive() throws RecognitionException {
		Include_compiler_directiveContext _localctx = new Include_compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_include_compiler_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(GRAVE_ACCENT);
			setState(187);
			match(DIRECTIVE_INCLUDE);
			setState(188);
			filename();
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

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_STRING() { return getToken(VerilogPreprocessorParser.DIRECTIVE_STRING, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(DIRECTIVE_STRING);
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

	public static class Resetall_compiler_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_RESETALL() { return getToken(VerilogPreprocessorParser.DIRECTIVE_RESETALL, 0); }
		public Resetall_compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetall_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterResetall_compiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitResetall_compiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitResetall_compiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resetall_compiler_directiveContext resetall_compiler_directive() throws RecognitionException {
		Resetall_compiler_directiveContext _localctx = new Resetall_compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_resetall_compiler_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(GRAVE_ACCENT);
			setState(193);
			match(DIRECTIVE_RESETALL);
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

	public static class Line_compiler_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_LINE() { return getToken(VerilogPreprocessorParser.DIRECTIVE_LINE, 0); }
		public Line_numberContext line_number() {
			return getRuleContext(Line_numberContext.class,0);
		}
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Line_levelContext line_level() {
			return getRuleContext(Line_levelContext.class,0);
		}
		public Line_compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterLine_compiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitLine_compiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitLine_compiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_compiler_directiveContext line_compiler_directive() throws RecognitionException {
		Line_compiler_directiveContext _localctx = new Line_compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_line_compiler_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(GRAVE_ACCENT);
			setState(196);
			match(DIRECTIVE_LINE);
			setState(197);
			line_number();
			setState(198);
			filename();
			setState(199);
			line_level();
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

	public static class Line_numberContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_NUMBER() { return getToken(VerilogPreprocessorParser.DIRECTIVE_NUMBER, 0); }
		public Line_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterLine_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitLine_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitLine_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_numberContext line_number() throws RecognitionException {
		Line_numberContext _localctx = new Line_numberContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_line_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(DIRECTIVE_NUMBER);
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

	public static class Line_levelContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_NUMBER() { return getToken(VerilogPreprocessorParser.DIRECTIVE_NUMBER, 0); }
		public Line_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterLine_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitLine_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitLine_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_levelContext line_level() throws RecognitionException {
		Line_levelContext _localctx = new Line_levelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_line_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(DIRECTIVE_NUMBER);
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

	public static class Timescale_compiler_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_TIMESCALE() { return getToken(VerilogPreprocessorParser.DIRECTIVE_TIMESCALE, 0); }
		public List<Time_literalContext> time_literal() {
			return getRuleContexts(Time_literalContext.class);
		}
		public Time_literalContext time_literal(int i) {
			return getRuleContext(Time_literalContext.class,i);
		}
		public TerminalNode DIRECTIVE_SLASH() { return getToken(VerilogPreprocessorParser.DIRECTIVE_SLASH, 0); }
		public Timescale_compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timescale_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterTimescale_compiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitTimescale_compiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitTimescale_compiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timescale_compiler_directiveContext timescale_compiler_directive() throws RecognitionException {
		Timescale_compiler_directiveContext _localctx = new Timescale_compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_timescale_compiler_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(GRAVE_ACCENT);
			setState(206);
			match(DIRECTIVE_TIMESCALE);
			setState(207);
			time_literal();
			setState(208);
			match(DIRECTIVE_SLASH);
			setState(209);
			time_literal();
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

	public static class Time_literalContext extends ParserRuleContext {
		public Time_numberContext time_number() {
			return getRuleContext(Time_numberContext.class,0);
		}
		public Time_unitContext time_unit() {
			return getRuleContext(Time_unitContext.class,0);
		}
		public Time_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterTime_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitTime_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitTime_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_literalContext time_literal() throws RecognitionException {
		Time_literalContext _localctx = new Time_literalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_time_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			time_number();
			setState(212);
			time_unit();
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

	public static class Time_numberContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_NUMBER() { return getToken(VerilogPreprocessorParser.DIRECTIVE_NUMBER, 0); }
		public Time_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterTime_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitTime_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitTime_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_numberContext time_number() throws RecognitionException {
		Time_numberContext _localctx = new Time_numberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_time_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(DIRECTIVE_NUMBER);
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

	public static class Time_unitContext extends ParserRuleContext {
		public TerminalNode TIME_UNIT() { return getToken(VerilogPreprocessorParser.TIME_UNIT, 0); }
		public Time_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterTime_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitTime_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitTime_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_unitContext time_unit() throws RecognitionException {
		Time_unitContext _localctx = new Time_unitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_time_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(TIME_UNIT);
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

	public static class Unconnected_drive_compiler_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_UNCONNECTED_DRIVE() { return getToken(VerilogPreprocessorParser.DIRECTIVE_UNCONNECTED_DRIVE, 0); }
		public Unconnected_drive_valueContext unconnected_drive_value() {
			return getRuleContext(Unconnected_drive_valueContext.class,0);
		}
		public Unconnected_drive_compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconnected_drive_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterUnconnected_drive_compiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitUnconnected_drive_compiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitUnconnected_drive_compiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unconnected_drive_compiler_directiveContext unconnected_drive_compiler_directive() throws RecognitionException {
		Unconnected_drive_compiler_directiveContext _localctx = new Unconnected_drive_compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unconnected_drive_compiler_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(GRAVE_ACCENT);
			setState(219);
			match(DIRECTIVE_UNCONNECTED_DRIVE);
			setState(220);
			unconnected_drive_value();
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

	public static class Unconnected_drive_valueContext extends ParserRuleContext {
		public TerminalNode UNCONNECTED_DRIVE_VALUE() { return getToken(VerilogPreprocessorParser.UNCONNECTED_DRIVE_VALUE, 0); }
		public Unconnected_drive_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconnected_drive_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterUnconnected_drive_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitUnconnected_drive_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitUnconnected_drive_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unconnected_drive_valueContext unconnected_drive_value() throws RecognitionException {
		Unconnected_drive_valueContext _localctx = new Unconnected_drive_valueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unconnected_drive_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(UNCONNECTED_DRIVE_VALUE);
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

	public static class Nounconnected_drive_compiler_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_NOUNCONNECTED_DRIVE() { return getToken(VerilogPreprocessorParser.DIRECTIVE_NOUNCONNECTED_DRIVE, 0); }
		public Nounconnected_drive_compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounconnected_drive_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterNounconnected_drive_compiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitNounconnected_drive_compiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitNounconnected_drive_compiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nounconnected_drive_compiler_directiveContext nounconnected_drive_compiler_directive() throws RecognitionException {
		Nounconnected_drive_compiler_directiveContext _localctx = new Nounconnected_drive_compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nounconnected_drive_compiler_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(GRAVE_ACCENT);
			setState(225);
			match(DIRECTIVE_NOUNCONNECTED_DRIVE);
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

	public static class Keywords_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_BEGIN_KEYWORDS() { return getToken(VerilogPreprocessorParser.DIRECTIVE_BEGIN_KEYWORDS, 0); }
		public Version_specifierContext version_specifier() {
			return getRuleContext(Version_specifierContext.class,0);
		}
		public Keywords_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterKeywords_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitKeywords_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitKeywords_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keywords_directiveContext keywords_directive() throws RecognitionException {
		Keywords_directiveContext _localctx = new Keywords_directiveContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_keywords_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(GRAVE_ACCENT);
			setState(228);
			match(DIRECTIVE_BEGIN_KEYWORDS);
			setState(229);
			version_specifier();
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

	public static class Version_specifierContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_STRING() { return getToken(VerilogPreprocessorParser.DIRECTIVE_STRING, 0); }
		public Version_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterVersion_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitVersion_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitVersion_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Version_specifierContext version_specifier() throws RecognitionException {
		Version_specifierContext _localctx = new Version_specifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_version_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(DIRECTIVE_STRING);
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

	public static class Endkeywords_directiveContext extends ParserRuleContext {
		public TerminalNode GRAVE_ACCENT() { return getToken(VerilogPreprocessorParser.GRAVE_ACCENT, 0); }
		public TerminalNode DIRECTIVE_END_KEYWORDS() { return getToken(VerilogPreprocessorParser.DIRECTIVE_END_KEYWORDS, 0); }
		public Endkeywords_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endkeywords_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).enterEndkeywords_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogPreprocessorParserListener ) ((VerilogPreprocessorParserListener)listener).exitEndkeywords_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogPreprocessorParserVisitor ) return ((VerilogPreprocessorParserVisitor<? extends T>)visitor).visitEndkeywords_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endkeywords_directiveContext endkeywords_directive() throws RecognitionException {
		Endkeywords_directiveContext _localctx = new Endkeywords_directiveContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_endkeywords_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(GRAVE_ACCENT);
			setState(234);
			match(DIRECTIVE_END_KEYWORDS);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0180\u00ef\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\t\3\t\3\t\5\t"+
		"s\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u0082"+
		"\n\r\f\r\16\r\u0085\13\r\3\r\7\r\u0088\n\r\f\r\16\r\u008b\13\r\3\r\5\r"+
		"\u008e\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u0097\n\16\f\16\16\16"+
		"\u009a\13\16\3\16\7\16\u009d\n\16\f\16\16\16\u00a0\13\16\3\16\5\16\u00a3"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00ac\n\17\f\17\16\17\u00af"+
		"\13\17\3\20\3\20\3\20\3\20\7\20\u00b5\n\20\f\20\16\20\u00b8\13\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\3\3\2\u017a\u017b\2\u00ec"+
		"\2E\3\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\b]\3\2\2\2\n`\3\2\2\2\fd\3\2\2\2\16"+
		"f\3\2\2\2\20o\3\2\2\2\22t\3\2\2\2\24v\3\2\2\2\26x\3\2\2\2\30|\3\2\2\2"+
		"\32\u0091\3\2\2\2\34\u00a6\3\2\2\2\36\u00b0\3\2\2\2 \u00b9\3\2\2\2\"\u00bc"+
		"\3\2\2\2$\u00c0\3\2\2\2&\u00c2\3\2\2\2(\u00c5\3\2\2\2*\u00cb\3\2\2\2,"+
		"\u00cd\3\2\2\2.\u00cf\3\2\2\2\60\u00d5\3\2\2\2\62\u00d8\3\2\2\2\64\u00da"+
		"\3\2\2\2\66\u00dc\3\2\2\28\u00e0\3\2\2\2:\u00e2\3\2\2\2<\u00e5\3\2\2\2"+
		">\u00e9\3\2\2\2@\u00eb\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2"+
		"EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2HY\5\6\4\2IY\5\b\5\2JY\5\n\6\2KY\5\16\b"+
		"\2LY\5\20\t\2MY\5\26\f\2NY\5\30\r\2OY\5\32\16\2PY\5\"\22\2QY\5&\24\2R"+
		"Y\5(\25\2SY\5.\30\2TY\5\66\34\2UY\5:\36\2VY\5<\37\2WY\5@!\2XH\3\2\2\2"+
		"XI\3\2\2\2XJ\3\2\2\2XK\3\2\2\2XL\3\2\2\2XM\3\2\2\2XN\3\2\2\2XO\3\2\2\2"+
		"XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2"+
		"XW\3\2\2\2Y\5\3\2\2\2Z[\7\u0153\2\2[\\\7\u015f\2\2\\\7\3\2\2\2]^\7\u0153"+
		"\2\2^_\7\u0165\2\2_\t\3\2\2\2`a\7\u0153\2\2ab\7\u0160\2\2bc\5\f\7\2c\13"+
		"\3\2\2\2de\7\u0170\2\2e\r\3\2\2\2fg\7\u0153\2\2gh\7\u0161\2\2hl\5\24\13"+
		"\2ik\t\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\17\3\2\2\2nl\3\2"+
		"\2\2op\7\u0153\2\2pr\5\24\13\2qs\5\22\n\2rq\3\2\2\2rs\3\2\2\2s\21\3\2"+
		"\2\2tu\7\u017c\2\2u\23\3\2\2\2vw\7\u0175\2\2w\25\3\2\2\2xy\7\u0153\2\2"+
		"yz\7\u016f\2\2z{\5\24\13\2{\27\3\2\2\2|}\7\u0153\2\2}~\7\u0167\2\2~\u0083"+
		"\5\24\13\2\177\u0082\7\u017f\2\2\u0080\u0082\5\4\3\2\u0081\177\3\2\2\2"+
		"\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0089\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\5\34\17\2"+
		"\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\5\36\20\2"+
		"\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\5 \21\2\u0090\31\3\2\2\2\u0091\u0092\7\u0153\2\2\u0092\u0093\7\u0168"+
		"\2\2\u0093\u0098\5\24\13\2\u0094\u0097\7\u017f\2\2\u0095\u0097\5\4\3\2"+
		"\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009e\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009d\5\34\17\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a3\5\36\20\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a5\5 \21\2\u00a5\33\3\2\2\2\u00a6\u00a7\7\u0153\2\2\u00a7"+
		"\u00a8\7\u0163\2\2\u00a8\u00ad\5\24\13\2\u00a9\u00ac\7\u017f\2\2\u00aa"+
		"\u00ac\5\4\3\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\35\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00b0\u00b1\7\u0153\2\2\u00b1\u00b6\7\u0162\2\2\u00b2\u00b5\7"+
		"\u017f\2\2\u00b3\u00b5\5\4\3\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\37"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\u0153\2\2\u00ba\u00bb\7\u0166"+
		"\2\2\u00bb!\3\2\2\2\u00bc\u00bd\7\u0153\2\2\u00bd\u00be\7\u0169\2\2\u00be"+
		"\u00bf\5$\23\2\u00bf#\3\2\2\2\u00c0\u00c1\7\u0174\2\2\u00c1%\3\2\2\2\u00c2"+
		"\u00c3\7\u0153\2\2\u00c3\u00c4\7\u016c\2\2\u00c4\'\3\2\2\2\u00c5\u00c6"+
		"\7\u0153\2\2\u00c6\u00c7\7\u016a\2\2\u00c7\u00c8\5*\26\2\u00c8\u00c9\5"+
		"$\23\2\u00c9\u00ca\5,\27\2\u00ca)\3\2\2\2\u00cb\u00cc\7\u0173\2\2\u00cc"+
		"+\3\2\2\2\u00cd\u00ce\7\u0173\2\2\u00ce-\3\2\2\2\u00cf\u00d0\7\u0153\2"+
		"\2\u00d0\u00d1\7\u016d\2\2\u00d1\u00d2\5\60\31\2\u00d2\u00d3\7\u0176\2"+
		"\2\u00d3\u00d4\5\60\31\2\u00d4/\3\2\2\2\u00d5\u00d6\5\62\32\2\u00d6\u00d7"+
		"\5\64\33\2\u00d7\61\3\2\2\2\u00d8\u00d9\7\u0173\2\2\u00d9\63\3\2\2\2\u00da"+
		"\u00db\7\u0171\2\2\u00db\65\3\2\2\2\u00dc\u00dd\7\u0153\2\2\u00dd\u00de"+
		"\7\u016e\2\2\u00de\u00df\58\35\2\u00df\67\3\2\2\2\u00e0\u00e1\7\u0172"+
		"\2\2\u00e19\3\2\2\2\u00e2\u00e3\7\u0153\2\2\u00e3\u00e4\7\u016b\2\2\u00e4"+
		";\3\2\2\2\u00e5\u00e6\7\u0153\2\2\u00e6\u00e7\7\u015e\2\2\u00e7\u00e8"+
		"\5> \2\u00e8=\3\2\2\2\u00e9\u00ea\7\u0174\2\2\u00ea?\3\2\2\2\u00eb\u00ec"+
		"\7\u0153\2\2\u00ec\u00ed\7\u0164\2\2\u00edA\3\2\2\2\22EXlr\u0081\u0083"+
		"\u0089\u008d\u0096\u0098\u009e\u00a2\u00ab\u00ad\u00b4\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}