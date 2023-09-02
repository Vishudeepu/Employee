package in.ratheesh.service;

import java.util.List;

import in.ratheesh.entity.Employee;

public interface EmployeeService {
	
	public String upsert(Employee emp);
	
	public Employee findById(Integer id);
	
	public String deleteById(Integer id);
	
	public List<Employee> getAll();
	

}
