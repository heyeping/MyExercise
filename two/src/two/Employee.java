package two;

public class Employee {
	//�����Ա����������ɼ�
	public String name;
	//˽�б��������ڸ���ɼ�
	private double salary;
	//�ڹ������ж�name��ֵ
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
