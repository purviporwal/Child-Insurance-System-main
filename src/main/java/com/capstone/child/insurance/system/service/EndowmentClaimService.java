package com.capstone.child.insurance.system.service;

import java.util.Collection;

import com.capstone.child.insurance.system.entity.EndowmentClaim;



public interface EndowmentClaimService {
	

	EndowmentClaim addEndowmentClaim(EndowmentClaim newEndowmentClaim);
	EndowmentClaim getEndowmentClaimById(Integer id);
	EndowmentClaim updateEndowmentClaimById(EndowmentClaim newEndowmentClaim);
	String deleteChildById(Integer id);
	
	Collection<EndowmentClaim> getAllEndowmentClaims(Integer id);  //For User
	
	Collection<EndowmentClaim> getAllEndowmentClaimsForAdmin();  //For Admin
	


}
