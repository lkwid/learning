package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {
	
	Customer customer = new CustomerImpl();

	@Override
	public int getId() {
		return customer.getId();
	}

	@Override
	public List<Order> getOrders() {
		List<Order> orders = List.of(
				new Order(0, "Xbox Series X", 1),
				new Order(1, "XSX Controller", 1)				
				);
				
		return orders;
	}

}
