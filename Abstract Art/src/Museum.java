import java.util.ArrayList;
public class Museum {
	protected static ArrayList<Art> museum = new ArrayList<>();
	
	
	public static void main(String[] args) {
		Painting paint1 = new Painting("Mona Lisa", "Leonardo da Vinci", "a lady.", "Oil");
		museum.add(paint1);
		
		Painting paint2 = new Painting("The Starry Night", "Vincent van Gogh", "stars.", "Watercolor");
		museum.add(paint2);
		
		Painting paint3 = new Painting("Guernica", "Pablo Picasso", "weird figures.", "Pastel");
		museum.add(paint3);
		
		Sculpture sculpt1 = new Sculpture("David", "Michelangelo", "it's David.", "marble");
		museum.add(sculpt1);
		
		Sculpture sculpt2 = new Sculpture("The Thinker", "Auguste Rodin", "thinking hard.", "brass");
		museum.add(sculpt2);
		
		}
	}
}
