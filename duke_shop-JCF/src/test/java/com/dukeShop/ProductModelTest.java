package com.dukeShop;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;
import com.dukeShop.model.Orders;
import com.dukeShop.model.Product;
import com.dukeShop.service.CustomerService;
import com.dukeShop.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class ProductModelTest {

//	@Autowired
//	private QueryExecutor queryExcutor;

	@Autowired
	private ProductService productService;

	private Product product;

	@Before
	public void 셋업(){
		product = new Product();
		product.setPid("P015");
		product.setPname("BizCaz남방");
		product.setPhoto("busness_gon.jpg");
		product.setDescription("대우정보에서 입을 수 있는 옷입니다.");
		product.setPrice(5000);
		product.setStock(30);
	}

	@Test
	public void 제품_입력테스트(){

//		Product product = new Product();
//		product.setPid("P015");
//		product.setPname("BizCaz남방");
//		product.setPhoto("busness_gon.jpg");
//		product.setDesc("대우정보에서 입을 수 있는 옷입니다.");
//		product.setPrice(5000);
//		product.setStock(30);
//
//		queryExcutor.update("product.insert", product);

		productService.insertProduct(product);
	}

	@Test
	public void 제품_조회테스트(){
//		List<Product> queryForListProduct = queryExcutor.queryForList("product.select", null, Product.class);
//
//		for(Product product : queryForListProduct){
//			System.out.println(product.getPname());
//		}
		List<Product> allProduct = productService.getAllProduct();

		for(Product product : allProduct){
			System.out.println(product.getPname());
		}
	}

	@Test
	public void 제품_삭제테스트(){
		productService.deleteProduct(product);
	}

	@Test
	public void 제품_수정테스트(){
		product.setPname("대우정보남방");
		productService.updateProduct(product);
	}

}
