package Arrays_Ex;

public class Array_Ex {

	public static void main(String[] args) {
		//single dimensional array
		
		
		//two dimensional array
		

		String[] stud= new String[10];
		
		stud[3]="John";
		stud[4]="Sam";
		stud[0]="Steve";
		stud[1]="Ray";
		stud[2]="Lee";
		stud[2]="Mary";
		stud[4]=stud[0];
		
		//class method
		System.out.println(stud.length);
		int len=stud.length;
		
		/*
		 * System.out.println(stud[4]); System.out.println(stud[3]);
		 * System.out.println(stud[2]); System.out.println(stud[0]);
		 * System.out.println(stud[1]);
		 */
		//System.out.println(stud[5]);
		
		for(int i=0;i<len;i++) {
			System.out.println(stud[i]);
			
		}
		
	}

}
