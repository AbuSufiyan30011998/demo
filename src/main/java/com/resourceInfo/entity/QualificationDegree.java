package com.resourceInfo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
@Entity
@Table(name="qly_Degree")
public class QualificationDegree {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int degreeId;
	
//	@Column(nullable = false,length=30)
//	private String qlyId;
	
	@Column(nullable = false,unique = true,length=30)
	private String degreeName;
	
	@ManyToOne
	@JoinColumn(name="qualification_id")
	private Qualification qualification1;
	
	@OneToMany(mappedBy = "degree1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<QualificationDegreeBranch> specilization1;

}
