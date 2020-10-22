package test.database;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import database.Connection;

class TestSingleton {

	@Test
	void testUniqueSingleton() {
		Connection c1 = Connection.getInstance();
		Connection c2 = Connection.getInstance();
		assertSame(c1, c2);
		// some display to be sure
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
	
	// compilation error: private constructor
//	@Test
//	void testNoDirectNew() {
//		Connection c = new Connection();
//	}

}
