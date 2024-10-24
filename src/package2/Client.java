package package2;

import package3.Book;

//------------------------------------------------------------------
//Assignment 1
//Question: Client Class
//------------------------------------------------------------------


public class Client {

	// Attributes
	private static int clientTracker = 0;
	private int client_id;
	private String name;
	private String phoneNumber;
	private String emailAddress;
	private static Client[] clientArray = new Client[100];
	
	
	// Default Constructor
	public Client() {
		this.client_id = (clientTracker+1);
		this.name = "";
		this.phoneNumber = "";
		this.emailAddress = "";
		clientArray[clientTracker] = this;
		clientTracker++;
	}
	
	// Parameterized Constructor
	public Client(String name, String phoneNumber, String emailAddress) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.client_id = (clientTracker+1);
		clientArray[clientTracker] = this;
		clientTracker++;
	}
	
	// Copy Constructor
	public Client (Client other) {
		this.name = other.getName();
		this.phoneNumber = other.getPhoneNumber();
		this.emailAddress = other.getEmailAddress();
		this.client_id = (clientTracker+1);
		clientArray[clientTracker] = this;
		clientTracker++;
	}
	
	
	// Getters & Setters
	public int getClientId() {
		return this.client_id;
	}
	public void setClientId(int id) {
		this.client_id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAdress) {
		this.emailAddress = emailAdress;
	}
	
	public static Client[] getClientArray() {
		return clientArray;
	}

	public static void setClientArray(Client[] clientArray) {
		Client.clientArray = clientArray;
	}

	// Method to display all client objects in the array
		public static void displayAllClients() {
			
			for (int i = 0; i < clientArray.length ; i++ )
				if (clientArray[i] == null) {
					
				} else {
					System.out.println(clientArray[i]);
				}
					
		}
	
	// Method to delete a Client object
	public static void deleteClient(int idOfClientToDelete) {
			
			
			for (int i = 0; i < clientArray.length ; i++ )

				if(clientArray[i].getClientId() == idOfClientToDelete)  {
					clientArray[i] = null;
				}
			
		}
	
	
	// toString Method
	@Override
	public String toString() {
		return "The name of the client is " + this.name + 
				", their phone number is " + this.phoneNumber + ", their email adress is "
				+ this.emailAddress + ", and their ID is " + this.client_id;
	}
	
	
	// equals Method
	@Override
	public boolean equals(Object other) {
		
		// 1. Check if parameter is null (return false if null)
		if(other == null) {
			return false;
		}
		
		// 2. Check if other is of the type of this class (return false if not), cannot use instanceOf (), must use getClass()
		if (this.getClass() != other.getClass()) {
			return false;
		}
		
		// 3. Implement
		Client otherClient = (Client) other;
		if ( this.name.equalsIgnoreCase(otherClient.name) && this.phoneNumber.equalsIgnoreCase(otherClient.phoneNumber) 
				&& this.emailAddress.equals(other) ) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
}
