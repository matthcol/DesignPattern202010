package cars.game;

import cars.data.IVoiture;
import cars.data.IVoitureFactory;

public class JeuVideo {
	// @injection
	private IVoitureFactory voitureFactory;
	
	public JeuVideo(IVoitureFactory voitureFactory) {
		super();
		this.voitureFactory = voitureFactory;
	}

	public void play() {
		IVoiture voiture1 = voitureFactory.newVoiture();
		IVoiture voiture2 = voitureFactory.newVoiture();
		for (int i=0; i<5; i++) {
			voiture1.rouler();
			voiture2.rouler();
		}
	}

}
