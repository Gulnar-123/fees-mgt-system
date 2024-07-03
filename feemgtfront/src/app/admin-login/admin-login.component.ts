import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Adminlogin } from '../models/adminlogin';
import { AdminloginService } from '../services/adminlogin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './admin-login.component.html',
  styleUrl: './admin-login.component.css'
})
export class AdminLoginComponent {
  adm:Adminlogin=new Adminlogin()
  constructor(private as:AdminloginService,private router:Router)
  {

  }
submitdata()
{
this.as.login(this.adm.email,this.adm.password).subscribe((data:Adminlogin)=>{
  if(data!=null)
    {
      alert("Login successful")
      localStorage.setItem("aemail","admin@gmail.com")
      this.router.navigate(["/"])

    }
})
}
}
