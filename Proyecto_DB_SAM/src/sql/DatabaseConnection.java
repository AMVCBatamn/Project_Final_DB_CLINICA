package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static final String URL = "serversamsql.database.windows.net";
    private static final String USER = "a.veras";
    private static final String PASSWORD = "Str0ngP@ssw0rd!";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


