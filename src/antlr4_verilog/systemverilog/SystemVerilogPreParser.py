# Generated from /home/mtdsousa/workspace/antlr4-verilog-python/extra/grammars-v4/verilog/systemverilog/SystemVerilogPreParser.g4 by ANTLR 4.10.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,408,233,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,
        7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,
        13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
        20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,
        26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,1,0,5,0,64,8,0,10,0,12,
        0,67,9,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,3,1,89,8,1,1,2,1,2,1,2,1,3,1,3,1,3,1,4,1,
        4,1,4,1,4,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,8,1,8,1,8,1,
        9,1,9,1,9,1,9,1,9,5,9,119,8,9,10,9,12,9,122,9,9,1,9,3,9,125,8,9,
        1,9,1,9,1,10,1,10,1,10,1,10,1,10,5,10,134,8,10,10,10,12,10,137,9,
        10,1,10,3,10,140,8,10,1,10,1,10,1,11,1,11,1,11,1,11,1,12,1,12,1,
        12,1,12,1,13,1,13,1,13,1,14,1,14,1,14,1,14,1,15,1,15,1,15,1,16,1,
        16,1,16,1,16,1,16,1,17,1,17,1,17,1,18,1,18,1,18,1,18,1,19,1,19,1,
        19,1,19,1,20,1,20,1,20,1,20,1,21,1,21,1,21,1,22,1,22,1,22,1,22,1,
        22,1,23,1,23,1,23,1,23,1,24,1,24,1,24,1,25,1,25,1,26,1,26,5,26,201,
        8,26,10,26,12,26,204,9,26,1,27,1,27,5,27,208,8,27,10,27,12,27,211,
        9,27,1,28,1,28,5,28,215,8,28,10,28,12,28,218,9,28,1,29,1,29,5,29,
        222,8,29,10,29,12,29,225,9,29,1,30,5,30,228,8,30,10,30,12,30,231,
        9,30,1,30,0,0,31,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,
        36,38,40,42,44,46,48,50,52,54,56,58,60,0,1,1,0,406,407,234,0,65,
        1,0,0,0,2,88,1,0,0,0,4,90,1,0,0,0,6,93,1,0,0,0,8,96,1,0,0,0,10,100,
        1,0,0,0,12,103,1,0,0,0,14,107,1,0,0,0,16,110,1,0,0,0,18,113,1,0,
        0,0,20,128,1,0,0,0,22,143,1,0,0,0,24,147,1,0,0,0,26,151,1,0,0,0,
        28,154,1,0,0,0,30,158,1,0,0,0,32,161,1,0,0,0,34,166,1,0,0,0,36,169,
        1,0,0,0,38,173,1,0,0,0,40,177,1,0,0,0,42,181,1,0,0,0,44,184,1,0,
        0,0,46,189,1,0,0,0,48,193,1,0,0,0,50,196,1,0,0,0,52,202,1,0,0,0,
        54,209,1,0,0,0,56,216,1,0,0,0,58,223,1,0,0,0,60,229,1,0,0,0,62,64,
        3,2,1,0,63,62,1,0,0,0,64,67,1,0,0,0,65,63,1,0,0,0,65,66,1,0,0,0,
        66,1,1,0,0,0,67,65,1,0,0,0,68,89,3,4,2,0,69,89,3,6,3,0,70,89,3,8,
        4,0,71,89,3,10,5,0,72,89,3,12,6,0,73,89,3,14,7,0,74,89,3,16,8,0,
        75,89,3,18,9,0,76,89,3,20,10,0,77,89,3,22,11,0,78,89,3,24,12,0,79,
        89,3,26,13,0,80,89,3,28,14,0,81,89,3,30,15,0,82,89,3,32,16,0,83,
        89,3,34,17,0,84,89,3,36,18,0,85,89,3,38,19,0,86,89,3,40,20,0,87,
        89,3,42,21,0,88,68,1,0,0,0,88,69,1,0,0,0,88,70,1,0,0,0,88,71,1,0,
        0,0,88,72,1,0,0,0,88,73,1,0,0,0,88,74,1,0,0,0,88,75,1,0,0,0,88,76,
        1,0,0,0,88,77,1,0,0,0,88,78,1,0,0,0,88,79,1,0,0,0,88,80,1,0,0,0,
        88,81,1,0,0,0,88,82,1,0,0,0,88,83,1,0,0,0,88,84,1,0,0,0,88,85,1,
        0,0,0,88,86,1,0,0,0,88,87,1,0,0,0,89,3,1,0,0,0,90,91,5,96,0,0,91,
        92,5,378,0,0,92,5,1,0,0,0,93,94,5,96,0,0,94,95,5,379,0,0,95,7,1,
        0,0,0,96,97,5,96,0,0,97,98,5,380,0,0,98,99,5,401,0,0,99,9,1,0,0,
        0,100,101,5,96,0,0,101,102,5,381,0,0,102,11,1,0,0,0,103,104,5,96,
        0,0,104,105,5,382,0,0,105,106,5,401,0,0,106,13,1,0,0,0,107,108,5,
        96,0,0,108,109,5,387,0,0,109,15,1,0,0,0,110,111,5,96,0,0,111,112,
        5,386,0,0,112,17,1,0,0,0,113,114,5,96,0,0,114,115,5,389,0,0,115,
        116,3,50,25,0,116,120,3,52,26,0,117,119,3,44,22,0,118,117,1,0,0,
        0,119,122,1,0,0,0,120,118,1,0,0,0,120,121,1,0,0,0,121,124,1,0,0,
        0,122,120,1,0,0,0,123,125,3,46,23,0,124,123,1,0,0,0,124,125,1,0,
        0,0,125,126,1,0,0,0,126,127,3,48,24,0,127,19,1,0,0,0,128,129,5,96,
        0,0,129,130,5,390,0,0,130,131,3,50,25,0,131,135,3,54,27,0,132,134,
        3,44,22,0,133,132,1,0,0,0,134,137,1,0,0,0,135,133,1,0,0,0,135,136,
        1,0,0,0,136,139,1,0,0,0,137,135,1,0,0,0,138,140,3,46,23,0,139,138,
        1,0,0,0,139,140,1,0,0,0,140,141,1,0,0,0,141,142,3,48,24,0,142,21,
        1,0,0,0,143,144,5,96,0,0,144,145,5,391,0,0,145,146,5,401,0,0,146,
        23,1,0,0,0,147,148,5,96,0,0,148,149,5,392,0,0,149,150,5,401,0,0,
        150,25,1,0,0,0,151,152,5,96,0,0,152,153,5,393,0,0,153,27,1,0,0,0,
        154,155,5,96,0,0,155,156,5,394,0,0,156,157,5,401,0,0,157,29,1,0,
        0,0,158,159,5,96,0,0,159,160,5,395,0,0,160,31,1,0,0,0,161,162,5,
        96,0,0,162,163,5,383,0,0,163,164,3,50,25,0,164,165,3,60,30,0,165,
        33,1,0,0,0,166,167,5,96,0,0,167,168,5,400,0,0,168,35,1,0,0,0,169,
        170,5,96,0,0,170,171,5,396,0,0,171,172,5,401,0,0,172,37,1,0,0,0,
        173,174,5,96,0,0,174,175,5,397,0,0,175,176,5,401,0,0,176,39,1,0,
        0,0,177,178,5,96,0,0,178,179,5,398,0,0,179,180,3,50,25,0,180,41,
        1,0,0,0,181,182,5,96,0,0,182,183,5,399,0,0,183,43,1,0,0,0,184,185,
        5,96,0,0,185,186,5,385,0,0,186,187,3,50,25,0,187,188,3,56,28,0,188,
        45,1,0,0,0,189,190,5,96,0,0,190,191,5,384,0,0,191,192,3,58,29,0,
        192,47,1,0,0,0,193,194,5,96,0,0,194,195,5,388,0,0,195,49,1,0,0,0,
        196,197,5,402,0,0,197,51,1,0,0,0,198,201,5,408,0,0,199,201,3,2,1,
        0,200,198,1,0,0,0,200,199,1,0,0,0,201,204,1,0,0,0,202,200,1,0,0,
        0,202,203,1,0,0,0,203,53,1,0,0,0,204,202,1,0,0,0,205,208,5,408,0,
        0,206,208,3,2,1,0,207,205,1,0,0,0,207,206,1,0,0,0,208,211,1,0,0,
        0,209,207,1,0,0,0,209,210,1,0,0,0,210,55,1,0,0,0,211,209,1,0,0,0,
        212,215,5,408,0,0,213,215,3,2,1,0,214,212,1,0,0,0,214,213,1,0,0,
        0,215,218,1,0,0,0,216,214,1,0,0,0,216,217,1,0,0,0,217,57,1,0,0,0,
        218,216,1,0,0,0,219,222,5,408,0,0,220,222,3,2,1,0,221,219,1,0,0,
        0,221,220,1,0,0,0,222,225,1,0,0,0,223,221,1,0,0,0,223,224,1,0,0,
        0,224,59,1,0,0,0,225,223,1,0,0,0,226,228,7,0,0,0,227,226,1,0,0,0,
        228,231,1,0,0,0,229,227,1,0,0,0,229,230,1,0,0,0,230,61,1,0,0,0,231,
        229,1,0,0,0,15,65,88,120,124,135,139,200,202,207,209,214,216,221,
        223,229
    ]

