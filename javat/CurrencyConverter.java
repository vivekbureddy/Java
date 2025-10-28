public class CurrencyConverter{
	static double dollarRate=84.5;
	public static void convertToINR(double usd){
		System.out.println(usd*dollarRate);
	}
	public static void main(String[] a){
		convertToINR(500.54);
		convertToINR(100);
		convertToINR(1);
	}
}