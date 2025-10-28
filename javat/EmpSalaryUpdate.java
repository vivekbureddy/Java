public class EmpSalaryUpdate{
	static int basic=20000;
	static int bonus=5000;
	public static void calculateSalary(){
		int total=basic+bonus;
		System.out.println(total);
	}
	public static void main(String[] a){
		calculateSalary();
	}
}