package structural.proxy;

public class Order {

	private int id;
	private String productName;
	private int quantity;
	
	public Order(int id, String productName, int quantity) {
		this.id = id;
		this.productName = productName;
		this.quantity = quantity;
	}
	
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getProductName() {
		return productName;
	}
	public final void setProductName(String productName) {
		this.productName = productName;
	}
	public final int getQuantity() {
		return quantity;
	}
	public final void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
