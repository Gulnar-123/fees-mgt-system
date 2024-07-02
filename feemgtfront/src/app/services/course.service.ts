import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Course } from '../models/course';

@Injectable({
  providedIn: 'root'
})
export class CourseService {
  serverurl="http://localhost:8080/feemgt"
  constructor(private http:HttpClient) { }
  insert(r:Course):Observable<Course>
  {
    return this.http.post<Course>(this.serverurl+"/course",r)
  }
  getAll():Observable<Course[]>
  {
    return this.http.get<Course[]>(this.serverurl+"/course")
  }
  delete(cid:any):Observable<any>
  {
    return this.http.delete<any>(this.serverurl+"/course/"+cid)

  }
  update(cid:any,c:Course):Observable<Course>
  {
    return this.http.put<Course>(this.serverurl+"/course/"+cid,c)

  }
  search(cn:any):Observable<Course>
  {
    return this.http.get<Course>(this.serverurl+"/course/"+cn)
  }
}
