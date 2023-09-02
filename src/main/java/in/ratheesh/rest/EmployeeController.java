package in.ratheesh.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ratheesh.entity.Employee;
import in.ratheesh.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empSer;
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "Welcome to the Employee Database";
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> insert(@RequestBody Employee emp) {
		String status = empSer.upsert(emp);
		return new ResponseEntity<>(status, HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> find(@PathVariable Integer id){
		
		Employee find = empSer.findById(id);
	
		return new ResponseEntity<>(find,HttpStatus.OK );
	
		
		
		
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		
		
		
		String status=empSer.deleteById(id);
		
		return new ResponseEntity<>(status, HttpStatus.OK);
		
		
	}
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> findAll() {
		
		List<Employee> emp = empSer.getAll();
		
		return new ResponseEntity<>(emp, HttpStatus.OK);
		
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Employee emp) {
		
		String status = empSer.upsert(emp);
		
		return new ResponseEntity<String>(status, HttpStatus.OK);
		
	}
}
