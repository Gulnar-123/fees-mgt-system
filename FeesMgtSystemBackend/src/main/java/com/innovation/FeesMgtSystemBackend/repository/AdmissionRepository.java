package com.innovation.FeesMgtSystemBackend.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovation.FeesMgtSystemBackend.model.Admission;

@Repository
@Qualifier("admRepo")
public interface AdmissionRepository extends JpaRepository<Admission,Long>{
	@Query(nativeQuery = true,value = "select course.cid, course.cname,course.duration,course.fees,admission.email from course,admission where course.cname=admission.coursenm and admission.email=:email")
List<CourseAdmission> findAllCoursesByEmail(String email);
}
