package department;

import com.fasterxml.jackson.annotation.JsonGetter;

import javax.persistence.*;
import javax.swing.text.Position;
import java.util.List;

@Entity
@Table (name = "employee")
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String surname;
    @OneToMany(mappedBy = "employee")
    List<Position> positionList;
}
