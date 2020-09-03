package com.mycompany.devicemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.devicemgmt.model.DeviceOwner;

public interface DeviceOwnerRepository extends JpaRepository<DeviceOwner, Long> {
	
}
