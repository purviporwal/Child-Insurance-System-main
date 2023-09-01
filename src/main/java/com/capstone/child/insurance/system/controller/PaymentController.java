package com.capstone.child.insurance.system.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capstone.child.insurance.system.entity.Payment;
import com.capstone.child.insurance.system.exceptions.ChildPolicyEnrollmentException;
import com.capstone.child.insurance.system.exceptions.PaymentException;
import com.capstone.child.insurance.system.service.PaymentService;

import jakarta.annotation.security.PermitAll;

@RequestMapping("/api/v1/user")
@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@GetMapping("/")
	public String getGreeting() {
		return "welcome to payment!";
	}

	@PostMapping("/payment")
	public Payment addPayment(@RequestBody Payment newPayment) {

		return this.paymentService.addPayment(newPayment);

	}

	@GetMapping("/payment/{id}")
	public Payment addPayment(@PathVariable Integer id) throws PaymentException {
		return this.paymentService.getPaymentById(id);
	}
	
	@GetMapping("/findall/payment/{enrollment_id}")
	public Collection<Payment> getAllPayments(@PathVariable("enrollment_id") Integer id) throws PaymentException, ChildPolicyEnrollmentException{
		return this.paymentService.getAllPayments(id);
		
	}
	
	@GetMapping("/createTransaction/{amount}")
	public Payment createTransaction(@PathVariable(name="amount") Double amount) {
		 return paymentService.createTransaction(amount);
		
	}

}
