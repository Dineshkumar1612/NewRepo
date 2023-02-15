package i8_java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AllStreamMethods {
	static {
		System.out.println("Welcome");
	}
	public static void main (String[] args) {
		StreamMethods m1 = new StreamMethods("Dinesh",26,10000,"Tiruvannamalai",604408);
		StreamMethods m2 = new StreamMethods("Azarudeen",26,20000,"Cuddalore",621101);
		StreamMethods m3 = new StreamMethods("Ananth",25,22000,"KanyaKumari",631011);
		StreamMethods m4 = new StreamMethods("Logesh",28,25000,"Karur",631502);
		StreamMethods m5 = new StreamMethods("Nethaji",25,28000,"Arani",604407);
		List<StreamMethods>a = new ArrayList<>();
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		a.add(m5);
		//AscendingOrder
		List<String>l=a.stream().map(x->x.getName()).sorted().collect(Collectors.toList());
		List<String>m=a.stream().map(x->x.getName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(m);
		System.out.println(l);		
		//filter
		List<StreamMethods>w=a.stream().filter(x->x.getLocation().contains("Arani")).collect(Collectors.toList());
		System.out.println(w);
		//count
		long u=a.stream().filter(x->x.getSalary()>=20000).count();
		System.out.println(u);
		//limit Method
//		List<String>b=a.stream().map(x->x.getName()).filter(y->y.startsWith("A")).sorted().limit(1).collect(Collectors.toList());
//		System.out.println(b);
		
		//AnyMatch Method
//		boolean c=a.stream().map(y->y.getName()).anyMatch(x->x.contains("Dinesh"));
//		System.out.println(c);
		
		//Using Method Referrence we can filter Ascending order to filter the age in object
		List<StreamMethods>d=a.stream().sorted(Comparator.comparing(StreamMethods::getAge)).collect(Collectors.toList());
		//System.out.println(d);
		
		//Using toUnmodifiableList we can Read only the List you can't modify the list.
		List<StreamMethods>e=a.stream().collect(Collectors.toUnmodifiableList());
		//System.out.println(e);
		//e.add(m4);
		
		//you can see the specify list
		List<StreamMethods>f = new ArrayList<>();
		f.add(m1);
		f.add(m3);
		//System.out.println(f);
		
		//
		List<StreamMethods> b = new ArrayList<>();
		//b.add(a);
		//b.add(e);
		List<StreamMethods>g = new ArrayList<>();
		for(StreamMethods x:e) {
			for(StreamMethods v:a) {
				g.add(v);
			}
		}
		System.out.println(g);
		
	}
	

}










