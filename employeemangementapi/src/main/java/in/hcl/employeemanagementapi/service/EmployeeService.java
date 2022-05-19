package in.hcl.employeemanagementapi.service;

import java.util.List;

import in.hcl.employeemanagementapi.domain.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Employee> addAllEmployees(List<Employee> employees);

	public Employee getEmployeeById(Long id);

	public Employee updateEmployee(Employee employee, Long id);

	public boolean deleteEmployeeById(Long id);

	public List<Employee> getEmployeeByName(String name);

}
