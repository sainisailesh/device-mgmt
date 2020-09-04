import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DeviceListComponent } from './device-list/device-list.component';

const routes: Routes = [
  { path: '', redirectTo: 'device', pathMatch: 'full' },
  { path: 'devices', component: DeviceListComponent },
  //{ path: 'add', component: CreateDeviceComponent },
  //{ path: 'update/:id', component: UpdateDeviceComponent },
  //{ path: 'details/:id', component: DeviceDetailsComponent },
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
