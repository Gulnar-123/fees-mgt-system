import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Adminlogin } from '../models/adminlogin';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminloginService {
  serverurl="http://localhost:8080/feemgt"
  constructor(private http:HttpClient) { }
  login(em:any,ps:any):Observable<Adminlogin>
  {
    return this.http.get<Adminlogin>(this.serverurl+"/admin/"+em+"/"+ps)
  }
}
