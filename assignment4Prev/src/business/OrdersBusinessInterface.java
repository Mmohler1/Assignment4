package business;

import java.util.List;

import javax.ejb.Local;


//Imported beans
import beans.Order;

@Local
public interface OrdersBusinessInterface {

	public void test();
	public List<Order> getOrders();
	public void setOrders(List<Order> orders);
	
}
