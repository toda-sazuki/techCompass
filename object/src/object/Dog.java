package object;

public class Dog extends Animal {
	//体重
	   double weight;

	  // public Dog() {};
		public Dog(String name,int age,double weight) {
			Animal.name = name;
			this.age = age;
			this.weight = weight;
		}

public static void main(String[] arg) {
	Dog dog = new Dog("まさる",25,4.5);
	run();
	dog.sleep();
	Animal animal = new Animal();
	animal.sleep();


}

public static void run() {
		System.out.println(name+"は走った");
		}

public void sleep() {
	System.out.print(name+"は");
}
}
