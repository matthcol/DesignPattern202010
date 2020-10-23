package data;

import compute.Visitor;

public class Variable implements Expression {

	private String name;
	
	public Variable(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitVariable(this);
	}
	

}
