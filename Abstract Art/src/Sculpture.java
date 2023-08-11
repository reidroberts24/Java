
public class Sculpture extends Art {
	protected String material;
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}

	public void viewArt() {
		System.out.println("Wow look at this sculpture!");
	}
}
