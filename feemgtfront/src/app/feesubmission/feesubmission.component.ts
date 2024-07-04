import { Component, OnInit } from '@angular/core';
import { Fee } from '../models/fee';
import { FormsModule } from '@angular/forms';
import { Admission } from '../models/admission';
import { AdmissionService } from '../services/admission.service';
import { CommonModule } from '@angular/common';
import { CourseAdmission } from '../models/courseadmission';
import { FeeService } from '../services/fee.service';

@Component({
  selector: 'app-feesubmission',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './feesubmission.component.html',
  styleUrl: './feesubmission.component.css'
})
export class FeesubmissionComponent implements OnInit {
  f:Fee=new Fee()
  ad:Admission[]=[]
  ad1:CourseAdmission[]=[]
constructor(private as :AdmissionService, private fs:FeeService)
{

}
showcourses()
{
this.as.getAllByEmail(this.f.email).subscribe((data:CourseAdmission[])=>{
  if(data!=null)
    this.ad1=data
})

}
calremain()
{
  this.f.remaining=this.f.total-this.f.paid
}
showtotal(cn:any)
{
let selcou=this.ad1.filter((c:CourseAdmission)=>{
  return c.cname==cn
})
this.f.total=selcou[0].fees
}
  ngOnInit(): void {
  this.as.getAll().subscribe((data:Admission[])=>{
    if(data!=null)
      this.ad=data
  })  
  }
  
submitdata(){
  this.fs.insert(this.f).subscribe((data :Fee)=>{
    if(data!=null)
      {
        alert("Fee submitted Successful")
      }
  })
}
}
