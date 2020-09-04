package com.mycompany.devicemgmt.dto;

import java.util.List;
import java.util.Objects;

public class DeviceDto {
	
	private Long deviceId;

	private String deviceName;

	private String deviceType;

	private List<DeviceOwnerDto> deviceOwnerDto;

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

	public List<DeviceOwnerDto> getDeviceOwnerDto() {
		return deviceOwnerDto;
	}

	public void setDeviceOwnerDto(List<DeviceOwnerDto> deviceOwnerDto) {
		this.deviceOwnerDto = deviceOwnerDto;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		return obj instanceof DeviceDto && Objects.equals(deviceId, ((DeviceDto) obj).deviceId);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(deviceId);
	}

}
