package com.dukeShop.sql.groovy

class CustomerQuery {

	public static selectAll='''
	select * from CUSTOMER
	'''

	public static insert='''
	INSERT INTO CUSTOMER(ID,PASSWD,PHONE,EMAIL,NAME) VALUES(
		:id,
		:passwd,
		:phone,
		:email,
		:name
	)
		'''

	public static update='''
	UPDATE CUSTOMER SET
		id = :id,
		passwd = :passwd,
		phone = :phone,
		email = :email,
		name = :name
		WHERE id = :id
	'''

	public static delete='''
	DELETE FROM CUSTOMER WHERE id = :id
	'''
}
