package data;

import java.util.Optional;

public class RechercheBalayageStrategy implements RechercheStrategy{

	@Override
	public Optional<Movie> recherche(String title, Mediateque mediateque) {
		return mediateque.stream()
			.filter(m -> m.getTitle().equals(title))
			.findFirst();
	}
	
}
