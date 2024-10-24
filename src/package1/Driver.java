package package1;
import java.util.Scanner;

import package2.Client;
import package3.Book;
import package3.Item;
import package3.Journal;
import package3.Media;


//------------------------------------------------------------------
//Assignment 1
//Question: Driver Class
//------------------------------------------------------------------

public class Driver {
		
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Welcoming the user into the library program
		System.out.println("***************Welcome to FunReadings Library!***************");
		System.out.println("Would you like to 1. View the menu or");
		System.out.println("                  2. Run a pre-defined scenario");
		System.out.print("Please input your answer: ");
		int choice1 = in.nextInt();
		
		// Executing the user's choice 
		if (choice1 == 1) {
			
			while (true) {
				mainMenu();
				int choice2 = in.nextInt();
				choiceOfUser(choice2);
				}
			
		} else if (choice1 == 2) {
			scenario();
		} 
		
		
	}
	
	// Method that displays the main menu
	public static void mainMenu() {
		System.out.println();
		System.out.println();
		System.out.println("This is the main menu: ");
		System.out.println("1. Add an item");
		System.out.println("2. Delete an item");
		System.out.println("3. Change the information of an item");
		System.out.println("4. List all books");
		System.out.println("5. List all journals");
		System.out.println("6. List all medias");
		System.out.println("7. List all items");
		System.out.println("8. Add a client");
		System.out.println("9. Delete a client");
		System.out.println("10. Lease an item to a client");
		System.out.println("11. Return an item leased to a client.");
		System.out.println("12. Display all items leased by a client");
		System.out.println("13. Display all leased items");
		System.out.println("14. Display the biggest book");
		System.out.println("15. Make a copy of the books array");
		System.out.println("Press the number that corresponds to the manipulation you desire to do: ");
	}
	
	// Method that displays the scenario
	public static void scenario()  {
	// Creating 3 Book objects and printing their information.
			Book b1 = new Book("The Song of Achilles", "Madeline Miller", 2012, 408);
			System.out.println(b1.toString());
			Book b2 = new Book("The Outsider", "Stephen King", 2020, 656);
			System.out.println(b2.toString());
			Book b3 = new Book("The Whisper Man", "Alex North", 2021, 480);
			System.out.println(b3.toString());
			System.out.println();
			
			// Creating 3 Journal objects and printing their information.
			Journal j1 = new Journal("British Journal of Radiology", "Dr Simon Jackson and Professor Andrew", 2024, 97);
			System.out.println(j1.toString());
			Journal j2 = new Journal("Journal of Political Economy", "Richard V. Burkhauser", 2024, 132);
			System.out.println(j2.toString());
			Journal j3 = new Journal("Nature Reviews Drug Discovery", "James A. Wells and Kaan Kumru", 2023, 100);
			System.out.println(j3.toString());
			System.out.println();
			
			// Creating 3 Media objects and printing their information
			Media m1 = new Media("The Iron Giant", "Warner Bros", 1999, "DVD");
			System.out.println(m1.toString());
			Media m2 = new Media("Wall-E", "Pixar", 2008, "DVD");
			System.out.println(m2.toString());
			Media m3 = new Media("Wall-E", "Pixar", 2008, "DVD");
			System.out.println(m3.toString());
			System.out.println();
			
			// Creating 3 Client objects and printing their information
			Client c1 = new Client("George Pine", "(514) 565-9844", "georgePine@gmail.com");
			System.out.println(c1.toString());
			Client c2 = new Client("Eleanor Ho", "(514) 748-8383", "elho@gmail.com");
			System.out.println(c2.toString());
			Client c3 = new Client("Mehmet Oz", "(438) 545-0130", "memosh@gmail.com");
			System.out.println(c3.toString());
			System.out.println();
			
			// Testing equality between two objects of different classes
			System.out.println("The equality between b1 and m3 is: " + b1.equals(m3));
			
			// Testing equality between two objects of the same class but with different values
			System.out.println("The equality between j1 and j2 is: " + j1.equals(j2));
			
			// Testing equality between two objects of the same class with the same attributes (except ID)
			System.out.println("The equality between m2 and m3 is: " + m2.equals(m3));
			System.out.println();
			
			// Creating an array of Books and using copy constructor to parameterize some of the Books
			Book[] books = new Book[5];
			books[0] = new Book(b1);
			books[1] = new Book(b2);
			books[2] = new Book(b3);
			books[3] = new Book();
			books[4] = new Book();
			
			// Creating an array of Journals and using copy constructor to parameterize some of the Journals
			Journal[] journals = new Journal[5];
			journals[0] = new Journal(j1);
			journals[1] = new Journal(j2);
			journals[2] = new Journal(j3);
			journals[3] = new Journal();
			journals[4] = new Journal();
			
			// Creating an array of Medias and using copy constructor to parameterize some of the Medias
			Media[] medias = new Media[5];
			medias[0] = new Media(m1);
			medias[1] = new Media(m2);
			medias[2] = new Media(m3);
			medias[3] = new Media();
			medias[4] = new Media();
			
			// Creating an array for all items
			Item[] items = {b1, b2, b3, books[3], books[4], books[4]};
			
			for (int i = 0; i < items.length; i++) {
				if (items[i].getClass() == Book.class) {
					
				}
					
			}
			
			// Creating an array of Clients and using copy constructor to parameterize some of the Clients
			Client[] clients = new Client[5];
			clients[0] = new Client(c1);
			clients[1] = new Client(c2);
			clients[2] = new Client(c3);
			clients[3] = new Client();
			clients[4] = new Client();
			
			
			// Calling the getBiggestBook() method of Book array and displaying the result
			getBiggestBook(books);
			
			// Calling the copyBooks() method on the Media array
			copyBooks(books);
	}
	
	// Method that accepts the user's choice after the main menu
	public static void choiceOfUser(int choice) {
		
		// Add a switch statement that refers to the method that satisfies the user's choice
		switch(choice) {
		case 1: 
			addItem();
			break;
		case 2:
			deleteItem();
			break;
		case 3:
			changeInformationOfItem();
			break;
		case 4:
			System.out.println("These are all the books: ");
			Book.displayAllBooks();
			System.out.println();
			break;
		case 5:
			System.out.println("These are all the journals: ");
			Journal.displayAllJournals();
			System.out.println();
			break;
		case 6: 
			System.out.println("These are all the medias: ");
			Media.displayAllMedia();
			System.out.println();
			break;
		case 7:
			Item.displayAllItems();
			System.out.println();
			break;
		case 8:
			addClient();
			break;
		case 9:
			deleteClient();
			break;
		case 10:
			leaseAnItem();
			break;
		case 11: 
			returnAnItem();
			break;
		case 12:
			displayAllLeasedItemsBySameClient();
			break;
		case 13:
			Item.getAllLeasedItems();
			break;
		case 14:
			getBiggestBook(Book.getBookArray());
			break;
		case 15:
			break;
		default:
			System.out.println("Wront input. Back to the main menu.");
				break;
			
		}
	}
	
	// Method that allows the user to add an item
	public static void addItem() {
		
		System.out.println("Which type of item would you like to add?");
		System.out.println("1. Book");
		System.out.println("2. Journal");
		System.out.println("3. Media");
		int answer = in.nextInt();
		
		switch (answer) {
		case 1:
			in.nextLine();
			System.out.print("Enter the name of the book: ");
	        String n1 = in.nextLine();
	        

	        System.out.print("Enter the author of the book: ");
	        String a1 = in.nextLine();
	      
		
	        System.out.println("Enter the year of publication of the book: ");
			int y1 = in.nextInt();
			
			System.out.println("Enter the number of pages of the book");
			int p1 = in.nextInt();
			
			Book b = new Book (n1, a1, y1, p1);
			
			System.out.println("Operation successfully done!");
			System.out.println();
			
			break;
		case 2:
			in.nextLine();
			System.out.print("Enter the name of the journal: ");
	        String n2 = in.nextLine();

	        System.out.print("Enter the author of the journal: ");
	        String a2 = in.nextLine();
		
	        System.out.println("Enter the year of publication of the journal: ");
			int y2 = in.nextInt();
			
			System.out.println("Enter the volume number of the journal");
			int v1 = in.nextInt();
			
			Journal j = new Journal (n2, a2, y2, v1);
			
			System.out.println("Operation successfully done!");
			System.out.println();
			
			break;
		case 3:
			in.nextLine();
			System.out.print("Enter the name of the media: ");
	        String n3 = in.nextLine();

	        System.out.print("Enter the author of the media: ");
	        String a3 = in.nextLine();
		
	        System.out.println("Enter the year of publication of the media: ");
			int y3 = in.nextInt();
			
			System.out.println("Enter the type of the media (audio/video/interactive): ");
			String t1 = in.next();
			
			Media m = new Media (n3, a3, y3, t1);
			
			System.out.println("Operation successfully done!");
			System.out.println();
			
			break;
		
		default:
			System.out.println("Your input does not correspond to the expected one. Back to the main menu.");
			System.out.println();
			break;
		}
		
		
	}

	
	// Method to delete an item
	public static void deleteItem() {
		
		System.out.println("Here is the list of all items: ");
		Item.displayAllItems();
		System.out.print("Please input the ID of the item you want to delete: ");
		String idItem = in.next();
		
		// Calling the method in charge of deleting the item
		Item.deleteItem(idItem);
		
		System.out.println("Operation successfully done!");
		System.out.println();
		
		}
	
	// Method to change the content of a specific item
	public static void changeInformationOfItem() {
		
			System.out.println("Which type of item would you like to change?");	
			System.out.println("1. Book");
			System.out.println("2. Journal");
			System.out.println("3. Media");
			int answer = in.nextInt();
					
			// Switch statement that directly accesses the methods related to the type of item chosen
			switch (answer) {
			case 1:
				
				System.out.println("Here is the list of all book items: ");
				Book.displayAllBooks();
				System.out.println();
				
				System.out.print("Please enter the ID of the book item you want to change: ");
				String index1 = in.next();
				System.out.println();
				
				System.out.println("What attribute would you like to change? ");
				System.out.println("1. Name of the book");
				System.out.println("2. Author of the book");
				System.out.println("3. Year of Publication of the book");
				System.out.println("4. Number of pages of the book");
				System.out.print("Enter the corresponding number: ");
				int attribute1 = in.nextInt();
				
				// Switch statement that directly accesses the method related to the change desired by also using the ID of the item.
				switch(attribute1) {
				case 1:
					
					System.out.println("What is the new name of the book? ");
					in.nextLine();
					String newName1 = in.nextLine();
					
					for (int i = 0; i < Book.getBookArray().length; i++ ) {
						
						if (Book.getBookArray()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Book.getBookArray()[i].getItemId().equalsIgnoreCase(index1)) {
							Book.getBookArray()[i].setName(newName1);
						}
					}
					break;
				case 2:
					
					System.out.println("What is the name of the new auhtor of the book? ");
					in.nextLine();
					String newAuthor1 = in.nextLine();
					
					for (int i = 0; i < Book.getBookArray().length; i++ ) {
						
						if (Book.getBookArray()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Book.getBookArray()[i].getItemId().equalsIgnoreCase(index1)) {
							Book.getBookArray()[i].setAuthor(newAuthor1);
						}
					}
					break;
				case 3:
					System.out.println("What is the new year of publication of the book? ");
					int newYearOfPublication1 = in.nextInt();
					
					for (int i = 0; i < Book.getBookArray().length; i++ ) {
						
						if (Book.getBookArray()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Book.getBookArray()[i].getItemId().equalsIgnoreCase(index1)) {
							Book.getBookArray()[i].setYearOfPublication(newYearOfPublication1);
						}
					}
					break;
				case 4:
					System.out.println("What is the new number of pages of the book? ");
					int newNumOfPages = in.nextInt();
					
					for (int i = 0; i < Book.getBookArray().length; i++ ) {
						
						if (Book.getBookArray()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Book.getBookArray()[i].getItemId().equalsIgnoreCase(index1)) {
							Book.getBookArray()[i].setNumOfPages(newNumOfPages);
						}
					}
					break;
					
				default:
					System.out.println("Wrong input.");
					System.out.println();
					break;
				}
				
				System.out.println("Operation successfully done");
				System.out.println();
				break;
					
			case 2:
				System.out.println("Here is the list of all journal items: ");
				Journal.displayAllJournals();
				System.out.println();
				
				System.out.println("Please enter the ID of the journal item you want to change");
				String index2 = in.next();
				System.out.println();
				
				System.out.println("What attribute would you like to change? ");
				System.out.println("1. Name of the journal");
				System.out.println("2. Author of the journal");
				System.out.println("3. Year of Publication of the journal");
				System.out.println("4. Number of Volume of the journal");
				System.out.println("Enter the corresponding number: ");
				int attribute2 = in.nextInt();
				
				switch(attribute2) {
				
				case 1:
					
					System.out.println("What is the new name of the journal? ");
					in.nextLine();
					String newName2 = in.nextLine();
					
					for (int i = 0; i < Journal.getArrayJournal().length; i++ ) {
						
						if (Journal.getArrayJournal()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Journal.getArrayJournal()[i].getItemId().equalsIgnoreCase(index2)) {
							Journal.getArrayJournal()[i].setName(newName2);
						}
					}
						
					
					break;
				case 2:
					
					System.out.println("What is the name of the new auhtor of the journal? ");
					in.nextLine();
					String newAuthor2 = in.nextLine();
					
					for (int i = 0; i < Journal.getArrayJournal().length; i++ ) {
						
						if (Journal.getArrayJournal()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Journal.getArrayJournal()[i].getItemId().equalsIgnoreCase(index2)) {
							Journal.getArrayJournal()[i].setAuthor(newAuthor2);
						}
					}
						
					
					break;
				case 3:
					System.out.println("What is the new year of publication of the journal? ");
					int newYearOfPublication2 = in.nextInt();
					
					for (int i = 0; i < Journal.getArrayJournal().length; i++ ) {
						
						if (Journal.getArrayJournal()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Journal.getArrayJournal()[i].getItemId().equalsIgnoreCase(index2)) {
							Journal.getArrayJournal()[i].setYearOfPublication(newYearOfPublication2);
						}
					}
					break;
				case 4:
					System.out.println("What is the new number of the volume of the journal? ");
					int newVolumeNum = in.nextInt();
					
					for (int i = 0; i < Journal.getArrayJournal().length; i++ ) {
						
						if (Journal.getArrayJournal()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Journal.getArrayJournal()[i].getItemId().equalsIgnoreCase(index2)) {
							Journal.getArrayJournal()[i].setNumOfVolume(newVolumeNum);
						}
					}
					break;
					
				default:
						System.out.println("Wrong input.");
						System.out.println();
						break;
					
				}
				System.out.println("Operation successfully done");
				System.out.println();
				break;
				
			case 3:
				
				System.out.println("Here is the list of all media items: ");
				Media.displayAllMedia();
				System.out.println();
				
				System.out.println("Please enter the ID of the media item you want to change");
				String index3 = in.next();
				System.out.println();
				
				System.out.println("What attribute would you like to change? ");
				System.out.println("1. Name of the media");
				System.out.println("2. Author of the media");
				System.out.println("3. Year of Publication of the media");
				System.out.println("4. Type of the media");
				System.out.println("Enter the corresponding number: ");
				int attribute3 = in.nextInt();
				
				switch(attribute3) {
				
				case 1:
					
					System.out.println("What is the new name of the media? ");
					in.nextLine();
					String newName3 = in.nextLine();
					
					for (int i = 0; i < Media.getArrayMedia().length; i++ ) {
						
						if (Media.getArrayMedia()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Media.getArrayMedia()[i].getItemId().equalsIgnoreCase(index3)) {
							Media.getArrayMedia()[i].setName(newName3);
						}
					}
						
					
					break;
				case 2:
					
					System.out.println("What is the name of the new auhtor of the media? ");
					in.nextLine();
					String newAuthor3 = in.nextLine();
					
					for (int i = 0; i < Media.getArrayMedia().length; i++ ) {
						
						if (Media.getArrayMedia()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Media.getArrayMedia()[i].getItemId().equalsIgnoreCase(index3)) {
							Media.getArrayMedia()[i].setAuthor(newAuthor3);
						}
					}
						
					
					break;
				case 3:
					System.out.println("What is the new year of publication of the media? ");
					int newYearOfPublication3 = in.nextInt();
					
					for (int i = 0; i < Media.getArrayMedia().length; i++ ) {
						
						if (Media.getArrayMedia()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Media.getArrayMedia()[i].getItemId().equalsIgnoreCase(index3)) {
							Media.getArrayMedia()[i].setYearOfPublication(newYearOfPublication3);
						}
					}
					
					break;
					
				case 4:
					System.out.println("What is the new type of the media? ");
					String newType = in.next();
					
					for (int i = 0; i < Media.getArrayMedia().length; i++ ) {
						
						if (Media.getArrayMedia()[i] == null) {
							// In case a deleted item was between two non-null indexes, i can not break the loop
						} else if (Media.getArrayMedia()[i].getItemId().equalsIgnoreCase(index3)) {
							Media.getArrayMedia()[i].setType(newType);
						}
					}
					
				default:
					System.out.println("Wrong input.");
						System.out.println();
					break;
				}
				
				System.out.println("Operation successfully done");
				System.out.println();
				break;
				
				
			default:
				System.out.println("Wrong input.");
				System.out.println();
				break;
			}
			
	}
	
	
	
	// Method that adds a client
	public static void addClient() {
		
		
		System.out.println("What is the name of the new client?");
		String newName = in.nextLine();
		
		
		System.out.println("What is the phone number of the new client?");
		String newPhoneNumber = in.nextLine();
		
		System.out.println("What is the email address of the new client?");
		String newEmailAddress = in.nextLine();
		
		Client c = new Client (newName, newPhoneNumber, newEmailAddress);
		
		System.out.println("Operation successfully done!");
		System.out.println();
		
		}
	
	// Method that deletes a client
	public static void deleteClient() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Here is the list of all clients: ");
		Client.displayAllClients();
		System.out.println("Please input the ID of the client you want to delete: ");
		int idOfClientToDelete = in.nextInt();
		Client.deleteClient(idOfClientToDelete);
		
		System.out.println("Operation successfully done!");
		System.out.println();
		
	}
	
	
	// Method that leases an item to a client
	public static void leaseAnItem() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Here are all available items: ");
		Item.displayAllItems();
		System.out.println("Input the ID of the item you want to lease: ");
		String idItem = in.nextLine();
		
		System.out.println();
		System.out.println("Here are all registered clients:");
		Client.displayAllClients();
		System.out.println("Input the ID of the client who leases the item: ");
		int idClient = in.nextInt();
		
		
		for (int i = 0; i < Item.getItemArray().length; i++ ) {
			
			if (Item.getItemArray()[i] == null) {
				// In case a deleted item was between two non-null indexes, i can not break the loop
			} else if (Item.getItemArray()[i].getItemId().equalsIgnoreCase(idItem)) {
				Item.getItemArray()[i].setClient(Client.getClientArray()[(idClient-1)]); // here it is minus 1 because we need to get the index of the client in the array, and the index is the id-1
			}
		}
		
		System.out.println("Operation successfully done!");
		System.out.println();
		
		
		}
		
	
	
	
	// Method that returns an item that was previously leased simply by putting the client object within the item class equal to null
		public static void returnAnItem() {
			Scanner in = new Scanner(System.in);
			
			
			System.out.println("Here are all leased items: ");                  
			Item.getAllLeasedItems();
			System.out.println("Input the ID of the item you want to return: ");
			String idItem = in.nextLine();
			
			
			
			for (int i = 0; i < Item.getItemArray().length; i++ ) {
				
				if (Item.getItemArray()[i] == null) {
					// In case a deleted item was between two non-null indexes, i can not break the loop but at least no operations can be done and it goes to the next index
				} else if (Item.getItemArray()[i].getItemId().equalsIgnoreCase(idItem)) {
					Item.getItemArray()[i].setNoClient();
				}
			}
			
			System.out.println("Operation successful!");
			System.out.println();
			
		}
	
		// Method that displays all leased items by the same client
		public static void displayAllLeasedItemsBySameClient() {
			// need scanner because static
			Scanner in = new Scanner(System.in);
			
			System.out.println("Here all the clients registered to the library: ");
			Client.displayAllClients();
			System.out.println("Please enter the ID of the client you want to access: ");
			int idOfClient = in.nextInt();
			
			System.out.println("Items leased by this client: ");
			Item.getItemsLeasedByAClient(idOfClient);
			System.out.println();
			
			
		}
		
		
		
	public static void getBiggestBook(Book[] books) {
		
			int max = books[0].getNumOfPages();
			Book maxBook = books[0];
			for(int i = 0; i < books.length; i++) {
				if (books[i] != null && books[i].getNumOfPages() > max) {
					max = books[i].getNumOfPages();
					maxBook = books[i];
				}
			}
			System.out.println(maxBook.toString());
		}
		
		
	
	
	public static void copyBooks(Book[] books) {
		Book[] booksCopy = new Book[books.length];
		for (int i = 0; i < books.length; i++) {
		booksCopy[i] = new Book(books[i].getName(), books[i].getAuthor(), books[i].getYearOfPublication(), books[i].getNumOfPages());
			
		}
	}
}
