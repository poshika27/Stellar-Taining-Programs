class Dog{
	void animal() {
	System.out.println("Dog");
}
}
class Cat extends Dog{
	void animal() {
		System.out.println("Cat");
	}
}

public class Extendscatdog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		Cat c=new Cat();
		d.animal();
		c.animal();

	}

}
