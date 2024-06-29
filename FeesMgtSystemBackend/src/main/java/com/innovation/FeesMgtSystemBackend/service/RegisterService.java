package com.innovation.FeesMgtSystemBackend.service;

import java.util.List;

import com.innovation.FeesMgtSystemBackend.model.Register;

public interface RegisterService {
Register insert(Register r);
List<Register> getAll();
Register login(String e,String p);
}
