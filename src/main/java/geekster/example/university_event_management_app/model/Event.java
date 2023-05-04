package geekster.example.university_event_management_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventId;
    private String eventName;
    private String locationOfEvent;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate date;
    @DateTimeFormat(pattern="hh:mm:ss")
    private LocalTime startTime;
    @DateTimeFormat(pattern="hh:mm:ss")

    private LocalTime endTime;

}
