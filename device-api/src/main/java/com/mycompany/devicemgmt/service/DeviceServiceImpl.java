package com.mycompany.devicemgmt.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.devicemgmt.model.Device;
import com.mycompany.devicemgmt.model.DeviceOwner;
import com.mycompany.devicemgmt.repository.DeviceRepository;

@Service
public class DeviceServiceImpl implements DeviceService {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@Override
	public List<Device> getDevices() {
		return deviceRepository.findAll();
	}
	
	@Override
	public Device save(Device device) {
		return deviceRepository.save(device);
	}
	
	@Override
	public List<DeviceOwner> getOwners(Long deviceId) {
		Optional<Device> optionalDevice = deviceRepository.findById(deviceId);
		if (optionalDevice.isPresent()) {
			return optionalDevice.get().getDeviceOwners();
		}
		
		return Collections.emptyList();
	}
	
	@Override
	public Optional<Device> findById(Long deviceId) {
		return deviceRepository.findById(deviceId);
	}
	
	@Override
	public void delete(Device device) {
		deviceRepository.delete(device);
	}
	

}
