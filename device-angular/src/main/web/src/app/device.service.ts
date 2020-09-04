import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Device } from './device';

@Injectable({
  providedIn: 'root'
})
export class DeviceService {

  private baseUrl = "http://localhost:8080/api/v1";

  constructor(private http: HttpClient) { }

  getDevices(): Observable<any> {
    return this.http.get(`${this.baseUrl}/devices`);
  }

  createDevice(device: Device): Observable<Object>  {
    return this.http.post(`${this.baseUrl}/devices`, device);
  }

  updateDevice(id: number, device: Device): Observable<any> {
    return this.http.put(`${this.baseUrl}/devices/${id}`, device);
  }

  deleteDevice(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/devices/${id}`, { responseType: 'text' });
  }
}
