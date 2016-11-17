
class XMLSceneLoader {
    private static XMLSceneLoader ourInstance = new XMLSceneLoader();

    public static XMLSceneLoader getInstance() {
        return ourInstance;
    }

    public Scene get(int sceneId) {
        return new Scene();
    }
}
