public class StudentPercentage{
	static int marks1=78;
	static int marks2=85;
	static int marks3=90;
	public static int total(){
		return (marks1+marks2+marks3);
	}
	public static void percentage(){
		System.out.println((total()/300.0)*100);
	}
	public static void main(String[] a){
		percentage();
	}
}