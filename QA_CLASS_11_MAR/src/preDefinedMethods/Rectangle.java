package preDefinedMethods;

public class Rectangle {
	
	public void area() 
	{
		int length=100;
		int breadth=50;
		int area=length*breadth;
		System.out.println("Area of rectangle is "+area);
		
	}
	
	

	public static void main(String[] args) {
		
	Rectangle r=new Rectangle();
	r.area();
		
		
	}

}
