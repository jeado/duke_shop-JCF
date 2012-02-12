package fw;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class OracleJndiConnectionMaker implements ConnectionMaker {

	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		InitialContext ctx;
		try {
			ctx = new InitialContext();
			DataSource ds;
			ds = (DataSource)ctx.lookup("java:/comp/env/oraclePool");
			con = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return con;
	}

}
