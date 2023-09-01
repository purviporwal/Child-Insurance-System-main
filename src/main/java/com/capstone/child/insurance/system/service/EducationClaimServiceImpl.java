package com.capstone.child.insurance.system.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.child.insurance.system.dao.EducationClaimRepository;
import com.capstone.child.insurance.system.entity.EducationClaim;


@Service
public class EducationClaimServiceImpl implements EducationClaimService{
	@Autowired
	EducationClaimRepository educationClaimRepository;

	@Override
	public EducationClaim addEducationClaim(EducationClaim newEducationClaim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EducationClaim getEducationClaimById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EducationClaim updateChildById(EducationClaim newEducationClaim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEducationClaimById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<EducationClaim> getAllEducationClaims(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<EducationClaim> getAllEducationClaimsForAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

}
