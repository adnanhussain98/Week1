package Day4;

public abstract class Animal {
	
	//can't instantiate objects of an abstract class. you need to inherit
	
	String name;
	int age;
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	public void makeNoise() {
//		System.out.println("This animal does not make any noise");
//	}
	

}
