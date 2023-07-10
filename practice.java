import java.util.*;

public class practice {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your full name?");
		String name = sc.nextLine();
		
		
		System.out.println("What your home address?");
		String address = sc.nextLine();
		
		System.out.println("What is your cell phone number?");
		String phone = sc.nextLine();
		
		Customer c = new Customer( name,  address,  phone);
		
		c.setName(name);
		c.setAddress(address);
		c.setPhone(phone);
		System.out.println();
		System.out.println("Your output.");
		System.out.println("Your full name is "+c.getName());
		System.out.println("Your home address is "+ c.getAddress());
		System.out.println("Your cell phone number is "+ c.getPhone());
		
}
	
}

