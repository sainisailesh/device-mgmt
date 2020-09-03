package com.mycompany.devicemgmt.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "deviceOwner")
public class DeviceOwner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ownerId;

	private String ownerName;

	private String emailId;

	@ManyToMany(mappedBy = "deviceOwners", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Device> devices;

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		return obj instanceof DeviceOwner && Objects.equals(ownerId, ((DeviceOwner) obj).ownerId);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(ownerId);
	}

}
