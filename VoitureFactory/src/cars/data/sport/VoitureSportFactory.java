package cars.data.sport;

import cars.data.IVoiture;
import cars.data.IVoitureFactory;

public class VoitureSportFactory implements IVoitureFactory  {

	@Override
	public IVoiture newVoiture() {
		// TODO Auto-generated method stub
		return new VoitureSport();
	}
	
}
