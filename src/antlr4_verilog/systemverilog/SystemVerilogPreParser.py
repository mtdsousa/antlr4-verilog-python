# Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4-2/verilog/systemverilog/SystemVerilogPreParser.g4 by ANTLR 4.9
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u019e")
        buf.write("\u00eb\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31")
        buf.write("\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36")
        buf.write("\4\37\t\37\4 \t \3\2\7\2B\n\2\f\2\16\2E\13\2\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6")
        buf.write("\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3")
        buf.write("\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13y\n\13\f\13\16")
        buf.write("\13|\13\13\3\13\5\13\177\n\13\3\13\3\13\3\f\3\f\3\f\3")
        buf.write("\f\3\f\7\f\u0088\n\f\f\f\16\f\u008b\13\f\3\f\5\f\u008e")
        buf.write("\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17")
        buf.write("\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22")
        buf.write("\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25")
        buf.write("\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30")
        buf.write("\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32")
        buf.write("\3\33\3\33\3\34\3\34\7\34\u00cb\n\34\f\34\16\34\u00ce")
        buf.write("\13\34\3\35\3\35\7\35\u00d2\n\35\f\35\16\35\u00d5\13\35")
        buf.write("\3\36\3\36\7\36\u00d9\n\36\f\36\16\36\u00dc\13\36\3\37")
        buf.write("\3\37\7\37\u00e0\n\37\f\37\16\37\u00e3\13\37\3 \7 \u00e6")
        buf.write("\n \f \16 \u00e9\13 \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26")
        buf.write("\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\2\2\u00ec\2C\3")
        buf.write("\2\2\2\4Z\3\2\2\2\6\\\3\2\2\2\b_\3\2\2\2\nb\3\2\2\2\f")
        buf.write("f\3\2\2\2\16i\3\2\2\2\20m\3\2\2\2\22p\3\2\2\2\24s\3\2")
        buf.write("\2\2\26\u0082\3\2\2\2\30\u0091\3\2\2\2\32\u0095\3\2\2")
        buf.write("\2\34\u0099\3\2\2\2\36\u009c\3\2\2\2 \u00a0\3\2\2\2\"")
        buf.write("\u00a3\3\2\2\2$\u00a8\3\2\2\2&\u00ab\3\2\2\2(\u00af\3")
        buf.write("\2\2\2*\u00b3\3\2\2\2,\u00b7\3\2\2\2.\u00ba\3\2\2\2\60")
        buf.write("\u00bf\3\2\2\2\62\u00c3\3\2\2\2\64\u00c6\3\2\2\2\66\u00cc")
        buf.write("\3\2\2\28\u00d3\3\2\2\2:\u00da\3\2\2\2<\u00e1\3\2\2\2")
        buf.write(">\u00e7\3\2\2\2@B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2")
        buf.write("\2CD\3\2\2\2D\3\3\2\2\2EC\3\2\2\2F[\5\6\4\2G[\5\b\5\2")
        buf.write("H[\5\n\6\2I[\5\f\7\2J[\5\16\b\2K[\5\20\t\2L[\5\22\n\2")
        buf.write("M[\5\24\13\2N[\5\26\f\2O[\5\30\r\2P[\5\32\16\2Q[\5\34")
        buf.write("\17\2R[\5\36\20\2S[\5 \21\2T[\5\"\22\2U[\5$\23\2V[\5&")
        buf.write("\24\2W[\5(\25\2X[\5*\26\2Y[\5,\27\2ZF\3\2\2\2ZG\3\2\2")
        buf.write("\2ZH\3\2\2\2ZI\3\2\2\2ZJ\3\2\2\2ZK\3\2\2\2ZL\3\2\2\2Z")
        buf.write("M\3\2\2\2ZN\3\2\2\2ZO\3\2\2\2ZP\3\2\2\2ZQ\3\2\2\2ZR\3")
        buf.write("\2\2\2ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2")
        buf.write("\2ZX\3\2\2\2ZY\3\2\2\2[\5\3\2\2\2\\]\7d\2\2]^\7\u0180")
        buf.write("\2\2^\7\3\2\2\2_`\7d\2\2`a\7\u0181\2\2a\t\3\2\2\2bc\7")
        buf.write("d\2\2cd\7\u0182\2\2de\7\u0197\2\2e\13\3\2\2\2fg\7d\2\2")
        buf.write("gh\7\u0183\2\2h\r\3\2\2\2ij\7d\2\2jk\7\u0184\2\2kl\7\u0197")
        buf.write("\2\2l\17\3\2\2\2mn\7d\2\2no\7\u0189\2\2o\21\3\2\2\2pq")
        buf.write("\7d\2\2qr\7\u0188\2\2r\23\3\2\2\2st\7d\2\2tu\7\u018b\2")
        buf.write("\2uv\5\64\33\2vz\5\66\34\2wy\5.\30\2xw\3\2\2\2y|\3\2\2")
        buf.write("\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}\177\5\60\31")
        buf.write("\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081")
        buf.write("\5\62\32\2\u0081\25\3\2\2\2\u0082\u0083\7d\2\2\u0083\u0084")
        buf.write("\7\u018c\2\2\u0084\u0085\5\64\33\2\u0085\u0089\58\35\2")
        buf.write("\u0086\u0088\5.\30\2\u0087\u0086\3\2\2\2\u0088\u008b\3")
        buf.write("\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d")
        buf.write("\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\5\60\31\2\u008d")
        buf.write("\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2")
        buf.write("\u008f\u0090\5\62\32\2\u0090\27\3\2\2\2\u0091\u0092\7")
        buf.write("d\2\2\u0092\u0093\7\u018d\2\2\u0093\u0094\7\u0197\2\2")
        buf.write("\u0094\31\3\2\2\2\u0095\u0096\7d\2\2\u0096\u0097\7\u018e")
        buf.write("\2\2\u0097\u0098\7\u0197\2\2\u0098\33\3\2\2\2\u0099\u009a")
        buf.write("\7d\2\2\u009a\u009b\7\u018f\2\2\u009b\35\3\2\2\2\u009c")
        buf.write("\u009d\7d\2\2\u009d\u009e\7\u0190\2\2\u009e\u009f\7\u0197")
        buf.write("\2\2\u009f\37\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7")
        buf.write("\u0191\2\2\u00a2!\3\2\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5")
        buf.write("\7\u0185\2\2\u00a5\u00a6\5\64\33\2\u00a6\u00a7\5> \2\u00a7")
        buf.write("#\3\2\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7\u0196\2\2\u00aa")
        buf.write("%\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7\u0192\2\2\u00ad")
        buf.write("\u00ae\7\u0197\2\2\u00ae\'\3\2\2\2\u00af\u00b0\7d\2\2")
        buf.write("\u00b0\u00b1\7\u0193\2\2\u00b1\u00b2\7\u0197\2\2\u00b2")
        buf.write(")\3\2\2\2\u00b3\u00b4\7d\2\2\u00b4\u00b5\7\u0194\2\2\u00b5")
        buf.write("\u00b6\5\64\33\2\u00b6+\3\2\2\2\u00b7\u00b8\7d\2\2\u00b8")
        buf.write("\u00b9\7\u0195\2\2\u00b9-\3\2\2\2\u00ba\u00bb\7d\2\2\u00bb")
        buf.write("\u00bc\7\u0187\2\2\u00bc\u00bd\5\64\33\2\u00bd\u00be\5")
        buf.write(":\36\2\u00be/\3\2\2\2\u00bf\u00c0\7d\2\2\u00c0\u00c1\7")
        buf.write("\u0186\2\2\u00c1\u00c2\5<\37\2\u00c2\61\3\2\2\2\u00c3")
        buf.write("\u00c4\7d\2\2\u00c4\u00c5\7\u018a\2\2\u00c5\63\3\2\2\2")
        buf.write("\u00c6\u00c7\7\u0198\2\2\u00c7\65\3\2\2\2\u00c8\u00cb")
        buf.write("\7\u019e\2\2\u00c9\u00cb\5\4\3\2\u00ca\u00c8\3\2\2\2\u00ca")
        buf.write("\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2")
        buf.write("\u00cc\u00cd\3\2\2\2\u00cd\67\3\2\2\2\u00ce\u00cc\3\2")
        buf.write("\2\2\u00cf\u00d2\7\u019e\2\2\u00d0\u00d2\5\4\3\2\u00d1")
        buf.write("\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2")
        buf.write("\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d49\3\2\2")
        buf.write("\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\7\u019e\2\2\u00d7\u00d9")
        buf.write("\5\4\3\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9")
        buf.write("\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2")
        buf.write("\u00db;\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\7\u019e")
        buf.write("\2\2\u00de\u00e0\5\4\3\2\u00df\u00dd\3\2\2\2\u00df\u00de")
        buf.write("\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1")
        buf.write("\u00e2\3\2\2\2\u00e2=\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4")
        buf.write("\u00e6\7\u019c\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2")
        buf.write("\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8?\3")
        buf.write("\2\2\2\u00e9\u00e7\3\2\2\2\21CZz~\u0089\u008d\u00ca\u00cc")
        buf.write("\u00d1\u00d3\u00d8\u00da\u00df\u00e1\u00e7")
        return buf.getvalue()


