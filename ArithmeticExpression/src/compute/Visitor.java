package compute;

import data.BinaryOperator;
import data.Constant;
import data.Variable;

public interface Visitor {
	void visitOperator(BinaryOperator operator);
	void visitConstant(Constant constant);
	void visitVariable(Variable variable);
}
