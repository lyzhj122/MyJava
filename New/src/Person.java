
public class Person {
		String name;
		int age;
		void sayHello(){
			System.out.println("Hello!, My name is"+name);
			}
	}

class Studen extends Person{
	String School;
	int Score;
	boolean isGood(){return Score>80;}
}
