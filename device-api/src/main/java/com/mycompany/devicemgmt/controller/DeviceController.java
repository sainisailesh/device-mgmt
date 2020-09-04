package com.mycompany.devicemgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.devicemgmt.model.Device;
import com.mycompany.devicemgmt.model.DeviceOwner;
import com.mycompany.devicemgmt.service.DeviceControllerService;
import com.mycompany.devicemgmt.service.DeviceService;

@CrossOrigin(origins = {"http://localhost:4200"})
@Controller
@RequestMapping("/api/v1")
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	
	@Autowired
	private DeviceControllerService deviceControllerService;
	
	@PostMapping("/devices")
	public ResponseEntity<Device> createDevice(@RequestBody Device device) {
		Device createDevice = deviceControllerService.createDevice(device);
		return new ResponseEntity<>(createDevice, HttpStatus.CREATED);
	}
	
	@GetMapping("/devices")
	public ResponseEntity<List<Device>> getDevices() {
		return new ResponseEntity<>(deviceControllerService.getDevices(), HttpStatus.OK);
	}
	
	@GetMapping("/devices/{id}")
	public ResponseEntity<Device> getDevice(@PathVariable long id) {
		Optional<Device> optionalDevice = deviceControllerService.getDevice(id);
		if(optionalDevice.isPresent()) {
			return new ResponseEntity<>(optionalDevice.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/devices/{id}/owners")
	public ResponseEntity<List<DeviceOwner>> getDeviceOwners(@PathVariable long id) {
		return new ResponseEntity<>(deviceService.getOwners(id), HttpStatus.OK);
	}
	
	@PutMapping("/devices")
	public ResponseEntity<Device> modifyDevice(Device device) {
		Optional<Device> modifyDevice = deviceControllerService.modifyDevice(device);
		if(modifyDevice.isPresent()) {
			return new ResponseEntity<>(modifyDevice.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	} 
	
	@DeleteMapping("/devices/{id}")
	public ResponseEntity<List<DeviceOwner>> deleteDevice(@PathVariable long id) {
		deviceControllerService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	
	
	

}
