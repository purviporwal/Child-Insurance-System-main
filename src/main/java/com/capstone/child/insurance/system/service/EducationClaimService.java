package com.capstone.child.insurance.system.service;

import java.util.Collection;

import com.capstone.child.insurance.system.entity.EducationClaim;



public interface EducationClaimService {
	

	EducationClaim addEducationClaim(EducationClaim newEducationClaim);
	EducationClaim getEducationClaimById(Integer id);
	EducationClaim updateChildById(EducationClaim newEducationClaim);
	String deleteEducationClaimById(Integer id);
	
	Collection<EducationClaim> getAllEducationClaims(Integer id);     //For User
	
	Collection<EducationClaim> getAllEducationClaimsForAdmin();   //For Admin


}
