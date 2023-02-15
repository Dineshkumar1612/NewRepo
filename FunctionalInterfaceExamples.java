package i8_java8;

public class FunctionalInterfaceExamples {
	public static void main (String[] args) {
		Serupu s = new Serupu();
	Example Name=(a)->a;
	Example College=(a)->a;
	Example roll=(a)->a;
	System.out.println(Name.getName("dinesh"));
	System.out.println(College.getCollege("Ucek"));
	System.out.println(Example.rollno(13403020));
	Example no=s::getName;
	System.out.println(no.getName("dinesh"));
	System.out.println(no.getCollege("Ucek"));
	}
	

}
@FunctionalInterface
interface Example {
	public String getName(String value);
	public static int rollno(int no) {
		return no;
	}
	public default String getCollege(String college) {
		return college;
	}
}
class Serupu implements Example{
	public String getName(String name) {
		return "hi "+name;
	}
}