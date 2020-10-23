package data;

import compute.Visitor;

public class BinaryOperator implements Expression {
	
	private OperatorKind kind;
	private Expression leftOperand;
	private Expression rightOperand;
	
	public BinaryOperator(OperatorKind kind, Expression leftOperand, Expression rightOperand) {
		super();
		this.kind = kind;
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}
	
	public OperatorKind getKind() {
		return kind;
	}

	public Expression getLeftOperand() {
		return leftOperand;
	}

	public Expression getRightOperand() {
		return rightOperand;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitOperator(this);
	}

}
