package i8_java8;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<student> StudentSupplier=()->new student(12, "Azar", 26);
		student Student= StudentSupplier.get();
		System.out.println(Student);
		}
	

}
class student {
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public student(int id, String name, int age) {
		//super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}
