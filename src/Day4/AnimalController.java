package Day4;

public class AnimalController {

	public static void main(String[] args) {

		//polymorphism. 
		Dog d = new Dog("Fido", 23);
		Cat c = new Cat("Billy", 2, "Tabby");
		Goldfish g = new Goldfish("John", 33);
		
//		d.makeNoise();
//		c.makeNoise();
//		g.makeNoise();
		
		System.out.println(d.doesTheseTricks());
		System.out.println(c.doesTheseTricks());
	}

}
