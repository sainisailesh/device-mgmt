package com.mycompany.devicemgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.devicemgmt.model.Device;

@Service
public class DeviceControllerServiceImpl implements DeviceControllerService {
	
	@Autowired
	private DeviceService deviceService;
	
	@Override
	public Device createDevice(Device device) {
		return deviceService.save(device);
	}
	
	@Override
	public List<Device> getDevices() {
		return deviceService.getDevices();
	}
	
	@Override
	public Optional<Device> modifyDevice(Device device) {
		Optional<Device> optionalDevice = deviceService.findById(device.getDeviceId());
		if(optionalDevice.isPresent()) {
			 return Optional.of(deviceService.save(optionalDevice.get()));
		}
		return optionalDevice;
		
	}
	
	@Override
	public void delete(Long deviceId) {
		Optional<Device> optionalDevice = deviceService.findById(deviceId);
		if(optionalDevice.isPresent()) {
			deviceService.delete(optionalDevice.get());
		}
	}

}
