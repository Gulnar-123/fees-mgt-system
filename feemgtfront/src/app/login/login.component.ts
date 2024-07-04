import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Register } from '../models/register';
import { RegisterService } from '../services/register.service';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
reg:Register=new Register();
constructor(private rs:RegisterService,private router:Router)
{

}
  submitdata(logfrm:any)
  {
    if(logfrm.valid)
      {
this.rs.login(this.reg.email,this.reg.password).subscribe((data:Register)=>{
  if(data!=null)
    {
     // alert("Login Successful")
      localStorage.setItem("email",this.reg.email)
      localStorage.setItem("name",this.reg.name)
    
      this.router.navigate(['/'])
    }
})
      }
      else
alert("Please input valid data")
  }
}
