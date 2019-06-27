package com.test.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/empService/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeService {

	/*
	 * public Map<String, Employee> employees = new HashMap<String, Employee>();
	 * Set<Entry<String,Employee>> s = employees.entrySet();
	 * List<Entry<String,Employee>> e = new ArrayList<Entry<String,Employee>>(s);
	 * 
	 * 
	 * @GET
	 * 
	 * @Path("/employees/{id}/{name}/{dept}/ASC/") public List<Employee>
	 * getAllEmployees(@PathParam("id") String id,@PathParam("name") String name,
	 * 
	 * @PathParam("dept") String dept) { if (name = "id") {
	 * 
	 * if (sortby = "ASC") { LOGGIC TO SORT BY ID IN ASCENDING OREDER } ELSE { LOGIC
	 * TO SORT BY ID IN DESCRE } } ELSE IF (NAME = "name") {
	 * 
	 * LOGGIC TO SORT BY name IN ASCENDING/desending ORDER
	 * 
	 * 
	 * } else { LOGGIC TO SORT BY dept IN ASCENDING/desending ORDER } List<Employee>
	 * lists = new ArrayList<Employee>(emp.values()); return lists;
	 * Collections.sort(e, Comparator.comparing(Employee::getId));
	 * Collections.sort(e,Comparator.comparing(Employee::getName));
	 * Collections.sort(e,Comparator.comparing(Employee::getDept)); return e;
	 * 
	 * }
	 * 
	 * @GET
	 * 
	 * @Path("/getEmployee/{id}/") public Employee getEmployee(@PathParam("id")
	 * String id) {
	 * 
	 * return employees.get(id);
	 * 
	 * }
	 * 
	 * @POST
	 * 
	 * @Path("/addEmployee/") public Employee addEmployee(Employee emp) {
	 * 
	 * employees.put(emp.getId(), emp); return emp; }
	 * 
	 * 
	 * 
	 * 
	 * @DELETE
	 * 
	 * @Path("/deleteEmployee/{id}/") public Employee
	 * deleteEmployee(@PathParam("id") int id) {
	 * 
	 * Employee emp = employees.get(id); employees.remove(id); return emp; }
	 * 
	 * }
	 */
	List<Employee> employees = new ArrayList<>();

	public EmployeeService() {
		employees.add(new Employee("1010", "Rajeev", 100000, LocalDate.of(2019, 1, 10)));
		employees.add(new Employee("1004", "Chris", 95000, LocalDate.of(2019, 3, 20)));
		employees.add(new Employee("1015", "David", 134000, LocalDate.of(2019, 2, 15)));
		employees.add(new Employee("1009", "Steve", 1000000, LocalDate.of(2018, 4, 4)));
		employees.add(new Employee("1020", "John", 135000, LocalDate.of(2017, 5, 21)));
		employees.add(new Employee("1003", "Ranjish", 2000000, LocalDate.of(2019, 5, 25)));
	}

	/*
	 * @POST
	 * 
	 * @Path("/addEmployee/") public Employee addEmployee(Employee emp) {
	 * 
	 * employees.add(emp.getId(), emp); return emp; }
	 */

	@GET
	@Path("/employees")
	public List<Employee> getEmployees() {
		return employees;
	}

	/*
	 * @GET
	 * 
	 * @Path("/employees/{id}/ASC") public List<Employee>
	 * getAllEmployees(@PathParam("id") int id) { Collections.sort(employees,
	 * Comparator.comparingInt(Employee::getId)); return employees; }
	 * 
	 * @GET
	 * 
	 * @Path("/employees/{id}/DESC") public List<Employee>
	 * getAllEmployeess(@PathParam("id") int id) { Collections.sort(employees,
	 * Comparator.comparing(Employee::getId).reversed()); return employees; }
	 * 
	 * @GET
	 * 
	 * @Path("/employees/{name}/ASCE") public List<Employee>
	 * getAllEmployeesss(@PathParam("name") String name) {
	 * Collections.sort(employees, Comparator.comparing(Employee::getName)); return
	 * employees; }
	 * 
	 * @GET
	 * 
	 * @Path("/employees/{name}/DESCE") public List<Employee>
	 * getAllEmployeessss(@PathParam("name") String name) {
	 * Collections.sort(employees,
	 * Comparator.comparing(Employee::getName).reversed()); return employees; }
	 * 
	 * @GET
	 * 
	 * @Path("/employees/{salary}/ASCEN") public List<Employee>
	 * getAllEmployees1(@PathParam("salary") Double salary) {
	 * Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
	 * return employees; }
	 * 
	 * @GET
	 * 
	 * @Path("/employees/{salary}/DESCN") public List<Employee>
	 * getAllEmployees2(@PathParam("salary") Double salary) {
	 * Collections.sort(employees,
	 * Comparator.comparing(Employee::getSalary).reversed()); return employees; }
	 * 
	 * @DELETE
	 * 
	 * @Path("/deleteEmployee/{id}") public Employee deleteEmployee(@PathParam("id")
	 * String id) { Employee emp = employees.get(id); employees.remove(id); return
	 * emp; }
	 */
	/*
	 * @GET
	 * 
	 * @Path("/employees/{sortById}/{sortByOrder}") public List<Employee>
	 * getAllEmployees(@PathParam("sortById") String sortById,
	 * 
	 * @PathParam("sortByOrder") String sortByOrder) {
	 * 
	 * if (sortByOrder.equalsIgnoreCase("asc")) {
	 * 
	 * if (sortById.equals("id")) {
	 * 
	 * Collections.sort(employees, Comparator.comparing(Employee::getId));
	 * 
	 * }
	 * 
	 * else if (sortById.equals("salary")) {
	 * 
	 * Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
	 * 
	 * } else if (sortById.equals("name")) {
	 * 
	 * Collections.sort(employees, Comparator.comparing(Employee::getName));
	 * 
	 * }
	 * 
	 * } else if (sortByOrder.equalsIgnoreCase("dsc")) {
	 * 
	 * if (sortById.equals("id")) {
	 * 
	 * Collections.sort(employees,
	 * Comparator.comparing(Employee::getId).reversed());
	 * 
	 * } else if (sortById.equals("salary")) { Collections.sort(employees,
	 * Comparator.comparing(Employee::getSalary).reversed());
	 * 
	 * } else if (sortById.equals("name")) { Collections.sort(employees,
	 * Comparator.comparing(Employee::getName).reversed()); } }
	 * 
	 * // Collections.sort(employees, Comparator.comparingInt(Employee::getId));
	 * return employees; }
	 */
	@GET
	@Path("/employees/{sortById}/{sortByOrder}")
	public List<Employee> getAllEmployees(@PathParam("sortById") String sortById,
			@PathParam("sortByOrder") String sortByOrder) {

		if (sortByOrder.equalsIgnoreCase("asc")) {

			if (sortById.equals("id")) {

				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {

						return o1.getId().compareTo(o2.getId());
					}
				});

			}

			else if (sortById.equals("salary")) {

				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {

						Integer sal1 = (Integer) o1.getSalary();
						Integer sal2 = (Integer) o2.getSalary();
						return sal1.compareTo(sal2);
					}

				});

			} else if (sortById.equals("name")) {

				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {

						return o1.getName().compareTo(o2.getName());
					}
				});

			} else if (sortById.equals("dateOfJoining")) {

				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {

						return o1.getDateOfJoining().compareTo(o2.getDateOfJoining());
					}

				});
			}

		} else if (sortByOrder.equalsIgnoreCase("dsc")) {

			if (sortById.equals("id")) {

				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {

						return -o1.getId().compareTo(o2.getId());
					}
				});

			} else if (sortById.equals("salary")) {
				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {

						Integer sal1 = o1.getSalary();
						Integer sal2 = o2.getSalary();
						return -sal1.compareTo(sal2);
					}
				});

			} else if (sortById.equals("name")) {

				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {

						return -o1.getName().compareTo(o2.getName());
					}
				});
			} else if (sortById.equals("dateOfJoining")) {
				Collections.sort(employees, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {

						return -o1.getDateOfJoining().compareTo(o2.getDateOfJoining());

					}
				});
			}

			// Collections.sort(employees, Comparator.comparingInt(Employee::getId));

		}
		return employees;
	}

	/*
	 * @GET
	 * 
	 * @Path("/searchById/{id}") public Employee getEmployee(@PathParam("id") String
	 * id) { Employee emp = null; int id1 = Integer.parseInt(id);
	 * if(employees.contains(id1)) { emp = employees.get(id1); } return emp;
	 */

	@GET
	@Path("/{id}")
	public Employee getEmployee(@PathParam("id") String id) {
		return (Employee) employees.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
	}

	@GET
	@Path("/salsearch/{salary}")
	public Employee getEmployeeBySalary(@PathParam("salary") int salary) {
		return (Employee) employees.stream().filter(e -> e.getSalary() == salary).findAny().orElse(null);
	}

	/*
	 * @GET
	 * 
	 * @Path("{/name}") public Employee getEmployeeByName(@PathParam("name") String
	 * name) { return
	 * (Employee)employees.stream().filter(em->em.getName().equals(name)).findAny().
	 * orElse(null); }
	 */

	/*
	 * @GET
	 * 
	 * @Path("{/salary}") public Employee getEmployeeByName(@PathParam("salary")
	 * Integer salary) { return
	 * (Employee)employees.stream().filter(emp->emp.getSalary(). }
	 */

	@GET
	@Path("/salsearching/{name}")
	public Employee getEmployeeByName(@PathParam("name") String name) {
		return (Employee) employees.stream().filter(e -> e.getName().equals(name)).findAny().orElse(null);
	}

	@GET
	@Path("/date/{dateOfJoining}")
	public Employee getEmployeeByDateOfJoining(@PathParam("dateOfJoining") LocalDate dateOfJoining) {
		return (Employee) employees.stream().filter(e -> e.getDateOfJoining().equals(dateOfJoining)).findAny()
				.orElse(null);
	}
}
