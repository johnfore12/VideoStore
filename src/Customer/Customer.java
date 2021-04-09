package Customer;

public class Customer {
	
	private String name;
	private int id;
	
	public Customer(String name, int id) {
		name = this.name;
		id = this.id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "[" + name + ", " + id + "]";
	}
}
