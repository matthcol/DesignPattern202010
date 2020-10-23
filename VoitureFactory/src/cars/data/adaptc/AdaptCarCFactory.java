package cars.data.adaptc;

import cars.data.IVoiture;
import cars.data.IVoitureFactory;

public class AdaptCarCFactory implements IVoitureFactory {

	@Override
	public IVoiture newVoiture() {
		return new AdaptCarC();
	}
	
}
