package data;

import compute.Visitor;

public class Constant implements Expression {

	private int value;
	
	public Constant(int value) {
		super();
		this.value = value;
	}

	
	public int getValue() {
		return value;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visitConstant(this);
	}

}
