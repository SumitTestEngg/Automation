package OOPS;

public class Employee {

	int EmpID;
	String EName;
	String EJob;
	int ESalary;
	
	Employee(String EName,int EmpID,String EJob,int ESalary){
		
		this.EName=EName;
		this.EmpID=EmpID;
		this.EJob=EJob;
		this.ESalary=ESalary;
		
	}
	
	void Display() {
		System.out.println(EmpID);
		System.out.println(EName);
		System.out.println(EJob);
		System.out.println(ESalary);
	}
	
	void Show() {
		System.out.println("Next Employee Data Is");
		
	}
	public static void main(String[] args) {
		Employee Emp1=new Employee("Sumit",001,"Engineer",30000);
		Emp1.Display();
		Emp1.Show();
	
		
		
		
		
		
		
		
		

	}

}
