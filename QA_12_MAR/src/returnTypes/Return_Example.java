package returnTypes;

public class Return_Example {
	
	public static String convertToLowerCase(String input) {
		
		return input.toLowerCase();
		
		
	}
	

	public static void main(String[] args) {
		String output=convertToLowerCase("wElcome to SelenIUM Training");
		System.out.println(output);
		System.out.println(convertToLowerCase("Java is PROGRAmming language"));
		
		

	}

}
