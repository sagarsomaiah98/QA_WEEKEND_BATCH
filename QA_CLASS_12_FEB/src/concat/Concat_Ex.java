package concat;

public class Concat_Ex {

	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		String name="John";
		
		System.out.println(a+b+name);
		System.out.println(a+name+b);
		System.out.println(name+a+b);
        System.out.println(b+a+name);
        System.out.println(name+b+a);
        
        System.out.println(name+(a+b));
		
	}

}
