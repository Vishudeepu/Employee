package in.ratheesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ratheesh.entity.Employee;
import in.ratheesh.repository.EmployeeRepository;


@Service
public class ServiceImpl implements EmployeeService  {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public String upsert(Employee emp) {
		  
	  empRepo.save(emp);
		
	  return "Success";
	}

	@Override
	public Employee findById(Integer id) {
		Optional<Employee> find = empRepo.findById(id);
		if(find.isPresent()) {
			
		return find.get();
	}
	return null;
	}
	
	@Override
	public String deleteById(Integer id) {
		if(empRepo.existsById(id)){
				
				empRepo.deleteById(id);
				return "Delete success";
		}else {
		return "Record Not found";
	}}

	@Override
	public List<Employee> getAll() {
	
		return empRepo.findAll();
	}
	

}
