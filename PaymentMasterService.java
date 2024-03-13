package com.onlinegrocery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinegrocery.entity.PaymentMasterEntity;
import com.onlinegrocery.repository.PaymentMasterRepository;

@Service
public class PaymentMasterService {
	@Autowired
	PaymentMasterRepository pmRepo;
	public void addCarDetails(PaymentMasterEntity pme)
	{
		pmRepo.save(pme);
	}
	public void addNetBanking(PaymentMasterEntity pme)
	{
		pmRepo.save(pme);
	}
	public void addUpiPayment(PaymentMasterEntity pme)
	{
		pmRepo.save(pme);
	}
	
	
	
	
	
	
       
}
