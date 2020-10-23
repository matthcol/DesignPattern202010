package cars.data.classic;

import cars.data.IVoiture;

public class Voiture implements IVoiture {

	@Override
	public void rouler() {
		System.out.println("Je roule");
	}

}
