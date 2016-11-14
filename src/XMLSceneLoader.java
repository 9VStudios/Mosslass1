/**
 * Created by Joel on 12/11/2016.
 */
class XMLSceneLoader {
    private static XMLSceneLoader ourInstance = new XMLSceneLoader();

    public static XMLSceneLoader getInstance() {
        return ourInstance;
    }

    private XMLSceneLoader() {
    }

    public Scene get(int sceneId) {
        return new Scene();
    }
}
