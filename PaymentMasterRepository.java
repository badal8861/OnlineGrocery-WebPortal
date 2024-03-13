package com.onlinegrocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlinegrocery.entity.PaymentMasterEntity;

public interface PaymentMasterRepository extends JpaRepository<PaymentMasterEntity, Integer>{

	
	@Query(value="select * from payment_master_entity where accno=?1",
			nativeQuery = true)
	PaymentMasterEntity getmasterdetails(long peaccno);

}
