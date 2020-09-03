package com.mycompany.devicemgmt.dto;

import java.util.Objects;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeviceDto {
	private Long deviceId;

	private String deviceName;

	private String deviceType;

	private Set<DeviceOwnerDto> deviceOwner;
	//private DeviceOwnerDto deviceOwner;

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
