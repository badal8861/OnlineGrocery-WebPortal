package com.onlinegrocery.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinegrocery.entity.CustomerEntity;
import com.onlinegrocery.entity.OrderEntity;
import com.onlinegrocery.entity.ProductEntity;
import com.onlinegrocery.repository.CustomerRepository;
import com.onlinegrocery.repository.OrderRepository;
import com.onlinegrocery.repository.ProductRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository custRepo;
	@Autowired
	ProductRepository prodrepo;
	@Autowired
	OrderRepository orderRepo;
	
	
	public void createAccount(CustomerEntity customerEntity) {
		custRepo.save(customerEntity);
	}
	public List<ProductEntity> getallapprovedproducts() {
		
		List<ProductEntity> listofapprovedproducts = prodrepo.getallapprovedproducts();
		
		return listofapprovedproducts;
	}
	
	public OrderEntity registerOrder(OrderEntity orderEntity) {
		
		return orderRepo.save(orderEntity);
		
	}
	public int cancelOrder(int  orderId) {
		
		return orderRepo.cancelOrder(orderId);
	}
	public List<OrderEntity> orderHistory(int custId) {
		
		return orderRepo.orderHistory(custId);
	}

	
}
