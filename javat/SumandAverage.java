public class SumandAverage{
	public static int sum(int a, int b){
		int add=a+b;
		System.out.println(add);
		return add;
	}
	public static int average(int a,int b){
		int avg=sum(a,b)/2;
		System.out.println(avg);
		return avg;
	}
	public static void main(String[] args){
		average(20,30);
	}
}