package com.innovation.FeesMgtSystemBackend.service;

import java.util.List;

import com.innovation.FeesMgtSystemBackend.model.Course;

public interface CourseService {
Course insert(Course c);
List<Course> getAll();
void delete(int cid);
Course update(int id,Course c);
Course search(String cn);
}
