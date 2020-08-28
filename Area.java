//Lets make changes in the remote repo
//to see what happens
public class Area {
	int length;
	int width;
	int side;
	double radius;
	
	static double pi;
	static {
		pi=3.14;
	}
	
	 Area(int length,int width)
	 {
		int rectangle=length*width;
		 System.out.println("Area of Rectangle is "+rectangle);
	 }
	 Area(int side)
	 {
		int square=side*side;
		 System.out.println("Area of Square is "+square);
	 }
	 Area(double radius)
	 {
		 double area=2*pi*radius;
		 System.out.println("Area of Circle is "+area);
	 }
	public static void main(String args[]) {
		Area a1=new Area(11,12);
		Area a2=new Area(10);
		Area a3=new Area(2.5);
		
	
}

}
