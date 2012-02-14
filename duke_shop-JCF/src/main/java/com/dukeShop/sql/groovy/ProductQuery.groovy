package com.dukeShop.sql.groovy

class ProductQuery {
	public static String selectAll ='''
		select * from product
'''
	public static String insert = '''
		insert into product values(
		:pid,
		:pname,
		:photo,
		:description,
		:price,
		:stock

		)
'''
	public static String update = '''
update product set price=:price,
		stock=:stock where pid=:pid
	'''
	public static String delete = '''
delete from product where pid=:pid
	'''

}
