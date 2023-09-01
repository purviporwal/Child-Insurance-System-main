package com.capstone.child.insurance.system.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.child.insurance.system.dao.ReminderRepository;
import com.capstone.child.insurance.system.entity.Reminder;


@Service
public class ReminderServiceImpl implements ReminderService{
	
	@Autowired
	ReminderRepository reminderRepository;

	@Override
	public Reminder addReminder(Reminder newReminder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reminder getReminderById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reminder updateReminderById(Reminder newReminder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteReminderById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Reminder> getAllReminders() {
		// TODO Auto-generated method stub
		return null;
	}

}
