package com.innovation.FeesMgtSystemBackend.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovation.FeesMgtSystemBackend.model.Course;

@Repository
@Qualifier("couRepo")
public interface CourseRepository extends JpaRepository<Course, Integer>{
Optional<Course> findByCname(String cname);
}
