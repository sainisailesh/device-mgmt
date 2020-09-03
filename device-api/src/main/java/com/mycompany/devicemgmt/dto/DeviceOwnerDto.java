package com.mycompany.devicemgmt.dto;

import java.util.Objects;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeviceOwnerDto {
    private Long ownerId;
	
	private String ownerName;
	
	private String emailId;
	
	private Set<DeviceDto> devices ;
	
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
