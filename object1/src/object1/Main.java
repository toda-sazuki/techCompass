package object1;

public class Main extends Animal {
		//体重
		  static double weight;

		  // public Dog() {};
			public Main(String name,int age,double weight) {
				Animal.name = name;
				this.age = age;
				this.weight = weight;
			}

	public static void main(String[] arg) {
		Main main = new Main("ポチ",5,12.3);
		System.out.println("名前:"+name);
		System.out.println("年齢:"+age+"歳");
		System.out.println("体重:"+weight+"kg");

		run();
		Animal animal = new Animal();
		animal.sleep();
		main.sleep();
		animal.sleep();


	}

	public static void run() {
			System.out.println(name+"は走った");
			}

	public void sleep() {
		System.out.print(name+"は");
	}


}
