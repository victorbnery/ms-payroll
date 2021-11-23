package com.victorbnery.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.victorbnery.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment (long workerId, Integer days) {
		return new Payment("Bob", 300.00, days);
	}
	
	
}
