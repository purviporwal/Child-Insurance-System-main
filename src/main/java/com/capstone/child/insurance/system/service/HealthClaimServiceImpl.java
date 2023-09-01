package com.capstone.child.insurance.system.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.child.insurance.system.dao.HealthClaimRepository;
import com.capstone.child.insurance.system.entity.HealthClaim;



@Service
public class HealthClaimServiceImpl implements HealthClaimService{
	
	@Autowired
	HealthClaimRepository healthClaimRepository;

	@Override
	public HealthClaim addHealthClaim(HealthClaim newHealthClaim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HealthClaim getHealthClaimById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HealthClaim updateHealthClaimById(HealthClaim newHealthClaim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteHealthClaimById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<HealthClaim> getAllHealthClaims(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<HealthClaim> getAllHealthClaimsForAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

}
