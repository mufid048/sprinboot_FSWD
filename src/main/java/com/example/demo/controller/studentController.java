package com.example.demo.controller;

import com.example.demo.model.Student20it048;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class studentController {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    //CourseRepository courserepository;
//    List<Student> students = new ArrayList<>(
//            Arrays.asList(
//                    new Student(1, "Tom", "US"),
//                    new Student(2, "Harry", "Canada"),
//                    new Student(3, "Nick", "UK")
//            )
//    );

    // Mappings - URL endpoints
    // Get the list of all student
    @GetMapping("/listStudents")
    public List<Student20it048> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get the student information
    @GetMapping("/student/{id}")
    public Student20it048 getStudent(@PathVariable Integer id) {
        return studentRepository.findById(id).get();
    }

    // Delete the student
    @DeleteMapping("/student/{id}")
    public List<Student20it048> deleteStudent(@PathVariable Integer id) {
        studentRepository.delete(studentRepository.findById(id).get());
        return studentRepository.findAll();
    }

    // Add new student
    @PostMapping("/student")
    public List<Student20it048> addStudent(@RequestBody Student20it048 student) {
        studentRepository.save(student);
        return studentRepository.findAll();
    }

    // Update the student information
    @PutMapping("/student/{id}")
    public List<Student20it048> updateStudent(@RequestBody Student20it048 student, @PathVariable Integer id) {
        Student20it048 studentObj = studentRepository.findById(id).get();
        studentObj.setName(student.getName());
        studentObj.setAddress(student.getAddress());
        studentRepository.save(studentObj);
        return studentRepository.findAll();
    }

}
