import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-nav',
  standalone: true,
  imports: [RouterLink, CommonModule],
  templateUrl: './nav.component.html',
  styleUrl: './nav.component.css'
})
export class NavComponent implements OnInit {
  
  usertype="guest"
  constructor(private router:Router)
  {

  }
  ngOnInit(): void {
    this.router.events.subscribe((val:any)=>{
      if(val.url)
      {
  let e=localStorage.getItem("email")
  console.log("email="+e)
  if(e!=null)
    {
      this.usertype="user"
    }
    else
    {
      
  let ae=localStorage.getItem("aemail")
  if(ae!=null)
    this.usertype="admin"
  else
this.usertype="guest"
    }
    
  }});

  }

logout()
{
  localStorage.removeItem("email")
  localStorage.removeItem("name")
this.router.navigate(["/"])
}

alogout()
{
  localStorage.removeItem("aemail")
 
this.router.navigate(["/"])
}
}
