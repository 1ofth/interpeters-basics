import java.io.*;
import com.ifmo.interpreter.*;
%%

%class Lexer
%implements ParserTokens

%int
%char
%line
%column
%{
    private int token;
    private Object semantic;
    public int getLine() {
      return yyline;
    }

    public int getColumn() {
      return yycolumn;
    }
    public int getToken(){
        return token;
    }

    public Object getSemantic(){
        return semantic;
    }

    public int nextToken() {
        try{
            token = yylex();
        }
        catch (java.io.IOException e){
            System.out.println(
                "IO exception occured:\n" + e);
        }
        return token;
    }

%}


%%

/* operators */
"+" |
"-" |
"*" |
"/" |
"," |
";" |
"(" |
")" |
">" |
"<" { return (int) yycharat(0); }

":="    { return ASSIGN; }
"=="    { return EQUALS;}
/* int */
[0-9]+  { semantic = Integer.parseInt(yytext());
         return NUMBER;}

"IF"    { return IF; }
"THEN"  { return THEN; }
"ELSE"  { return ELSE; }
"Var"   { return VAR; }

/* symbols */
[a-z]+  { semantic = yytext();
         return NAME; }

/* whitespace */
[ \n\r\t]+ {}

/* ignore comment */
"//"[^\n]* {}

\b     { System.err.println("Sorry, backspace doesn't work"); }
<<EOF>> {return ENDINPUT;}
/* error fallback */
[^]    { System.err.println("Scanner error: unexpected character '" +yytext() + "' at line "
            + yyline + " column: " + yycolumn);return -2; }