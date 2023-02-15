package i8_java8;

public class StreamMethods {
	private String name;
	private int age;
	private int salary;
	private String location;
	private int pincode;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public void setPincode(int pincode) {
		this.pincode=pincode;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	public String getLocation() {
		return location;
	}
	public int getPincode() {
		return pincode;
	}
	public StreamMethods (String name, int age, int salary, String location, int pincode) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.location=location;
		this.pincode=pincode;
	}
	public String toString() {
		return "Name= "+name+", Age= "+age+", Salary= "+salary+", Location= "+location+", Pincode= "+pincode;
	}
}