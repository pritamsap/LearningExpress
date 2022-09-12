package com.namaste.CompleteLearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namaste.CompleteLearning.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
