package com.mycompany.devicemgmt.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "device")
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deviceId;

	private String deviceName;

	private String deviceType;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "deviceOwnerMap", joinColumns = { @JoinColumn(name = "deviceId") }, inverseJoinColumns = {
			@JoinColumn(name = "ownerId") })
	private List<DeviceOwner> deviceOwners = new ArrayList<>();
	
	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public List<DeviceOwner> getDeviceOwners() {
		return deviceOwners;
	}

	public void setDeviceOwners(List<DeviceOwner> deviceOwners) {
		this.deviceOwners = deviceOwners;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		return obj instanceof Device && Objects.equals(deviceId, ((Device) obj).deviceId);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(deviceId);
	}
	
	@Override
	public String toString() {
		return "deviceId: " + deviceId + " ---- " + deviceOwners;
	}

}
