package com.mycompany.devicemgmt.mapper;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;

import com.mycompany.devicemgmt.dto.DeviceDto;
import com.mycompany.devicemgmt.dto.DeviceOwnerDto;
import com.mycompany.devicemgmt.model.Device;
import com.mycompany.devicemgmt.model.DeviceOwner;

@Mapper(componentModel ="spring")
public abstract class DeviceOwnerMapper {

	public abstract DeviceOwnerDto toDto(DeviceOwner deviceOwner);
	
	public abstract DeviceOwner toEntity(DeviceOwnerDto deviceOwnerDto);
	
	public List<DeviceOwnerDto> toDto(List<DeviceOwner> deviceOwners){
		/*
		 * return deviceOwners.stream() .map(deviceOwner -> toDto(deviceOwner))
		 * .collect(Collectors.toList());
		 */
		
		List<DeviceOwnerDto> deviceOwnerDtos = Collections.emptyList();
		for (DeviceOwner owner: deviceOwners) {
			deviceOwnerDtos.add(this.toDto(owner));
			
		}
		return deviceOwnerDtos;
	}
	
	public List<DeviceOwner> toEntity(List<DeviceOwnerDto> deviceOwnerDtos){
		/*
		 * return deviceOwnerDtos.stream() .map(deviceOwnerDto ->
		 * toEntity(deviceOwnerDto)) .collect(Collectors.toList());
		 */
		List<DeviceOwner> deviceOwners = Collections.emptyList();
		for (DeviceOwnerDto ownerDto: deviceOwnerDtos) {
			deviceOwners.add(this.toEntity(ownerDto));
			
		}
		return deviceOwners;
	}
}
