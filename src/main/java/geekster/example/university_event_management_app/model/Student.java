package geekster.example.university_event_management_app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int studentId;
    @Pattern(regexp = "[A-Z][a-z]*", message = "First name should start with a capital letter")
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;

    @Column(name = "age")
    @Min(value = 18,
            message = "Age must be greater than 18")
    @Max(value = 25,
            message = "Age must be smaller than 25")
    private int age;
    @Column(name = "department")
    private String department;


}
