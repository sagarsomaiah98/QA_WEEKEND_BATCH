package StringfunctionMethods;

public class String_Split_Functions {

	public static void main(String[] args) {
		
		String input="Welcome-To-Training";
		String[] value= input.split("-");
		System.out.println("length of value array is "+value.length);
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		  
	}

}
