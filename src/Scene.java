import java.util.List;

class Scene {
    private int id;
    private String description;
    private List<Event> events;
    private List<Item> items;
    private List<Npc> npcs;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<Event> getEvents() {
        return events;
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Npc> getNpcs() {
        return npcs;
    }
}
