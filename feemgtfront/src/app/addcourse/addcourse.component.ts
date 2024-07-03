import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Course } from '../models/course';
import { CourseService } from '../services/course.service';

@Component({
  selector: 'app-addcourse',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './addcourse.component.html',
  styleUrl: './addcourse.component.css'
})
export class AddcourseComponent {
cou:Course=new Course()
constructor(private cs:CourseService)
{

}
submitdata()
{
this.cs.insert(this.cou).subscribe((data:Course)=>{
  if(data!=null)
    {
      alert("Course Added Successfully")
    }
})
}
}
