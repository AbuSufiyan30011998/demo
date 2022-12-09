package com.resourceInfo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DomainKnowledge {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long domainId;
	private String domainKnowledge;

	public DomainKnowledge() {
		super();
	}

	public DomainKnowledge(long domainId, String domainKnowledge) {
		super();
		this.domainId = domainId;
		this.domainKnowledge = domainKnowledge;
	}

	public long getDomainId() {
		return domainId;
	}

	public void setDomainId(long domainId) {
		this.domainId = domainId;
	}

	public String getDomainKnowledge() {
		return domainKnowledge;
	}

	public void setDomainKnowledge(String domainKnowledge) {
		this.domainKnowledge = domainKnowledge;
	}

	@Override
	public String toString() {
		return "DomainKnowledge [domainId=" + domainId + ", domainKnowledge=" + domainKnowledge + "]";
	}

}
