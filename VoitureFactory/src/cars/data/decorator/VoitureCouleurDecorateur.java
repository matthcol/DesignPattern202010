package cars.data.decorator;

import java.awt.Color;

import cars.data.IVoiture;

public class VoitureCouleurDecorateur extends VoitureDecorateur {
	String couleur;

	public VoitureCouleurDecorateur(IVoiture voiture, String couleur) {
		super(voiture);
		this.couleur = couleur;
	}

	@Override
	public void rouler() {
		System.out.print("en " + couleur + ", ");
		getVoiture().rouler();
	}
	
	

}
