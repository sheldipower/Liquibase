package repositories;

import department.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public class EmployeeRepository extends JpaRepository <Employee, Long> {
}
