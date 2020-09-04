package com.mycompany.devicemgmt.dto;

import java.util.Objects;
import java.util.Set;

public class DeviceOwnerDto {
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
		 if(this == obj) {
			 return true;
		 }
		 return obj instanceof DeviceOwnerDto && Objects.equals(ownerId, ((DeviceOwnerDto) obj).ownerId);
	 }
	 
	 @Override
	 public int hashCode() {
		 return Objects.hashCode(ownerId);
	 }
	

	
	
}