class SystemVerilogPreParser ( Parser ):

    grammarFileName = "SystemVerilogPreParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'!'", "'!='", "'!=='", "'!=?'", "'\"'", 
                     "'\"DPI\"'", "'\"DPI-C\"'", "'#'", "'##'", "'#-#'", 
                     "'#=#'", "'$'", "'$error'", "'$fatal'", "'$fullskew'", 
                     "'$hold'", "'$info'", "'$nochange'", "'$period'", "'$recovery'", 
                     "'$recrem'", "'$removal'", "'$root.'", "'$setup'", 
                     "'$setuphold'", "'$skew'", "'$timeskew'", "'$unit'", 
                     "'$warning'", "'$width'", "'%'", "'%='", "'&'", "'&&'", 
                     "'&&&'", "'&='", "'''", "'('", "')'", "'*'", "'**'", 
                     "'*/'", "'*::*'", "'*='", "'*>'", "'+'", "'++'", "'+:'", 
                     "'+='", "','", "'-'", "'--'", "'-:'", "'-='", "'->'", 
                     "'->>'", "'.'", "'.*'", "'/'", "'/*'", "'//'", "'/='", 
                     "'1step'", "':'", "':/'", "'::'", "':='", "';'", "'<'", 
                     "'<->'", "'<<'", "'<<<'", "'<<<='", "'<<='", "'<='", 
                     "'='", "'=='", "'==='", "'==?'", "'=>'", "'>'", "'>='", 
                     "'>>'", "'>>='", "'>>>'", "'>>>='", "'?'", "'@'", "'@@'", 
                     "'PATHPULSE$'", "'['", "']'", "'^'", "'^='", "'^~'", 
                     "<INVALID>", "'accept_on'", "'alias'", "'always'", 
                     "'always_comb'", "'always_ff'", "'always_latch'", "'and'", 
                     "'assert'", "'assign'", "'assume'", "'automatic'", 
                     "'before'", "'begin'", "'bind'", "'bins'", "'binsof'", 
                     "'bit'", "'break'", "'buf'", "'bufif0'", "'bufif1'", 
                     "'byte'", "'case'", "'casex'", "'casez'", "'cell'", 
                     "'chandle'", "'checker'", "'class'", "'clocking'", 
                     "'cmos'", "'config'", "'const'", "'constraint'", "'context'", 
                     "'continue'", "'cover'", "'covergroup'", "'coverpoint'", 
                     "'cross'", "'deassign'", "'default'", "'defparam'", 
                     "'design'", "'disable'", "'dist'", "'do'", "'edge'", 
                     "'else'", "'end'", "'endcase'", "'endchecker'", "'endclass'", 
                     "'endclocking'", "'endconfig'", "'endfunction'", "'endgenerate'", 
                     "'endgroup'", "'endinterface'", "'endmodule'", "'endpackage'", 
                     "'endprimitive'", "'endprogram'", "'endproperty'", 
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
                     "<INVALID>", "'-incdir'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'__FILE__'", "'__LINE__'", 
                     "<INVALID>", "'celldefine'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'end_keywords'", "'endcelldefine'", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'nounconnected_drive'", "<INVALID>", 
                     "'resetall'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'undefineall'" ]

    symbolicNames = [ "<INVALID>", "EM", "EMEQ", "EMEQEQ", "EMEQQM", "DQ", 
                      "DQDPIDQ", "DQDPIMICDQ", "HA", "HAHA", "HAMIHA", "HAEQHA", 
                      "DL", "DLERROR", "DLFATAL", "DLFULLSKEW", "DLHOLD", 
                      "DLINFO", "DLNOCHANGE", "DLPERIOD", "DLRECOVERY", 
                      "DLRECREM", "DLREMOVAL", "DLROOTDT", "DLSETUP", "DLSETUPHOLD", 
                      "DLSKEW", "DLTIMESKEW", "DLUNIT", "DLWARNING", "DLWIDTH", 
                      "MO", "MOEQ", "AM", "AMAM", "AMAMAM", "AMEQ", "AP", 
                      "LP", "RP", "AS", "ASAS", "ASSL", "ASCLCLAS", "ASEQ", 
                      "ASGT", "PL", "PLPL", "PLCL", "PLEQ", "CO", "MI", 
                      "MIMI", "MICL", "MIEQ", "MIGT", "MIGTGT", "DT", "DTAS", 
                      "SL", "SLAS", "SLSL", "SLEQ", "ONESTEP", "CL", "CLSL", 
                      "CLCL", "CLEQ", "SC", "LT", "LTMIGT", "LTLT", "LTLTLT", 
                      "LTLTLTEQ", "LTLTEQ", "LTEQ", "EQ", "EQEQ", "EQEQEQ", 
                      "EQEQQM", "EQGT", "GT", "GTEQ", "GTGT", "GTGTEQ", 
                      "GTGTGT", "GTGTGTEQ", "QM", "AT", "ATAT", "PATHPULSEDL", 
                      "LB", "RB", "CA", "CAEQ", "CATI", "GA", "ACCEPT_ON", 
                      "ALIAS", "ALWAYS", "ALWAYS_COMB", "ALWAYS_FF", "ALWAYS_LATCH", 
                      "AND", "ASSERT", "ASSIGN", "ASSUME", "AUTOMATIC", 
                      "BEFORE", "BEGIN", "BIND", "BINS", "BINSOF", "BIT", 
                      "BREAK", "BUF", "BUFIFZERO", "BUFIFONE", "BYTE", "CASE", 
                      "CASEX", "CASEZ", "CELL", "CHANDLE", "CHECKER", "CLASS", 
                      "CLOCKING", "CMOS", "CONFIG", "CONST", "CONSTRAINT", 
                      "CONTEXT", "CONTINUE", "COVER", "COVERGROUP", "COVERPOINT", 
                      "CROSS", "DEASSIGN", "DEFAULT", "DEFPARAM", "DESIGN", 
                      "DISABLE", "DIST", "DO", "EDGE", "ELSE", "END", "ENDCASE", 
                      "ENDCHECKER", "ENDCLASS", "ENDCLOCKING", "ENDCONFIG", 
                      "ENDFUNCTION", "ENDGENERATE", "ENDGROUP", "ENDINTERFACE", 
                      "ENDMODULE", "ENDPACKAGE", "ENDPRIMITIVE", "ENDPROGRAM", 
                      "ENDPROPERTY", "ENDSEQUENCE", "ENDSPECIFY", "ENDTABLE", 
                      "ENDTASK", "ENUM", "EVENT", "EXPECT", "EXPORT", "EXTENDS", 
                      "EXTERN", "FINAL", "FIRST_MATCH", "FOR", "FORCE", 
                      "FOREACH", "FOREVER", "FORK", "FORKJOIN", "FUNCTION", 
                      "GENERATE", "GENVAR", "GLOBAL", "HIGHZZERO", "HIGHZONE", 
                      "IF", "IFF", "IFNONE", "IGNORE_BINS", "ILLEGAL_BINS", 
                      "IMPLEMENTS", "IMPLIES", "IMPORT", "INCLUDE", "INITIAL", 
                      "INOUT", "INPUT", "INSIDE", "INSTANCE", "INT", "INTEGER", 
                      "INTERCONNECT", "INTERFACE", "INTERSECT", "JOIN", 
                      "JOIN_ANY", "JOIN_NONE", "LARGE", "LET", "LIBLIST", 
                      "LIBRARY", "LOCAL", "LOCALPARAM", "LOGIC", "LONGINT", 
                      "MACROMODULE", "MATCHES", "MEDIUM", "MODPORT", "MODULE", 
                      "NAND", "NEGEDGE", "NETTYPE", "NEW", "NEXTTIME", "NMOS", 
                      "NOR", "NOSHOWCANCELLED", "NOT", "NOTIFZERO", "NOTIFONE", 
                      "NULL", "OPTIONDT", "OR", "OUTPUT", "PACKAGE", "PACKED", 
                      "PARAMETER", "PMOS", "POSEDGE", "PRIMITIVE", "PRIORITY", 
                      "PROGRAM", "PROPERTY", "PROTECTED", "PULLZERO", "PULLONE", 
                      "PULLDOWN", "PULLUP", "PULSESTYLE_ONDETECT", "PULSESTYLE_ONEVENT", 
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
                      "ZERO_OR_ONE_Z_OR_X", "MIINCDIR", "FILE_PATH_SPEC", 
                      "OUTPUT_OR_LEVEL_SYMBOL", "LEVEL_ONLY_SYMBOL", "EDGE_SYMBOL", 
                      "FILE_DIRECTIVE", "LINE_DIRECTIVE_", "BEGIN_KEYWORDS_DIRECTIVE", 
                      "CELLDEFINE_DIRECTIVE", "DEFAULT_NETTYPE_DIRECTIVE", 
                      "DEFINE_DIRECTIVE", "ELSE_DIRECTIVE", "ELSIF_DIRECTIVE", 
                      "END_KEYWORDS_DIRECTIVE", "ENDCELLDEFINE_DIRECTIVE", 
                      "ENDIF_DIRECTIVE", "IFDEF_DIRECTIVE", "IFNDEF_DIRECTIVE", 
                      "INCLUDE_DIRECTIVE", "LINE_DIRECTIVE", "NOUNCONNECTED_DRIVE_DIRECTIVE", 
                      "PRAGMA_DIRECTIVE", "RESETALL_DIRECTIVE", "TIMESCALE_DIRECTIVE", 
                      "UNCONNECTED_DRIVE_DIRECTIVE", "UNDEF_DIRECTIVE", 
                      "UNDEFINEALL_DIRECTIVE", "MACRO_USAGE", "DIRECTIVE_TEXT", 
                      "DIRECTIVE_IDENTIFIER", "DIRECTIVE_COMMENT", "DIRECTIVE_WHITE_SPACE", 
                      "DIRECTIVE_NEWLINE", "MACRO_TEXT", "MACRO_ESC_NEWLINE", 
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
    HAEQHA=11
    DL=12
    DLERROR=13
    DLFATAL=14
    DLFULLSKEW=15
    DLHOLD=16
    DLINFO=17
    DLNOCHANGE=18
    DLPERIOD=19
    DLRECOVERY=20
    DLRECREM=21
    DLREMOVAL=22
    DLROOTDT=23
    DLSETUP=24
    DLSETUPHOLD=25
    DLSKEW=26
    DLTIMESKEW=27
    DLUNIT=28
    DLWARNING=29
    DLWIDTH=30
    MO=31
    MOEQ=32
    AM=33
    AMAM=34
    AMAMAM=35
    AMEQ=36
    AP=37
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
    DT=57
    DTAS=58
    SL=59
    SLAS=60
    SLSL=61
    SLEQ=62
    ONESTEP=63
    CL=64
    CLSL=65
    CLCL=66
    CLEQ=67
    SC=68
    LT=69
    LTMIGT=70
    LTLT=71
    LTLTLT=72
    LTLTLTEQ=73
    LTLTEQ=74
    LTEQ=75
    EQ=76
    EQEQ=77
    EQEQEQ=78
    EQEQQM=79
    EQGT=80
    GT=81
    GTEQ=82
    GTGT=83
    GTGTEQ=84
    GTGTGT=85
    GTGTGTEQ=86
    QM=87
    AT=88
    ATAT=89
    PATHPULSEDL=90
    LB=91
    RB=92
    CA=93
    CAEQ=94
    CATI=95
    GA=96
    ACCEPT_ON=97
    ALIAS=98
    ALWAYS=99
    ALWAYS_COMB=100
    ALWAYS_FF=101
    ALWAYS_LATCH=102
    AND=103
    ASSERT=104
    ASSIGN=105
    ASSUME=106
    AUTOMATIC=107
    BEFORE=108
    BEGIN=109
    BIND=110
    BINS=111
    BINSOF=112
    BIT=113
    BREAK=114
    BUF=115
    BUFIFZERO=116
    BUFIFONE=117
    BYTE=118
    CASE=119
    CASEX=120
    CASEZ=121
    CELL=122
    CHANDLE=123
    CHECKER=124
    CLASS=125
    CLOCKING=126
    CMOS=127
    CONFIG=128
    CONST=129
    CONSTRAINT=130
    CONTEXT=131
    CONTINUE=132
    COVER=133
    COVERGROUP=134
    COVERPOINT=135
    CROSS=136
    DEASSIGN=137
    DEFAULT=138
    DEFPARAM=139
    DESIGN=140
    DISABLE=141
    DIST=142
    DO=143
    EDGE=144
    ELSE=145
    END=146
    ENDCASE=147
    ENDCHECKER=148
    ENDCLASS=149
    ENDCLOCKING=150
    ENDCONFIG=151
    ENDFUNCTION=152
    ENDGENERATE=153
    ENDGROUP=154
    ENDINTERFACE=155
    ENDMODULE=156
    ENDPACKAGE=157
    ENDPRIMITIVE=158
    ENDPROGRAM=159
    ENDPROPERTY=160
    ENDSEQUENCE=161
    ENDSPECIFY=162
    ENDTABLE=163
    ENDTASK=164
    ENUM=165
    EVENT=166
    EXPECT=167
    EXPORT=168
    EXTENDS=169
    EXTERN=170
    FINAL=171
    FIRST_MATCH=172
    FOR=173
    FORCE=174
    FOREACH=175
    FOREVER=176
    FORK=177
    FORKJOIN=178
    FUNCTION=179
    GENERATE=180
    GENVAR=181
    GLOBAL=182
    HIGHZZERO=183
    HIGHZONE=184
    IF=185
    IFF=186
    IFNONE=187
    IGNORE_BINS=188
    ILLEGAL_BINS=189
    IMPLEMENTS=190
    IMPLIES=191
    IMPORT=192
    INCLUDE=193
    INITIAL=194
    INOUT=195
    INPUT=196
    INSIDE=197
    INSTANCE=198
    INT=199
    INTEGER=200
    INTERCONNECT=201
    INTERFACE=202
    INTERSECT=203
    JOIN=204
    JOIN_ANY=205
    JOIN_NONE=206
    LARGE=207
    LET=208
    LIBLIST=209
    LIBRARY=210
    LOCAL=211
    LOCALPARAM=212
    LOGIC=213
    LONGINT=214
    MACROMODULE=215
    MATCHES=216
    MEDIUM=217
    MODPORT=218
    MODULE=219
    NAND=220
    NEGEDGE=221
    NETTYPE=222
    NEW=223
    NEXTTIME=224
    NMOS=225
    NOR=226
    NOSHOWCANCELLED=227
    NOT=228
    NOTIFZERO=229
    NOTIFONE=230
    NULL=231
    OPTIONDT=232
    OR=233
    OUTPUT=234
    PACKAGE=235
    PACKED=236
    PARAMETER=237
    PMOS=238
    POSEDGE=239
    PRIMITIVE=240
    PRIORITY=241
    PROGRAM=242
    PROPERTY=243
    PROTECTED=244
    PULLZERO=245
    PULLONE=246
    PULLDOWN=247
    PULLUP=248
    PULSESTYLE_ONDETECT=249
    PULSESTYLE_ONEVENT=250
    PURE=251
    RAND=252
    RANDC=253
    RANDCASE=254
    RANDOMIZE=255
    RANDSEQUENCE=256
    RCMOS=257
    REAL=258
    REALTIME=259
    REF=260
    REG=261
    REJECT_ON=262
    RELEASE=263
    REPEAT=264
    RESTRICT=265
    RETURN=266
    RNMOS=267
    RPMOS=268
    RTRAN=269
    RTRANIFZERO=270
    RTRANIFONE=271
    S_ALWAYS=272
    S_EVENTUALLY=273
    S_NEXTTIME=274
    S_UNTIL=275
    S_UNTIL_WITH=276
    SAMPLE=277
    SCALARED=278
    SEQUENCE=279
    SHORTINT=280
    SHORTREAL=281
    SHOWCANCELLED=282
    SIGNED=283
    SMALL=284
    SOFT=285
    SOLVE=286
    SPECIFY=287
    SPECPARAM=288
    STATIC=289
    STD=290
    STRING=291
    STRONG=292
    STRONGZERO=293
    STRONGONE=294
    STRUCT=295
    SUPER=296
    SUPPLYZERO=297
    SUPPLYONE=298
    SYNC_ACCEPT_ON=299
    SYNC_REJECT_ON=300
    TABLE=301
    TAGGED=302
    TASK=303
    THIS=304
    THROUGHOUT=305
    TIME=306
    TIMEPRECISION=307
    TIMEUNIT=308
    TRAN=309
    TRANIFZERO=310
    TRANIFONE=311
    TRI=312
    TRIZERO=313
    TRIONE=314
    TRIAND=315
    TRIOR=316
    TRIREG=317
    TYPE=318
    TYPE_OPTIONDT=319
    TYPEDEF=320
    UNION=321
    UNIQUE=322
    UNIQUEZERO=323
    UNSIGNED=324
    UNTIL=325
    UNTIL_WITH=326
    UNTYPED=327
    USE=328
    UWIRE=329
    VAR=330
    VECTORED=331
    VIRTUAL=332
    VOID=333
    WAIT=334
    WAIT_ORDER=335
    WAND=336
    WEAK=337
    WEAKZERO=338
    WEAKONE=339
    WHILE=340
    WILDCARD=341
    WIRE=342
    WITH=343
    WITHIN=344
    WOR=345
    XNOR=346
    XOR=347
    LC=348
    VL=349
    VLMIGT=350
    VLEQ=351
    VLEQGT=352
    VLVL=353
    RC=354
    TI=355
    TIAM=356
    TICA=357
    TIVL=358
    TIME_LITERAL=359
    DECIMAL_NUMBER=360
    BINARY_NUMBER=361
    OCTAL_NUMBER=362
    HEX_NUMBER=363
    REAL_NUMBER=364
    UNBASED_UNSIZED_LITERAL=365
    STRING_LITERAL=366
    COMMENT=367
    ESCAPED_IDENTIFIER=368
    SIMPLE_IDENTIFIER=369
    SYSTEM_TF_IDENTIFIER=370
    WHITE_SPACE=371
    ZERO_OR_ONE_Z_OR_X=372
    MIINCDIR=373
    FILE_PATH_SPEC=374
    OUTPUT_OR_LEVEL_SYMBOL=375
    LEVEL_ONLY_SYMBOL=376
    EDGE_SYMBOL=377
    FILE_DIRECTIVE=378
    LINE_DIRECTIVE_=379
    BEGIN_KEYWORDS_DIRECTIVE=380
    CELLDEFINE_DIRECTIVE=381
    DEFAULT_NETTYPE_DIRECTIVE=382
    DEFINE_DIRECTIVE=383
    ELSE_DIRECTIVE=384
    ELSIF_DIRECTIVE=385
    END_KEYWORDS_DIRECTIVE=386
    ENDCELLDEFINE_DIRECTIVE=387
    ENDIF_DIRECTIVE=388
    IFDEF_DIRECTIVE=389
    IFNDEF_DIRECTIVE=390
    INCLUDE_DIRECTIVE=391
    LINE_DIRECTIVE=392
    NOUNCONNECTED_DRIVE_DIRECTIVE=393
    PRAGMA_DIRECTIVE=394
    RESETALL_DIRECTIVE=395
    TIMESCALE_DIRECTIVE=396
    UNCONNECTED_DRIVE_DIRECTIVE=397
    UNDEF_DIRECTIVE=398
    UNDEFINEALL_DIRECTIVE=399
    MACRO_USAGE=400
    DIRECTIVE_TEXT=401
    DIRECTIVE_IDENTIFIER=402
    DIRECTIVE_COMMENT=403
    DIRECTIVE_WHITE_SPACE=404
    DIRECTIVE_NEWLINE=405
    MACRO_TEXT=406
    MACRO_ESC_NEWLINE=407
    SOURCE_TEXT=408

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class Source_textContext(ParserRuleContext):
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

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
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MACRO_TEXT(self, i:int=None):
            if i is None:
                return self.getTokens(SystemVerilogPreParser.MACRO_TEXT)
            else:
                return self.getToken(SystemVerilogPreParser.MACRO_TEXT, i)

        def MACRO_ESC_NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(SystemVerilogPreParser.MACRO_ESC_NEWLINE)
            else:
                return self.getToken(SystemVerilogPreParser.MACRO_ESC_NEWLINE, i)

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
            while _la==SystemVerilogPreParser.MACRO_TEXT or _la==SystemVerilogPreParser.MACRO_ESC_NEWLINE:
                self.state = 226
                _la = self._input.LA(1)
                if not(_la==SystemVerilogPreParser.MACRO_TEXT or _la==SystemVerilogPreParser.MACRO_ESC_NEWLINE):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
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





