package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service()
public class StudentService {
      public List<Stutdent> getStudents() {
    return List.of(
        new Stutdent(1, "vanchhai", 12, "chhai@gmail.com", LocalDate.of(2000, 1, 1)),
        new Stutdent(2, "Dog", 12, "chhai@gmail.com", LocalDate.of(2000, 1, 1)),
        new Stutdent(3, "Cat", 12, "chhai@gmail.com", LocalDate.of(2000, 1, 1))

    );
  }

  public String getSubject() {
    return "this subject is";
  }
}
