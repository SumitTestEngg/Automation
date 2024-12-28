package OOPS;

public class CompileTimePolymorphism {
void myMethod (int A) {
	
	System.out.println("Value of A is " + A);
	
}
	
void myMethod (int A,int B) {
	
	System.out.println("Value of A is " + A + " and Value Of B is" + B);
	
}
void myMethod (String A) {
	
	System.out.println(A);
	
}


	public static void main(String[] args) {
	
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		obj.myMethod(6);
		obj.myMethod(2, 4);
		obj.myMethod("IAm String");
		
		

	}

}
