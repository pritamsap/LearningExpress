package com.namaste.CompleteLearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.namaste.CompleteLearning.entity.StudentStatus;

@RepositoryRestResource (collectionResourceRel = "studentStatus", path = "student_status")

public interface StudentStatusRepositoryy extends JpaRepository<StudentStatus, Integer> {

}
