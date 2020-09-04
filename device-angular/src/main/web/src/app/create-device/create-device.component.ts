import { Component, OnInit } from '@angular/core';
import { DeviceService } from '../device.service';
import { Router } from '@angular/router';
import { Device } from '../device';


@Component({
  selector: 'app-create-device',
  templateUrl: './create-device.component.html',
  styleUrls: ['./create-device.component.css']
})
export class CreateDeviceComponent implements OnInit {

  device: Device = new Device();
  submitted = false;

  constructor(private dataService: DeviceService,
    private router: Router) { }

  ngOnInit(): void {
  }

  newDevice(): void {
    this.submitted = false;
    this.device = new Device();
  }

  save() {
    this.dataService
      .createDevice(this.device)
      .subscribe(data => {
        console.log(data);
        this.device = new Device();
        this.gotoList();
      }, 
      error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/devices']);
  }

}
