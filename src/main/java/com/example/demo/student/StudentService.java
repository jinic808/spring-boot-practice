package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(0L, "Myeongnam", "myeongnam@gmail.com", LocalDate.of(1962, Month.SEPTEMBER, 13), 60)
        );
    }
}
