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

@Entity
@Table(name="state")
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stateId;

	
	@Column(nullable = false,unique = true,length=30)
	private String stateName;
	
	@ManyToOne
	@JoinColumn(name="country_id")
	private Country country1 ;
	
	@OneToMany(mappedBy = "state1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<City>  cities;

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	
	public Country getCountry1() {
		return country1;
	}

	public void setCountry1(Country country1) {
		this.country1 = country1;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", StateName=" + stateName + ", country1=" + country1 + ", cities="
				+ cities + "]";
	}

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
