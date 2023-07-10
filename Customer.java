
public class Customer {
	private String name;
	private String address;
	private String phone;
	public Customer(String nam, String add, String ph) {
		name = nam;
		address = add;
		phone = ph;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	
	}
	
}


