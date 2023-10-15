package objectExamples;

public class main {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1985, 45, 2000.0, "kemal");
		
		System.out.println("tax : " + emp1.tax());
		System.out.println("bonus: " + emp1.bonus());
		System.out.println("increase salary: " + emp1.increase());
		
		double totalSalary = emp1.salary - emp1.tax() + emp1.bonus();
		System.out.println("total salary: " + totalSalary);
		System.out.println("raise salary: " + (emp1.salary + emp1.increase()));
	}

}
