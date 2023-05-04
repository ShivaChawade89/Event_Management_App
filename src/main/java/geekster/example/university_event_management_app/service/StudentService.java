package geekster.example.university_event_management_app.service;

import geekster.example.university_event_management_app.model.Student;
import geekster.example.university_event_management_app.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired

    IStudentRepository studentRepository;

    public  String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "student deleted";
    }


    public Iterable<Student> getAll() {

        Iterable<Student>  allStudents = studentRepository.findAll();
        return allStudents;
    }


    public Student addStudents(Student student) {
        Student savedStudent=studentRepository.save(student);
        return savedStudent;
    }

    public Optional<Student> findById(Integer id) {
        return studentRepository.findById(id);

    }

    public List<Student> getStudentsByAgeGreaterThan(Integer age) {
        return studentRepository.findByAgeGreaterThan(age);

    }

    public List<Student> studentsOrderByAge() {
       return studentRepository.findStudentsOrderASC();
    }
}
