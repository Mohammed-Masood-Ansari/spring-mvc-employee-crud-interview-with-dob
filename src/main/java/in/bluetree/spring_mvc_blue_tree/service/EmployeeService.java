package in.bluetree.spring_mvc_blue_tree.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.bluetree.spring_mvc_blue_tree.dao.EmployeeDao;
import in.bluetree.spring_mvc_blue_tree.dto.Employee;

@Component
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	//save method for employee
	public Employee saveEmployee(Employee employee) {

		return employeeDao.saveEmployee(employee);
	}

	//delete Employee
	public Employee deleteEmployee(int id) {

		return employeeDao.deleteEmployee(id);
	}

	//displayEmployee
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	//updateEmployee
	public Employee updateEmployee(Employee employee) {

		return employeeDao.updateEmployee(employee);
	}

	//getDataById
	public Employee getEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}
}
