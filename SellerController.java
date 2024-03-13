package com.onlinegrocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.onlinegrocery.entity.ProductEntity;
import com.onlinegrocery.entity.SellerEntity;
import com.onlinegrocery.service.SellerService;

@RestController
public class SellerController {

	@Autowired
	SellerService sellerService;

	@PostMapping("/sellerRegistration")
	public String adminRegistration(@RequestBody SellerEntity sellerEntity) throws Exception {

		SellerEntity sellerEntitySaved = sellerService.sellerRegistration(sellerEntity);

		return "Seller registered with details : " + sellerEntitySaved;
	}

	// seller publish the product
	@PostMapping("/sellerpublishproducts")
	public String publishProduct(@RequestBody ProductEntity productEntity) throws Exception {
		ProductEntity prodAdded = sellerService.sellerPublishproducts(productEntity);

		return "Seller published the products successfully" + "/n" + "Please find below the product added : /n"
				+ prodAdded;
	}

	@PostMapping("/addproductininventory")
	public String addProductQuantity(@RequestBody ProductEntity productEntity) throws Exception{
		
		return sellerService.addProductQuantity(productEntity);
		
	}
	
	@GetMapping("/deleteproductininventory/{id}")
	public String deleteproductininventory(@PathVariable int id ) throws Exception{
		
		return sellerService.deleteproductininventory(id);
		
	}
	

}
