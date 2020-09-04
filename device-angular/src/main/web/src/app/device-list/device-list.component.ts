import { Component, OnInit } from '@angular/core';
import { Device } from '../device';
import { Observable } from 'rxjs';
import { DeviceService } from '../device.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-device-list',
  templateUrl: './device-list.component.html',
  styleUrls: ['./device-list.component.css']
})
export class DeviceListComponent implements OnInit {

  devices: Observable<Device[]>;

  constructor(private deviceService: DeviceService, 
      private router: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.devices = this.deviceService.getDevices();
    console.log(this.devices);
  }

  deleteDevice(id: number) {
    this.deviceService.deleteDevice(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  updateDevice(id: number) {
    this.router.navigate(['update', id]);
  }

}
