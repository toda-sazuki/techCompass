package object1;

public class Animal {
	//名前
		static String name;
		//年齢
		static int age;

		//コンストラクタ
		public Animal() {};
		public Animal(String name, int age) {
			Animal.name = name;
			this.age = age;
		}

		//眠る
		public void sleep() {
			System.out.println("眠った");
		}
	}
