package com.onlinegrocery.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.onlinegrocery.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
	
	@Query(value ="SELECT * FROM order_entity s WHERE s.paymentdate BETWEEN ?1 AND ?2 ",nativeQuery = true)
	List<OrderEntity> getRevenueDetails(Date fromDate, Date toDate);
	
	@Transactional
	@Modifying
	@Query( value = "UPDATE order_entity SET order_status = 2 WHERE orderid =?1", nativeQuery = true) 
	int cancelOrder(int orderid);
	
	@Query(value ="SELECT * FROM order_entity s WHERE s.custid = ?1 ",nativeQuery = true)
	List<OrderEntity> orderHistory(int custId);
	
	@Transactional
	@Modifying
	@Query( value = "UPDATE order_entity SET order_status = 3 WHERE orderid =?1", nativeQuery = true) 
	int updatePaymentStatus(int orderId);

}
