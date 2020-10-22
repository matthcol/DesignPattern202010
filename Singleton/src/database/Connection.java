package database;

public class Connection {
	
	private static Connection instance = null;
	
	private Connection() {}
	
	/**
	 * version non thread-safe
	 * @return
	 */
	public static Connection getInstance() {
		if (instance == null) {
			instance = new Connection();
		}
		return instance;
	}

}
