package geekster.example.university_event_management_app.controller;

import geekster.example.university_event_management_app.model.Student;
import geekster.example.university_event_management_app.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/get-All-Students")
    public Iterable<Student>findAllStudents(){
        return studentService.getAll();
    }

    @DeleteMapping("delete-Student/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

    @PostMapping("/add-student")
    public Student addStudent(@Valid @RequestBody Student student) {
       return studentService.addStudents(student);
    }

    @GetMapping("/get-student/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id) {
        return studentService.findById(id);
    }

    @GetMapping("/get-studentsGreaterThan/age/{age}")
    public List<Student> getStudentsByAgeGreaterThan(@PathVariable Integer age) {
        return studentService.getStudentsByAgeGreaterThan(age);
    }

    @GetMapping("/get-studentsOrderByAge")
    public List<Student> studentsOrderByAge() {
        return studentService.studentsOrderByAge();
    }




}
