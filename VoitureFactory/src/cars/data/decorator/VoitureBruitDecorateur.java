package cars.data.decorator;

import cars.data.IVoiture;

public class VoitureBruitDecorateur extends VoitureDecorateur {
	private int intensite;

	public VoitureBruitDecorateur(IVoiture voiture, int intensite) {
		super(voiture);
		this.intensite = intensite;
	}

	@Override
	public void rouler() {	
		System.out.print("à "+ intensite + " db, ");
		getVoiture().rouler();
	}
	
	

}
