package com.springpro.springpro.Controller;

import com.springpro.springpro.Entity.Student;
import com.springpro.springpro.Repsitiry.StudentRepo;
import com.springpro.springpro.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudent")
    public  Student postDetails(@RequestBody Student student){

    return  studentService.saveDetails(student);
    }
    @GetMapping("/")
    public String GetRes(){

        return  "Server is working well :)";
    }
    @GetMapping("/Alldetails")
    public List<Student> getAllDetails(){

        return studentService.getAllDetails();
    }
    @GetMapping("/getStudentBysId/{id}")
    public Student FetchDetailsById(@PathVariable int id){
        return  studentService.getStudentById(id);
    }
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){

        return studentService.updateDetails(student);
    }
    @DeleteMapping("/Delete/{id}")
    public  String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
    @PostMapping("/saveList")
    public List<Student> saveList(@RequestBody List<Student> students){
        return studentService.saveStudentList(students);
    }

}
