import java.util.HashMap;
import java.util.List;

/**
 * Created by arran on 21/11/2016.
 */
public class SceneController {
    private static SceneController ourInstance = new SceneController();
    HashMap<String, Object> sceneState = new HashMap<>();
    private Scene scene;
    private Player player;

    public static SceneController getInstance() {
        return ourInstance;
    }

    private SceneController() {
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void onCommand(){
        //Do scene events first
        List<Event> sceneEvents = scene.getEvents();
        for (Event event: sceneEvents) {
            if (event.checkConditions(GameController.getInstance().globalState, sceneState)){
                event.doEvent(scene);
            }
        }

        //Do npc events
        for (Npc npc: scene.getNpcs()){
            for (Event event: npc.getEvents()){
                if (event.checkConditions(GameController.getInstance().globalState, sceneState)){
                    event.doEvent(scene);
                }
            }
        }
    }
}
