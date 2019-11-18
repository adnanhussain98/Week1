package Day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDAO {

	private Connection getConnection() {

		Connection conn = null;

		try {
			// load driver
			Class.forName("org.sqlite.JDBC");
			// url of the database location
			String url = "jdbc:sqlite:dvd.sqlite";
			// initialise connection object
			conn = DriverManager.getConnection(url);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// returns conn object
		return conn;
	}

	public void getDVDs() throws SQLException {

		Connection connection = getConnection();
		Statement statement = connection.createStatement();

		String sql = "SELECT * FROM collection;";

		System.out.println(sql);

		ResultSet rs = statement.executeQuery(sql);

		while (rs.next()) {
			int id = rs.getInt("ID");
			String title = rs.getString("Title");
			String genre = rs.getString("Genre");
			int year = rs.getInt("Year");

			System.out.println(id + " " + title + " " + genre + " " + year + " ");

		}
	}

	public void insertDVD() throws SQLException {

		Connection connection = getConnection();
		Statement statement = connection.createStatement();

		String sql = "INSERT INTO collection (ID, Title, Genre, Year )" + " VALUES (4, 'Batman', 'Action', 2009);";
		System.out.println(sql);
		
		statement.executeUpdate(sql);
		System.out.println("done");

	}
	
	public void updateDVD() throws SQLException {

		Connection connection = getConnection();
		Statement statement = connection.createStatement();

		String sql = "UPDATE collection " + 
				"SET Title = 'Batman 2', Genre = 'Comedy', Year = 1985" + 
				" WHERE ID = 4";
		System.out.println(sql);
		
		statement.executeUpdate(sql);
		System.out.println("done");

	}
	
	public void deleteDVD() throws SQLException {

		Connection connection = getConnection();
		Statement statement = connection.createStatement();

		String sql = "DELETE FROM collection " + 
				"WHERE ID = 4 ";

		System.out.println(sql);
		
		statement.executeUpdate(sql);
		System.out.println("done");

	}
}
