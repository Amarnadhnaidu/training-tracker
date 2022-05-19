package in.hcl.employeemanagementapi.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hcl.employeemanagementapi.domain.Employee;
import in.hcl.employeemanagementapi.repository.EmployeeRepository;
import in.hcl.employeemanagementapi.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRespository;

	public Employee addEmployee(Employee employee) {
		return employeeRespository.save(employee);
	}

	public List<Employee> addAllEmployees(List<Employee> employees) {
		return employeeRespository.saveAll(employees);
	}

	public Employee getEmployeeById(Long id) {
		return employeeRespository.findById(id).orElse(null);
	}

	public Employee updateEmployee(Employee employee, Long id) {
		Employee employee_entity = getEmployeeById(id);
		if (employee != null) {
			if (employee.getName() != null)
				employee_entity.setName(employee.getName());
			if (employee.getEmail() != null)
				employee_entity.setEmail(employee.getEmail());
			if (employee.getSalary() != null)
				employee_entity.setSalary(employee.getSalary());
			if (employee.getAddress() != null)
				employee_entity.setAddress(employee.getAddress());
			if (employee.getContact() != null)
				employee_entity.setContact(employee.getContact());
			if (employee.getDesignation() != null)
				employee_entity.setDesignation(employee.getDesignation());
			if (employee.getDepartment() != null)
				employee_entity.setDepartment(employee.getDepartment());
		}
		return employeeRespository.save(employee_entity);
	}

	public boolean deleteEmployeeById(Long id) {
		Employee employee = getEmployeeById(id);
		if (employee != null) {
			employeeRespository.delete(employee);
			return true;
		}
		return false;
	}

	public List<Employee> getEmployeeByName(String name) {
		return employeeRespository.findByName(name);
	}

}
