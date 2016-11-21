import java.util.List;

public abstract class Npc {

	private boolean talkedWith = false;

	private int conversationNumber = 1;
	/* This will be incremented after an event to 
	 make the npc say something else */

	private List<Event> events;

	public abstract void presentItem(Item givenItem); //Case statement for given item

	public abstract void talk(); //If statement

	public abstract boolean haveSpokenTo(); //Checks boolena variable

	public abstract void incrementConversationNumber();

	public abstract void setConversationNumber(int conversationSetter);

	public abstract void setSpokenToFalse();

	public abstract void setSpokenToTrue();

	public abstract void setDescription(String str);

	public abstract String getDescription();

	public abstract String getName();

	public abstract void setName(String str);

	public List<Event> getEvents() {
		return events;
	}
}
/*

master is latest version
- Add local movie time
- add preference to do something etc...

This'll be related to 

*/