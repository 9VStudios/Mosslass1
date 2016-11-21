
class XMLSceneLoader {
    private static XMLSceneLoader ourInstance = new XMLSceneLoader();
    private static final String SCENE_FORMAT = "scenes/%d.xml";

    public static XMLSceneLoader getInstance() {
        return ourInstance;
    }

    public <T> T get(Class<T> rootClass, int sceneId) {
        String path = String.format(SCENE_FORMAT, sceneId);
        return SimpleFacade.read(rootClass, path);
    }
}
