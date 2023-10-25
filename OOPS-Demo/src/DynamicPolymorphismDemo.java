class Animal{
	
	public void sound() {
		System.out.println("Animal is making sound.......");
	}
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Dog is making sound bow... bow... .......");
	}
}

public class DynamicPolymorphismDemo {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.sound();//method call will resolved at runtime will called as Runtime Poly or dynamic poly or dynamic method dispatch....
		
		Animal animal1 = new Dog();
		animal1.sound();//
	}
}
