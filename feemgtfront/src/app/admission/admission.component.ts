import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Admission } from '../models/admission';
import { AdmissionService } from '../services/admission.service';
import { CourseService } from '../services/course.service';
import { Course } from '../models/course';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-admission',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './admission.component.html',
  styleUrl: './admission.component.css'
})
export class AdmissionComponent implements OnInit {
  
ad:Admission=new Admission()
cou:Course[]=[]
selcou:Course=new Course()
constructor(private ads:AdmissionService,private cs:CourseService)
{

}
  ngOnInit(): void {
    this.cs.getAll().subscribe((data:Course[])=>{
      if(data!=null)
        {
          this.cou=data
         
        }
    })
  }
submitdata()
{
  this.ad.email=localStorage.getItem("email")
  this.ads.insert(this.ad).subscribe((data:Admission)=>{
    if(data!=null)
      {
        alert("Admission Successful")
      }
  })
}
show(n:any)
{
  this.cs.search(n).subscribe((data:Course)=>{
if(data!=null)
  {
    this.selcou=data
  }
  else
  this.selcou=new Course()
  })
}
}
