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
import lombok.Data;

@Data
@Entity
@Table(name="country")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int countryId;
	
	@Column(nullable = false,unique = true,length=30)
	private String countryName;
	
	@OneToMany(mappedBy = "country1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<State> states= new ArrayList<>();


}
