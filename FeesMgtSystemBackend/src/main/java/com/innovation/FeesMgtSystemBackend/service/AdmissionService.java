package com.innovation.FeesMgtSystemBackend.service;

import java.util.List;

import com.innovation.FeesMgtSystemBackend.model.Admission;
import com.innovation.FeesMgtSystemBackend.repository.CourseAdmission;

public interface AdmissionService {
Admission insert(Admission a);
List<Admission> getAll();
List<CourseAdmission> getAllByEmail(String e);

}
