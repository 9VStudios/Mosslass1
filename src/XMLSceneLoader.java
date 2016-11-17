
class XMLSceneLoader {
    private static XMLSceneLoader ourInstance = new XMLSceneLoader();
    private static final String SCENE_DIRECTORY = "scenes/";

    public static XMLSceneLoader getInstance() {
        return ourInstance;
    }

    public Scene get(int sceneId) {
        String path = SCENE_DIRECTORY + sceneId;
        return SimpleFacade.read(path);
    }
}
