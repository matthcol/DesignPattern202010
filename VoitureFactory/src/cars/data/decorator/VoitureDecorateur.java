package cars.data.decorator;

import cars.data.IVoiture;

public abstract class VoitureDecorateur implements IVoiture {

	private IVoiture voiture;

	public VoitureDecorateur(IVoiture voiture) {
		super();
		this.voiture = voiture;
	}

	protected IVoiture getVoiture() {
		return voiture;
	}
	
}
