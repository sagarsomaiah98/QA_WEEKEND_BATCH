package returnTypes;

public class Area {
	
	public double triangleArea(double length, double height) {
		
		double area=0.5*length*height;
		return area;
		
		
	}
	
	public static double circleArea(int radius) {
		
		double area=3.14*radius*radius;
		return area;
		
	}
	
	public static int rectangleArea(int length, int breadth) {
		
		int area=length*breadth;
		return area;
		
		
	}
	

	public static void main(String[] args) {
		Area a = new Area();
		System.out.println(a.triangleArea(21.3, 10.5));
		System.out.println(circleArea(15));
		System.out.println(rectangleArea(17,8));

	}

}
