package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStringBuilder {

	@Test
	void test() {
		int nbDoors = 2;
		int nbWalls = 10;
		double height = 3.4;
		StringBuilder builder = new StringBuilder("House[");
		String stringHouse = builder
				.append(nbDoors)
				.append(" doors, ")
				.append(nbWalls)
				.append(" walls, ")
				.append(height)
				.append(" m]")
		 		.toString(); // finalize string
		System.out.println(stringHouse);
	}

}
