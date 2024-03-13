package com.onlinegrocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlinegrocery.entity.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {
	
	@Query(value ="Select * FROM admin_entity a WHERE a.username = ?1",nativeQuery = true)
	public AdminEntity findByUsername(String username)throws Exception;
	
}
