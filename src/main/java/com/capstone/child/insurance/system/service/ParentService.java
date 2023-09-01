package com.capstone.child.insurance.system.service;

import java.util.Collection;

import com.capstone.child.insurance.system.entity.Parent;


public interface ParentService {
	
	Parent addParent(Parent newParent);
	Parent getParentById(Integer id);
	Parent updateParentById(Parent newParent);
	String deleteParentById(Integer id);
	
	Collection<Parent> getAllParents(); //For Admin

}
