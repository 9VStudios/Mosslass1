import java.util.Dictionary;
import java.util.HashMap;

/**
 * Created by arran on 21/11/2016.
 */
public class GameController {
    HashMap<String, Object> globalState = new HashMap<>();

    private static GameController ourInstance = new GameController();

    public static GameController getInstance() {
        return ourInstance;
    }

    private GameController() {
    }

    public void onEvent(Command command){
        command.doCommand();
        SceneController.getInstance().onCommand();
    }
}
