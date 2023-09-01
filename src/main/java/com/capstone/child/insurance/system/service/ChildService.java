package com.capstone.child.insurance.system.service;

import java.util.Collection;

import com.capstone.child.insurance.system.entity.Child;

public interface ChildService {
	
	Child addChild(Child newChild);
	Child getChildById(Integer id);
	Child updateChildById(Child newChild);
	String deleteChildById(Integer id);
	
	Collection<Child> getAllChilderen(Integer id);    
	
	
	

}
