package package3;

import package2.Client;

//------------------------------------------------------------------
//Assignment 1
//Question: Item Class
//------------------------------------------------------------------

public class Item {

	// Attributes
	private static int itemTracker = 0;
	private String item_id;
	private String name;
	private String author;
	private int yearOfPublication;
	private static Item [] itemArray = new Item[300];
	private Client client;
	
	// Default Constructor
	public Item() {
		this.item_id = Integer.toString((itemTracker+1));
		this.name = "";
		this.author = "";
		this.yearOfPublication = 0;
		this.client = null;
		itemArray[itemTracker] = this;
		itemTracker++;
	}
	
	// Parameterized Constructor
	public Item(String name, String author, int yearOfPublication, Client client) {
		this.name = name;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
		this.item_id = Integer.toString((itemTracker+1));
		this.client = client;
		itemArray[itemTracker] = this;
		itemTracker++;
	}
	
	// Copy Constructor
	public Item (Item other)
	{
		this.name = other.getName();
		this.author = other.getAuthor();
		this.yearOfPublication = other.getYearOfPublication();
		this.item_id = Integer.toString((itemTracker+1));
		itemArray[itemTracker] = this;
		itemTracker++;
	}
	// Getters & Setters
	public String getItemId() {
		return item_id;
	}
	public void setItemId(String id) {
		this.item_id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public static Item[] getItemArray() {
		return itemArray;
	}

	public static void setItemArray(Item[] itemArray) {
		Item.itemArray = itemArray;
	}

	// Method to delete a book object
		public static void deleteItem(String idOfItem) {
			
			
			for (int i = 0; i < itemArray.length ; i++ )

				if(itemArray[i] == null) {
					// needed because the array is way bigger 
				} else if(itemArray[i].getItemId().equalsIgnoreCase(idOfItem))  {
					itemArray[i] = null;
				}
			
		}
	
	//Method to return the item by setting the client object to be null
		public void setNoClient() {
			this.client = null;
		}
	
	// Method to display all item objects in the array
	public static void displayAllItems() {
				
		for (int i = 0; i < itemArray.length ; i++ )
				if (itemArray[i] == null) {
						
				} else {
					System.out.println(itemArray[i]);
				}
						
			}
	
	// Method to find a leased item by a specific client in the array of items
		public static void getItemsLeasedByAClient(int idOfClient) {
			
			for (int i = 0; i < itemArray.length ; i++ )
				
				if (itemArray[i] == null) {
					
				} else if ((itemArray[i].getClient()) == null){
					
				} else if ((itemArray[i].getClient()).getClientId() == idOfClient){
					System.out.println(itemArray[i]);
				}
		}
		
	// Method to display all leased items
		public static void getAllLeasedItems() {
			System.out.println("Here are all leased items!");
			
			for (int i = 0; i < itemArray.length ; i++ )
				
				if (itemArray[i] == null) {
					
				} else if ((itemArray[i].getClient()) == null){
					
				} else if ((itemArray[i].getClient())!= null){
					System.out.println(itemArray[i]);
				}
		}
		
	
	// toString Method
	@Override
	public String toString() {
		
		if(this.client != null) {
			return "This item's name is " + this.name +", its author is " + this.author + ", its year of publication is " +
					this.yearOfPublication + ", its ID is " + this.item_id + ", and the client that leased this item is " + 
					this.getClient();
		} else  {
			
			return "This item's name is " + this.name +", its author is " + this.author + ", its year of publication is " +
					this.yearOfPublication + ", its ID is " + this.item_id + ", and nobody leased this item.";
		}
		
		
		
	}
	
	// equals
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
		Item otherItem = (Item) other;
		if (this.getName().equals(otherItem.getName()) && this.getAuthor().equals(otherItem.getAuthor()) 
			&& this.getYearOfPublication() == otherItem.getYearOfPublication()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
