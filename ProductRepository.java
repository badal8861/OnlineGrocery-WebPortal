package com.onlinegrocery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.onlinegrocery.entity.ProductEntity;


public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	
	@Transactional
	@Modifying
	@Query( value = "UPDATE product_entity SET units_added = ?1 WHERE product_id =?2", nativeQuery = true) 
	int addProductQuantity(int unitsAdded , int id);
	
	@Query(value ="Select * FROM product_entity p WHERE p.product_approval = 1",nativeQuery = true)
	List<ProductEntity> getallapprovedproducts();
	
	@Query(value ="Select * FROM product_entity p WHERE p.product_approval = 2",nativeQuery = true)
	List<ProductEntity> fetchPendingProductList();

	@Transactional
	@Modifying
	@Query( value = "UPDATE product_entity SET product_approval = 1 WHERE product_id =?1", nativeQuery = true) 
	int approveProduct(int id);

}
