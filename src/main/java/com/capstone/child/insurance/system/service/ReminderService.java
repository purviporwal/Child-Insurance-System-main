package com.capstone.child.insurance.system.service;

import java.util.Collection;

import com.capstone.child.insurance.system.entity.Reminder;



public interface ReminderService {
	

	Reminder addReminder(Reminder newReminder);
	Reminder getReminderById(Integer id);
	Reminder updateReminderById(Reminder newReminder);
	String deleteReminderById(Integer id);
	
	Collection<Reminder> getAllReminders();
	


}