class SystemVerilogPreParser ( Parser ):

    grammarFileName = "SystemVerilogPreParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'!'", "'!='", "'!=='", "'!=?'", "'\"'", 
                     "'\"DPI\"'", "'\"DPI-C\"'", "'#'", "'##'", "'#-#'", 
                     "'#0'", "'#=#'", "'$'", "'$error'", "'$fatal'", "'$fullskew'", 
                     "'$hold'", "'$info'", "'$nochange'", "'$period'", "'$recovery'", 
                     "'$recrem'", "'$removal'", "'$root.'", "'$setup'", 
                     "'$setuphold'", "'$skew'", "'$timeskew'", "'$unit'", 
                     "'$warning'", "'$width'", "'%'", "'%='", "'&'", "'&&'", 
                     "'&&&'", "'&='", "'('", "')'", "'*'", "'**'", "'*/'", 
                     "'*::*'", "'*='", "'*>'", "'+'", "'++'", "'+:'", "'+='", 
                     "','", "'-'", "'--'", "'-:'", "'-='", "'->'", "'->>'", 
                     "'-incdir'", "'.'", "'.*'", "'/'", "'/*'", "'//'", 
                     "'/='", "'1step'", "':'", "':/'", "'::'", "':='", "';'", 
                     "'<'", "'<->'", "'<<'", "'<<<'", "'<<<='", "'<<='", 
                     "'<='", "'='", "'=='", "'==='", "'==?'", "'=>'", "'>'", 
                     "'>='", "'>>'", "'>>='", "'>>>'", "'>>>='", "'?'", 
                     "'@'", "'@@'", "'PATHPULSE$'", "'['", "'''", "']'", 
                     "'^'", "'^='", "'^~'", "<INVALID>", "'accept_on'", 
                     "'alias'", "'always'", "'always_comb'", "'always_ff'", 
                     "'always_latch'", "'and'", "'assert'", "'assign'", 
                     "'assume'", "'automatic'", "'before'", "'begin'", "'bind'", 
                     "'bins'", "'binsof'", "'bit'", "'break'", "'buf'", 
                     "'bufif0'", "'bufif1'", "'byte'", "'case'", "'casex'", 
                     "'casez'", "'cell'", "'chandle'", "'checker'", "'class'", 
                     "'clocking'", "'cmos'", "'config'", "'const'", "'constraint'", 
                     "'context'", "'continue'", "'cover'", "'covergroup'", 
                     "'coverpoint'", "'cross'", "'deassign'", "'default'", 
                     "'defparam'", "'design'", "'disable'", "'dist'", "'do'", 
                     "'edge'", "'else'", "'end'", "'endcase'", "'endchecker'", 
                     "'endclass'", "'endclocking'", "'endconfig'", "'endfunction'", 
                     "'endgenerate'", "'endgroup'", "'endinterface'", "'endmodule'", 
                     "'endpackage'", "'endprimitive'", "'endprogram'", "'endproperty'", 
                     "'endsequence'", "'endspecify'", "'endtable'", "'endtask'", 
                     "'enum'", "'event'", "'expect'", "'export'", "'extends'", 
                     "'extern'", "'final'", "'first_match'", "'for'", "'force'", 
                     "'foreach'", "'forever'", "'fork'", "'forkjoin'", "'function'", 
                     "'generate'", "'genvar'", "'global'", "'highz0'", "'highz1'", 
                     "'if'", "'iff'", "'ifnone'", "'ignore_bins'", "'illegal_bins'", 
                     "'implements'", "'implies'", "'import'", "'include'", 
                     "'initial'", "'inout'", "'input'", "'inside'", "'instance'", 
                     "'int'", "'integer'", "'interconnect'", "'interface'", 
                     "'intersect'", "'join'", "'join_any'", "'join_none'", 
                     "'large'", "'let'", "'liblist'", "'library'", "'local'", 
                     "'localparam'", "'logic'", "'longint'", "'macromodule'", 
                     "'matches'", "'medium'", "'modport'", "'module'", "'nand'", 
                     "'negedge'", "'nettype'", "'new'", "'nexttime'", "'nmos'", 
                     "'nor'", "'noshowcancelled'", "'not'", "'notif0'", 
                     "'notif1'", "'null'", "'option.'", "'or'", "'output'", 
                     "'package'", "'packed'", "'parameter'", "'pmos'", "'posedge'", 
                     "'primitive'", "'priority'", "'program'", "'property'", 
                     "'protected'", "'pull0'", "'pull1'", "'pulldown'", 
                     "'pullup'", "'pulsestyle_ondetect'", "'pulsestyle_onevent'", 
                     "'pure'", "'rand'", "'randc'", "'randcase'", "'randomize'", 
                     "'randsequence'", "'rcmos'", "'real'", "'realtime'", 
                     "'ref'", "'reg'", "'reject_on'", "'release'", "'repeat'", 
                     "'restrict'", "'return'", "'rnmos'", "'rpmos'", "'rtran'", 
                     "'rtranif0'", "'rtranif1'", "'s_always'", "'s_eventually'", 
                     "'s_nexttime'", "'s_until'", "'s_until_with'", "'sample'", 
                     "'scalared'", "'sequence'", "'shortint'", "'shortreal'", 
                     "'showcancelled'", "'signed'", "'small'", "'soft'", 
                     "'solve'", "'specify'", "'specparam'", "'static'", 
                     "'std'", "'string'", "'strong'", "'strong0'", "'strong1'", 
                     "'struct'", "'super'", "'supply0'", "'supply1'", "'sync_accept_on'", 
                     "'sync_reject_on'", "'table'", "'tagged'", "'task'", 
                     "'this'", "'throughout'", "'time'", "'timeprecision'", 
                     "'timeunit'", "'tran'", "'tranif0'", "'tranif1'", "'tri'", 
                     "'tri0'", "'tri1'", "'triand'", "'trior'", "'trireg'", 
                     "'type'", "'type_option.'", "'typedef'", "'union'", 
                     "'unique'", "'unique0'", "'unsigned'", "'until'", "'until_with'", 
                     "'untyped'", "'use'", "'uwire'", "'var'", "'vectored'", 
                     "'virtual'", "'void'", "'wait'", "'wait_order'", "'wand'", 
                     "'weak'", "'weak0'", "'weak1'", "'while'", "'wildcard'", 
                     "'wire'", "'with'", "'within'", "'wor'", "'xnor'", 
                     "'xor'", "'{'", "'|'", "'|->'", "'|='", "'|=>'", "'||'", 
                     "'}'", "'~'", "'~&'", "'~^'", "'~|'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'__FILE__'", "'__LINE__'", "<INVALID>", "'celldefine'", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'end_keywords'", "'endcelldefine'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "'nounconnected_drive'", 
                     "<INVALID>", "'resetall'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'undefineall'" ]

    symbolicNames = [ "<INVALID>", "EM", "EMEQ", "EMEQEQ", "EMEQQM", "DQ", 
                      "DQDPIDQ", "DQDPIMICDQ", "HA", "HAHA", "HAMIHA", "HAZERO", 
                      "HAEQHA", "DL", "DLERROR", "DLFATAL", "DLFULLSKEW", 
                      "DLHOLD", "DLINFO", "DLNOCHANGE", "DLPERIOD", "DLRECOVERY", 
                      "DLRECREM", "DLREMOVAL", "DLROOTDT", "DLSETUP", "DLSETUPHOLD", 
                      "DLSKEW", "DLTIMESKEW", "DLUNIT", "DLWARNING", "DLWIDTH", 
                      "MO", "MOEQ", "AM", "AMAM", "AMAMAM", "AMEQ", "LP", 
                      "RP", "AS", "ASAS", "ASSL", "ASCLCLAS", "ASEQ", "ASGT", 
                      "PL", "PLPL", "PLCL", "PLEQ", "CO", "MI", "MIMI", 
                      "MICL", "MIEQ", "MIGT", "MIGTGT", "MIINCDIR", "DT", 
                      "DTAS", "SL", "SLAS", "SLSL", "SLEQ", "ONESTEP", "CL", 
                      "CLSL", "CLCL", "CLEQ", "SC", "LT", "LTMIGT", "LTLT", 
                      "LTLTLT", "LTLTLTEQ", "LTLTEQ", "LTEQ", "EQ", "EQEQ", 
                      "EQEQEQ", "EQEQQM", "EQGT", "GT", "GTEQ", "GTGT", 
                      "GTGTEQ", "GTGTGT", "GTGTGTEQ", "QM", "AT", "ATAT", 
                      "PATHPULSEDL", "LB", "BSAP", "RB", "CA", "CAEQ", "CATI", 
                      "GA", "ACCEPT_ON", "ALIAS", "ALWAYS", "ALWAYS_COMB", 
                      "ALWAYS_FF", "ALWAYS_LATCH", "AND", "ASSERT", "ASSIGN", 
                      "ASSUME", "AUTOMATIC", "BEFORE", "BEGIN", "BIND", 
                      "BINS", "BINSOF", "BIT", "BREAK", "BUF", "BUFIFZERO", 
                      "BUFIFONE", "BYTE", "CASE", "CASEX", "CASEZ", "CELL", 
                      "CHANDLE", "CHECKER", "CLASS", "CLOCKING", "CMOS", 
                      "CONFIG", "CONST", "CONSTRAINT", "CONTEXT", "CONTINUE", 
                      "COVER", "COVERGROUP", "COVERPOINT", "CROSS", "DEASSIGN", 
                      "DEFAULT", "DEFPARAM", "DESIGN", "DISABLE", "DIST", 
                      "DO", "EDGE", "ELSE", "END", "ENDCASE", "ENDCHECKER", 
                      "ENDCLASS", "ENDCLOCKING", "ENDCONFIG", "ENDFUNCTION", 
                      "ENDGENERATE", "ENDGROUP", "ENDINTERFACE", "ENDMODULE", 
                      "ENDPACKAGE", "ENDPRIMITIVE", "ENDPROGRAM", "ENDPROPERTY", 
                      "ENDSEQUENCE", "ENDSPECIFY", "ENDTABLE", "ENDTASK", 
                      "ENUM", "EVENT", "EXPECT", "EXPORT", "EXTENDS", "EXTERN", 
                      "FINAL", "FIRST_MATCH", "FOR", "FORCE", "FOREACH", 
                      "FOREVER", "FORK", "FORKJOIN", "FUNCTION", "GENERATE", 
                      "GENVAR", "GLOBAL", "HIGHZZERO", "HIGHZONE", "IF", 
                      "IFF", "IFNONE", "IGNORE_BINS", "ILLEGAL_BINS", "IMPLEMENTS", 
                      "IMPLIES", "IMPORT", "INCLUDE", "INITIAL", "INOUT", 
                      "INPUT", "INSIDE", "INSTANCE", "INT", "INTEGER", "INTERCONNECT", 
                      "INTERFACE", "INTERSECT", "JOIN", "JOIN_ANY", "JOIN_NONE", 
                      "LARGE", "LET", "LIBLIST", "LIBRARY", "LOCAL", "LOCALPARAM", 
                      "LOGIC", "LONGINT", "MACROMODULE", "MATCHES", "MEDIUM", 
                      "MODPORT", "MODULE", "NAND", "NEGEDGE", "NETTYPE", 
                      "NEW", "NEXTTIME", "NMOS", "NOR", "NOSHOWCANCELLED", 
                      "NOT", "NOTIFZERO", "NOTIFONE", "NULL", "OPTIONDT", 
                      "OR", "OUTPUT", "PACKAGE", "PACKED", "PARAMETER", 
                      "PMOS", "POSEDGE", "PRIMITIVE", "PRIORITY", "PROGRAM", 
                      "PROPERTY", "PROTECTED", "PULLZERO", "PULLONE", "PULLDOWN", 
                      "PULLUP", "PULSESTYLE_ONDETECT", "PULSESTYLE_ONEVENT", 
                      "PURE", "RAND", "RANDC", "RANDCASE", "RANDOMIZE", 
                      "RANDSEQUENCE", "RCMOS", "REAL", "REALTIME", "REF", 
                      "REG", "REJECT_ON", "RELEASE", "REPEAT", "RESTRICT", 
                      "RETURN", "RNMOS", "RPMOS", "RTRAN", "RTRANIFZERO", 
                      "RTRANIFONE", "S_ALWAYS", "S_EVENTUALLY", "S_NEXTTIME", 
                      "S_UNTIL", "S_UNTIL_WITH", "SAMPLE", "SCALARED", "SEQUENCE", 
                      "SHORTINT", "SHORTREAL", "SHOWCANCELLED", "SIGNED", 
                      "SMALL", "SOFT", "SOLVE", "SPECIFY", "SPECPARAM", 
                      "STATIC", "STD", "STRING", "STRONG", "STRONGZERO", 
                      "STRONGONE", "STRUCT", "SUPER", "SUPPLYZERO", "SUPPLYONE", 
                      "SYNC_ACCEPT_ON", "SYNC_REJECT_ON", "TABLE", "TAGGED", 
                      "TASK", "THIS", "THROUGHOUT", "TIME", "TIMEPRECISION", 
                      "TIMEUNIT", "TRAN", "TRANIFZERO", "TRANIFONE", "TRI", 
                      "TRIZERO", "TRIONE", "TRIAND", "TRIOR", "TRIREG", 
                      "TYPE", "TYPE_OPTIONDT", "TYPEDEF", "UNION", "UNIQUE", 
                      "UNIQUEZERO", "UNSIGNED", "UNTIL", "UNTIL_WITH", "UNTYPED", 
                      "USE", "UWIRE", "VAR", "VECTORED", "VIRTUAL", "VOID", 
                      "WAIT", "WAIT_ORDER", "WAND", "WEAK", "WEAKZERO", 
                      "WEAKONE", "WHILE", "WILDCARD", "WIRE", "WITH", "WITHIN", 
                      "WOR", "XNOR", "XOR", "LC", "VL", "VLMIGT", "VLEQ", 
                      "VLEQGT", "VLVL", "RC", "TI", "TIAM", "TICA", "TIVL", 
                      "TIME_LITERAL", "DECIMAL_NUMBER", "BINARY_NUMBER", 
                      "OCTAL_NUMBER", "HEX_NUMBER", "REAL_NUMBER", "UNBASED_UNSIZED_LITERAL", 
                      "STRING_LITERAL", "COMMENT", "ESCAPED_IDENTIFIER", 
                      "SIMPLE_IDENTIFIER", "SYSTEM_TF_IDENTIFIER", "WHITE_SPACE", 
                      "FILE_PATH_SPEC", "FINISH_NUMBER", "INIT_VAL", "OUTPUT_SYMBOL", 
                      "LEVEL_SYMBOL", "EDGE_SYMBOL", "EDGE_DESCRIPTOR", 
                      "SCALAR_CONSTANT", "FILE_DIRECTIVE", "LINE_DIRECTIVE_", 
                      "BEGIN_KEYWORDS_DIRECTIVE", "CELLDEFINE_DIRECTIVE", 
                      "DEFAULT_NETTYPE_DIRECTIVE", "DEFINE_DIRECTIVE", "ELSE_DIRECTIVE", 
                      "ELSIF_DIRECTIVE", "END_KEYWORDS_DIRECTIVE", "ENDCELLDEFINE_DIRECTIVE", 
                      "ENDIF_DIRECTIVE", "IFDEF_DIRECTIVE", "IFNDEF_DIRECTIVE", 
                      "INCLUDE_DIRECTIVE", "LINE_DIRECTIVE", "NOUNCONNECTED_DRIVE_DIRECTIVE", 
                      "PRAGMA_DIRECTIVE", "RESETALL_DIRECTIVE", "TIMESCALE_DIRECTIVE", 
                      "UNCONNECTED_DRIVE_DIRECTIVE", "UNDEF_DIRECTIVE", 
                      "UNDEFINEALL_DIRECTIVE", "MACRO_USAGE", "DIRECTIVE_TEXT", 
                      "DIRECTIVE_IDENTIFIER", "DIRECTIVE_COMMENT", "DIRECTIVE_WHITE_SPACE", 
                      "DIRECTIVE_NEWLINE", "MACRO_TEXT", "MT_ESC_NEWLINE", 
                      "SOURCE_TEXT" ]

    RULE_source_text = 0
    RULE_compiler_directive = 1
    RULE_file_directive = 2
    RULE_line_directive_ = 3
    RULE_begin_keywords_directive = 4
    RULE_celldefine_directive = 5
    RULE_default_nettype_directive = 6
    RULE_endcelldefine_directive = 7
    RULE_end_keywords_directive = 8
    RULE_ifdef_directive = 9
    RULE_ifndef_directive = 10
    RULE_include_directive = 11
    RULE_line_directive = 12
    RULE_nounconnected_drive_directive = 13
    RULE_pragma_directive = 14
    RULE_resetall_directive = 15
    RULE_text_macro_definition = 16
    RULE_text_macro_usage = 17
    RULE_timescale_directive = 18
    RULE_unconnected_drive_directive = 19
    RULE_undef_directive = 20
    RULE_undefineall_directive = 21
    RULE_elsif_directive = 22
    RULE_else_directive = 23
    RULE_endif_directive = 24
    RULE_text_macro_identifier = 25
    RULE_ifdef_group_of_lines = 26
    RULE_ifndef_group_of_lines = 27
    RULE_elsif_group_of_lines = 28
    RULE_else_group_of_lines = 29
    RULE_macro_text = 30

    ruleNames =  [ "source_text", "compiler_directive", "file_directive", 
                   "line_directive_", "begin_keywords_directive", "celldefine_directive", 
                   "default_nettype_directive", "endcelldefine_directive", 
                   "end_keywords_directive", "ifdef_directive", "ifndef_directive", 
                   "include_directive", "line_directive", "nounconnected_drive_directive", 
                   "pragma_directive", "resetall_directive", "text_macro_definition", 
                   "text_macro_usage", "timescale_directive", "unconnected_drive_directive", 
                   "undef_directive", "undefineall_directive", "elsif_directive", 
                   "else_directive", "endif_directive", "text_macro_identifier", 
                   "ifdef_group_of_lines", "ifndef_group_of_lines", "elsif_group_of_lines", 
                   "else_group_of_lines", "macro_text" ]

    EOF = Token.EOF
    EM=1
    EMEQ=2
    EMEQEQ=3
    EMEQQM=4
    DQ=5
    DQDPIDQ=6
    DQDPIMICDQ=7
    HA=8
    HAHA=9
    HAMIHA=10
    HAZERO=11
    HAEQHA=12
    DL=13
    DLERROR=14
    DLFATAL=15
    DLFULLSKEW=16
    DLHOLD=17
    DLINFO=18
    DLNOCHANGE=19
    DLPERIOD=20
    DLRECOVERY=21
    DLRECREM=22
    DLREMOVAL=23
    DLROOTDT=24
    DLSETUP=25
    DLSETUPHOLD=26
    DLSKEW=27
    DLTIMESKEW=28
    DLUNIT=29
    DLWARNING=30
    DLWIDTH=31
    MO=32
    MOEQ=33
    AM=34
    AMAM=35
    AMAMAM=36
    AMEQ=37
    LP=38
    RP=39
    AS=40
    ASAS=41
    ASSL=42
    ASCLCLAS=43
    ASEQ=44
    ASGT=45
    PL=46
    PLPL=47
    PLCL=48
    PLEQ=49
    CO=50
    MI=51
    MIMI=52
    MICL=53
    MIEQ=54
    MIGT=55
    MIGTGT=56
    MIINCDIR=57
    DT=58
    DTAS=59
    SL=60
    SLAS=61
    SLSL=62
    SLEQ=63
    ONESTEP=64
    CL=65
    CLSL=66
    CLCL=67
    CLEQ=68
    SC=69
    LT=70
    LTMIGT=71
    LTLT=72
    LTLTLT=73
    LTLTLTEQ=74
    LTLTEQ=75
    LTEQ=76
    EQ=77
    EQEQ=78
    EQEQEQ=79
    EQEQQM=80
    EQGT=81
    GT=82
    GTEQ=83
    GTGT=84
    GTGTEQ=85
    GTGTGT=86
    GTGTGTEQ=87
    QM=88
    AT=89
    ATAT=90
    PATHPULSEDL=91
    LB=92
    BSAP=93
    RB=94
    CA=95
    CAEQ=96
    CATI=97
    GA=98
    ACCEPT_ON=99
    ALIAS=100
    ALWAYS=101
    ALWAYS_COMB=102
    ALWAYS_FF=103
    ALWAYS_LATCH=104
    AND=105
    ASSERT=106
    ASSIGN=107
    ASSUME=108
    AUTOMATIC=109
    BEFORE=110
    BEGIN=111
    BIND=112
    BINS=113
    BINSOF=114
    BIT=115
    BREAK=116
    BUF=117
    BUFIFZERO=118
    BUFIFONE=119
    BYTE=120
    CASE=121
    CASEX=122
    CASEZ=123
    CELL=124
    CHANDLE=125
    CHECKER=126
    CLASS=127
    CLOCKING=128
    CMOS=129
    CONFIG=130
    CONST=131
    CONSTRAINT=132
    CONTEXT=133
    CONTINUE=134
    COVER=135
    COVERGROUP=136
    COVERPOINT=137
    CROSS=138
    DEASSIGN=139
    DEFAULT=140
    DEFPARAM=141
    DESIGN=142
    DISABLE=143
    DIST=144
    DO=145
    EDGE=146
    ELSE=147
    END=148
    ENDCASE=149
    ENDCHECKER=150
    ENDCLASS=151
    ENDCLOCKING=152
    ENDCONFIG=153
    ENDFUNCTION=154
    ENDGENERATE=155
    ENDGROUP=156
    ENDINTERFACE=157
    ENDMODULE=158
    ENDPACKAGE=159
    ENDPRIMITIVE=160
    ENDPROGRAM=161
    ENDPROPERTY=162
    ENDSEQUENCE=163
    ENDSPECIFY=164
    ENDTABLE=165
    ENDTASK=166
    ENUM=167
    EVENT=168
    EXPECT=169
    EXPORT=170
    EXTENDS=171
    EXTERN=172
    FINAL=173
    FIRST_MATCH=174
    FOR=175
    FORCE=176
    FOREACH=177
    FOREVER=178
    FORK=179
    FORKJOIN=180
    FUNCTION=181
    GENERATE=182
    GENVAR=183
    GLOBAL=184
    HIGHZZERO=185
    HIGHZONE=186
    IF=187
    IFF=188
    IFNONE=189
    IGNORE_BINS=190
    ILLEGAL_BINS=191
    IMPLEMENTS=192
    IMPLIES=193
    IMPORT=194
    INCLUDE=195
    INITIAL=196
    INOUT=197
    INPUT=198
    INSIDE=199
    INSTANCE=200
    INT=201
    INTEGER=202
    INTERCONNECT=203
    INTERFACE=204
    INTERSECT=205
    JOIN=206
    JOIN_ANY=207
    JOIN_NONE=208
    LARGE=209
    LET=210
    LIBLIST=211
    LIBRARY=212
    LOCAL=213
    LOCALPARAM=214
    LOGIC=215
    LONGINT=216
    MACROMODULE=217
    MATCHES=218
    MEDIUM=219
    MODPORT=220
    MODULE=221
    NAND=222
    NEGEDGE=223
    NETTYPE=224
    NEW=225
    NEXTTIME=226
    NMOS=227
    NOR=228
    NOSHOWCANCELLED=229
    NOT=230
    NOTIFZERO=231
    NOTIFONE=232
    NULL=233
    OPTIONDT=234
    OR=235
    OUTPUT=236
    PACKAGE=237
    PACKED=238
    PARAMETER=239
    PMOS=240
    POSEDGE=241
    PRIMITIVE=242
    PRIORITY=243
    PROGRAM=244
    PROPERTY=245
    PROTECTED=246
    PULLZERO=247
    PULLONE=248
    PULLDOWN=249
    PULLUP=250
    PULSESTYLE_ONDETECT=251
    PULSESTYLE_ONEVENT=252
    PURE=253
    RAND=254
    RANDC=255
    RANDCASE=256
    RANDOMIZE=257
    RANDSEQUENCE=258
    RCMOS=259
    REAL=260
    REALTIME=261
    REF=262
    REG=263
    REJECT_ON=264
    RELEASE=265
    REPEAT=266
    RESTRICT=267
    RETURN=268
    RNMOS=269
    RPMOS=270
    RTRAN=271
    RTRANIFZERO=272
    RTRANIFONE=273
    S_ALWAYS=274
    S_EVENTUALLY=275
    S_NEXTTIME=276
    S_UNTIL=277
    S_UNTIL_WITH=278
    SAMPLE=279
    SCALARED=280
    SEQUENCE=281
    SHORTINT=282
    SHORTREAL=283
    SHOWCANCELLED=284
    SIGNED=285
    SMALL=286
    SOFT=287
    SOLVE=288
    SPECIFY=289
    SPECPARAM=290
    STATIC=291
    STD=292
    STRING=293
    STRONG=294
    STRONGZERO=295
    STRONGONE=296
    STRUCT=297
    SUPER=298
    SUPPLYZERO=299
    SUPPLYONE=300
    SYNC_ACCEPT_ON=301
    SYNC_REJECT_ON=302
    TABLE=303
    TAGGED=304
    TASK=305
    THIS=306
    THROUGHOUT=307
    TIME=308
    TIMEPRECISION=309
    TIMEUNIT=310
    TRAN=311
    TRANIFZERO=312
    TRANIFONE=313
    TRI=314
    TRIZERO=315
    TRIONE=316
    TRIAND=317
    TRIOR=318
    TRIREG=319
    TYPE=320
    TYPE_OPTIONDT=321
    TYPEDEF=322
    UNION=323
    UNIQUE=324
    UNIQUEZERO=325
    UNSIGNED=326
    UNTIL=327
    UNTIL_WITH=328
    UNTYPED=329
    USE=330
    UWIRE=331
    VAR=332
    VECTORED=333
    VIRTUAL=334
    VOID=335
    WAIT=336
    WAIT_ORDER=337
    WAND=338
    WEAK=339
    WEAKZERO=340
    WEAKONE=341
    WHILE=342
    WILDCARD=343
    WIRE=344
    WITH=345
    WITHIN=346
    WOR=347
    XNOR=348
    XOR=349
    LC=350
    VL=351
    VLMIGT=352
    VLEQ=353
    VLEQGT=354
    VLVL=355
    RC=356
    TI=357
    TIAM=358
    TICA=359
    TIVL=360
    TIME_LITERAL=361
    DECIMAL_NUMBER=362
    BINARY_NUMBER=363
    OCTAL_NUMBER=364
    HEX_NUMBER=365
    REAL_NUMBER=366
    UNBASED_UNSIZED_LITERAL=367
    STRING_LITERAL=368
    COMMENT=369
    ESCAPED_IDENTIFIER=370
    SIMPLE_IDENTIFIER=371
    SYSTEM_TF_IDENTIFIER=372
    WHITE_SPACE=373
    FILE_PATH_SPEC=374
    FINISH_NUMBER=375
    INIT_VAL=376
    OUTPUT_SYMBOL=377
    LEVEL_SYMBOL=378
    EDGE_SYMBOL=379
    EDGE_DESCRIPTOR=380
    SCALAR_CONSTANT=381
    FILE_DIRECTIVE=382
    LINE_DIRECTIVE_=383
    BEGIN_KEYWORDS_DIRECTIVE=384
    CELLDEFINE_DIRECTIVE=385
    DEFAULT_NETTYPE_DIRECTIVE=386
    DEFINE_DIRECTIVE=387
    ELSE_DIRECTIVE=388
    ELSIF_DIRECTIVE=389
    END_KEYWORDS_DIRECTIVE=390
    ENDCELLDEFINE_DIRECTIVE=391
    ENDIF_DIRECTIVE=392
    IFDEF_DIRECTIVE=393
    IFNDEF_DIRECTIVE=394
    INCLUDE_DIRECTIVE=395
    LINE_DIRECTIVE=396
    NOUNCONNECTED_DRIVE_DIRECTIVE=397
    PRAGMA_DIRECTIVE=398
    RESETALL_DIRECTIVE=399
    TIMESCALE_DIRECTIVE=400
    UNCONNECTED_DRIVE_DIRECTIVE=401
    UNDEF_DIRECTIVE=402
    UNDEFINEALL_DIRECTIVE=403
    MACRO_USAGE=404
    DIRECTIVE_TEXT=405
    DIRECTIVE_IDENTIFIER=406
    DIRECTIVE_COMMENT=407
    DIRECTIVE_WHITE_SPACE=408
    DIRECTIVE_NEWLINE=409
    MACRO_TEXT=410
    MT_ESC_NEWLINE=411
    SOURCE_TEXT=412

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class Source_textContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def compiler_directive(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SystemVerilogPreParser.Compiler_directiveContext)
            else:
                return self.getTypedRuleContext(SystemVerilogPreParser.Compiler_directiveContext,i)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_source_text

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSource_text" ):
                listener.enterSource_text(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSource_text" ):
                listener.exitSource_text(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSource_text" ):
                return visitor.visitSource_text(self)
            else:
                return visitor.visitChildren(self)




    def source_text(self):

        localctx = SystemVerilogPreParser.Source_textContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_source_text)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==SystemVerilogPreParser.GA:
                self.state = 62
                self.compiler_directive()
                self.state = 67
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Compiler_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def file_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.File_directiveContext,0)


        def line_directive_(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Line_directive_Context,0)


        def begin_keywords_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Begin_keywords_directiveContext,0)


        def celldefine_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Celldefine_directiveContext,0)


        def default_nettype_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Default_nettype_directiveContext,0)


        def endcelldefine_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Endcelldefine_directiveContext,0)


        def end_keywords_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.End_keywords_directiveContext,0)


        def ifdef_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Ifdef_directiveContext,0)


        def ifndef_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Ifndef_directiveContext,0)


        def include_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Include_directiveContext,0)


        def line_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Line_directiveContext,0)


        def nounconnected_drive_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Nounconnected_drive_directiveContext,0)


        def pragma_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Pragma_directiveContext,0)


        def resetall_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Resetall_directiveContext,0)


        def text_macro_definition(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Text_macro_definitionContext,0)


        def text_macro_usage(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Text_macro_usageContext,0)


        def timescale_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Timescale_directiveContext,0)


        def unconnected_drive_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Unconnected_drive_directiveContext,0)


        def undef_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Undef_directiveContext,0)


        def undefineall_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Undefineall_directiveContext,0)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_compiler_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCompiler_directive" ):
                listener.enterCompiler_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCompiler_directive" ):
                listener.exitCompiler_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCompiler_directive" ):
                return visitor.visitCompiler_directive(self)
            else:
                return visitor.visitChildren(self)




    def compiler_directive(self):

        localctx = SystemVerilogPreParser.Compiler_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_compiler_directive)
        try:
            self.state = 88
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 68
                self.file_directive()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 69
                self.line_directive_()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 70
                self.begin_keywords_directive()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 71
                self.celldefine_directive()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 72
                self.default_nettype_directive()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 73
                self.endcelldefine_directive()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 74
                self.end_keywords_directive()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 75
                self.ifdef_directive()
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 76
                self.ifndef_directive()
                pass

            elif la_ == 10:
                self.enterOuterAlt(localctx, 10)
                self.state = 77
                self.include_directive()
                pass

            elif la_ == 11:
                self.enterOuterAlt(localctx, 11)
                self.state = 78
                self.line_directive()
                pass

            elif la_ == 12:
                self.enterOuterAlt(localctx, 12)
                self.state = 79
                self.nounconnected_drive_directive()
                pass

            elif la_ == 13:
                self.enterOuterAlt(localctx, 13)
                self.state = 80
                self.pragma_directive()
                pass

            elif la_ == 14:
                self.enterOuterAlt(localctx, 14)
                self.state = 81
                self.resetall_directive()
                pass

            elif la_ == 15:
                self.enterOuterAlt(localctx, 15)
                self.state = 82
                self.text_macro_definition()
                pass

            elif la_ == 16:
                self.enterOuterAlt(localctx, 16)
                self.state = 83
                self.text_macro_usage()
                pass

            elif la_ == 17:
                self.enterOuterAlt(localctx, 17)
                self.state = 84
                self.timescale_directive()
                pass

            elif la_ == 18:
                self.enterOuterAlt(localctx, 18)
                self.state = 85
                self.unconnected_drive_directive()
                pass

            elif la_ == 19:
                self.enterOuterAlt(localctx, 19)
                self.state = 86
                self.undef_directive()
                pass

            elif la_ == 20:
                self.enterOuterAlt(localctx, 20)
                self.state = 87
                self.undefineall_directive()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class File_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def FILE_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.FILE_DIRECTIVE, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_file_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFile_directive" ):
                listener.enterFile_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFile_directive" ):
                listener.exitFile_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFile_directive" ):
                return visitor.visitFile_directive(self)
            else:
                return visitor.visitChildren(self)




    def file_directive(self):

        localctx = SystemVerilogPreParser.File_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_file_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.match(SystemVerilogPreParser.GA)
            self.state = 91
            self.match(SystemVerilogPreParser.FILE_DIRECTIVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Line_directive_Context(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def LINE_DIRECTIVE_(self):
            return self.getToken(SystemVerilogPreParser.LINE_DIRECTIVE_, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_line_directive_

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLine_directive_" ):
                listener.enterLine_directive_(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLine_directive_" ):
                listener.exitLine_directive_(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLine_directive_" ):
                return visitor.visitLine_directive_(self)
            else:
                return visitor.visitChildren(self)




    def line_directive_(self):

        localctx = SystemVerilogPreParser.Line_directive_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_line_directive_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 93
            self.match(SystemVerilogPreParser.GA)
            self.state = 94
            self.match(SystemVerilogPreParser.LINE_DIRECTIVE_)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Begin_keywords_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def BEGIN_KEYWORDS_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.BEGIN_KEYWORDS_DIRECTIVE, 0)

        def DIRECTIVE_TEXT(self):
            return self.getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_begin_keywords_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBegin_keywords_directive" ):
                listener.enterBegin_keywords_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBegin_keywords_directive" ):
                listener.exitBegin_keywords_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBegin_keywords_directive" ):
                return visitor.visitBegin_keywords_directive(self)
            else:
                return visitor.visitChildren(self)




    def begin_keywords_directive(self):

        localctx = SystemVerilogPreParser.Begin_keywords_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_begin_keywords_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 96
            self.match(SystemVerilogPreParser.GA)
            self.state = 97
            self.match(SystemVerilogPreParser.BEGIN_KEYWORDS_DIRECTIVE)
            self.state = 98
            self.match(SystemVerilogPreParser.DIRECTIVE_TEXT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Celldefine_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def CELLDEFINE_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.CELLDEFINE_DIRECTIVE, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_celldefine_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCelldefine_directive" ):
                listener.enterCelldefine_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCelldefine_directive" ):
                listener.exitCelldefine_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCelldefine_directive" ):
                return visitor.visitCelldefine_directive(self)
            else:
                return visitor.visitChildren(self)




    def celldefine_directive(self):

        localctx = SystemVerilogPreParser.Celldefine_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_celldefine_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 100
            self.match(SystemVerilogPreParser.GA)
            self.state = 101
            self.match(SystemVerilogPreParser.CELLDEFINE_DIRECTIVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Default_nettype_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def DEFAULT_NETTYPE_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.DEFAULT_NETTYPE_DIRECTIVE, 0)

        def DIRECTIVE_TEXT(self):
            return self.getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_default_nettype_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDefault_nettype_directive" ):
                listener.enterDefault_nettype_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDefault_nettype_directive" ):
                listener.exitDefault_nettype_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDefault_nettype_directive" ):
                return visitor.visitDefault_nettype_directive(self)
            else:
                return visitor.visitChildren(self)




    def default_nettype_directive(self):

        localctx = SystemVerilogPreParser.Default_nettype_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_default_nettype_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 103
            self.match(SystemVerilogPreParser.GA)
            self.state = 104
            self.match(SystemVerilogPreParser.DEFAULT_NETTYPE_DIRECTIVE)
            self.state = 105
            self.match(SystemVerilogPreParser.DIRECTIVE_TEXT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Endcelldefine_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def ENDCELLDEFINE_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.ENDCELLDEFINE_DIRECTIVE, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_endcelldefine_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEndcelldefine_directive" ):
                listener.enterEndcelldefine_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEndcelldefine_directive" ):
                listener.exitEndcelldefine_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEndcelldefine_directive" ):
                return visitor.visitEndcelldefine_directive(self)
            else:
                return visitor.visitChildren(self)




    def endcelldefine_directive(self):

        localctx = SystemVerilogPreParser.Endcelldefine_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_endcelldefine_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 107
            self.match(SystemVerilogPreParser.GA)
            self.state = 108
            self.match(SystemVerilogPreParser.ENDCELLDEFINE_DIRECTIVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class End_keywords_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def END_KEYWORDS_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.END_KEYWORDS_DIRECTIVE, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_end_keywords_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEnd_keywords_directive" ):
                listener.enterEnd_keywords_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEnd_keywords_directive" ):
                listener.exitEnd_keywords_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEnd_keywords_directive" ):
                return visitor.visitEnd_keywords_directive(self)
            else:
                return visitor.visitChildren(self)




    def end_keywords_directive(self):

        localctx = SystemVerilogPreParser.End_keywords_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_end_keywords_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 110
            self.match(SystemVerilogPreParser.GA)
            self.state = 111
            self.match(SystemVerilogPreParser.END_KEYWORDS_DIRECTIVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Ifdef_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def IFDEF_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.IFDEF_DIRECTIVE, 0)

        def text_macro_identifier(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Text_macro_identifierContext,0)


        def ifdef_group_of_lines(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Ifdef_group_of_linesContext,0)


        def endif_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Endif_directiveContext,0)


        def elsif_directive(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SystemVerilogPreParser.Elsif_directiveContext)
            else:
                return self.getTypedRuleContext(SystemVerilogPreParser.Elsif_directiveContext,i)


        def else_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Else_directiveContext,0)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_ifdef_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfdef_directive" ):
                listener.enterIfdef_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfdef_directive" ):
                listener.exitIfdef_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfdef_directive" ):
                return visitor.visitIfdef_directive(self)
            else:
                return visitor.visitChildren(self)




    def ifdef_directive(self):

        localctx = SystemVerilogPreParser.Ifdef_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_ifdef_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 113
            self.match(SystemVerilogPreParser.GA)
            self.state = 114
            self.match(SystemVerilogPreParser.IFDEF_DIRECTIVE)
            self.state = 115
            self.text_macro_identifier()
            self.state = 116
            self.ifdef_group_of_lines()
            self.state = 120
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 117
                    self.elsif_directive() 
                self.state = 122
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

            self.state = 124
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.state = 123
                self.else_directive()


            self.state = 126
            self.endif_directive()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Ifndef_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def IFNDEF_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.IFNDEF_DIRECTIVE, 0)

        def text_macro_identifier(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Text_macro_identifierContext,0)


        def ifndef_group_of_lines(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Ifndef_group_of_linesContext,0)


        def endif_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Endif_directiveContext,0)


        def elsif_directive(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SystemVerilogPreParser.Elsif_directiveContext)
            else:
                return self.getTypedRuleContext(SystemVerilogPreParser.Elsif_directiveContext,i)


        def else_directive(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Else_directiveContext,0)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_ifndef_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfndef_directive" ):
                listener.enterIfndef_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfndef_directive" ):
                listener.exitIfndef_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfndef_directive" ):
                return visitor.visitIfndef_directive(self)
            else:
                return visitor.visitChildren(self)




    def ifndef_directive(self):

        localctx = SystemVerilogPreParser.Ifndef_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_ifndef_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 128
            self.match(SystemVerilogPreParser.GA)
            self.state = 129
            self.match(SystemVerilogPreParser.IFNDEF_DIRECTIVE)
            self.state = 130
            self.text_macro_identifier()
            self.state = 131
            self.ifndef_group_of_lines()
            self.state = 135
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,4,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 132
                    self.elsif_directive() 
                self.state = 137
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

            self.state = 139
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.state = 138
                self.else_directive()


            self.state = 141
            self.endif_directive()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Include_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def INCLUDE_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.INCLUDE_DIRECTIVE, 0)

        def DIRECTIVE_TEXT(self):
            return self.getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_include_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInclude_directive" ):
                listener.enterInclude_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInclude_directive" ):
                listener.exitInclude_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInclude_directive" ):
                return visitor.visitInclude_directive(self)
            else:
                return visitor.visitChildren(self)




    def include_directive(self):

        localctx = SystemVerilogPreParser.Include_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_include_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 143
            self.match(SystemVerilogPreParser.GA)
            self.state = 144
            self.match(SystemVerilogPreParser.INCLUDE_DIRECTIVE)
            self.state = 145
            self.match(SystemVerilogPreParser.DIRECTIVE_TEXT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Line_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def LINE_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.LINE_DIRECTIVE, 0)

        def DIRECTIVE_TEXT(self):
            return self.getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_line_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLine_directive" ):
                listener.enterLine_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLine_directive" ):
                listener.exitLine_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLine_directive" ):
                return visitor.visitLine_directive(self)
            else:
                return visitor.visitChildren(self)




    def line_directive(self):

        localctx = SystemVerilogPreParser.Line_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_line_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 147
            self.match(SystemVerilogPreParser.GA)
            self.state = 148
            self.match(SystemVerilogPreParser.LINE_DIRECTIVE)
            self.state = 149
            self.match(SystemVerilogPreParser.DIRECTIVE_TEXT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Nounconnected_drive_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def NOUNCONNECTED_DRIVE_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.NOUNCONNECTED_DRIVE_DIRECTIVE, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_nounconnected_drive_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNounconnected_drive_directive" ):
                listener.enterNounconnected_drive_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNounconnected_drive_directive" ):
                listener.exitNounconnected_drive_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNounconnected_drive_directive" ):
                return visitor.visitNounconnected_drive_directive(self)
            else:
                return visitor.visitChildren(self)




    def nounconnected_drive_directive(self):

        localctx = SystemVerilogPreParser.Nounconnected_drive_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_nounconnected_drive_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 151
            self.match(SystemVerilogPreParser.GA)
            self.state = 152
            self.match(SystemVerilogPreParser.NOUNCONNECTED_DRIVE_DIRECTIVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Pragma_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def PRAGMA_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.PRAGMA_DIRECTIVE, 0)

        def DIRECTIVE_TEXT(self):
            return self.getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_pragma_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPragma_directive" ):
                listener.enterPragma_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPragma_directive" ):
                listener.exitPragma_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPragma_directive" ):
                return visitor.visitPragma_directive(self)
            else:
                return visitor.visitChildren(self)




    def pragma_directive(self):

        localctx = SystemVerilogPreParser.Pragma_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_pragma_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 154
            self.match(SystemVerilogPreParser.GA)
            self.state = 155
            self.match(SystemVerilogPreParser.PRAGMA_DIRECTIVE)
            self.state = 156
            self.match(SystemVerilogPreParser.DIRECTIVE_TEXT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Resetall_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def RESETALL_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.RESETALL_DIRECTIVE, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_resetall_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterResetall_directive" ):
                listener.enterResetall_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitResetall_directive" ):
                listener.exitResetall_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitResetall_directive" ):
                return visitor.visitResetall_directive(self)
            else:
                return visitor.visitChildren(self)




    def resetall_directive(self):

        localctx = SystemVerilogPreParser.Resetall_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_resetall_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 158
            self.match(SystemVerilogPreParser.GA)
            self.state = 159
            self.match(SystemVerilogPreParser.RESETALL_DIRECTIVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Text_macro_definitionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def DEFINE_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.DEFINE_DIRECTIVE, 0)

        def text_macro_identifier(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Text_macro_identifierContext,0)


        def macro_text(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Macro_textContext,0)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_text_macro_definition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterText_macro_definition" ):
                listener.enterText_macro_definition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitText_macro_definition" ):
                listener.exitText_macro_definition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitText_macro_definition" ):
                return visitor.visitText_macro_definition(self)
            else:
                return visitor.visitChildren(self)




    def text_macro_definition(self):

        localctx = SystemVerilogPreParser.Text_macro_definitionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_text_macro_definition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 161
            self.match(SystemVerilogPreParser.GA)
            self.state = 162
            self.match(SystemVerilogPreParser.DEFINE_DIRECTIVE)
            self.state = 163
            self.text_macro_identifier()
            self.state = 164
            self.macro_text()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Text_macro_usageContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def MACRO_USAGE(self):
            return self.getToken(SystemVerilogPreParser.MACRO_USAGE, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_text_macro_usage

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterText_macro_usage" ):
                listener.enterText_macro_usage(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitText_macro_usage" ):
                listener.exitText_macro_usage(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitText_macro_usage" ):
                return visitor.visitText_macro_usage(self)
            else:
                return visitor.visitChildren(self)




    def text_macro_usage(self):

        localctx = SystemVerilogPreParser.Text_macro_usageContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_text_macro_usage)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 166
            self.match(SystemVerilogPreParser.GA)
            self.state = 167
            self.match(SystemVerilogPreParser.MACRO_USAGE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Timescale_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def TIMESCALE_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.TIMESCALE_DIRECTIVE, 0)

        def DIRECTIVE_TEXT(self):
            return self.getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_timescale_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTimescale_directive" ):
                listener.enterTimescale_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTimescale_directive" ):
                listener.exitTimescale_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTimescale_directive" ):
                return visitor.visitTimescale_directive(self)
            else:
                return visitor.visitChildren(self)




    def timescale_directive(self):

        localctx = SystemVerilogPreParser.Timescale_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_timescale_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 169
            self.match(SystemVerilogPreParser.GA)
            self.state = 170
            self.match(SystemVerilogPreParser.TIMESCALE_DIRECTIVE)
            self.state = 171
            self.match(SystemVerilogPreParser.DIRECTIVE_TEXT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Unconnected_drive_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def UNCONNECTED_DRIVE_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.UNCONNECTED_DRIVE_DIRECTIVE, 0)

        def DIRECTIVE_TEXT(self):
            return self.getToken(SystemVerilogPreParser.DIRECTIVE_TEXT, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_unconnected_drive_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterUnconnected_drive_directive" ):
                listener.enterUnconnected_drive_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitUnconnected_drive_directive" ):
                listener.exitUnconnected_drive_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUnconnected_drive_directive" ):
                return visitor.visitUnconnected_drive_directive(self)
            else:
                return visitor.visitChildren(self)




    def unconnected_drive_directive(self):

        localctx = SystemVerilogPreParser.Unconnected_drive_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_unconnected_drive_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 173
            self.match(SystemVerilogPreParser.GA)
            self.state = 174
            self.match(SystemVerilogPreParser.UNCONNECTED_DRIVE_DIRECTIVE)
            self.state = 175
            self.match(SystemVerilogPreParser.DIRECTIVE_TEXT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Undef_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def UNDEF_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.UNDEF_DIRECTIVE, 0)

        def text_macro_identifier(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Text_macro_identifierContext,0)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_undef_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterUndef_directive" ):
                listener.enterUndef_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitUndef_directive" ):
                listener.exitUndef_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUndef_directive" ):
                return visitor.visitUndef_directive(self)
            else:
                return visitor.visitChildren(self)




    def undef_directive(self):

        localctx = SystemVerilogPreParser.Undef_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_undef_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 177
            self.match(SystemVerilogPreParser.GA)
            self.state = 178
            self.match(SystemVerilogPreParser.UNDEF_DIRECTIVE)
            self.state = 179
            self.text_macro_identifier()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Undefineall_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def UNDEFINEALL_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.UNDEFINEALL_DIRECTIVE, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_undefineall_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterUndefineall_directive" ):
                listener.enterUndefineall_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitUndefineall_directive" ):
                listener.exitUndefineall_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUndefineall_directive" ):
                return visitor.visitUndefineall_directive(self)
            else:
                return visitor.visitChildren(self)




    def undefineall_directive(self):

        localctx = SystemVerilogPreParser.Undefineall_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_undefineall_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 181
            self.match(SystemVerilogPreParser.GA)
            self.state = 182
            self.match(SystemVerilogPreParser.UNDEFINEALL_DIRECTIVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Elsif_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def ELSIF_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.ELSIF_DIRECTIVE, 0)

        def text_macro_identifier(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Text_macro_identifierContext,0)


        def elsif_group_of_lines(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Elsif_group_of_linesContext,0)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_elsif_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElsif_directive" ):
                listener.enterElsif_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElsif_directive" ):
                listener.exitElsif_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElsif_directive" ):
                return visitor.visitElsif_directive(self)
            else:
                return visitor.visitChildren(self)




    def elsif_directive(self):

        localctx = SystemVerilogPreParser.Elsif_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_elsif_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 184
            self.match(SystemVerilogPreParser.GA)
            self.state = 185
            self.match(SystemVerilogPreParser.ELSIF_DIRECTIVE)
            self.state = 186
            self.text_macro_identifier()
            self.state = 187
            self.elsif_group_of_lines()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Else_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def ELSE_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.ELSE_DIRECTIVE, 0)

        def else_group_of_lines(self):
            return self.getTypedRuleContext(SystemVerilogPreParser.Else_group_of_linesContext,0)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_else_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElse_directive" ):
                listener.enterElse_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElse_directive" ):
                listener.exitElse_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElse_directive" ):
                return visitor.visitElse_directive(self)
            else:
                return visitor.visitChildren(self)




    def else_directive(self):

        localctx = SystemVerilogPreParser.Else_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_else_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 189
            self.match(SystemVerilogPreParser.GA)
            self.state = 190
            self.match(SystemVerilogPreParser.ELSE_DIRECTIVE)
            self.state = 191
            self.else_group_of_lines()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Endif_directiveContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GA(self):
            return self.getToken(SystemVerilogPreParser.GA, 0)

        def ENDIF_DIRECTIVE(self):
            return self.getToken(SystemVerilogPreParser.ENDIF_DIRECTIVE, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_endif_directive

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEndif_directive" ):
                listener.enterEndif_directive(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEndif_directive" ):
                listener.exitEndif_directive(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEndif_directive" ):
                return visitor.visitEndif_directive(self)
            else:
                return visitor.visitChildren(self)




    def endif_directive(self):

        localctx = SystemVerilogPreParser.Endif_directiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_endif_directive)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 193
            self.match(SystemVerilogPreParser.GA)
            self.state = 194
            self.match(SystemVerilogPreParser.ENDIF_DIRECTIVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Text_macro_identifierContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DIRECTIVE_IDENTIFIER(self):
            return self.getToken(SystemVerilogPreParser.DIRECTIVE_IDENTIFIER, 0)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_text_macro_identifier

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterText_macro_identifier" ):
                listener.enterText_macro_identifier(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitText_macro_identifier" ):
                listener.exitText_macro_identifier(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitText_macro_identifier" ):
                return visitor.visitText_macro_identifier(self)
            else:
                return visitor.visitChildren(self)




    def text_macro_identifier(self):

        localctx = SystemVerilogPreParser.Text_macro_identifierContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_text_macro_identifier)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 196
            self.match(SystemVerilogPreParser.DIRECTIVE_IDENTIFIER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Ifdef_group_of_linesContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SOURCE_TEXT(self, i:int=None):
            if i is None:
                return self.getTokens(SystemVerilogPreParser.SOURCE_TEXT)
            else:
                return self.getToken(SystemVerilogPreParser.SOURCE_TEXT, i)

        def compiler_directive(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SystemVerilogPreParser.Compiler_directiveContext)
            else:
                return self.getTypedRuleContext(SystemVerilogPreParser.Compiler_directiveContext,i)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_ifdef_group_of_lines

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfdef_group_of_lines" ):
                listener.enterIfdef_group_of_lines(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfdef_group_of_lines" ):
                listener.exitIfdef_group_of_lines(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfdef_group_of_lines" ):
                return visitor.visitIfdef_group_of_lines(self)
            else:
                return visitor.visitChildren(self)




    def ifdef_group_of_lines(self):

        localctx = SystemVerilogPreParser.Ifdef_group_of_linesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_ifdef_group_of_lines)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 202
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,7,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 200
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [SystemVerilogPreParser.SOURCE_TEXT]:
                        self.state = 198
                        self.match(SystemVerilogPreParser.SOURCE_TEXT)
                        pass
                    elif token in [SystemVerilogPreParser.GA]:
                        self.state = 199
                        self.compiler_directive()
                        pass
                    else:
                        raise NoViableAltException(self)
             
                self.state = 204
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,7,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Ifndef_group_of_linesContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SOURCE_TEXT(self, i:int=None):
            if i is None:
                return self.getTokens(SystemVerilogPreParser.SOURCE_TEXT)
            else:
                return self.getToken(SystemVerilogPreParser.SOURCE_TEXT, i)

        def compiler_directive(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SystemVerilogPreParser.Compiler_directiveContext)
            else:
                return self.getTypedRuleContext(SystemVerilogPreParser.Compiler_directiveContext,i)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_ifndef_group_of_lines

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfndef_group_of_lines" ):
                listener.enterIfndef_group_of_lines(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfndef_group_of_lines" ):
                listener.exitIfndef_group_of_lines(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfndef_group_of_lines" ):
                return visitor.visitIfndef_group_of_lines(self)
            else:
                return visitor.visitChildren(self)




    def ifndef_group_of_lines(self):

        localctx = SystemVerilogPreParser.Ifndef_group_of_linesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_ifndef_group_of_lines)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 209
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,9,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 207
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [SystemVerilogPreParser.SOURCE_TEXT]:
                        self.state = 205
                        self.match(SystemVerilogPreParser.SOURCE_TEXT)
                        pass
                    elif token in [SystemVerilogPreParser.GA]:
                        self.state = 206
                        self.compiler_directive()
                        pass
                    else:
                        raise NoViableAltException(self)
             
                self.state = 211
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,9,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Elsif_group_of_linesContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SOURCE_TEXT(self, i:int=None):
            if i is None:
                return self.getTokens(SystemVerilogPreParser.SOURCE_TEXT)
            else:
                return self.getToken(SystemVerilogPreParser.SOURCE_TEXT, i)

        def compiler_directive(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SystemVerilogPreParser.Compiler_directiveContext)
            else:
                return self.getTypedRuleContext(SystemVerilogPreParser.Compiler_directiveContext,i)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_elsif_group_of_lines

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElsif_group_of_lines" ):
                listener.enterElsif_group_of_lines(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElsif_group_of_lines" ):
                listener.exitElsif_group_of_lines(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElsif_group_of_lines" ):
                return visitor.visitElsif_group_of_lines(self)
            else:
                return visitor.visitChildren(self)




    def elsif_group_of_lines(self):

        localctx = SystemVerilogPreParser.Elsif_group_of_linesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_elsif_group_of_lines)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 216
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,11,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 214
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [SystemVerilogPreParser.SOURCE_TEXT]:
                        self.state = 212
                        self.match(SystemVerilogPreParser.SOURCE_TEXT)
                        pass
                    elif token in [SystemVerilogPreParser.GA]:
                        self.state = 213
                        self.compiler_directive()
                        pass
                    else:
                        raise NoViableAltException(self)
             
                self.state = 218
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,11,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Else_group_of_linesContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SOURCE_TEXT(self, i:int=None):
            if i is None:
                return self.getTokens(SystemVerilogPreParser.SOURCE_TEXT)
            else:
                return self.getToken(SystemVerilogPreParser.SOURCE_TEXT, i)

        def compiler_directive(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SystemVerilogPreParser.Compiler_directiveContext)
            else:
                return self.getTypedRuleContext(SystemVerilogPreParser.Compiler_directiveContext,i)


        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_else_group_of_lines

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElse_group_of_lines" ):
                listener.enterElse_group_of_lines(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElse_group_of_lines" ):
                listener.exitElse_group_of_lines(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElse_group_of_lines" ):
                return visitor.visitElse_group_of_lines(self)
            else:
                return visitor.visitChildren(self)




    def else_group_of_lines(self):

        localctx = SystemVerilogPreParser.Else_group_of_linesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_else_group_of_lines)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 223
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,13,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 221
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [SystemVerilogPreParser.SOURCE_TEXT]:
                        self.state = 219
                        self.match(SystemVerilogPreParser.SOURCE_TEXT)
                        pass
                    elif token in [SystemVerilogPreParser.GA]:
                        self.state = 220
                        self.compiler_directive()
                        pass
                    else:
                        raise NoViableAltException(self)
             
                self.state = 225
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,13,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Macro_textContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MACRO_TEXT(self, i:int=None):
            if i is None:
                return self.getTokens(SystemVerilogPreParser.MACRO_TEXT)
            else:
                return self.getToken(SystemVerilogPreParser.MACRO_TEXT, i)

        def getRuleIndex(self):
            return SystemVerilogPreParser.RULE_macro_text

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMacro_text" ):
                listener.enterMacro_text(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMacro_text" ):
                listener.exitMacro_text(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMacro_text" ):
                return visitor.visitMacro_text(self)
            else:
                return visitor.visitChildren(self)




    def macro_text(self):

        localctx = SystemVerilogPreParser.Macro_textContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_macro_text)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 229
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==SystemVerilogPreParser.MACRO_TEXT:
                self.state = 226
                self.match(SystemVerilogPreParser.MACRO_TEXT)
                self.state = 231
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





