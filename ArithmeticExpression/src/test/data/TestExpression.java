package test.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import compute.EvaluateVisitor;
import compute.ReversePolishDisplayVisitor;
import data.BinaryOperator;
import data.Constant;
import data.Expression;
import data.OperatorKind;
import data.Variable;

class TestExpression {
	
	private static Expression expression;
	
	@BeforeAll
	static void initData() {
		expression = new BinaryOperator(
			OperatorKind.ADD,
			new Constant(4),
			new BinaryOperator(
					OperatorKind.MULT, 
					new Constant(5),
					new Variable("x")));
	}
	
	@Test
	void testDisplayExpression() {
		System.out.println("Display Expression: ");
		ReversePolishDisplayVisitor visitor =  new ReversePolishDisplayVisitor(); 
		expression.accept(visitor);
		System.out.println();
	}
	
	@Test
	void testEvaluateExpression() {
		Map<String, Integer> params = Map.of("x", 5, "y", 3);
		var visitor =  new EvaluateVisitor(params); 
		expression.accept(visitor);
		var res = visitor.getResult();
		System.out.println("Evaluation: " + res);
	}


}
