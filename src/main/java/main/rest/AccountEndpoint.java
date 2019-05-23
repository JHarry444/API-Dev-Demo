package main.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import main.service.AccountService;

@Path("/account")
public class AccountEndpoint {
	
	@Inject
	private AccountService service;

	public void setService(AccountService service) {
		this.service = service;
	}

	@Path("/addAccount")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		return service.addAccount(account);
	}
	
	@Path("/getAccount/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAccount(@PathParam("id") Integer id) {
		return service.getAccount(id);
	}

	@Path("/getAll")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllAccounts() {
		return this.service.getAllAccounts();
	}

	@Path("/delete/{id}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteAccount(@PathParam("id") int id) {
		return this.service.deleteAccount(id);
	}

	@Path("/update/{id}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String updateAccount(@PathParam("id") int id, String mockValue2) {
		return this.service.deleteAccount(id);
	}
	
	
	
}