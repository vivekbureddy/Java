public class CombineLocalandStatic{
	static int rate=10;
	public static void calculateAmount(){
		int amount=500;
		int total=amount+rate;
		System.out.println(total);
	}
	public static void main(String[] a){
		calculateAmount();
	}
}