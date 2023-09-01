package com.capstone.child.insurance.system.service;

import java.util.Collection;

import com.capstone.child.insurance.system.entity.ChildPolicyEnrollment;
import com.capstone.child.insurance.system.entity.Payment;
import com.capstone.child.insurance.system.exceptions.ChildPolicyEnrollmentException;
import com.capstone.child.insurance.system.exceptions.PaymentException;

public interface PaymentService {
	
	
	Payment addPayment(Payment newPayment) ;
	Payment getPaymentById(Integer id) throws PaymentException;
	Collection<Payment> getAllPayments(Integer EnrollmentId) throws ChildPolicyEnrollmentException, PaymentException;  //For User
	Payment createTransaction(Double amount);
	Payment prepareTransactionDetail(com.razorpay.Payment payment);

}
