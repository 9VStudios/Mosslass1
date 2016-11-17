public class NPCFactory {
	
	public NPCSettings getNPC(String npcName) {
	
	switch(npcName){
		//After change to generic NPC class, switch statement redundent?
		case "Mercy":
			return new NPC(npcName);

		case "Freddie":
			return new NPC(npcName);

		default:
		throw new NotRealNPCException("No record of passed npcName:\n" + npcName);
	}

    }
}