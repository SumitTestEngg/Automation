package OOPS;
class Animal{
	void eat() {
		System.out.println("Animal is Eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog Is Barking");
	}
}



public class Inheritance {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.eat();
		obj.bark();
		

	}

}
