package com.springpro.springpro.Service;

import com.springpro.springpro.Entity.Student;
import com.springpro.springpro.Repsitiry.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
  private  StudentRepo studentRepo ;

    public Student saveDetails(Student student){
        return  studentRepo.save(student);
    }
    public List<Student> getAllDetails(){
        return  studentRepo.findAll();
    }
    public  Student getStudentById(int id){
        return studentRepo.findById(id).orElse(null);
    }
    public Student updateDetails(Student student){
     Student updateStudent = studentRepo.findById(student.getId()).orElse(null);
     if(updateStudent != null){
         updateStudent.setMark(student.getMark());
         updateStudent.setName(student.getName());
         updateStudent.setId(student.getId());
         studentRepo.save(updateStudent);
         return  updateStudent;
     }
        return null;
    }
    public  String deleteStudent(int id){
        if(studentRepo.existsById(id)){
            studentRepo.deleteById(id);
            return "Student Deleted.";
        }else{
            return "I'd was not there";
        }

    }
    public List<Student> saveStudentList(List<Student> student){
        return studentRepo.saveAll(student);
    }
}
