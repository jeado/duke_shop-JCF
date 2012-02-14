package com.dukeShop;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Product;
import com.dukeShop.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class ProductModelTest {

	private Product product;

	@Autowired
	private ProductService productService;

	@Before
	public void 셋업(){
		product = new Product();
		product.setPid("ddd");
		product.setPname("test");
		product.setPrice(10);
		product.setStock(2);
		product.setPhoto(null);
		product.setDesc(null);
	}

	@Test
	public void 조회테스트(){
		List<Product> queryForList = productService.getAllProduct();

		for (Product product : queryForList) {
			System.out.print(product.getPid()+ " : ");
			System.out.println(product.getPrice());
		}
	}

	@Test
	public void 상품_삽입테스트(){
		productService.insertProduct(product);
	}

	@Test
	public void 상품_수정테스트(){
		productService.updateProduct(product);
	}

	@Test
	public void 상품_삭제테스트(){
		productService.deleteProduct(product);
	}


}
