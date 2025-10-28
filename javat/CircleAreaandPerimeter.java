public class CircleAreaandPerimeter{
	static int radius=5;
	public static double area(int r){
		return 3.14*r*r;
	}
	public static double perimeter(int r){
		return 2*3.14*r;
	}
	public static void main(String[] args){
		System.out.println(area(radius));
		System.out.println(perimeter(radius));
}
}