// Output created by jacc on Tue May 19 11:19:57 MSK 2020


import java.io.*;
import java.util.List;
import com.ifmo.interpreter.*;

class Parser implements ParserTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    switch (yytok) {
                        case VAR:
                            yyn = 3;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 46:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 90;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    switch (yytok) {
                        case IF:
                            yyn = 7;
                            continue;
                        case NAME:
                            yyn = 8;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    switch (yytok) {
                        case NAME:
                            yyn = 10;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    switch (yytok) {
                        case ';':
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    switch (yytok) {
                        case ';':
                            yyn = 11;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    switch (yytok) {
                        case IF:
                            yyn = 7;
                            continue;
                        case NAME:
                            yyn = 8;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    switch (yytok) {
                        case NAME:
                            yyn = 14;
                            continue;
                        case NUMBER:
                            yyn = 15;
                            continue;
                        case '(':
                            yyn = 16;
                            continue;
                        case '-':
                            yyn = 17;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    switch (yytok) {
                        case ASSIGN:
                            yyn = 18;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    switch (yytok) {
                        case ';':
                            yyn = 19;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case ',':
                            yyn = 20;
                            continue;
                        case ';':
                            yyn = yyr20();
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    switch (yytok) {
                        case ENDINPUT:
                        case NAME:
                        case ';':
                        case IF:
                        case ELSE:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    switch (yytok) {
                        case ';':
                            yyn = 21;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    switch (yytok) {
                        case NAME:
                            yyn = 14;
                            continue;
                        case NUMBER:
                            yyn = 15;
                            continue;
                        case '(':
                            yyn = 16;
                            continue;
                        case '-':
                            yyn = 17;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    switch (yytok) {
                        case NAME:
                            yyn = 14;
                            continue;
                        case NUMBER:
                            yyn = 15;
                            continue;
                        case '(':
                            yyn = 16;
                            continue;
                        case '-':
                            yyn = 17;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    switch (yytok) {
                        case NAME:
                            yyn = 14;
                            continue;
                        case NUMBER:
                            yyn = 15;
                            continue;
                        case '(':
                            yyn = 16;
                            continue;
                        case '-':
                            yyn = 17;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    switch (yytok) {
                        case NAME:
                        case IF:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    switch (yytok) {
                        case NAME:
                            yyn = 10;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    switch (yytok) {
                        case ENDINPUT:
                        case NAME:
                        case ';':
                        case IF:
                        case ELSE:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    switch (yytok) {
                        case NAME:
                            yyn = 14;
                            continue;
                        case NUMBER:
                            yyn = 15;
                            continue;
                        case '(':
                            yyn = 16;
                            continue;
                        case '-':
                            yyn = 17;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    switch (yytok) {
                        case IF:
                            yyn = 7;
                            continue;
                        case NAME:
                            yyn = 8;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case NAME:
                            yyn = 14;
                            continue;
                        case NUMBER:
                            yyn = 15;
                            continue;
                        case '(':
                            yyn = 16;
                            continue;
                        case '-':
                            yyn = 17;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    switch (yytok) {
                        case NAME:
                            yyn = 14;
                            continue;
                        case NUMBER:
                            yyn = 15;
                            continue;
                        case '(':
                            yyn = 16;
                            continue;
                        case '-':
                            yyn = 17;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    switch (yytok) {
                        case NAME:
                            yyn = 14;
                            continue;
                        case NUMBER:
                            yyn = 15;
                            continue;
                        case '(':
                            yyn = 16;
                            continue;
                        case '-':
                            yyn = 17;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    switch (yytok) {
                        case NAME:
                            yyn = 14;
                            continue;
                        case NUMBER:
                            yyn = 15;
                            continue;
                        case '(':
                            yyn = 16;
                            continue;
                        case '-':
                            yyn = 17;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    switch (yytok) {
                        case NAME:
                            yyn = 14;
                            continue;
                        case NUMBER:
                            yyn = 15;
                            continue;
                        case '(':
                            yyn = 16;
                            continue;
                        case '-':
                            yyn = 17;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    switch (yytok) {
                        case NAME:
                            yyn = 14;
                            continue;
                        case NUMBER:
                            yyn = 15;
                            continue;
                        case '(':
                            yyn = 16;
                            continue;
                        case '-':
                            yyn = 17;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 76:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    switch (yytok) {
                        case ';':
                            yyn = yyr21();
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    switch (yytok) {
                        case IF:
                            yyn = 7;
                            continue;
                        case NAME:
                            yyn = 8;
                            continue;
                        case ELSE:
                            yyn = 43;
                            continue;
                        case ';':
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    switch (yytok) {
                        case IF:
                            yyn = 7;
                            continue;
                        case NAME:
                            yyn = 8;
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    switch (yytok) {
                        case IF:
                            yyn = 7;
                            continue;
                        case NAME:
                            yyn = 8;
                            continue;
                        case ';':
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 93;
                    continue;

                case 90:
                    return true;
                case 91:
                    yyerror("stack overflow");
                case 92:
                    return false;
                case 93:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys13() {
        switch (yytok) {
            case EQUALS:
                return 22;
            case THEN:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case '-':
                return 26;
            case '/':
                return 27;
            case '<':
                return 28;
            case '>':
                return 29;
        }
        return 93;
    }

    private int yys14() {
        switch (yytok) {
            case '+':
            case THEN:
            case '*':
            case ')':
            case EQUALS:
            case '>':
            case '<':
            case ';':
            case '/':
            case '-':
                return yyr19();
        }
        return 93;
    }

    private int yys15() {
        switch (yytok) {
            case '+':
            case THEN:
            case '*':
            case ')':
            case EQUALS:
            case '>':
            case '<':
            case ';':
            case '/':
            case '-':
                return yyr18();
        }
        return 93;
    }

    private int yys30() {
        switch (yytok) {
            case EQUALS:
                return 22;
            case '*':
                return 24;
            case '+':
                return 25;
            case '-':
                return 26;
            case '/':
                return 27;
            case '<':
                return 28;
            case '>':
                return 29;
            case ')':
                return 42;
        }
        return 93;
    }

    private int yys31() {
        switch (yytok) {
            case '+':
            case THEN:
            case '*':
            case ')':
            case EQUALS:
            case '>':
            case '<':
            case ';':
            case '/':
            case '-':
                return yyr17();
        }
        return 93;
    }

    private int yys32() {
        switch (yytok) {
            case EQUALS:
                return 22;
            case '*':
                return 24;
            case '+':
                return 25;
            case '-':
                return 26;
            case '/':
                return 27;
            case '<':
                return 28;
            case '>':
                return 29;
            case ';':
                return yyr8();
        }
        return 93;
    }

    private int yys34() {
        switch (yytok) {
            case '*':
                return 24;
            case '+':
                return 25;
            case '-':
                return 26;
            case '/':
                return 27;
            case '<':
                return 28;
            case '>':
                return 29;
            case THEN:
            case ')':
            case EQUALS:
            case ';':
                return yyr11();
        }
        return 93;
    }

    private int yys36() {
        switch (yytok) {
            case '+':
            case THEN:
            case '*':
            case ')':
            case EQUALS:
            case '>':
            case '<':
            case ';':
            case '/':
            case '-':
                return yyr14();
        }
        return 93;
    }

    private int yys37() {
        switch (yytok) {
            case '*':
                return 24;
            case '/':
                return 27;
            case '+':
            case THEN:
            case ')':
            case EQUALS:
            case '>':
            case '<':
            case ';':
            case '-':
                return yyr12();
        }
        return 93;
    }

    private int yys38() {
        switch (yytok) {
            case '*':
                return 24;
            case '/':
                return 27;
            case '+':
            case THEN:
            case ')':
            case EQUALS:
            case '>':
            case '<':
            case ';':
            case '-':
                return yyr13();
        }
        return 93;
    }

    private int yys39() {
        switch (yytok) {
            case '+':
            case THEN:
            case '*':
            case ')':
            case EQUALS:
            case '>':
            case '<':
            case ';':
            case '/':
            case '-':
                return yyr15();
        }
        return 93;
    }

    private int yys40() {
        switch (yytok) {
            case '*':
                return 24;
            case '+':
                return 25;
            case '-':
                return 26;
            case '/':
                return 27;
            case THEN:
            case ')':
            case EQUALS:
            case '>':
            case '<':
            case ';':
                return yyr10();
        }
        return 93;
    }

    private int yys41() {
        switch (yytok) {
            case '*':
                return 24;
            case '+':
                return 25;
            case '-':
                return 26;
            case '/':
                return 27;
            case THEN:
            case ')':
            case EQUALS:
            case '>':
            case '<':
            case ';':
                return yyr9();
        }
        return 93;
    }

    private int yys42() {
        switch (yytok) {
            case '+':
            case THEN:
            case '*':
            case ')':
            case EQUALS:
            case '>':
            case '<':
            case ';':
            case '/':
            case '-':
                return yyr16();
        }
        return 93;
    }

    private int yyr1() { // program : declarations statementList
        { yyrv = new Stmt.Block(((Stmt.Block)yysv[yysp-1]), ((Stmt)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return 1;
    }

    private int yyr2() { // declarations : VAR symlist ';'
        { yyrv = new Stmt.Var(((Expr.LiteralList)yysv[yysp-2]).list); }
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr9() { // expression : expression '>' expression
        { yyrv = new Expr.Binary(((Expr)yysv[yysp-3]), ">", ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr10() { // expression : expression '<' expression
        { yyrv = new Expr.Binary(((Expr)yysv[yysp-3]), "<", ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr11() { // expression : expression EQUALS expression
        { yyrv = new Expr.Binary(((Expr)yysv[yysp-3]), "==", ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr12() { // expression : expression '+' expression
        { yyrv = new Expr.Binary(((Expr)yysv[yysp-3]), "+", ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr13() { // expression : expression '-' expression
        { yyrv = new Expr.Binary(((Expr)yysv[yysp-3]), "-", ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr14() { // expression : expression '*' expression
        { yyrv = new Expr.Binary(((Expr)yysv[yysp-3]), "*", ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr15() { // expression : expression '/' expression
        { yyrv = new Expr.Binary(((Expr)yysv[yysp-3]), "/", ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr16() { // expression : '(' expression ')'
        { yyrv = new Expr.Grouping(((Expr)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return yypexpression();
    }

    private int yyr17() { // expression : '-' expression
        { yyrv = new Expr.Unary("-", ((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpression();
    }

    private int yyr18() { // expression : NUMBER
        { yyrv = new Expr.Literal(((Integer)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypexpression();
    }

    private int yyr19() { // expression : NAME
        { yyrv = new Expr.Literal(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 28: return 40;
            case 27: return 39;
            case 26: return 38;
            case 25: return 37;
            case 24: return 36;
            case 22: return 34;
            case 18: return 32;
            case 17: return 31;
            case 16: return 30;
            case 7: return 13;
            default: return 41;
        }
    }

    private int yyr8() { // assign : NAME ASSIGN expression
        { yyrv = new Expr.Assign(((String)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 4;
    }

    private int yyr5() { // statement : IF expression THEN statementList ELSE statementList
        { yyrv = new Stmt.If(((Expr)yysv[yysp-5]), ((Stmt.Block)yysv[yysp-3]), ((Stmt.Block)yysv[yysp-1])); }
        yysv[yysp-=6] = yyrv;
        return yypstatement();
    }

    private int yyr6() { // statement : IF expression THEN statementList
        { yyrv = new Stmt.If(((Expr)yysv[yysp-3]), ((Stmt.Block)yysv[yysp-1]), null); }
        yysv[yysp-=4] = yyrv;
        return yypstatement();
    }

    private int yyr7() { // statement : assign
        { yyrv = new Stmt.Expression(((Expr)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 43: return 5;
            case 23: return 5;
            case 2: return 5;
            default: return 12;
        }
    }

    private int yyr3() { // statementList : statement ';'
        { yyrv = new Stmt.Block(((Stmt)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypstatementList();
    }

    private int yyr4() { // statementList : statementList statement ';'
        { yyrv = new Stmt.Block(((Stmt.Block)yysv[yysp-3]), ((Stmt)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return yypstatementList();
    }

    private int yypstatementList() {
        switch (yyst[yysp-1]) {
            case 23: return 35;
            case 2: return 6;
            default: return 44;
        }
    }

    private int yyr20() { // symlist : NAME
        { yyrv = new Expr.LiteralList(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypsymlist();
    }

    private int yyr21() { // symlist : NAME ',' symlist
        { yyrv = new Expr.LiteralList(((String)yysv[yysp-3]), ((Expr.LiteralList)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypsymlist();
    }

    private int yypsymlist() {
        switch (yyst[yysp-1]) {
            case 3: return 9;
            default: return 33;
        }
    }

    protected String[] yyerrmsgs = {
    };


    private Lexer lexer;
    private AstPrettyPrinter ap;
    private boolean hasError;
    public Parser(Reader reader) {
        this.hasError = false;
        this.ap = new AstPrettyPrinter();
        this.lexer = new Lexer(reader);
    }
    public void yyerror(String error) {
        this.hasError = true;
        System.err.println("Error : " + error + " at line "
            + lexer.getLine() + " column: " + lexer.getColumn());
    }

    public static void main(String args[]) throws IOException {
        Parser parser;
        if (args.length > 0) {
          // parse a file
            parser = new Parser(new FileReader(args[0]));
        } else {
          // interactive mode
          System.out.println("[Quit with CTRL-D]");
          parser = new Parser(new InputStreamReader(System.in));
        }
        parser.lexer.nextToken();
        parser.parse();
        if (!parser.hasError) {
            System.out.println(parser.ap.print((Stmt)parser.yyrv));
        }
        System.out.println("Made by Karina@khs99");
    }

}
