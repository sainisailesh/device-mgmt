import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateDeviceComponent } from './create-device/create-device.component';
import { DeviceListComponent } from './device-list/device-list.component';
import { HttpClientModule } from '@angular/common/http';
import { DeviceService } from './device.service';

@NgModule({
  declarations: [
    AppComponent,
    CreateDeviceComponent,
    DeviceListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [DeviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
