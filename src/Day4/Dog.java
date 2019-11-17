package Day4;

public class Dog extends Animal implements Tricks {

	public Dog(String name, int age) {
		super(name, age);

	}

//	@Override // changes the default behaviour of the
//	public void makeNoise() {
//		System.out.println(this.getName() + "Woof");
//	}

	@Override
	public String doesTheseTricks() {
		return "rolls over";
	}

}
