package com.onlinegrocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinegrocery.entity.CustomerEntity;
import com.onlinegrocery.entity.OrderEntity;
import com.onlinegrocery.entity.ProductEntity;
import com.onlinegrocery.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/registration")
	public String addAccount(@RequestBody CustomerEntity customerEntity) {
			customerService.createAccount(customerEntity);
			return "Account is created successfully";
		}
	
	@GetMapping("/getallapprovedproducts")
	public List<ProductEntity> getallapprovedproducts() throws Exception {
		
		List<ProductEntity> listofapprovedproducts = customerService.getallapprovedproducts();
		
		return listofapprovedproducts ;
	}
	
	@PostMapping("/order")
	public String registerOrder(@RequestBody OrderEntity orderEntity)
	{
		OrderEntity savedOrder = customerService.registerOrder(orderEntity);
		
		return "Your order is saved please complete payment to confirm. Please find the order details below : /n " + savedOrder;
	}
	
	@GetMapping("/cancelOrder/{orderId}")
	public String cancelOrder(@PathVariable int orderId)
	{
		int orderCancelled = customerService.cancelOrder(orderId);
		
		if(orderCancelled == 0) {
			return "Please provide valid order info to cancel";
		}
		
		return "Cancellation successfull" ;
	}
	

	@GetMapping("/orderHistory/{custId}")
	public List<OrderEntity> orderHistory(@PathVariable int custId) throws Exception {
		
		List<OrderEntity> listofOrder = customerService.orderHistory(custId);
		
		return listofOrder ;
	}
	

}

