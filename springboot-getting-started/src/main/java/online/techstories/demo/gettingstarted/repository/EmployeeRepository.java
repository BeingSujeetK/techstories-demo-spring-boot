package online.techstories.demo.gettingstarted.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.techstories.demo.gettingstarted.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
