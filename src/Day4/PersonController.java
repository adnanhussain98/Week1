package Day4;

public class PersonController {

	public static void main(String[] args) {
		//polymorphism. 
		Student s = new Student("Adnan", 1998, "Oldham");
		Lecturer l = new Lecturer("Iqra", 1997, "Cheetham Hill");
		
		s.introduceYourself();
		l.introduceYourself();
	}

}
