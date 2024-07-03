import { Component } from '@angular/core';
import { Fee } from '../models/fee';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-feesubmission',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './feesubmission.component.html',
  styleUrl: './feesubmission.component.css'
})
export class FeesubmissionComponent {
  f:Fee=new Fee()
submitdata(){

}
}
