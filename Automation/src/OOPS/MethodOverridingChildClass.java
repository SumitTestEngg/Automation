package OOPS;

public class MethodOverridingChildClass extends MethodOverridingParentClass {
	
public void myMethod() {
	System.out.println("Iam Method From CHILD Class");
	
}
	public static void main(String[] args) {
	  /*  When parent class reference refers to child class object
	   * then the method of child class (overriding method) is called 
	   * is called as run time polymorphism 
	   */
		MethodOverridingParentClass obj = new MethodOverridingChildClass();
		// It Calls child class method myMethod()
		obj.myMethod();
		
		/* When parent class reference refers to parent class object 
		 * then the method of parent class (overriden method) is called
		 */
		MethodOverridingParentClass obj1 = new MethodOverridingParentClass();
		obj1.myMethod();
		
	}

}
