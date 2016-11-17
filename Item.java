import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Item{

	private String itemName;
	private String itemDescription;

	private int itemID;

	/*Will vary on how the matching text will be parsed in 
	          [Alter hash code after decision]*/
	//private Item[] compatibleItems;
	private Map<Item, String> compatibleItems = new HashMap<>();

	
	public void setID(int id) {
		itemID = id;
	}
	
	public int getID() {
		return itemID;
	}
	
	public String getName() {
		return itemName;
	}

	public void setDescription(String str) {
		itemDescription = str;
	} 

	public void inspect() {
		System.out.println(itemDescription);
	}

	/* Uncomment when world is completed
	public void pickUp(Item item, Player player) {
		scene.getItem(item);
		player.addToInventory(item);
	}
	*/

	@Override
	public int hashCode() {
		return Objects.hash(itemDescription,itemName, compatibleItems);
	}
	
	@Override
	public boolean equals(Object otherItem) {
	    if (!(otherItem instanceof Item))  {
	      return false;
	    } 
	    Item temp = (Item) otherItem;
	    return (this.getID() == temp.getID());
	  }
	
}