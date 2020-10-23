package compute;

import java.util.Map;

import data.BinaryOperator;
import data.Constant;
import data.Variable;

public class EvaluateVisitor implements Visitor {

	// parameters of computation
	private Map<String,Integer> params;
	// result of computation
	private int result;
	
	
	public EvaluateVisitor(Map<String, Integer> params) {
		super();
		this.params = params;
	}

	
	public int getResult() {
		return result;
	}


	@Override
	public void visitOperator(BinaryOperator operator) {
		int leftResult, righResult;
		operator.getLeftOperand().accept(this);
		leftResult = result;
		operator.getRightOperand().accept(this);
		righResult = result;
		switch (operator.getKind()) {
		case ADD:
			result = leftResult +  righResult; break;
		case MINUS:
			result = leftResult -  righResult; break;
		case MULT:
			result = leftResult *  righResult; break;
		case DIV:
			result = leftResult /  righResult; break;
		}
	}

	@Override
	public void visitConstant(Constant constant) {
		result = constant.getValue();
		
	}

	@Override
	public void visitVariable(Variable variable) {
		result = params.get(variable.getName());
	}

}
