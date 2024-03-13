package com.onlinegrocery.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinegrocery.entity.ProductEntity;
import com.onlinegrocery.entity.SellerEntity;
import com.onlinegrocery.repository.ProductRepository;
import com.onlinegrocery.repository.SellerRepository;


@Service
public class SellerService {
	@Autowired
	SellerRepository sellerRepo;
	@Autowired
	ProductRepository productRepo;
	
	public ProductEntity sellerPublishproducts(ProductEntity productEntity)throws Exception
	{	
		ProductEntity productBean = new ProductEntity(productEntity.getProductId(), productEntity.getProductName(), productEntity.getProductDescription(), productEntity.getProductApproval(),
				productEntity.getProductPricePerUnit(), productEntity.getSellerId(), productEntity.getProductTypeCode(), productEntity.getUnitsAdded());
		
		ProductEntity productEntitySaved =  productRepo.save(productBean);
		return productEntitySaved ;
	}
	
	public SellerEntity sellerRegistration(SellerEntity sellerEntity)throws Exception {
		SellerEntity sellerEntitySaved = sellerRepo.save(sellerEntity);
		return sellerEntitySaved;
	}

	public String addProductQuantity(ProductEntity productEntity) throws Exception {
		
		int noOfrowsUpdated = productRepo.addProductQuantity(productEntity.getUnitsAdded(),productEntity.getProductId());
		
		if (noOfrowsUpdated == 0) {
			return "Update failed , please check the details provided ";
		}
		return "Product quantity increased in inventory";
	}

	public String deleteproductininventory(int id) {
		
		productRepo.deleteById(id);
		
		return "Product Deleted successfully";
	}
	
}
