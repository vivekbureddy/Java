public class MarksCalculation{
	static int sub1=85;
	static int sub2=90;
	static int sub3=80;
	public static int totalMarks(){
		return sub1+sub2+sub3;
	}
	public static double averageMarks(){
		return totalMarks()/3;
	}
	public static void main(String[] args){
		System.out.println(totalMarks());
		System.out.println(averageMarks());
	}
}