package com.onlinegrocery.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinegrocery.entity.AdminEntity;
import com.onlinegrocery.entity.OrderEntity;
import com.onlinegrocery.entity.ProductEntity;
import com.onlinegrocery.entity.RevenueDataBean;
import com.onlinegrocery.repository.AdminRepository;
import com.onlinegrocery.repository.OrderRepository;
import com.onlinegrocery.repository.ProductRepository;
import com.onlinegrocery.repository.SellerRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	SellerRepository sellerRepo;
	
	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	ProductRepository prodRepo;

	public List<ProductEntity> pendingProductList()throws Exception {

		return prodRepo.fetchPendingProductList();
	}

	
	 public int approveProduct(int id) throws Exception{
	  
	  int updateStatusCode = prodRepo.approveProduct(id);
	  
	  return updateStatusCode;
 
	  }


	public RevenueDataBean getRevenueDetails(RevenueDataBean revenuedatabean) {
		List<OrderEntity> orderList = orderRepo.getRevenueDetails(revenuedatabean.getFromDate(),revenuedatabean.getToDate());
		int noOfOrders = orderList.size();
		double totalRevenue = 0.0 ;
		for (int i = 0 ; i <= noOfOrders - 1;i++) {
			totalRevenue = totalRevenue +  orderList.get(i).getAmount();	
		}
		RevenueDataBean finalBean = new RevenueDataBean();
		finalBean.setFromDate(revenuedatabean.getFromDate());
		finalBean.setToDate(revenuedatabean.getToDate());
		finalBean.setTotalRevenue(totalRevenue);
		
		return finalBean;
	}


	public AdminEntity adminRegistration(AdminEntity adminEntity) {

		AdminEntity adminEntitySaved = adminRepo.save(adminEntity);
		return adminEntitySaved;
	}
	 
}
