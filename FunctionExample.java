package i8_java8;

import java.util.function.Function;

public class FunctionExample {
	static String show(String msg) {
		return "Hello "+msg;
	}
	public static void main(String[] arg) {
		Function<String, String>fun =FunctionExample::show;
		System.out.println(fun.apply("Word"));
	}

}
