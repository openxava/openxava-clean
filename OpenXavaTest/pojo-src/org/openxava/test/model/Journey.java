package org.openxava.test.model;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

/**
 * 
 * @author Javier Paniza
 */

@Entity
public class Journey {
	
	@Id @Hidden
	private String oid;	
	
	@Column(length=20)
	private String name;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private AverageSpeed averageSpeed;
		
	@Column(length=40)
	private String description;
	
	@PrePersist
	private void generateOid() { 
		oid = "z" + System.currentTimeMillis();
	}
	
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AverageSpeed getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(AverageSpeed averageSpeed) {
		this.averageSpeed = averageSpeed;
	}
	
}
