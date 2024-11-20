package com.springpro.springpro.Repsitiry;

import com.springpro.springpro.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
