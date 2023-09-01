package com.capstone.child.insurance.system.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.child.insurance.system.dao.ChildRepository;
import com.capstone.child.insurance.system.entity.Child;


@Service 
public class ChildServiceImpl implements ChildService{
	
	@Autowired
	ChildRepository childRepository;

	@Override
	public Child addChild(Child newChild) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Child getChildById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Child updateChildById(Child newChild) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteChildById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Child> getAllChilderen(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
