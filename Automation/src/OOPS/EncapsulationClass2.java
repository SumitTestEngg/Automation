package OOPS;

public class EncapsulationClass2 {

	public static void main(String[] args) {
		EncapsulationClass1 obj=new EncapsulationClass1();
		// Setting values of variables
		obj.setAge(30);
		obj.setName("Sumit");
		System.out.println("My name is " + obj.getName());
		System.out.println("My age is " + obj.getAge());

	}

}
