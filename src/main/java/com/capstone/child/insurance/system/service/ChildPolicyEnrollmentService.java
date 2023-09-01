package com.capstone.child.insurance.system.service;
import java.util.Collection;

import com.capstone.child.insurance.system.entity.ChildPolicyEnrollment;
import com.capstone.child.insurance.system.entity.Payment;


public interface ChildPolicyEnrollmentService {
	

	ChildPolicyEnrollment addCowns(ChildPolicyEnrollment newCOwns);
	ChildPolicyEnrollment getCOwnsById(Integer id);
	ChildPolicyEnrollment updateCOwnsById(ChildPolicyEnrollment newCOwns);
	String deleteCOwnsById(Integer id);
	
	Collection<ChildPolicyEnrollment> getAllCOwns(Integer id);      //Used by: Parent 
	
	Collection<ChildPolicyEnrollment> getAllCOwnsByPolicy(Integer id); //Used by: Admin  (Here, Id is PolicyId)
	
	


}
