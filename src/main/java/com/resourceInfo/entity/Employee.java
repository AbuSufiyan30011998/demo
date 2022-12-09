package com.resourceInfo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;


@Getter
@Setter

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;

	@Column(nullable = false)
	private String employeeName;

	@Column(nullable = false, unique = true)
	private String employeeEmail;

	@Column
	private String employeePassword;

	@Column(nullable = false)
	private int managerId;

	@Column(nullable= false)
	private String managerName;
	
	private String unitName;

	private String jobTitle;

	private String grade;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<StagingResourseInfo> trrs;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<MasterResourceInfo> rrId;

	public Employee(int id, String empName, String unit, int mId, String mName) {
		this.employeeId = id;
		this.employeeName = empName;
		this.unitName = unit;
		this.managerId = mId;
		this.managerName = mName;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", managerId=" + managerId
				+ ", managerName=" + managerName + ", unitName=" + unitName + "]";
	}

	
	}
