package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableMap;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Mediateque {
	private List<Movie> movies;
	private NavigableMap<String, Movie> indexByTitle;
	
	private RechercheStrategy rechercheStrategy;

	public Mediateque(RechercheStrategy rechercheStrategy) {
		super();
		this.rechercheStrategy = rechercheStrategy;
		indexByTitle = new TreeMap<>();
		movies = new ArrayList<>();
		Collections.addAll(movies,
			new Movie("Pulp Fiction", 1994),
			new Movie("The Man Who Knew Too Much", 1954),
			new Movie("The Lion King", 1994));
		reindex();
	}
	
	public void setRechercheStrategy(RechercheStrategy rechercheStrategy) {
		this.rechercheStrategy = rechercheStrategy;
	}

	private void reindex() {
		movies.forEach(m->indexByTitle.put(m.getTitle(), m));
	}
	
	public Optional<Movie> recherche(String title) {
		return rechercheStrategy.recherche(title, this);
	}
	
	Iterator<Movie> iterator() {
		return movies.iterator();
	}
	
	Stream<Movie> stream() {
		return movies.stream();
	}

	NavigableMap<String, Movie> getIndexByTitle() {
		return indexByTitle;
	}

}
