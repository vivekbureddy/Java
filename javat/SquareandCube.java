public class SquareandCube{
	static int num=5;
	public static int square(){
		return num*num;
	}
	public static void cube(){
		System.out.println(square()*num);
	}
	public static void main(String[] args){
		cube();
	}
}