package com.capstone.child.insurance.system.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.child.insurance.system.dao.ChildPolicyEnrollmentRepository;
import com.capstone.child.insurance.system.entity.ChildPolicyEnrollment;
import com.capstone.child.insurance.system.entity.Payment;


@Service
public class ChildPolicyEnrollmentServiceImpl implements ChildPolicyEnrollmentService{
	
	@Autowired
	ChildPolicyEnrollmentRepository cOwnsRepository;

	@Override
	public ChildPolicyEnrollment addCowns(ChildPolicyEnrollment newCOwns) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChildPolicyEnrollment getCOwnsById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChildPolicyEnrollment updateCOwnsById(ChildPolicyEnrollment newCOwns) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCOwnsById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ChildPolicyEnrollment> getAllCOwns(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ChildPolicyEnrollment> getAllCOwnsByPolicy(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
