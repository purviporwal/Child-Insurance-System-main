package com.capstone.child.insurance.system.entity;

import java.time.LocalDate;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKeyJoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Child {

	// Enums

	public enum relationship {
		Parent, Guardian
	}

	public enum Gender {
		Male, Female, Other
	}

	// Attributes

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer childId; // child id
	private String childName; // Child name
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate childDob; // Child date of birth
	private String childUID; // Child unique identification number (child_aadhar)

	@Enumerated(EnumType.STRING)
	private Gender childGender; // Child gender

	@Enumerated(EnumType.STRING)
	private relationship relationship; // Your relationship to child (Parent or guardian)

	@ManyToOne
	@JoinColumn(name = "parentId")
	private Parent parent;

	@ManyToMany
	@JoinTable(name = "child_policy", joinColumns = @JoinColumn(name = "childId"), inverseJoinColumns = @JoinColumn(name = "policyId"))
	@MapKeyJoinColumn(name = "policyEnrollmentId")
	private Map<Policy, ChildPolicyEnrollment> policyEnrollments = new HashMap<>();

	@OneToMany(mappedBy = "child")
	private List<HealthClaim> healthClaims = new ArrayList<>();

	@OneToMany(mappedBy = "child")
	private List<EducationClaim> educationClaims = new ArrayList<>();

	@OneToOne(mappedBy = "child")
	private EndowmentClaim endowmentClaim;

	// Constructors

	public Child() {
		super();
	}	
	

	public Child( String childName, LocalDate childDob, String childUID, Gender childGender,
			com.capstone.child.insurance.system.entity.Child.relationship relationship, Parent parent,
			Map<Policy, ChildPolicyEnrollment> policyEnrollments, List<HealthClaim> healthClaims,
			List<EducationClaim> educationClaims, EndowmentClaim endowmentClaim) {
		super();
		
		this.childName = childName;
		this.childDob = childDob;
		this.childUID = childUID;
		this.childGender = childGender;
		this.relationship = relationship;
		this.parent = parent;
		this.policyEnrollments = policyEnrollments;
		this.healthClaims = healthClaims;
		this.educationClaims = educationClaims;
		this.endowmentClaim = endowmentClaim;
	}

	// Getters and Setters

	public Integer getChildId() {
		return childId;
	}

	public void setChildId(Integer childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public LocalDate getChildDob() {
		return childDob;
	}

	public void setChildDob(LocalDate childDob) {
		this.childDob = childDob;
	}

	public String getChildUID() {
		return childUID;
	}

	public void setChildUID(String childUID) {
		this.childUID = childUID;
	}

	public Gender getChildGender() {
		return childGender;
	}

	public void setChildGender(Gender childGender) {
		this.childGender = childGender;
	}

	public relationship getRelationship() {
		return relationship;
	}

	public void setRelationship(relationship relationship) {
		this.relationship = relationship;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Map<Policy, ChildPolicyEnrollment> getPolicyEnrollments() {
		return policyEnrollments;
	}

	public void setPolicyEnrollments(Map<Policy, ChildPolicyEnrollment> policyEnrollments) {
		this.policyEnrollments = policyEnrollments;
	}

	public List<HealthClaim> getHealthClaims() {
		return healthClaims;
	}

	public void setHealthClaims(List<HealthClaim> healthClaims) {
		this.healthClaims = healthClaims;
	}

	public List<EducationClaim> getEducationClaims() {
		return educationClaims;
	}

	public void setEducationClaims(List<EducationClaim> educationClaims) {
		this.educationClaims = educationClaims;
	}

	public EndowmentClaim getEndowmentClaim() {
		return endowmentClaim;
	}

	public void setEndowmentClaim(EndowmentClaim endowmentClaim) {
		this.endowmentClaim = endowmentClaim;
	}

}
