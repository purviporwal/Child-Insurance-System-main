package com.capstone.child.insurance.system.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Reminder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer reminderId; // unique due id
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate nextDueDate; // next due date
	private Double due; // monthly due to be paid

	@OneToOne
	@JoinColumn(name = "enrollmentId")
	private ChildPolicyEnrollment enrollment;

	public Reminder() {
		super();
	}

	public Reminder(LocalDate nextDueDate, Double due, ChildPolicyEnrollment enrollment) {
		super();
		this.nextDueDate = nextDueDate;
		this.due = due;
		this.enrollment = enrollment;
	}

	public Integer getReminderId() {
		return reminderId;
	}

	public void setReminderId(Integer reminderId) {
		this.reminderId = reminderId;
	}

	public LocalDate getNextDueDate() {
		return nextDueDate;
	}

	public void setNextDueDate(LocalDate nextDueDate) {
		this.nextDueDate = nextDueDate;
	}

	public Double getDue() {
		return due;
	}

	public void setDue(Double due) {
		this.due = due;
	}

	public ChildPolicyEnrollment getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(ChildPolicyEnrollment enrollment) {
		this.enrollment = enrollment;
	}

}