package test.director;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clasian.ClasianHouseBuilder;
import clasian.House;

/**
 * director of pattern Builder
 */
class TestScalianHouseBuilder {

	@Test
	void testBuildHouse() {
		ClasianHouseBuilder builder = new ClasianHouseBuilder();
		House house = builder
			.addWall()
			.addWall()
			.addDoor()
			.addWindow()
			.addWindow()
			.addRoof()
			.build();
		System.out.println(house);
	}

}
