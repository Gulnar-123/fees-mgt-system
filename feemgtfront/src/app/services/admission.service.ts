import { Injectable } from '@angular/core';
import { Register } from '../models/register';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Admission } from '../models/admission';
import { Course } from '../models/course';
import { CourseAdmission } from '../models/courseadmission';

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
  getAllByEmail(e:string):Observable<CourseAdmission[]>
  {
    return this.http.get<CourseAdmission[]>(this.serverurl+"/admission/"+e)
  }
}
