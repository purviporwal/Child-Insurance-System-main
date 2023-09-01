package com.capstone.child.insurance.system.service;

import java.util.Collection;

import com.capstone.child.insurance.system.entity.HealthClaim;


public interface HealthClaimService {
	
	HealthClaim addHealthClaim(HealthClaim newHealthClaim);
	HealthClaim getHealthClaimById(Integer id);
	HealthClaim updateHealthClaimById(HealthClaim newHealthClaim);
	String deleteHealthClaimById(Integer id);
	
	Collection<HealthClaim> getAllHealthClaims(Integer id); //For User
	Collection<HealthClaim> getAllHealthClaimsForAdmin();     //For Admin

}
