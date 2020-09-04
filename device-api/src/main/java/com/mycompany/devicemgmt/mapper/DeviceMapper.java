package com.mycompany.devicemgmt.mapper;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;

import com.mycompany.devicemgmt.dto.DeviceDto;
import com.mycompany.devicemgmt.dto.DeviceOwnerDto;
import com.mycompany.devicemgmt.model.Device;
import com.mycompany.devicemgmt.model.DeviceOwner;

@Mapper(componentModel="spring", uses = DeviceOwnerMapper.class)
public abstract class DeviceMapper {
	
	public abstract DeviceDto toDto(Device device);
	
	public abstract Device toEntity(DeviceDto deviceDto);
	
	public List<DeviceDto> toDto(List<Device> devices){
		/*
		 * return devices.stream() .map(deviceOwner -> toDto(deviceOwner))
		 * .collect(Collectors.toList());
		 */
		List<DeviceDto> deviceDtos = Collections.emptyList();
		for (Device device: devices) {
			deviceDtos.add(this.toDto(device));
			
		}
		return deviceDtos;
	}
	
	public List<Device> toEntity(List<DeviceDto> deviceDtos){
		/*
		 * return deviceDtos.stream() .map(deviceDto -> toEntity(deviceDto))
		 * .collect(Collectors.toList());
		 */
		List<Device> devices = Collections.emptyList();
		for (DeviceDto deviceDto: deviceDtos) {
			devices.add(this.toEntity(deviceDto));
			
		}
		return devices;
	}
	

}
