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
import lombok.*;

//@Data
@Getter
@Setter
//@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="technology")
public class Technology {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int technologyId;
		
	@Column(nullable = false,unique = true,length=30)
	private String technologyName;
	
	@ManyToOne
	@JoinColumn(name="resource_type_id")
	private DeveloperType resourceType1;
	
	@OneToMany(mappedBy = "tech1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<TechnologySpecialization>  technologiSpecializations;

}
