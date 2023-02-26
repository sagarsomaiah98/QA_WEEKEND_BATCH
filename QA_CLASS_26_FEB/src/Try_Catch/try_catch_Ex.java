package Try_Catch;

public class try_catch_Ex {

	public static void main(String[] args) {
		
		int[] temp=new int[5];
		
		try 
		{
		
		temp[2]=30;
		temp[10]=10;
		temp[1]=90;
		}
		
		catch(Exception e)
		{
			
			System.out.println("try block didnt execute");
			System.out.println("not able to store all the values");
			e.printStackTrace();
			
		}
	
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		
		String city[]= new String[4];
		city[2]="Newyork";
		System.out.println(city[2]);
		

	}

}
