package com.dukeShop.sql.groovy

class CustomerQuery {

		public static selectAll = '''
		
		select * from CUSTOMER
				
		'''

		public static String insert ='''
	
		insert into customer 
		values(
		:cid,
		:passwd,
		:name,
		:email,
		:phone
		)
		
		'''
		public static String update = '''
		
		



		'''
				
}
