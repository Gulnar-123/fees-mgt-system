import { Injectable } from '@angular/core';
import { Register } from '../models/register';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Admission } from '../models/admission';

@Injectable({
  providedIn: 'root'
})
export class AdmissionService {
  serverurl="http://localhost:8080/feemgt"
  constructor(private http:HttpClient) { }
  insert(r:Admission):Observable<Admission>
  {
    return this.http.post<Admission>(this.serverurl+"/admission",r)
  }
  getAll():Observable<Admission[]>
  {
    return this.http.get<Admission[]>(this.serverurl+"/admission")
  }
}
