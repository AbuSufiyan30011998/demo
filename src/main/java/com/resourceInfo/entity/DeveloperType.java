package com.resourceInfo.entity;

import java.util.ArrayList;
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

//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="resourceType")
public class DeveloperType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resourceTypeId;
	
	@Column(nullable = false,unique = true,length=30)
	private String resourceTypeName;
	
	@OneToMany(mappedBy = "resourceType1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Technology> technologies= new ArrayList<>();



}
