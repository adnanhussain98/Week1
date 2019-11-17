package Day4;

public class Cat extends Animal implements Tricks {

	private String breed;

	public Cat(String name, int age, String breed) {
		// subclass of animal
		super(name, age);

		this.breed = breed;
	}

//	@Override
//	public void makeNoise() {
//		System.out.println(this.getName() + "Meow");
//	}

	@Override
	public String doesTheseTricks() {
		return "jumps up";
	}

}
