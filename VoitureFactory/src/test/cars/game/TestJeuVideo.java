package test.cars.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cars.data.IVoitureFactory;
import cars.data.adaptc.AdaptCarCFactory;
import cars.data.adapth.AdaptCarH;
import cars.data.adapth.AdaptCarHFactory;
import cars.data.classic.Voiture;
import cars.data.classic.VoitureFactory;
import cars.data.decorator.VoitureBruitDecorateur;
import cars.data.decorator.VoitureCouleurDecorateur;
import cars.data.sport.VoitureSportFactory;
import cars.game.JeuVideo;

// configure game and play it
class TestJeuVideo {

	@Test
	void testJeuVoiture() {
		playJeuVoiture(new VoitureFactory());
	}
	
	@Test
	void testJeuVoitureSport() {
		playJeuVoiture(new VoitureSportFactory());
	}
	
	@Test
	void testJeuVoitureAdaptComposition() {
		playJeuVoiture(new AdaptCarCFactory());
	}
	
	@Test
	void testJeuVoitureAdaptHeritage() {
		playJeuVoiture(new AdaptCarHFactory());
	}
	
	@Test
	void testJeuVoitureAdaptHeritageShortcut() {
		playJeuVoiture(AdaptCarH::new);
	}
	
	@Test
	void testJeuVoitureDecoree() {
		playJeuVoiture(()-> 
				new VoitureCouleurDecorateur(
					new VoitureCouleurDecorateur(
							new VoitureBruitDecorateur(
								new Voiture(),
								150),
							"rouge"),
					"jaune"));
	}
	
	void playJeuVoiture(IVoitureFactory voitureFactory) {
		JeuVideo jeu = new JeuVideo(voitureFactory);
		jeu.play();
	}

}
