package Second;

import com.A.Default_Example;
import com.A.Protected_Example;

public class Run extends Protected_Example {

	public static void main(String[] args) {
		
		/*
		 * Default_Example d= new Default_Example(); d.method1();
		 * System.out.println(d.age); System.out.println(d.name);
		 */

		
		/*
		 * Protected_Example p= new Protected_Example();
		 * 
		 * p.method1(); System.out.println(p.name); System.out.println(p.age);
		 */
		
		Run r= new Run();
		r.method1();
		System.out.println(r.age);
		System.out.println(r.name);
	}

}
