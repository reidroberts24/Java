
public class Painting extends Art {
	protected String paintType;
	
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}
	
	public void viewArt() {
		System.out.println("Ahh that painting is very good!");
	}
}
