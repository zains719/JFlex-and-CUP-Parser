import java_cup.runtime.*;

%%
%class Lexer
%unicode
%cup
%line
%column
%states IN_COMMENT
%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

/* Your code goes here */
/* Your code goes here */
/* Your code goes here */

Whitespace = \r|\n|\r\n|" "|"\t"
Comment = {MultiLineComment} | {SingleLineComment}
MultiLineComment = "/#" [^#/]* "#/"
SingleLineComment = "#"[^\r\n]*[\r\n(\r\n)]?

Letter = [a-zA-Z]
Digit = [0-9]
IdChar = {Letter} | {Digit} | "_"
Punct = [!\"#\$%&\'()\*\+\,\-\.\/:;<=>\?@\[\]\\\^_`{}\~]

Identifier = {Letter}{IdChar}*
Boolean = T | F
Integer = (0|[1-9]{Digit}*)
Rational = (({Integer}"_")?{Integer}"/")?{Integer}
Float = {Integer}(\.{Digit}*)? 
Character = '[{Letter}{Punct}{Digit}]'

%state STRING

%%
<YYINITIAL> {

  /* types */
  "bool"        { return symbol(sym.BOOL);       } 
  "int"         { return symbol(sym.INT);        }
  "rat"         { return symbol(sym.RAT);        }
  "float"       { return symbol(sym.FLOAT);      }
  "char"        { return symbol(sym.CHAR);       }
  "str"         { return symbol(sym.STR);        }
  "top"         { return symbol(sym.TOP);        }
  "seq"         { return symbol(sym.SEQ);        }
  "dict"        { return symbol(sym.DICT);       }

  /* built in function names */
  "main"        { return symbol(sym.MAIN);       }
  "tdef"        { return symbol(sym.TDEF);       }
  "fdef"        { return symbol(sym.FDEF);       } 
  "len"         { return symbol(sym.LENGTH);     }
  "?"           { return symbol(sym.QUESTION);   }
  "for"         { return symbol(sym.FOR);        }
  "of"          { return symbol(sym.OF);         }
  "range"       { return symbol(sym.RANGE);      }
  "alias"       { return symbol(sym.ALIAS);      }
  "read"        { return symbol(sym.READ);       }
  "thread"      { return symbol(sym.THREAD);     }
  "wait"        { return symbol(sym.WAIT);       }
  "print"       { return symbol(sym.PRINT);      }
  "return"      { return symbol(sym.RETURN);     }

/* case statements */
  "if"          { return symbol(sym.IF);         }
  "elif"        { return symbol(sym.ELIF);       }
  "else"        { return symbol(sym.ELSE);       }
  "while"       { return symbol(sym.WHILE);      }
  "break"       { return symbol(sym.BREAK);      }

  /* operators */
  ":="          { return symbol(sym.EQUAL);      }
  "+"           { return symbol(sym.PLUS);       }
  "-"           { return symbol(sym.MINUS);      }
  "*"           { return symbol(sym.MULT);       }
  "/"           { return symbol(sym.DIV);        }
  "^"           { return symbol(sym.POW);        }

  "<="          { return symbol(sym.LTEQ);       }
  "!="          { return symbol(sym.NOTEQ);      }
  "<"           { return symbol(sym.LT);         }
  ">"           { return symbol(sym.GT);         }
  "!"           { return symbol(sym.NOT);        }
  "="           { return symbol(sym.EQUALTO);    }
  "&&"          { return symbol(sym.AND);        }
  "||"          { return symbol(sym.OR);         }

  "("           { return symbol(sym.LPAREN);     }
  ")"           { return symbol(sym.RPAREN);     }
  "["           { return symbol(sym.LSQB);       }
  "]"           { return symbol(sym.RSQB);       }
  "{"           { return symbol(sym.LBRACE);     }
  "}"           { return symbol(sym.RBRACE);     }
  ":"           { return symbol(sym.COLON);      }
  ";"           { return symbol(sym.SEMI);       }
  ","           { return symbol(sym.COMMA);      }
  "."           { return symbol(sym.DOT);        }
  \"            { string.setLength(0); yybegin(STRING);  }

  /* datatypes */
  {Boolean}     { return symbol(sym.BOOLEAN);                       }
  {Integer}     { return symbol(sym.INTEGER);                       }
  {Rational}    { return symbol(sym.RATIONAL);                      }
  {Float}       { return symbol(sym.FLOATING);                      }  
  {Character}   { return symbol(sym.CHARACTER);                     }
  {Identifier}  { return symbol(sym.IDENTIFIER);                    }

  /* comments */
  {Whitespace}     { /* do nothing */            }

  /* whitespace */
  {Comment}        { /* do nothing */            }
}

 <STRING> {
  \"                             { yybegin(YYINITIAL);                        
                                  return symbol(sym.STRING_LITERAL,
                                  string.toString());   }
  [^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }
  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}

/* error fallback */
[^]  {
    System.out.println("Error in line "
        + (yyline+1) +": Invalid input '" + yytext()+"'");
    return symbol(sym.ILLEGAL_CHARACTER);
}
