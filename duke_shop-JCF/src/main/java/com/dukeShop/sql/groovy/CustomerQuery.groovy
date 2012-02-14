package com.dukeShop.sql.groovy

class CustomerQuery {

	public static String selectAll = '''
		select * from CUSTOMER
	'''

	public static String insert = '''

		INSERT INTO CUSTOMER (
				id,
				name,
				passwd,
				email,
				phone
			) VALUES(
				:id,
				:name,
				:passwd,
				:email,
				:phone
		)
	'''
}
