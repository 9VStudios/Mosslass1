import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.*;


class SimpleFacade {
    private static Serializer serializer = new Persister();

    public static Scene read(String filename) {
        Scene root = null;

        try (Reader reader = new BufferedReader(new FileReader(filename))) {
            root = serializer.read(Scene.class, reader);
        } catch (Exception e) {
            // Empty catch statement
        }

        return root;
    }

    public static void write(Scene root, String filename) {
        try (Writer writer = new BufferedWriter(new FileWriter(filename))) {
            serializer.write(root, writer);
        } catch (Exception e) {
            // Enpty catch statement
        }
    }
}
