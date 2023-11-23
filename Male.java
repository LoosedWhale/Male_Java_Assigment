package Male;

public class Male {
	String name;
	int age;
	
	public Male(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eatAndDrink() {
		System.out.println(name + " ate some prigels and drank monster");
	}
	
	public void playsCod(int hour){
		System.out.println(name + " played Cod for " + hour + " hours");
	}
	
	public void hello() {
		System.out.println("Hi you all");
	}
	
	public void howOld() {
		System.out.println(name + " is " + age + " years old");
	}	
	
	
	public static void main(String[] args) {
		
		Male Theodor = new Male("Theodor", 18);
		
		Theodor.hello();
		Theodor.playsCod(69);
		Theodor.eatAndDrink();
		Theodor.howOld();
	}

}