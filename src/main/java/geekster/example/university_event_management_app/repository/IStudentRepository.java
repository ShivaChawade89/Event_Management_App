package geekster.example.university_event_management_app.repository;

import geekster.example.university_event_management_app.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Integer> {


 public List<Student> findByAgeGreaterThan(int age);

 @Query(value = "select * from Student Order by age ", nativeQuery = true)
 public List<Student> findStudentsOrderASC();




}
