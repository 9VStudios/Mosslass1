abstract class NPCSettings {	

	private boolean talkedWith = false;

	private int conversationNumber = 1;
	/* This will be incremented after an event to 
	 make the npc say something else */

	

	public abstract void talk(); //Switch statement

	public abstract boolean haveSpokenTo(); //Checks boolena variable

	public abstract void incrementConversationNumber();

	public abstract void setConversationNumber(int conversationSetter);


}
/*

master is latest version
- Add local movie time
- add preference to do something etc...

This'll be related to 

*/