import { Injectable } from '@angular/core';
import { Fee } from '../models/fee';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FeeService {
  serverurl="http://localhost:8080/feemgt"
  constructor(private http:HttpClient) { }
  insert(r:Fee):Observable<Fee>
  {
    return this.http.post<Fee>(this.serverurl+"/fee",r)
  }
  getAll():Observable<Fee[]>
  {
    return this.http.get<Fee[]>(this.serverurl+"/fee")
  }
     

  search(email:any):Observable<Fee[]>
  {
    return this.http.get<Fee[]>(this.serverurl+"/fee/"+email)
  }
}
