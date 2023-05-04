package geekster.example.university_event_management_app.service;

import geekster.example.university_event_management_app.model.Event;
import geekster.example.university_event_management_app.repository.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEventRepository eventRepository;

    public  Iterable<Event> GetAllEvents() {
        return eventRepository.findAll();
    }


    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    public void deleteEvent(int id) {
        eventRepository.deleteById(id);
    }

    public List<Event> findAllEventByDate(String date) {
       return eventRepository.findAllByDate(date);

    }



}
