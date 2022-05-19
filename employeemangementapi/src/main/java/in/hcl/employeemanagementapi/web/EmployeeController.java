package in.hcl.employeemanagementapi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.hcl.employeemanagementapi.domain.Employee;
import in.hcl.employeemanagementapi.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// Adding new employee
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@PostMapping("/addAll")
	public List<Employee> addAllEmployees(List<Employee> employees) {
		return employeeService.addAllEmployees(employees);

	}
	
	@GetMapping("/id/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/name/{name}")
	public List<Employee> getEmployeesByName(@PathVariable String name){
		return employeeService.getEmployeeByName(name);
	}
	
	@PutMapping("/id/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
		return employeeService.updateEmployee(employee, id);
	}
	
	@DeleteMapping ("/id/{id}")
	public boolean deleteEmployeeById(@PathVariable Long id) {
		return employeeService.deleteEmployeeById(id);
	}
}


