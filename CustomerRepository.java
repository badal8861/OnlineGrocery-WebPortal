package com.onlinegrocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onlinegrocery.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
	
	@Query(value ="Select * FROM customer_entity c WHERE c.username = ?1",nativeQuery = true)
	public CustomerEntity findByUsername(String username) throws Exception;

}
