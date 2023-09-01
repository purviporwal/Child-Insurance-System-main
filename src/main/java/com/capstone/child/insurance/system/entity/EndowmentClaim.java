package com.capstone.child.insurance.system.entity;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


@Entity
public class EndowmentClaim {
	

	// Enums

	public enum endowmentApproval {
		 Approved, Declined
	}
	
	//Attributes

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer endowmentClaimId; // endowment claim id
	private Integer childAge; // Child age
	
	@Enumerated(EnumType.STRING)
	private endowmentApproval approval;             //Claim has been approved or not
	

    @OneToOne
    @JoinColumn(name = "childId")
    private Child child;

    @ManyToOne
    @JoinColumn(name = "policyId")
    private Policy policy;
	
	//Constructors
	
	public EndowmentClaim() {
		super();
	}
	
	
	
	public EndowmentClaim(Integer childAge, endowmentApproval approval, Child child, Policy policy) {
		super();
		this.childAge = childAge;
		this.approval = approval;
		this.child = child;
		this.policy = policy;
	}



	//Getters and setters

	public Integer getEndowmentClaimId() {
		return endowmentClaimId;
	}

	public void setEndowmentClaimId(Integer endowmentClaimId) {
		this.endowmentClaimId = endowmentClaimId;
	}

	public Integer getChildAge() {
		return childAge;
	}

	public void setChildAge(Integer childAge) {
		this.childAge = childAge;
	}

	public endowmentApproval getApproval() {
		return approval;
	}

	public void setApproval(endowmentApproval approval) {
		this.approval = approval;
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
