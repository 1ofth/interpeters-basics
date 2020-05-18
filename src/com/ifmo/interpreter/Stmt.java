package com.ifmo.interpreter;

import java.util.ArrayList;
import java.util.List;

public abstract class Stmt {
    interface Visitor<R> {
        R visitBlockStmt(Block stmt);
        R visitExpressionStmt(Expression stmt);
        R visitVarStmt(Var stmt);
        R visitIfStmt(If stmt);
    }

    public static class Block extends Stmt {
        public Block(Block block, Stmt stmt) {
            block.statements.add(stmt);
            this.statements = block.statements;
        }

        public Block(Stmt stmt) {
            List<Stmt> temp = new ArrayList<>();
            temp.add(stmt);
            this.statements = temp;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitBlockStmt(this);
        }

        final List<Stmt> statements;
    }

    public static class Expression extends Stmt {
        public Expression(Expr expression) {
            this.expression = expression;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitExpressionStmt(this);
        }

        final Expr expression;
    }

    public static class Var extends Stmt {
        public Var(List names) {
            this.names = names;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitVarStmt(this);
        }

        final List names;
    }

    public static class If extends Stmt {
        public If(Expr condition, Stmt thenBranch, Stmt elseBranch) {
            this.condition = condition;
            this.thenBranch = thenBranch;
            this.elseBranch = elseBranch;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitIfStmt(this);
        }

        final Expr condition;
        final Stmt thenBranch;
        final Stmt elseBranch;
    }

    abstract <R> R accept(Visitor<R> visitor);
}
