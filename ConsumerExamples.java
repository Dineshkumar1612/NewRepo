package i8_java8;

import java.util.function.Consumer;

public class ConsumerExamples {
	public static void ptinrtName(String a) {
		System.out.println("Welcome "+a);
	}
//	public void welcom(String a) {
//		System.out.println("Welcome "+a);
//	}
//	
	
	public static void main(String[] arg) {
		Consumer<String >consumer1=ConsumerExamples::ptinrtName;
		consumer1.accept("Azar");
		ConsumerExamples a=new ConsumerExamples();
		//Consumer<String >consumer=ConsumerExamples(a.welcom(null));
		Consumer<String> consumer2=value->{
			System.out.println(value);
			//System.out.println(value);
			//System.out.println(value);
		};
		consumer2.accept("Azarudeen");
	}

}
