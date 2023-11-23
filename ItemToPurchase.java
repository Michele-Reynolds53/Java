public class ItemToPurchase {
  //Private fields - itemName, itemPrice, and itemQuantity
	private String itemName;
	private int itemPrice;
	private int itemQuantity;

  
    //public member methods (mutators & accessors)

	public ItemToPurchase() {
		itemName = "";
		itemPrice = 0;
		itemQuantity = 0;
	}
	
   //setName() & getName() 
	public String getName() {
		return itemName;
	}
	
  public void setName(String name) {
    itemName = name;
	}

   //setPrice() & getPrice() 
  public int getPrice() {
		return itemPrice;
	}
   
  public void setPrice(int price) {
    itemPrice = price;
  }

   //setQuantity() & getQuantity() 
  public int getQuantity() {
    return itemQuantity;
  }
   
  public void setQuantity(int quantity) {
    itemQuantity = quantity;
  }

	
   //print item to purchase
   
   public void printItemPurchase() {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}
