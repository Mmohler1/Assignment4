package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.faces.bean.ViewScoped;


//Imported beans
import beans.Order;

/**
 * Session Bean implementation class OrdersBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@LocalBean
@Alternative
@ViewScoped
public class OrdersBusinessService implements OrdersBusinessInterface {

	//Array list for orders
	List <Order> orders = new ArrayList<Order>();
	
    /**
     * Default constructor. 
     */
    public OrdersBusinessService() {
        // TODO Auto-generated constructor stub
		orders.add(new Order("03345873","Pants",(float)43.54,3));
		orders.add(new Order("05875643","Hat",(float)21.29,1));
		orders.add(new Order("05643423","Cooler",(float)200.87,10));
		orders.add(new Order("36922574","Soda Cans",(float)12.84,4));
    }

    //Tells the console that the program is running
    public void test() {
        // TODO Auto-generated method stub
    	System.out.println("-------->Hello from the OrdersBusinessService\n\n\n");
    }

    //Getters and setters for orders
    public List<Order> getOrders()
    {
    	return orders;
    	
    }
    
    public void setOrders(List<Order> orders)
    {
    	this.orders = orders;
    	
    }
}
