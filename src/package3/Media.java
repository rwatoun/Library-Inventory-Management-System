package package3;

//------------------------------------------------------------------
//Assignment 1
//Question: Media Class
//------------------------------------------------------------------

public class Media extends Item {

	// Attributes
	private static int mediaTracker = 0;
	private String type;
	private static Media[] arrayMedia = new Media[300];
	
	// Default Constructor
	public Media() {
		super();
		this.type = "";
		this.setItemId("M" + Integer.toString((mediaTracker+1)));
		arrayMedia[mediaTracker] = this;
		mediaTracker++;
	}
	
	// Parameterized Constructor
	public Media( String name, String author, int yearOfPublication, String type) {
		super(name, author, yearOfPublication, null);
		this.type = type;
		this.setItemId("M" + Integer.toString((mediaTracker+1)));
		arrayMedia[mediaTracker] = this;
		mediaTracker++;
	}
	
	// Copy Constructor
	public Media (Media other) {
		super(other);
		this.type = other.getType();
		this.setItemId("M" + Integer.toString((mediaTracker+1)));
		arrayMedia[mediaTracker] = this;
		mediaTracker++;
	}
	
	// Getters & Setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public static Media[] getArrayMedia() {
		return arrayMedia;
	}

	public static void setArrayMedia(Media[] arrayMedia) {
		Media.arrayMedia = arrayMedia;
	}

	
	// Method that displays all media objects from the array
	public static void displayAllMedia() {
	
		for (int i = 0; i < arrayMedia.length ; i++ )
			if (arrayMedia[i] == null) {
				
			} else {
				System.out.println(arrayMedia[i]);
			}
	}
	
	// toString Method
	@Override
	public String toString() {
		
		return "This media's name is " + this.getName() + ", its author is " + this.getAuthor() +
		", its year of publication is " + this.getYearOfPublication() + ", its type is " +
		this.type + ", and its ID is " + this.getItemId() + ".";
	}
	
	
	// equals Method
	@Override 
	public boolean equals(Object other) {
		// 1. Check if parameter is null (return false if null)
				if (other == null) {
					return false;
				} 
			// 2. Check if other is of the type of this class (return false if not), cannot use instanceOf (), must use getClass()
				if (this.getClass() != other.getClass()) {
					return false;
					}
			// 3. Implement
				Media otherMedia = (Media) other;
				if (this.getName().equals(otherMedia.getName()) && (this.getAuthor().equals(otherMedia.getAuthor())) 
					&& (this.getYearOfPublication() == otherMedia.getYearOfPublication()) && this.getType() 
					== otherMedia.getType()) {
					return true;
				}
				else {
					return false;
				}
	}
	
	
}
