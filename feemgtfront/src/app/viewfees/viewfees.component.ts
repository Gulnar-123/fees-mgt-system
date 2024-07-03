import { Component } from '@angular/core';
import { Fee } from '../models/fee';
import { FeeService } from '../services/fee.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-viewfees',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './viewfees.component.html',
  styleUrl: './viewfees.component.css'
})
export class ViewfeesComponent {
  fees:Fee[]=[]
  constructor(private ads:FeeService)
  {
  
  }
    ngOnInit(): void {
     this.ads.getAll().subscribe((data:Fee[])=>{
      if(data!=null)
        this.fees=data
     })
    }
}
