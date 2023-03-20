package firstSpring;

public class Employee {
	
	String Name;
	int roll;
	Address address;

	//Performing injection using constructors.
	
	public Employee() {
		
	}

	public Employee(String name, int roll, Address address) {
		super();
		Name = name;
		this.roll = roll;
		this.address = address;
	}

	@Override
	public String toString() {
		//address.toString();
		return "Employee [Name=" + Name + ", roll=" + roll + ", address=" + address + "]";
	}


}
