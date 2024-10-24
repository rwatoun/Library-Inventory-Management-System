package package3;
import package2.Client;


//------------------------------------------------------------------
//Assignment 1
//Question: Book Class
//------------------------------------------------------------------

public class Book extends Item{
	
	// Attributes
	private static int bookTracker = 0;
	private int numOfPages;
	private static Book[] bookArray = new Book[300];
	
	
	// Default Constructor
	public Book (){
		super();
		this.numOfPages = 0;
		
		this.setItemId("B" + Integer.toString((bookTracker+1)));
		bookArray[bookTracker] = this;
		bookTracker++;
	}
	// Parameterized Constructor
	public Book(String name, String author, int yearOfPublication, int numOfPages) {
		// added null because no client associated now
		super(name, author, yearOfPublication, null);
		this.numOfPages = numOfPages;
		
		this.setItemId("B" + Integer.toString((bookTracker+1)));
		bookArray[bookTracker] = this;
		bookTracker++;
	}
	
	// Copy Constructor
	public Book (Book other) {
		super(other);
		this.numOfPages = other.getNumOfPages();
		this.setItemId("B" + Integer.toString((bookTracker+1)));
		bookArray[bookTracker] = this;
		bookTracker++;
	}
	
	
	// Getters & Setters
	public int getNumOfPages() {
		return numOfPages;
	}
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	public static Book[] getBookArray() {
		return bookArray;
	}
	public static void setBookArray(Book[] bookArray) {
		Book.bookArray = bookArray;
	}
	
	
	// Method to display all book objects in the array
	public static void displayAllBooks() {
		
		for (int i = 0; i < bookArray.length ; i++ )
			if (bookArray[i] == null) {
				
			} else {
				System.out.println(bookArray[i]);
			}
				
	}
	
	
	
	// toString Method
	@Override
	public String toString() {
		
		
		if(this.getClient() != null) {
			return "This book's name is " + this.getName() + ", its author is " + this.getAuthor() +
					", its year of publication is " + this.getYearOfPublication() + ", its number of pages is " +
					this.numOfPages + ", its ID is " + this.getItemId() + ", and the client to whom it is leased is " + 
					this.getClient();
		} else  {
			
			return "This book's name is " + this.getName() + ", its author is " + this.getAuthor() +
					", its year of publication is " + this.getYearOfPublication() + ", its number of pages is " +
					this.numOfPages + ", its ID is " + this.getItemId() + ", and it is not leased for the moment. ";
			
		}
		
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
				Book otherBook = (Book) other;
				if (this.getName().equals(otherBook.getName()) && (this.getAuthor().equals(otherBook.getAuthor())) 
					&& (this.getYearOfPublication() == otherBook.getYearOfPublication()) && this.getNumOfPages() 
					== otherBook.getNumOfPages()) {
					return true;
				}
				else {
					return false;
				}
			}
		
	

}
