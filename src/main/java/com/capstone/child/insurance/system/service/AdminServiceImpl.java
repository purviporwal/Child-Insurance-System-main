package com.capstone.child.insurance.system.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capstone.child.insurance.system.dao.AdminRepository;
import com.capstone.child.insurance.system.entity.Admin;



@Service 
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminRepository;

	@Override
	public Admin addAdmin(Admin newAdmin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAdmin(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
