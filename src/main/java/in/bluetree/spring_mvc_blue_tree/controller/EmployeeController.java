package in.bluetree.spring_mvc_blue_tree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.bluetree.spring_mvc_blue_tree.dto.Employee;
import in.bluetree.spring_mvc_blue_tree.service.EmployeeService;

//if you will face any issue call me
//9651076292
//masoodansari1997@gmail.com

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/")
	public String getHome() {

		return "home";
	}

	// open employee insert
	@RequestMapping("/employeeinsert")
	public ModelAndView openInsertEmployee() {

		ModelAndView andView = new ModelAndView("employee-insert");

		andView.addObject("employee", new Employee());

		return andView;
	}

	// save method for employee
	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployee(Employee employee) {

		Employee employee2 = employeeService.saveEmployee(employee);

		ModelAndView modelAndView = new ModelAndView("employee-insert");

		return modelAndView;
	}

	// open employee insert
	@RequestMapping("/employeeDisplay")
	public ModelAndView openDeleteEmployee() {

		ModelAndView andView = new ModelAndView("employee-display");

		andView.addObject("employeelist", employeeService.getAllEmployees());

		return andView;
	}

	// delete Employee
	@RequestMapping(value = "/deleteemployee")
	public ModelAndView deleteEmployee(@RequestParam int employeeId) {

		// int id = Integer.parseInt( httpServletRequest.getParameter("employeeId"));

		ModelAndView modelAndView = new ModelAndView("employee-display");

		employeeService.deleteEmployee(employeeId);
		
		modelAndView.addObject("employeelist", employeeService.getAllEmployees());

		return modelAndView;
	}
	
	//editEmployee
	@RequestMapping("/employeeEdit")
	public ModelAndView editEmployee(@RequestParam int employeeId) {
		
		ModelAndView andView = new ModelAndView("employee-update");
		
		andView.addObject("editemployee", employeeService.getEmployee(employeeId));
		
		return andView;
		
	}

	// updateEmployee
	@RequestMapping("/updateEmployee")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
		
		ModelAndView modelAndView = new ModelAndView("employee-display");

		employeeService.updateEmployee(employee);
		
		modelAndView.addObject("employeelist", employeeService.getAllEmployees());

		return modelAndView;
	}

}
