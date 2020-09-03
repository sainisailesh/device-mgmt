package com.mycompany.devicemgmt.model;

import java.util.Objects;
import java.util.Set;

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

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "device")
public class Device {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deviceId;

	private String deviceName;

	private String deviceType;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL})
	@JoinTable(name = "deviceOwnerMap", joinColumns = { @JoinColumn(name = "deviceId") }, inverseJoinColumns = {
			@JoinColumn(name = "ownerId") })
	private Set<DeviceOwner> deviceOwners;

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

}
