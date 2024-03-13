package com.onlinegrocery.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinegrocery.entity.AdminEntity;
import com.onlinegrocery.entity.CustomerEntity;
import com.onlinegrocery.entity.LoginEntity;
import com.onlinegrocery.entity.SellerEntity;
import com.onlinegrocery.repository.AdminRepository;
import com.onlinegrocery.repository.CustomerRepository;
import com.onlinegrocery.repository.LoginRepository;
import com.onlinegrocery.repository.SellerRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepo;
	@Autowired
	AdminRepository adminRepo;
	@Autowired
	CustomerRepository customerRepo;
	@Autowired
	SellerRepository sellerRepo;
	
	public Boolean userLogin(LoginEntity loginEntity) throws Exception {
		
		int usertype = loginEntity.getUsertype();
		String username = loginEntity.getUsername();
		
		try {
			if(usertype == 1) {
				AdminEntity adminEntity = adminRepo.findByUsername(username);
				return validateLogin(adminEntity,loginEntity );
			}
			if(usertype == 2) {
				CustomerEntity customerEntity = customerRepo.findByUsername(username);
				return validateLogin(customerEntity,loginEntity );
			}
			if(usertype == 3) {
				SellerEntity sellerEntity = sellerRepo.findByUsername(username);
				return validateLogin(sellerEntity,loginEntity );
			}
		} catch (Exception e) {
			throw new Exception("No account exists with username provided ! Please try with valida user name !!");
		}
		
		return false;
	}

	private Boolean validateLogin(SellerEntity sellerEntity, LoginEntity loginEntity) {
		if(sellerEntity.getUsername().equalsIgnoreCase(loginEntity.getUsername())&&sellerEntity.getPassword().equalsIgnoreCase(loginEntity.getPassword())) {
			return true;
		}
		return false;
	}

	private Boolean validateLogin(CustomerEntity customerEntity, LoginEntity loginEntity) {
		if(customerEntity.getUsername().equalsIgnoreCase(loginEntity.getUsername())&&customerEntity.getPassword().equalsIgnoreCase(loginEntity.getPassword())) {
			return true;
		}
		return false;
	}

	private Boolean validateLogin(AdminEntity adminEntity, LoginEntity loginEntity) {
		if(adminEntity.getUsername().equalsIgnoreCase(loginEntity.getUsername())&&adminEntity.getPassword().equalsIgnoreCase(loginEntity.getPassword())) {
			return true;
		}
		return false;
	}
	
}
	