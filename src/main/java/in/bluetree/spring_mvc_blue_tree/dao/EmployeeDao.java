package in.bluetree.spring_mvc_blue_tree.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.bluetree.spring_mvc_blue_tree.dto.Employee;

@Component
public class EmployeeDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;

	// save method for employee
	public Employee saveEmployee(Employee employee) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// convert String to LocalDate
		LocalDate localDate = LocalDate.parse(employee.getEmployeeDob(), formatter);

		int yearOfEmployee = LocalDate.now().getYear() - localDate.getYear();

		System.out.println(yearOfEmployee);

		employee.setEmployeeAge(yearOfEmployee);

		entityTransaction.begin();

		entityManager.persist(employee);

		entityTransaction.commit();

		return employee;
	}

	// delete Employee
	public Employee deleteEmployee(int id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee employee = entityManager.find(Employee.class, id);

		if (employee != null) {

			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();

		}

		return employee;

	}

	// displayEmployee
	public List<Employee> getAllEmployees() {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String displayEmployeeQuery = "SELECT e FROM Employee e";

		return entityManager.createQuery(displayEmployeeQuery, Employee.class).getResultList();

	}
	
	//updateEmployee
	public Employee updateEmployee(Employee employee) {
	
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee employee1 = entityManager.find(Employee.class, employee.getEmployeeId());
		
		//DateFromate How We can Store
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate localDate = LocalDate.parse(employee.getEmployeeDob(),dateTimeFormatter);
		
		int yearOfEmployee = LocalDate.now().getYear() - localDate.getYear();
		
		employee.setEmployeeAge(yearOfEmployee);
				
		entityTransaction.begin();
		
		entityManager.merge(employee);
		
		entityTransaction.commit();

		return employee;
	}
	
	//getDataById
	public Employee getEmployee(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Employee.class, id);
	}
}
