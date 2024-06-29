package com.innovation.FeesMgtSystemBackend.service;

import java.util.List;

import com.innovation.FeesMgtSystemBackend.model.Admission;

public interface AdmissionService {
Admission insert(Admission a);
List<Admission> getAll();
}
