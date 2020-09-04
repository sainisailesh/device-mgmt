
export class DeviceOwner {
  ownerId: number;
  ownerName: string;
  emailId: string; 

}

export class Device {
  deviceId: number;
  deviceName: string;
  deviceType: string; 
  deviceOwners:  DeviceOwner[];
}
