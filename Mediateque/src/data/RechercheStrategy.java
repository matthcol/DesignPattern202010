package data;

import java.util.Optional;

public interface RechercheStrategy {
	public Optional<Movie> recherche(String title, Mediateque mediateque);
}
