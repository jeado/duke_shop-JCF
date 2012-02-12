package fw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class OracleJdbcConnectionMaker implements ConnectionMaker {

	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@152.149.47.87:8082:edu";
		String username="edu";
		String password="edu";
		Connection con=DriverManager.getConnection(url, username, password);
		return con;
	}

}
