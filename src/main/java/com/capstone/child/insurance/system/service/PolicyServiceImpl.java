package com.capstone.child.insurance.system.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.child.insurance.system.dao.PolicyRepository;
import com.capstone.child.insurance.system.entity.Policy;

@Service
public class PolicyServiceImpl implements PolicyService{
	
	@Autowired
	PolicyRepository policyRepository;

	@Override
	public Policy addPolicy(Policy newPolicy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Policy getPolicyById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Policy updatePolicyById(Policy newPolicy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePolicyById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Policy> getAllPolicies() {
		// TODO Auto-generated method stub
		return null;
	}

}
