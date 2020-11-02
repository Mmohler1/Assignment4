//Michael Mohler 

package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;


import beans.User;
import business.MyTimerService;
import business.OrdersBusinessInterface;

@ManagedBean
@ViewScoped
public class formController 
{
	
	//Insert the interface
	@Inject
	OrdersBusinessInterface service;
	
	//EJB for timers related things
	@EJB
	MyTimerService timer;

	
	//Submit by initializing the user in the method 
	public String onSubmit()
	{
		//Get the User Managed bean
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		service.test();
		
		timer.setTimer(10000);
		
		//Forward to Test Response View along with the user Managed Bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "TestResponse.xhtml";
	}
	
	
	
	public OrdersBusinessInterface getService()
	{
		return service;
	}
	

	
}
