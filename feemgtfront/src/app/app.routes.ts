import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdmissionComponent } from './admission/admission.component';
import { FeesComponent } from './fees/fees.component';

export const routes: Routes = [
{path:"",component:HomeComponent},
{path:"register",component:RegisterComponent},
{
    path:"login",component:LoginComponent
},
{path:"adminlogin",component:AdminLoginComponent},
{path:"admission",component:AdmissionComponent},
{path:"feereport",component:FeesComponent}
];
