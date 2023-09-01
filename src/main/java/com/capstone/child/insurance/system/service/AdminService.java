package com.capstone.child.insurance.system.service;

import com.capstone.child.insurance.system.entity.Admin;

public interface AdminService {
	
	Admin addAdmin(Admin newAdmin);
	String deleteAdmin(Integer id);

}
