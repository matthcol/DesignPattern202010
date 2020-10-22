package clasian;

import java.util.ArrayList;
import java.util.List;

public class House {
	private List<String> parts;

	public House() {
		super();
		parts = new ArrayList<>();
	}

	// package private (~)
	void addPart(String part) {
		parts.add(part);
	}
	
	@Override
	public String toString() {
		return parts.toString();
	}
}
