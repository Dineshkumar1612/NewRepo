package i8_java8;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> pr=a->(a>18);
		System.out.println(pr.test(6));
	}

}
