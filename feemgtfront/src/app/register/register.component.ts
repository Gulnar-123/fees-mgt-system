import { Component } from '@angular/core';
import { Register } from '../models/register';
import { FormsModule } from '@angular/forms';
import { RegisterService } from '../services/register.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {
reg:Register=new Register();
constructor(private rs :RegisterService,private router:Router)
{

}

submitdata()
{
this.rs.insert(this.reg).subscribe((data:Register)=>{
  if(data!=null)
    {
      alert('Registration Successful')
      this.router.navigate(["/login"])
    }
})
}
}
