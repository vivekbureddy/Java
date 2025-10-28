public class SwapNumbers{
	static int x=10;
	static int y=20;
	public static void swap(){
		int temp=x;
		int x=y;
		int y=temp;
		System.out.println("x="+x+",y="+y);
	}
	public static void main(String[] a){
		swap();
	}
}