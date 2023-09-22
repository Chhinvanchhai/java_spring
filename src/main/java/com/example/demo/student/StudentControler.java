package com.example.demo.student;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentControler {
    private final StudentService studentService;
    
    public StudentControler(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping()
    public List<Stutdent> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping("subject")
    public String getSubjet(){
        return studentService.getSubject();
    }

}
