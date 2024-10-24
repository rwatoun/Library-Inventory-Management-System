package package3;


//------------------------------------------------------------------
//Assignment 1
//Question: Journal Class
//------------------------------------------------------------------

public class Journal extends Item{
	
	// Attributes
	private static int journalTracker = 0;
	private int numOfVolume;
	private static Journal[] arrayJournal = new Journal [300];
	
	// Default Constructor
	public Journal() {
		super();
		this.numOfVolume = 0;
		this.setItemId("J" + Integer.toString((journalTracker+1)));
		arrayJournal[journalTracker] = this;
		journalTracker++;
	}
	
	// Parameterized Constructor
	public Journal (String name, String author, int yearOfPublication, int numOfVolume) {
		super(name, author, yearOfPublication, null);
		this.numOfVolume = numOfVolume;
		this.setItemId("J" + Integer.toString((journalTracker+1)));
		arrayJournal[journalTracker] = this;
		journalTracker++;
	}
	
	// Copy Constructor
	public Journal(Journal other) {
		super(other);
		this.numOfVolume = other.getNumOfVolume();
		this.setItemId("J" + Integer.toString((journalTracker+1)));
		arrayJournal[journalTracker] = this;
		journalTracker++;
	}
	
	// Getters & Setters
	public int getNumOfVolume() {
		return numOfVolume;
	}

	public void setNumOfVolume(int numOfVolume) {
		this.numOfVolume = numOfVolume;
	}
	public static Journal[] getArrayJournal() {
		return arrayJournal;
	}

	public static void setArrayJournal(Journal[] arrayJournal) {
		Journal.arrayJournal = arrayJournal;
	}

	//Method to display all journal objects from the array
	public static void displayAllJournals() {
		for (int i = 0; i < arrayJournal.length ; i++ )
			if (arrayJournal[i] == null) {
				
			} else {
				System.out.println(arrayJournal[i]);
			}
	}
	
	

	// toString Method
	@Override
	public String toString() {
		return "This journal's name is " + this.getName() + ", its author is " + this.getAuthor() +
				", its year of publication is " + this.getYearOfPublication() + ", its Volume number is " +
				this.numOfVolume + ", and its ID is " + this.getItemId() + ".";
	
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
				Journal otherJournal = (Journal) other;
				if (this.getName().equals(otherJournal.getName()) && (this.getAuthor().equals(otherJournal.getAuthor())) 
					&& (this.getYearOfPublication() == otherJournal.getYearOfPublication()) && this.getNumOfVolume() 
					== otherJournal.getNumOfVolume()) {
					return true;
				}
				else {
					return false;
				}
	}

}
