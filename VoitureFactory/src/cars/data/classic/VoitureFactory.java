package cars.data.classic;

import cars.data.IVoiture;
import cars.data.IVoitureFactory;

public class VoitureFactory implements IVoitureFactory  {

	@Override
	public IVoiture newVoiture() {
		return new Voiture();
	}

}
