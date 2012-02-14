package com.dukeShop.sql.groovy

class OrderQuery {
	public static String selectAll ='''
		select * from orders
'''
	public static String insert = '''
			insert into orders values(
		orders_sequence.nextval,
		:pid,
		:cid,
		:qty,
		sysdate

		)
	'''
	public static String update = '''
	update orders set pid=:pid,
		qty=#qty# where oid=:oid
	'''
	public static String delete = '''
	delete from orders where oid=:oid
	'''
}
