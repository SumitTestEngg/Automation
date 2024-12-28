package OOPS;

public class EncapsulationClass1 {
 // Variables declared as private
 // These private variables can only accessed by public methods of class	
   private int age;
   private String name;
 // Getter method to access private variable   
   public int getAge() {
	   return age;
   }
   public String getName() {
	   return name;
   }
   // Setter method to access private variable
   public void setAge(int inputAge) {
	   age=inputAge;
   }
   
   public void setName(String inputName) {
	   name=inputName;
   }
}
