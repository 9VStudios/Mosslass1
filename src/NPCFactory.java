/**
 * Created by arran on 21/11/2016.
 */
public class NpcFactory {
    private static NpcFactory ourInstance = new NpcFactory();

    public static NpcFactory getInstance() {
        return ourInstance;
    }

    private NpcFactory() {
    }

    public Npc getNpc(String npcName){
        switch(npcName){

            case "Mercury":
                return new ExampleNPC("Mercury");

            case "Freddie":
                return new ExampleNPC("Freddie");
            default:
                throw new NotRealNPCException("Well...");
        }
    }
}
