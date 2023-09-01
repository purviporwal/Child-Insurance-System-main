package com.capstone.child.insurance.system.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.child.insurance.system.dao.EndowmentClaimRepository;
import com.capstone.child.insurance.system.entity.EndowmentClaim;

@Service
public class EndowmentClaimServiceImpl implements EndowmentClaimService{
	
	@Autowired
	EndowmentClaimRepository endowmentClaimRepository;
	
	@Override
	public EndowmentClaim addEndowmentClaim(EndowmentClaim newEndowmentClaim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EndowmentClaim getEndowmentClaimById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EndowmentClaim updateEndowmentClaimById(EndowmentClaim newEndowmentClaim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteChildById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<EndowmentClaim> getAllEndowmentClaims(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<EndowmentClaim> getAllEndowmentClaimsForAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

}
