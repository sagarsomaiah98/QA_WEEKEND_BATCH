package Loops;

public class Prime_Number {

	public static void main(String[] args) {
		
		
		
		for(int i=5;i<=10;i++) {
			int count=0;
	    	   for(int j=2;j<=i;j++) {
				
			     if(i%j==0) 
			     {
			    	count++;
			    	break;
			    	
			     }
                                 	    		   
			}
	    	   if(count==1)
	    		   System.out.println(i);
	    		   

		}
	}

}
