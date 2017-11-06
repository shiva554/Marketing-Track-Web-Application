package com.rwsdev.MyRWS;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class Service {
	
	EmployeeDao empDao = new EmployeeDao();
	/*@GET
	@Path("/gete")
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmp(){
		Employee ee= new Employee(1," eName", "street", "city", "state",69875);
		return ee;
	}*/
	
	@GET
	@Path("/getee")
	@Produces(MediaType.TEXT_PLAIN)
	public String getEEmp(){
		//Employee ee= new Employee(1," eName", "street", "city", "state",69875);
		return "Hello";
	}
	
/*	@GET
	@Path("/getEmployeeeByIdXml")
	@Produces(MediaType.TEXT_PLAIN)
	public String getEmployeeeByIdXml(@QueryParam("p1") int id){
		return "Hello"+id;
	}
*/	
	
	@GET
	@Path("/getEmployeeByIdXml")
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployeeByIdXml(@QueryParam("p1") int id){
		return empDao.getEmployeeById(id);
	}
	
	@GET
	@Path("/getAllEmployeesByXml")
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getAllEmployeesByXml(){
		return empDao.getAllEmployees();
	}
	
	@GET
	@Path("/getEmployeeByIdJSON")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeByIdJSON(@QueryParam("p1") int id){
		return empDao.getEmployeeById(id);
	}


}
