package geekster.example.university_event_management_app.repository;

import geekster.example.university_event_management_app.model.Event;
import geekster.example.university_event_management_app.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Repository
public interface IEventRepository extends CrudRepository<Event,Integer> {

    @Query(value = "SELECT * FROM  Event WHERE date = date " ,nativeQuery = true)
    public List<Event> findAllByDate(String date);
}
