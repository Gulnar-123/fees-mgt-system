import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Register } from '../models/register';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {
serverurl="http://localhost:8080/feemgt"
  constructor(private http:HttpClient) { }
  insert(r:Register):Observable<Register>
  {
    return this.http.post<Register>(this.serverurl+"/register",r)
  }
  getAll():Observable<Register[]>
  {
    return this.http.get<Register[]>(this.serverurl+"/register")
  }
  login(e:string,p:string):Observable<Register>
  {
    return this.http.get<Register>(this.serverurl+"/login/"+e+"/"+p)
  }
}
