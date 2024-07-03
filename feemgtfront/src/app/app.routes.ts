import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdmissionComponent } from './admission/admission.component';
import { FeesComponent } from './fees/fees.component';
import { AddcourseComponent } from './addcourse/addcourse.component';
import { ViewadmissionComponent } from './viewadmission/viewadmission.component';
import { ViewfeesComponent } from './viewfees/viewfees.component';
import { FeesubmissionComponent } from './feesubmission/feesubmission.component';

export const routes: Routes = [
{path:"",component:HomeComponent},
{path:"register",component:RegisterComponent},
{
    path:"login",component:LoginComponent
},
{path:"adminlogin",component:AdminLoginComponent},
{path:"admission",component:AdmissionComponent},
{path:"feereport",component:FeesComponent},
{path:"addcourse",component:AddcourseComponent},
{path:"vadmission",component:ViewadmissionComponent},
{path:"vfees",component:ViewfeesComponent},
{path:"feeform",component:FeesubmissionComponent},
];
