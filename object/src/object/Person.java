package object;

public class Person {
//財布
   static int wallet = 0;
//名前
	private String name="";
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}

//年齢
	private int age = 0;
	public int getAge() {
		return this.age;
	}
	public void setAge(int age){
		this.age=age;
	}



	Person (){
		this.name = "さ";
		this.age = 19;
	}
    Person(int money){
    	Person.wallet = wallet + money;
    }

	public void myProfile() {
		System.out.println("私の名前は"+this.name+"です。");
		System.out.println("私の年齢は"+this.age+"です。");
		System.out.println("よろしくお願いします。");


		}


	}





