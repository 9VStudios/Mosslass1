import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Joel on 11/11/2016.
 */
public class XMLSceneLoaderTest {
    private static final int SCENE_ID = 1;
    private XMLSceneLoader sceneLoader;

    @Before
    public void setUp() throws Exception {
        sceneLoader = XMLSceneLoader.getInstance();
    }

    // Test 1
    // Created method get(int).
    // get(int) returns a new Scene object
    // Refactor:
    //
    /**
     * Calls get(int)and checks that a Scene object is returned
     */
    @Test
    public void getScene() {
        Scene scene = sceneLoader.get(SCENE_ID);
        assertTrue(
                "TEST 1: Get Scene object with id, should return a Scene Object",
                scene != null
        );
    }

}