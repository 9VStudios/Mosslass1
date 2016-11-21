import java.util.Dictionary;
import java.util.HashMap;

interface Event {

    boolean checkConditions(HashMap<String, Object> globalState, HashMap<String, Object> sceneState);

    void doEvent(Scene scene);
}
