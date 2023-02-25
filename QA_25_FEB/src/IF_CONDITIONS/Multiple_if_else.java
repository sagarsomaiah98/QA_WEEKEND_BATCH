package IF_CONDITIONS;

public class Multiple_if_else {

	public static void main(String[] args) {
		
		int k=90;
		int m=100;
		int h=45;
		
		if(k>m) { 
			if(k>h)
				System.out.println(k+" is greatest");
		}  
		else if(m>h)
			System.out.println(m+" is greatest");
		else
			System.out.println(h+" is greatest");
		
		
		
	}

}
