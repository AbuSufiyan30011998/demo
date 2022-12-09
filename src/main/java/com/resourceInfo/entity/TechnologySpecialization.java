package com.resourceInfo.entity;

import lombok.Data;

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
@Table(name="technology_Specialization")
public class TechnologySpecialization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int techSpecializationId;

	@Column(nullable = false,unique = true,length=30)
	private String techSpecialaizationName;
	
	@ManyToOne
	@JoinColumn(name="technology_id")
	private Technology tech1;

}
