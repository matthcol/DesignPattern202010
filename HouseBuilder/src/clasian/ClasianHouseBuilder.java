package clasian;

import house.HouseBuilder;

public class ClasianHouseBuilder implements HouseBuilder {

	private House house;
	
	public ClasianHouseBuilder() {
		super();
		house = new House();
	}

	@Override
	public ClasianHouseBuilder addWall() {
		house.addPart("wall");
		return this;
	}

	@Override
	public ClasianHouseBuilder addDoor() {
		house.addPart("door");
		return this;	
	}

	@Override
	public ClasianHouseBuilder addWindow() {
		house.addPart("window");
		return this;	
	}

	@Override
	public ClasianHouseBuilder addRoof() {
		house.addPart("roof");
		return this;	
	}

	public House build() {
		return house;
	}
}
