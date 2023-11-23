package comJava;
import java.util.Scanner;

public class Pet {
	private Scanner scnr = new Scanner(System.in);
	public static void main(String[] args) {
	}
	
	//variables
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces = 30;
	private int catSpaces = 12;
	private int daysStay;
	private double amountDue;
	private boolean returningPet;  
	
	
  	//Constructor
	public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue, boolean returningPet) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.setDogSpaces(dogSpaces);
        this.setCatSpaces(catSpaces);
        this.daysStay = daysStay;
        this.amountDue = amountDue;
        this.returningPet = returningPet;
       
    }
	
	
	//variable for incremental space number
	private int dogSpaceNumber = 100; 
	private int catSpaceNumber = 200;
	
	//Method for the pet check in process
	public void petCheckIn(){
		System.out.println("Enter the pet type: dog or cat.");
		setPetType(scnr.next());
				
		// Check pet type with conditional "if" statement - move up under enter pet type? 
		if (petType.equalsIgnoreCase("dog")) {
			checkInDog();
														
		} else if(petType.equalsIgnoreCase("cat")) {
			checkInCat();
								
			} else {
			System.out.println("Invalid entry.Enter valid pet type.");
		}
		System.out.println("You entered " + petType);
	 		
		//Get & set pet name
		System.out.println("Enter your pet's name.");
		setPetName(scnr.next());
		System.out.println("Your pet's name is " + petName);
		
		//Get & set pet age
		System.out.println("Enter your pet's age.");
		setPetAge(scnr.nextInt());
		System.out.println("Your pet's age is " + petAge);
	}	    
	
	//Method for Dog check in
	private void checkInDog() {
		System.out.println("Pet type: dog");		
		int availableDogSpaces = getDogSpaces();
		System.out.println("There are" + dogSpaces + " dog spaces.");
	
		//Conditional statement to check available dogs spaces and subtract one
		if(availableDogSpaces > 0) {
			setDogSpaces(availableDogSpaces -1);
			System.out.println("A space is reserved for " + getPetName() + ". There are " + getDogSpaces() + " left.");
			
			//Assign dog to space
			String assignedSpace = "Dog Space" + dogSpaceNumber++;
			System.out.println("Assigned space: " + assignedSpace);
		}else { 
			System.out.println("There are no spaces left.");
			}
		
	Dog myDog = new Dog();
	
	//Check grooming status
	boolean grooming = myDog.isGrooming();
		
	//Output if grooming is yes
	if (grooming){
		System.out.println("Grooming has been selected.");
		System.out.print("Enter length of stay.");
		int daysStay = scnr.nextInt();
		
		//Conditional statement if grooming is yes check days stay
		if (daysStay >= 2) {
			System.out.println("Length of stay is " + daysStay);
		} else {
			System.out.print("Length of Stay must be at least two days.");
		}
		
    //Output if grooming is no
	} else {
		System.out.println("Grooming has not been selected.");
		System.out.println("Enter length of stay.");
		int daysStay = scnr.nextInt();
		System.out.print("Length of stay is " + daysStay);
   	 }
   }
      
    Cat myCat = new Cat();
    
	//Method for Cat check in 
	private void checkInCat() {
		System.out.println("Pet type: cat");
		int availableCatSpaces = getCatSpaces();
		System.out.println("There are" + catSpaces + " cat spaces.");
            
		//Conditional statement to check available cat spaces and subtract one
		if(availableCatSpaces > 0) {
			setDogSpaces(availableCatSpaces -1);
			System.out.println("A space is reserved for " + getPetName() + ". There are " + getCatSpaces() + " left.");

			//Assign cat to space
			String assignedSpace = "Cat Space" + catSpaceNumber++;
			System.out.println("Assigned space: " + assignedSpace);
		}else { 
			System.out.println("There are no spaces left.");
			}
		
	//Check if pet is a returning pet	
			System.out.println("Has your pet been here before? (yes/no)");
			
			if (returningPet == true) {
				
				//Get & set pet age
				System.out.println("Enter your pet's age.");
				setPetAge(scnr.nextInt());
				System.out.println("Your pet's age is " + petAge);
			} else	
				System.out.println("Pet Type: " + petType);
				System.out.println("Pet Name: " + petName);
				System.out.println("Pet Age: " + petAge);
				System.out.print("Length of Stay: " + daysStay);
			} 
		
	//Accessor (getter) method for petType
	public String getPetType() {
		return petType;
	}
		

	//Mutator (setter) method for petType
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
		
	//Accessor (getter) method for petName
		public String getPetName() {
			return petName;
		}

		//Mutator (setter) method for petName
		public void setPetName(String petName) {
			this.petName = petName;
		}
		
				
		//Accessor (getter) method for petAge
		public int getPetAge() {
			return petAge;
		}

		//Mutator (setter) method for petAge
		public void setPetAge(int petAge) {
			this.petAge = petAge;
		}
		
				
		//Accessor (getter) method for dogSpaces
		public int getDogSpaces() {
			return dogSpaces;
		}

		//Mutator (setter) method for dogSpaces
		public void setDogSpaces(int dogSpaces) {
			this.dogSpaces = dogSpaces;
		}
			
				
		//Access (getter) method for catSpaces
		public int getCatSpaces() {
			return catSpaces;
		}

		//Mutator (setter) method for catSpaces
		public void setCatSpaces(int catSpaces) {
			this.catSpaces = catSpaces;
		}
			
		
		//Accessor (getter) method for daysStay
		public int getDaysStay() {
			return daysStay;
		}

		//Mutator (setter) method for daysStay
		public void setDaysStay(int daysStay) {
			this.daysStay = daysStay;
		}

			
		//Accessor (getter) method for amountDue
		public double getAmountDue() {
			return amountDue;
		}
		

		//Mutator (setter) method for amountDue
		public void setAmountDue(double amountDue){ 
			this.amountDue = amountDue;
		}

		
		//Accessor (getter) method for dogSpaceNumber
		public int getdogSpaceNumber() {
			return dogSpaceNumber;
		}
		
		//Mutator (setter) method for dogSpaceNumber
		public void setdogSpaceNumber(int dogSpaceNumber) {
			this.dogSpaceNumber = dogSpaceNumber;
		}

		//Accessor (getter) method for catSpaceNumber
		public int getcatSpaceNumber() {
			return catSpaceNumber;
		}

		//Mutator (setter) method for catSpaceNumber
		public void setcatSpaceNumber(int catSpaceNumber) {
			this.catSpaceNumber = catSpaceNumber;
		}
		
		//Accessor (getter) method for returningPet
				public int returningPet() {
					return returningPet();
		}

		//Mutator (setter) method for returningPet
		public void setreturningPet(boolean returningPet) {
			this.returningPet = returningPet;
		}
}
	
		
		
		
		
