package objectExamples;

public class Employee {
	private String name;
	public double salary;
	private int workHours, hireYear;
	
	Employee(int hireYear, int workHours, double salary, String name){
		this.name = name;
		this.salary = salary;
		this.hireYear = hireYear;
		this.workHours = workHours;
	}
	
	public double tax() {
		if(this.salary >= 100) {
			return salary * 0.03;
		}
		else {
			return 0.0;
		}
	}
	public double bonus() {
		int extraHours = this.workHours - 40;
		if(extraHours > 0) {
			return 30 * extraHours;
		}
		return 0.0;
		
	}
	public double increase() {
		int year = 2020 - this.hireYear;
		if(year < 10) {
			return salary * 0.5;
		}
		else if (year >=10 && year < 20) {
			return salary * 0.10;
		}
		else {
			return salary *0.15;
		}
	}

}
