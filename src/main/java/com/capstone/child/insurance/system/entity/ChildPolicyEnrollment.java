package com.capstone.child.insurance.system.entity;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class ChildPolicyEnrollment {
	
	//Enums
		public enum status {
			Active, Claimed, Expired
		}
		
    //Attributes
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer policyEnrollmentId;               //unique mapping id	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate startDate;                 //Policy Start Date
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate endDate;                 //Policy End Date
	private Double amountPaid;               //Amount Paid
	private Double monthlyDue;                //Monthly Due
	@Enumerated(EnumType.STRING)
	private status status;              // Ongoing or Claimed or Expired
	

    @OneToOne(mappedBy = "enrollment")
    private Reminder reminder;
    

    @OneToMany(mappedBy = "enrollment")
    private List<Payment> payments;
	
    @ManyToOne
    @JoinColumn(name = "childId")
    private Child child;

    @ManyToOne
    @JoinColumn(name = "policyId")
    private Policy policy;

	//Constructors

	public ChildPolicyEnrollment() {
			super();
		}

	public ChildPolicyEnrollment( LocalDate startDate, LocalDate endDate, Double amountPaid,
			Double monthlyDue, com.capstone.child.insurance.system.entity.ChildPolicyEnrollment.status status,
			Reminder reminder, List<Payment> payments, Child child, Policy policy) {
		super();
		
		this.startDate = startDate;
		this.endDate = endDate;
		this.amountPaid = amountPaid;
		this.monthlyDue = monthlyDue;
		this.status = status;
		this.reminder = reminder;
		this.payments = payments;
		this.child = child;
		this.policy = policy;
	}
	
	//Getters and setters

	public Integer getPolicyEnrollmentId() {
		return policyEnrollmentId;
	}

	public void setPolicyEnrollmentId(Integer policyEnrollmentId) {
		this.policyEnrollmentId = policyEnrollmentId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Double getMonthlyDue() {
		return monthlyDue;
	}

	public void setMonthlyDue(Double monthlyDue) {
		this.monthlyDue = monthlyDue;
	}

	public status getStatus() {
		return status;
	}

	public void setStatus(status status) {
		this.status = status;
	}

	public Reminder getReminder() {
		return reminder;
	}

	public void setReminder(Reminder reminder) {
		this.reminder = reminder;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	
	


		
	

}
