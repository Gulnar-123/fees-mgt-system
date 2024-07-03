import { Component, OnInit } from '@angular/core';
import { Admission } from '../models/admission';
import { AdmissionService } from '../services/admission.service';
import { Course } from '../models/course';
import { CommonModule } from '@angular/common';
import { CourseAdmission } from '../models/courseadmission';
import { FeeService } from '../services/fee.service';
import { Fee } from '../models/fee';

@Component({
  selector: 'app-fees',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './fees.component.html',
  styleUrl: './fees.component.css'
})
export class FeesComponent implements OnInit {
cou:CourseAdmission[]=[]
fees:Fee[]=[]
constructor(private ads:AdmissionService,private fs:FeeService){

}
  ngOnInit(): void {
   let e:any=localStorage.getItem("email")
   this.ads.getAllByEmail(e).subscribe((data:CourseAdmission[])=>{
    if(data!=null)
      {
        this.cou=data
       // alert(JSON.stringify(this.cou))
        console.log(this.cou)
      }
    
   })
this.fs.search(e).subscribe((data:Fee[])=>{
if(data!=null)
  {
    alert(JSON.stringify(data))
  this.fees=data
  }
  
})

  }

}
