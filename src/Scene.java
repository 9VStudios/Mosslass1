import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
class Scene {
    @Attribute
    private int id;
    @Element
    private String description;
    @ElementList
    private List<Event> events;
    @ElementList
    private List<Item> items;
    @ElementList
    private List<NPC> npcs;

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

    public List<NPC> getNpcs() {
        return npcs;
    }
}
