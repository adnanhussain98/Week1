package Day6;

public class DVD {

	private int id;
	private String title;
	private String genre;
	private int year;

	public DVD(int id, String title, String genre, int year) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
