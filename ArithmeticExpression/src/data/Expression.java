package data;

import compute.Visitor;

public interface Expression {
	void accept(Visitor visitor);
}
