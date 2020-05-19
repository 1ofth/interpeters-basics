package com.ifmo.interpreter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class AstPrettyPrinter implements Expr.Visitor<List<String>>, Stmt.Visitor<List<String>> {
    public String print(Stmt stmt) {
        StringBuilder sb = new StringBuilder();
        stmt.accept(this).forEach(s -> sb.append(s).append("\n"));
        return sb.toString();
    }

    @Override
    public List<String> visitAssignExpr(Expr.Assign expr) {
        List<String> ret = new ArrayList<>();
        ret.add(":=");
        ret.add("├── " + expr.name + " (id)");
        List<String> curr = expr.value.accept(this);
        ret.add("└── " + curr.get(0));
        for (int j = 1; j < curr.size(); j++) {
            ret.add("    " + curr.get(j));
        }
        return ret;
    }

    @Override
    public List<String> visitBinaryExpr(Expr.Binary expr) {
        return expand(expr.operator + " (binary)", expr.left, expr.right);
    }

    @Override
    public List<String> visitGroupingExpr(Expr.Grouping expr) {
        return expand(" ()", expr.expression);
    }

    @Override
    public List<String> visitLiteralExpr(Expr.Literal expr) {
        StringBuilder sb = new StringBuilder(expr.value.toString());
        if (expr.value instanceof Integer) {
            sb.append(" (const)");
        } else if (expr.value instanceof String) {
            sb.append(" (id)");
        }
        return Collections.singletonList(sb.toString());
    }

    @Override
    public List<String> visitUnaryExpr(Expr.Unary expr) {
        return expand(expr.operator + " (unary)", expr.right);
    }

    @Override
    public List<String> visitLiteralListExpr(Expr.LiteralList expr) {
        return new ArrayList<>();
    }

    @Override
    public List<String> visitBlockStmt(Stmt.Block stmt) {
        return expand(" (block)", IntStream.rangeClosed(1, stmt.statements.size())
                .mapToObj(i -> stmt.statements.get(stmt.statements.size() - i))
                .toArray());
    }

    @Override
    public List<String> visitExpressionStmt(Stmt.Expression stmt) {
        return stmt.expression.accept(this);
    }

    @Override
    public List<String> visitVarStmt(Stmt.Var stmt) {
        return expand("Var", stmt.names);
    }

    @Override
    public List<String> visitIfStmt(Stmt.If stmt) {
        List<String> ret = new ArrayList<>();
        ret.add("(IF)");

        List<String> curr = stmt.condition.accept(this);
        ret.add("├── (cond)" + curr.get(0));
        for (int j = 1; j < curr.size(); j++) {
            ret.add("│   " + curr.get(j));
        }

        curr = stmt.thenBranch.accept(this);
        ret.add("├── (THEN)" + curr.get(0));
        for (int j = 1; j < curr.size(); j++) {
            ret.add("│   " + curr.get(j));
        }
        if (stmt.elseBranch != null) {
            curr = stmt.elseBranch.accept(this);
            ret.add("└── (ELSE)" + curr.get(0));
            for (int j = 1; j < curr.size(); j++) {
                ret.add("    " + curr.get(j));
            }
        } else {
            ret.add("└── (ELSE) .");
        }
        return ret;
    }

    @SuppressWarnings("unchecked")
    private List<String> expand(String title, Object... nodes) {
        List<String> ret = new ArrayList<>();
        ret.add(title);

        List<String> curr;
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] instanceof Expr) {
                curr = ((Expr) nodes[i]).accept(this);
            } else if (nodes[i] instanceof Stmt) {
                curr = ((Stmt) nodes[i]).accept(this);
            } else if (nodes[i] instanceof String) {
                curr = Collections.singletonList(nodes[i].toString());
            } else if (nodes[i] instanceof List) {
                curr = ((List<String>) nodes[i]);
            } else {
                System.err.println(nodes[i].getClass());
                curr = Collections.singletonList(nodes[i].toString());
            }

            if (i != nodes.length - 1) {
                ret.add("├── " + curr.get(0));
                for (int j = 1; j < curr.size(); j++) {
                    ret.add("│   " + curr.get(j));
                }
            } else {
                ret.add("└── " + curr.get(0));
                for (int j = 1; j < curr.size(); j++) {
                    ret.add("    " + curr.get(j));
                }
            }
        }
        return ret;
    }
}
