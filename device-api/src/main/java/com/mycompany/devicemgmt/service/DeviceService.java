package com.mycompany.devicemgmt.service;

import java.util.List;
import java.util.Optional;

import com.mycompany.devicemgmt.model.Device;
import com.mycompany.devicemgmt.model.DeviceOwner;

public interface DeviceService {
	
	List<Device> getDevices();
	
	Device save(Device device);
	
	List<DeviceOwner> getOwners(Long deviceId);
	
	Optional<Device> findById(Long deviceId);
	
	void delete(Device device);

}
