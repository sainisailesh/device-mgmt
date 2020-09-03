package com.mycompany.devicemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.devicemgmt.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {
	
}
