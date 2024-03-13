package com.onlinegrocery.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onlinegrocery.entity.AdminEntity;
import com.onlinegrocery.entity.ProductEntity;
import com.onlinegrocery.entity.RevenueDataBean;
import com.onlinegrocery.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/adminRegistration")
	public String adminRegistration(@RequestBody AdminEntity adminEntity) throws Exception {
		
		AdminEntity adminEntitySaved = adminService.adminRegistration(adminEntity);
		
		return "Admin registered with details : " + adminEntitySaved;
	}
	
	@GetMapping("/pendingproductlist")
	public List<ProductEntity> pendingProductList() throws Exception {
        
		List<ProductEntity> pendingProductList = adminService.pendingProductList();
		
		return pendingProductList ;
	}
	
	@RequestMapping("/approveProduct/{id}") 
	public String approveProduct(@PathVariable int id) throws Exception {
	  
	  int updatestatus = adminService.approveProduct(id);
	  
	  if(updatestatus == 0 ) { 
		  return "Please provide valid product id and try again "; 
		  } 
	  else { 
		  return "Products approved successfully for product id " + id; 
		  
	  	}
	  
	  }
	
	@PostMapping("/getRevenueDetails")
	public String getRevenueDetail(@RequestBody RevenueDataBean revenuedatabean) throws Exception {
		
		RevenueDataBean finalRevenue = adminService.getRevenueDetails(revenuedatabean);
		
		return "Please find the total revenue detail : " + finalRevenue;
	}
	 
	 
	
}
