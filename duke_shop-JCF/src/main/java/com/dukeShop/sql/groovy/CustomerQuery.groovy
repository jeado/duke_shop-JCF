package com.dukeShop.sql.groovy

class CustomerQuery {

	public static String selectAll = '''
		select * from CUSTOMER
	'''

	public static String insert = '''
		insert into CUSTOMER values(
			:id,
			:passwd,
			:phone,
			:email,
			:name
		)
	'''

	public static String update = '''
		update CUSTOMER
		set passwd = :passwd
		where id = :id
	'''

	public static String delete = '''
		delete from CUSTOMER
		where id = :id
	'''


}
