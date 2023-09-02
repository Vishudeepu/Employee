package in.ratheesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ratheesh.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
