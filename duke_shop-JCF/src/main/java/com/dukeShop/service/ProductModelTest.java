
package com.dukeShop.service;

import java.util.List;

import jcf.query.core.QueryExecutor;

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
   product.setPid("p22");
   product.setPname("sdf");
   product.setPrice(13333);
   product.setStock(23);
   product.setPhoto(null);
   product.setDescription(null);

  }
  @Test
  public void 제품_조회테스트(){
  List<Product> allProduct=productService.getAllProduct();
		  for(Product product:allProduct){
			  System.out.println(product.getPid());
		  }
  }
 @Test
  public void 제품_입력테스트(){
  productService.insertProduct(product);
  }
@Test
  public void 제품_수정테스트(){
   productService.updateProduct(product);
  }
@Test
  public void 제품_삭제테스트(){
   productService.deleteProduct(product);
  }
}

