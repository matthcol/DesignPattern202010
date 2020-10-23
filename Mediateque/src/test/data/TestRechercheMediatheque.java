package test.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import data.Mediateque;
import data.Movie;
import data.RechercheBalayageStrategy;
import data.RechercheByIndexStrategy;
import data.RechercheStrategy;

class TestRechercheMediatheque {

	Mediateque mediateque;
	
	@BeforeEach
	void initMediateque() {
		// mediateque with initial strategy
		mediateque = new Mediateque(new RechercheBalayageStrategy());
	}
	
	@Test
	void testAllStrategy() {
		var strategies = List.of(
				new RechercheBalayageStrategy(),
				new RechercheByIndexStrategy());
		assertAll(strategies.stream().map(
				s -> () -> testOneStrategy(s)));
	}
	
	void testOneStrategy(RechercheStrategy strategy) {
		mediateque.setRechercheStrategy(strategy);
		String title = "Pulp Fiction";
		Optional<Movie> optMovie = mediateque.recherche(title);
		optMovie.ifPresentOrElse(
				m->assertEquals(title, m.getTitle()),
				()->fail("No movie found"));
	}

}
