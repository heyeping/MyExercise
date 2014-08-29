package two;

public class Employee {
	//这个成员变量对子类可见
	public String name;
	//私有变量，尽在该类可见
	private double salary;
	//在构造器中对name赋值
	public Employee(String empName){
		name=empName;
	}
	public void setSalary(double empSal){
		salary=empSal;
	}
	public void printEmp(){
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
	}
	public static void main(String args[]){
		Employee empOne=new Employee("heyeping");
		empOne.setSalary(100000);
		empOne.printEmp();
	}

}
