package com.onlinegrocery.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinegrocery.entity.OrderEntity;
import com.onlinegrocery.entity.PaymentEntity;
import com.onlinegrocery.entity.PaymentMasterEntity;
import com.onlinegrocery.service.PaymentMasterService;
import com.onlinegrocery.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentMasterService pms;
	
	@Autowired
	PaymentService ps;
	
	
	@PostMapping("/carddetails")
	public String carddetails(@RequestBody PaymentMasterEntity pme)
	{
		pms.addCarDetails(pme);
		return "added succesfully";
	}
	@PostMapping("/netbanking")
	public String netbankingdetails(@RequestBody PaymentMasterEntity pme)
	{
		pms.addNetBanking(pme);
		return "net banking details added succesfully";
	}
	@PostMapping("/upidetails")
	public String upidetails(@RequestBody PaymentMasterEntity pme)
	{
		pms.addUpiPayment(pme);
		return " upi details added succesfully";
	}
	
	@PostMapping("/orderpayment")
	public String orderpayment(@RequestBody PaymentEntity pe) throws Exception
	{
		OrderEntity orderEntity = ps.orderpaymentdetails(pe);
		
		if(orderEntity == null) {
			return "Please provide correct details and try again !! " ;
		}
		return "Your payment for the order is successfull Please find the order details : " + orderEntity;
	}
	
}
