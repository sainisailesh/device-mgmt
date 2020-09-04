package com.mycompany.devicemgmt.service;

import java.util.List;
import java.util.Optional;

import com.mycompany.devicemgmt.model.Device;

public interface DeviceControllerService {
	
	Device createDevice(Device device);
	
	List<Device> getDevices();
	
	 Optional<Device> modifyDevice(Device device);
	 
	 void delete(Long deviceId);

}
