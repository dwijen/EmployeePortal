package com.dwijen.emp;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path ("EmployeeService")
public class EmployeeService {
	
	@GET
	@Path("/noe")
	@Produces({MediaType.TEXT_HTML, MediaType.APPLICATION_JSON})
	public String noOfEmployee() {
		int size =10;
		return size+"";  
	}
	
	@GET
	@Path("/emp/{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Employee getEmployee(@PathParam("id") int id) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName("Dwijen123");
		return emp;
	}
	
	@GET
	@Path("/testemp")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Employee get() {
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("dipten");
		return emp;
				
	}
	
	@GET
	@Path("/data")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Movie> getJson() {
		List<Movie> movieList = new ArrayList<>();
		Movie movie = new Movie();
		movie.setId(1);
		movie.setName("Pathe holo deri");
		movieList.add(movie);
		
		Movie movie2 = new Movie();
		movie2.setId(2);
		movie2.setName("Pather pachali");
		movieList.add(movie2);
		
		return movieList;
	}
	
	@GET
	@Path("/emps")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Employee> getAllEmp() {
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Dwijen");
		
		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setName("Dipten");
		
		List<Employee> empList = new ArrayList<>(2);
		empList.add(emp1);
		empList.add(emp);
		return empList;
	}
	
	

}
