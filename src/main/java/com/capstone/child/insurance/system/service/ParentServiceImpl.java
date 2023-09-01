package com.capstone.child.insurance.system.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.child.insurance.system.dao.ParentRepository;
import com.capstone.child.insurance.system.entity.Parent;



@Service
public class ParentServiceImpl implements ParentService{
	@Autowired
	ParentRepository parentRepository;

	@Override
	public Parent addParent(Parent newParent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parent getParentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parent updateParentById(Parent newParent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteParentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Parent> getAllParents() {
		// TODO Auto-generated method stub
		return null;
	}

}
