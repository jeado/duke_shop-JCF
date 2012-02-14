package com.dukeShop.sql.groovy

class OrderQuery {

	public static String selectAll = '''
			SELECT * FROM ORDERS
	'''

	public static String insert = '''
			INSERT INTO ORDERS (
				oid,
				pid,
				id,
				qty,
				odate,
				photo,
				price

			) VALUES (
				orders_sequence.nextval,
				:pid,
				:id,
				:qty,
				sysdate,
				:photo,
				:price
			)
	'''

	public static String update = '''


	'''

	public static String delete = '''


	'''

}
