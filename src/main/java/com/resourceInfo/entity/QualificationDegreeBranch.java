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
@Table(name="qly_Specialization")
public class QualificationDegreeBranch {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int specializationId;

		@Column(nullable = false,unique = true,length=30)
		private String specialaizationName;
		
		@ManyToOne
		@JoinColumn(name="degree_id")
		private QualificationDegree degree1;

}
