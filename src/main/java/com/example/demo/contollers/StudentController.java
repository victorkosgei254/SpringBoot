package com.example.demo.contollers;

import java.util.ArrayList;
import java.util.List;

import com.example.models.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public Student getStudent() {
        Student mimi = new Student();
        mimi.setLastName("Kosgei");
        mimi.setFirstName("Victor");
        mimi.setAge(24);
        return mimi;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student("Kosgei", "Victor", 20 + i));
        }

        return students;
    }
}
