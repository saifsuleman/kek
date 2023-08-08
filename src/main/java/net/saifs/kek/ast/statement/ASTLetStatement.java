package net.saifs.kek.ast.statement;

import net.saifs.kek.ast.internal.IExpressionNode;
import net.saifs.kek.ast.internal.IStatementNode;
import net.saifs.kek.ast.internal.visitor.StatementVisitor;

public record ASTLetStatement(String identifier, IExpressionNode value) implements IStatementNode {
    @Override
    public <R> R accept(StatementVisitor<R> visitor) {
        return visitor.acceptLetStatement(this);
    }
}