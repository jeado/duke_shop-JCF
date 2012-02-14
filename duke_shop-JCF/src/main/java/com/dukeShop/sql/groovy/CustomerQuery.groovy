package com.dukeShop.sql.groovy

class CustomerQuery {
	
	public static String selectAll='''

		select * from customer
	
	'''
	
	public static String insert='''
	
		insert into customer values(
			:cid,
			:passwd,
			:name,
			:email,
			:phone
		)	
	'''
	
	public static String update='''

		update customer set name=:name,
		email=:email where id=:cid
		

	'''
	
	public static String delete='''

		delete from customer where id=:cid

	'''
	
}
