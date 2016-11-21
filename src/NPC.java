//Put in feature branch "Feature npc - Nobody using"

public class NPC extends NPCSettings {
	
	private boolean talkedWith = false;

	private int conversationNumber = 1;

	private String name;
	private String description;

	private String[] conversation; 

	/*Will be given a determined size per NPCafter we know
	  how many lines each NPC will say.

	  Note: conversation[0] is a special variable when 
	  the NPC has nothing important to say. */


	public NPC(String name) {
		setName(name);
		NPCSetUp();
	}

	public void NPCSetUp() {
		//TO-DO Set variables accordingly (via xml?)
	}


	public void talk() {
		System.out.println(conversation[conversationNumber]);
	}

	public void setSpokenToFalse() {
		talkedWith = false;
	}

	public void setSpokenToTrue() {
		talkedWith = true;
	}

	public boolean haveSpokenTo() {
		return talkedWith;
	}

	public void setDescription(String str) {
		description = str;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public void setName(String str) {
		name = str;
	}

	public void incrementConversationNumber() {
		conversationNumber++;
	}

	public void setConversationNumber(int conversationSetter) {
		conversationNumber = conversationSetter;
	}

	@Override
	public void presentItem(Item givenItem) {
		// TODO Auto-generated method stub
	}

	

}
