package com.innovation.FeesMgtSystemBackend.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovation.FeesMgtSystemBackend.model.Fee;

@Repository
@Qualifier("feeRepo")
public interface FeeRepository extends JpaRepository<Fee, Integer>{

	List<Fee> findAllByEmail(String email);
}
