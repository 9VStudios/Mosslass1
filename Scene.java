import java.util.ArrayList;
import java.util.List;

public class Scene {
	private List<NPC> listOfNPC = new ArrayList<>();
	private List<Item> listOfItems = new ArrayList<>();
	//Events
	private String description;
	private String name;
	
	public void addNPC(NPC npc){
		listOfNPC.add(npc);
	}

	public void removeNPC(NPC npc){
		for(NPC otherNPC: listOfNPC)
			if(npc.getName().equals(otherNPC.getName()))
				listOfNPC.remove(otherNPC);
	}

	public void addItem(Item item){
		listOfItems.add(item);
	}

	public void getItem(Item item){
		for(Item otherItem: listOfItems)
			if(item.getName().equals(otherItem.getName()))
				listOfItems.remove(otherItem);
	}

	public void setDescription(String str){
		description = str;
	}

	public void getDescription() {
		System.out.println(description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}