package creational.singleton;

import java.util.stream.Collectors;

import structural.proxy.Customer;
import structural.proxy.CustomerProxyImpl;

public class ProxyTest extends ReflectionProblem {

	public static void main(String[] args) {
		
		Customer customer = new CustomerProxyImpl();
		System.out.println("Customer " + customer.getId());
		System.out.println("Orders: \n" + customer.getOrders().stream()
				.map(o -> String.format(
						"Product: %s -- Quantity: %d",
						o.getProductName(), o.getQuantity())).collect(Collectors.toList()));
	}

}
 