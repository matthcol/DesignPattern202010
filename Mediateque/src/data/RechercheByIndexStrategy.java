package data;

import java.util.NavigableMap;
import java.util.Optional;

public class RechercheByIndexStrategy implements RechercheStrategy {	
	
	@Override
	public Optional<Movie> recherche(String title, Mediateque mediateque) {
		return Optional.ofNullable(mediateque.getIndexByTitle()
				.get(title));
	}

}
