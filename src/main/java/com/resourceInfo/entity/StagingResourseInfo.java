package com.resourceInfo.entity;

import lombok.Data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name ="stg_resource_info")
public class StagingResourseInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trrId;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@Column(nullable = false)
	private Date lastSavedOn = new Date();
	
	@Column(nullable = false)
	private Date availabilityDate;
	
	@Column(nullable = false)
	private String country;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false)
	private boolean readyToWorkInShifts = false;
	
	@Column
	private String typeOfDeveloper;

	@Column
	private String hiringType;

	@Column
	private String  selectedTechnology;
	
	@Column
	private String  techSpecialization;
	
	@Column
	private String qualification;
	
	@Column
	private String domainKnowledges;
	
	@Column
	private Date approvedOn;

	@Column
	private String qualificationDegree;
	
	@Column
	private String qualificationSpecialization;
	
	@Column
	private String qualificationPostDegree;
	
	@Column
	private String qualificationPostSpecialization;

	
	@Column(nullable = false)
	private boolean relocationStatus = false;
	
	@Column(nullable = false)
	private int relocationPeriod = 30;
	
	@Column(nullable = false)
	private boolean visa = false;
	
	@Column(nullable = false)
	private int positions = 30;
	
	@Column(nullable = false)
	private int yearsOfExp = 0;
	
	@Column(nullable = false)
	private boolean passportStatus = false;
	
	@Column(nullable = false, length=8)
	private long salesOrderNo;
	
	@Column(nullable = false)
	private long noOfJRs=0;
	
	@Column
	private String jd;

	@Column
	private String timezone;
	
	@Column
	private String otherEducation;
		
	@Column
	private String otherSpecializations;
	
	//@Column
	//private String unitName;


}
