package department;

import javax.persistence.*;

@Entity
@Table (name = "position")
@Getter
@Setter
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String surnamePosition;
    @ManyToOne
    private Employee employee;
}
