package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Employee;


public interface EmployeeService {
	
	//get all Employees  method.
	
	List<Employee> getAllEmployees();
	
	// method to add or post data to the database.
	
	void saveEmployee(Employee employee);
	
	//method to update the form by Id
	
	Employee getEmployeeById(long id);
	
	//method to delete employee.
	void deleteEmployeeById(long id);
	
	//method for pagination
	
	 Page < Employee > findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
