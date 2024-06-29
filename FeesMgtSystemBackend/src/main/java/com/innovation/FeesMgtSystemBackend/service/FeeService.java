package com.innovation.FeesMgtSystemBackend.service;

import java.util.List;

import com.innovation.FeesMgtSystemBackend.model.Fee;

public interface FeeService {
Fee insert(Fee f);
List<Fee> getAll();
}
