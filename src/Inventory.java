import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	List<Item> listOfItems = new ArrayList<>();

	public void showAllItems() {
		for(Item x :listOfItems)
			System.out.println(x.getName());
	}
}