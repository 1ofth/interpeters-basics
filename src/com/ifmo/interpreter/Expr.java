package com.ifmo.interpreter;

import java.util.ArrayList;
import java.util.List;

public abstract class Expr {
    interface Visitor<R> {
        R visitAssignExpr(Assign expr);
        R visitBinaryExpr(Binary expr);
        R visitGroupingExpr(Grouping expr);
        R visitLiteralExpr(Literal expr);
        R visitUnaryExpr(Unary expr);
        R visitLiteralListExpr(LiteralList expr);
    }

    public static class Assign extends Expr {
        public Assign(String name, Expr value) {
            this.name = name;
            this.value = value;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitAssignExpr(this);
        }

        final String name;
        final Expr value;
    }
    public static class Binary extends Expr {
        public Binary(Expr left, String operator, Expr right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitBinaryExpr(this);
        }

        final Expr left;
        final String operator;
        final Expr right;
    }

    public static class Grouping extends Expr {
        public Grouping(Expr expression) {
            this.expression = expression;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitGroupingExpr(this);
        }

        final Expr expression;
    }

    public static class Literal extends Expr {
        public Literal(Object value) {
            this.value = value;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitLiteralExpr(this);
        }

        final Object value;
    }

    @SuppressWarnings("unchecked")
    public static class LiteralList extends Expr {
        public LiteralList(Object value) {
            List temp = new ArrayList();
            temp.add(value);
            this.list = temp;
        }

        public LiteralList(Object value, LiteralList ll) {
            ll.list.add(value);
            this.list = ll.list;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitLiteralListExpr(this);
        }

        public final List list;
    }

    public static class Unary extends Expr {
        public Unary(String operator, Expr right) {
            this.operator = operator;
            this.right = right;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitUnaryExpr(this);
        }

        final String operator;
        final Expr right;
    }

    abstract <R> R accept(Visitor<R> visitor);
}
