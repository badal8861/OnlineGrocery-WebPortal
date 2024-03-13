package com.onlinegrocery.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.onlinegrocery.entity.SellerEntity;

public interface SellerRepository extends JpaRepository<SellerEntity, Integer>  {

	public void deleteById(int id)throws Exception;
	
	@Query(value ="Select * FROM seller_entity s WHERE s.username = ?1",nativeQuery = true)
	public SellerEntity findByUsername(String username) throws Exception;
	
}
