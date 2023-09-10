package command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repositories.EmployeeRepository;
import repositories.PositionRepository;

@Component
public class TestSqlScript implements CommandLineRunner {
    private final PositionRepository positionRepository;
    private final EmployeeRepository employeeRepository;

    public TestSqlScript(PositionRepository positionRepository, EmployeeRepository employeeRepository) {
        this.positionRepository = positionRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.findAll().forEach(employee -> {
            System.out.println(employee.getId() + "; " + employee.getName());
        });
    }
}

