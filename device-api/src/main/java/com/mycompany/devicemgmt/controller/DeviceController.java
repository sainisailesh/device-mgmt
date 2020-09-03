package com.mycompany.devicemgmt.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.devicemgmt.dto.DeviceDto;

@RestController
public class DeviceController {

	@PostMapping("/devices")
	public DeviceDto createDevice(DeviceDto device) {
		return null;
	}
	
	
	@GetMapping("/devices")
	public Set<DeviceDto> getDevices() {
		return null;
	}
	
	@GetMapping("/devices/{id}/owners")
	public Set<DeviceDto> getDeviceOwners(@PathVariable long id) {
		return null;
	}
	
	@PutMapping("/devices")
	public DeviceDto modifyDevice(DeviceDto device) {
		return null;
	}
	
	
	
	

}
