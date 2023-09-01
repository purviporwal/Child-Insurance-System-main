package com.capstone.child.insurance.system.service;

import java.util.Collection;
import java.util.Optional;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capstone.child.insurance.system.dao.ChildPolicyEnrollmentRepository;
import com.capstone.child.insurance.system.dao.PaymentRepository;
import com.capstone.child.insurance.system.entity.ChildPolicyEnrollment;
import com.capstone.child.insurance.system.entity.Payment;
import com.capstone.child.insurance.system.entity.TransactionDetail;
import com.capstone.child.insurance.system.exceptions.ChildPolicyEnrollmentException;
import com.capstone.child.insurance.system.exceptions.PaymentException;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Service
public class PaymentServiceImpl implements PaymentService {

	private static final String Key = "rzp_test_VbC7NGr6egY8lJ";
	private static final String Key_Secret ="RQd8f4zAYIveDzTtKFR97Kt1";
	private static final String currency = "INR";

	@Autowired
	PaymentRepository paymentRepo;
	ChildPolicyEnrollmentRepository childPolicyRepo;

	@Override
	public Payment addPayment(Payment newPayment) {


		return this.paymentRepo.save(newPayment);
	}

	@Override
	public Payment getPaymentById(Integer id) throws PaymentException {

		Optional<Payment> paymentOpt = this.paymentRepo.findById(id);
		if (!paymentOpt.isPresent())
			throw new PaymentException("Payment not found for this: " + id);

		return paymentOpt.get();

	}

	@Override
	public Collection<Payment> getAllPayments(Integer EnrollmentId)
			throws ChildPolicyEnrollmentException, PaymentException {


		Optional<ChildPolicyEnrollment> EnrollmentOpt = this.childPolicyRepo.findById(EnrollmentId);
		if (!EnrollmentOpt.isPresent()) {
			throw new ChildPolicyEnrollmentException("No enrollment Found");
		}

		Collection<Payment> payments = (Collection<Payment>) paymentRepo.findAllByEnrollment(EnrollmentOpt.get());
		if (payments.isEmpty()) {
			throw new PaymentException("No payments found");
		}
		return payments;

	}

	@Override
	public Payment createTransaction(Double amount) {

		try {

			JSONObject jsonObject = new JSONObject();
			jsonObject.put("amount", (amount * 100));
			jsonObject.put("currency", currency);

			RazorpayClient razorpayClient = new RazorpayClient(Key, Key_Secret);
			
			com.razorpay.Payment payment = razorpayClient.payments.createJsonPayment(jsonObject);
			
			Payment payment1 =prepareTransactionDetail(payment);

			
			return payment1;

		} catch (RazorpayException e) {

			System.out.println("Error!"+ e.getMessage());
		}
		return null;



	}

	@Override
	public Payment prepareTransactionDetail(com.razorpay.Payment payment) {

		Integer paymentId = payment.get("id");
		Double amountPaid = payment.get("amount");

		Payment payment1 = new Payment(paymentId, amountPaid);
		return payment1;

	}
}