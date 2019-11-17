package Day4;

public class Student extends Person {
	
	private int id;
	private String course;

	public Student(String name, int birthYear, String homeTown) {
		super(name, birthYear, homeTown);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}


}
