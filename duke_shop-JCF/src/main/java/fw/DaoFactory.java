package fw;

import sumin.summer.dao.ShopDao;

public class DaoFactory {

	public ShopDao shopDao(){
		return new ShopDao(connectionMaker());

	}

	public ConnectionMaker connectionMaker(){
		return new OracleJdbcConnectionMaker();
	}
}
