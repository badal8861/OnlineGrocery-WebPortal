package com.onlinegrocery.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinegrocery.entity.OrderEntity;
import com.onlinegrocery.entity.PaymentEntity;
import com.onlinegrocery.entity.PaymentMasterEntity;
import com.onlinegrocery.repository.OrderRepository;
import com.onlinegrocery.repository.PaymentMasterRepository;
import com.onlinegrocery.repository.PaymentRepository;

@Service
public class PaymentService  {
	
	@Autowired
	PaymentRepository pRepo;
	
	@Autowired
	PaymentMasterRepository pmRepo;
	
	@Autowired
	OrderRepository oRepo;
	
	public OrderEntity orderpaymentdetails(PaymentEntity pe) throws Exception{
		long peaccno=pe.getAccno();
	    boolean detailsmatch= true ;
        
	    PaymentMasterEntity pmefromdb= pmRepo.getmasterdetails(peaccno);
	    
        detailsmatch = validatepayment(pe,pmefromdb);
	    
        OrderEntity oeupdated  = null;
	    
	    
	    if(detailsmatch) {
	    	
	    		int updateStatus = oRepo.updatePaymentStatus(pe.getOrderId());
	    		if(updateStatus == 1) {
	    			oeupdated = oRepo.findById(pe.getOrderId()).get();
	    			return oeupdated;
	    		}else{
	    			return oeupdated;
	    		}
	    }
	    
	    return oeupdated;
	}
	
	
	
	private boolean validatepayment(PaymentEntity pe, PaymentMasterEntity pmefromdb) {
         if(pe.getCccvv()!=pmefromdb.getCccvv()) {
        	 System.out.println("false in ccvv");
        	 return false;
         }
         if(!pe.getCcexpiry().equalsIgnoreCase(pmefromdb.getCcexpiry()) )
         {
        	 System.out.println("false in ccexpiry");
        	 return false;
         }
         if(pe.getCcno()!=pmefromdb.getCcno())
         {
        	 System.out.println("false in ccno");
        	 return false;
        	 
         }
         if(pe.getDbcvv()!=pmefromdb.getDbcvv())
         {
        	 System.out.println("false in dbcvv");
        	 return false;
        	 
         }
         if(!pe.getName().equalsIgnoreCase(pmefromdb.getName()))
         {
        	 System.out.println("false in name");
        	 return false;
        	 
         }
         if(pe.getAccno() !=pmefromdb.getAccno())
         {
        	 System.out.println("false in accno");
        	 return false;
        	 
         }
         if(!pe.getDbexpiry().equalsIgnoreCase(pmefromdb.getDbexpiry()))
         {
        	 System.out.println("false in dbexpiry");
        	 return false;
        	 
         }
         if(pe.getDbno() !=pmefromdb.getDbno())
         {
        	 System.out.println("false in dbno");
        	 return false;
        	 
         }
         if(pe.getDbno() !=pmefromdb.getDbno())
         {
        	 System.out.println("false in accno");
        	 return false;
        	 
         }
         if(pe.getPassword() !=pmefromdb.getPassword())
         {
        	 System.out.println("false in password");
        	 return false;
        	 
         }
         if(pe.getUpipin() !=pmefromdb.getUpipin())
         {
        	 System.out.println("false in upiin");
        	 return false;
        	 
         }
         if(!pe.getUpiid().equalsIgnoreCase(pmefromdb.getUpiid()))
         {
        	 System.out.println("false in upiid");
        	 return false;
        	 
         } 
		return true;
	}
	
	
	
	

}
