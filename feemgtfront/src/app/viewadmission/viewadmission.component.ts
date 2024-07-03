import { Component, OnInit } from '@angular/core';
import { Admission } from '../models/admission';
import { AdmissionService } from '../services/admission.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-viewadmission',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './viewadmission.component.html',
  styleUrl: './viewadmission.component.css'
})
export class ViewadmissionComponent implements OnInit{
adm:Admission[]=[]
constructor(private ads:AdmissionService)
{

}
  ngOnInit(): void {
   this.ads.getAll().subscribe((data:Admission[])=>{
    if(data!=null)
      this.adm=data
   })
  }

}
