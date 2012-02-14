package com.dukeShop.sql.groovy

class ProductQuery {

	public static String selectAll = '''
		SELECT * FROM PRODUCT
	'''


	public static String insert = '''
		INSERT INTO PRODUCT (
			pid,
			pname,
			photo,
			description,
			price,
			stock

		)VALUES (
			:pid,
			:pname,
			:photo,
			:description,
			:price,
			:stock
		)

	'''

	public static String update = '''
		UPDATE PRODUCT SET
			pname =	:pname,
			photo = :photo,
			description = :description,
			price = :price,
			stock = :stock

		WHERE pid = :pid
	'''

	public static String delete = '''
		DELETE FROM PRODUCT WHERE pid = :pid
	'''
}
