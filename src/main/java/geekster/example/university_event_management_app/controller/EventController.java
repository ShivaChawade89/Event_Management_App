package geekster.example.university_event_management_app.controller;

import geekster.example.university_event_management_app.model.Event;
import geekster.example.university_event_management_app.model.Student;
import geekster.example.university_event_management_app.service.EventService;
import geekster.example.university_event_management_app.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    private StudentService studentService;

    @Autowired
    EventService eventService;
    @PostMapping("add-event")
    public Event addStudent(@Valid @RequestBody Event event) {
        return eventService.addEvent(event);
    }

    @GetMapping("get-All-Events")
    public Iterable<Event> findAllEvent(){
        return eventService.GetAllEvents();
    }

    @DeleteMapping("delete-Event/{id}")
    public void deleteEvent(@PathVariable int id) {
        eventService.deleteEvent(id);
    }

    @GetMapping("getEventByDate/{date}")
    public List<Event> findAllEventByDate(@PathVariable String date){
        return eventService.findAllEventByDate(date);
    }


}
