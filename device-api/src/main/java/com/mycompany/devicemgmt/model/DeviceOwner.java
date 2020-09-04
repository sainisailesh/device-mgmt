package com.mycompany.devicemgmt.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deviceOwner")
public class DeviceOwner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ownerId;

	private String ownerName;

	private String emailId;
	
	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		return obj instanceof DeviceOwner && Objects.equals(ownerId, ((DeviceOwner) obj).ownerId);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(ownerId);
	}
	
	@Override
	public String toString() {
		return "deviceOwner: " + ownerId;
	}

}
