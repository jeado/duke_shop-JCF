package com.dukeShop.sql.groovy

class CustomerQuery {

	public static String selectAll = '''
		SELECT * FROM CUSTOMER
	'''

	public static String insert ='''
			INSERT INTO CUSTOMER (
				id,
				passwd,
				phone,
				email,
				name
			)VALUES (
				 :id,
				 :passwd,
				 :phone,
 				 :email,
				 :name
			)
	'''

	public static String update ='''
			UPDATE CUSTOMER SET
				name= :name,
				passwd = :passwd,
				email = :email,
				phone = :phone
			WHERE id = :id
	'''

	public static String delete = '''
		DELETE FROM CUSTOMER WHERE id = :id
	'''






}
