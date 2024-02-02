package com.edu;

public class Employee {
	private int EmpId;// global variable
	private String name;
	private String salary;

//setter method -to set value
	public void setEmpId(int EmpId) {// local variable
		this.EmpId = EmpId;
	}

	public int getEmpId() {
		return EmpId;// global variable
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setsalary(String salary) {
		this.salary = salary;
	}

	public String getsalary() {
		return salary;
	}

	@Override
	public String toString() {//object  class's fun
		return "Employee [EmpId=" + EmpId + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();//e1 is encapsulated the data -->which returns getmethds
		e1.setEmpId(31);
		e1.setname("Anuja");
		e1.setsalary("900000");
		System.out.println(e1);

		Employee e2 = new Employee();
		e2.setEmpId(47);
		e2.setname("Sam");
		e2.setsalary("700000");
		System.out.println(e2);

		// System.out.println(e1.getEmpId());
		// System.out.println(e1.getname());
		// System.out.println(e1.getsalary());

	}

}
