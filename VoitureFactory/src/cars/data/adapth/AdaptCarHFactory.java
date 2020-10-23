package cars.data.adapth;

import cars.data.IVoiture;
import cars.data.IVoitureFactory;

public class AdaptCarHFactory implements IVoitureFactory{

	@Override
	public IVoiture newVoiture() {
		return new AdaptCarH();
	}

}
