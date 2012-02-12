package sumin.summer;

import java.util.ArrayList;

import sumin.summer.dao.ShopDao;
import sumin.summer.model.Product;

import fw.DaoFactory;


public class ShopDaoTest {

	public static void main(String[] args) throws ClassNotFoundException {
		ShopDao shopDao= new DaoFactory().shopDao();

		ArrayList<Product> allProduct = shopDao.getAllProduct();
		for (Product product : allProduct) {
			System.out.println("======================================");
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getPrice());
			System.out.println("======================================");
		}
	}


}
