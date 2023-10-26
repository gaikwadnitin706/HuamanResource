package com.example.hrms.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Employee {

	@Id
	private String employeeId;
	private String employeeFirstnName;
	private String employeeLastName;
	private String employeEmail;
	private String employeeContactNumber;
	private LocalDate employeeJoiningDate;
	private String employeeDepartment;
	private String employeeDesignation;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	private List<LeaveRequest> leaveRequests;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	private List<PerformanceReview> performanceReviews;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Skill> skills;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<TrainingProgram> trainingPrograms;
}
