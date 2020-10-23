package compute;

import data.BinaryOperator;
import data.Constant;
import data.OperatorKind;
import data.Variable;

public class ReversePolishDisplayVisitor
		implements Visitor
{

	@Override
	public void visitOperator(BinaryOperator operator) {
		operator.getLeftOperand().accept(this);
		System.out.print(" ");
		operator.getRightOperand().accept(this);
		System.out.print(" ");
		System.out.print(operator.getKind());
	}

	@Override
	public void visitConstant(Constant constant) {
		System.out.print(constant.getValue());
	}

	@Override
	public void visitVariable(Variable variable) {
		System.out.print(variable.getName());
	}

}
