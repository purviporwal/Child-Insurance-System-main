package com.capstone.child.insurance.system.service;

import java.util.Collection;

import com.capstone.child.insurance.system.entity.Policy;



public interface PolicyService {
	

	Policy addPolicy(Policy newPolicy);
	Policy getPolicyById(Integer id);
	Policy updatePolicyById(Policy newPolicy);
	String deletePolicyById(Integer id);
	
	Collection<Policy> getAllPolicies();    //Both User and Admin
	

}
