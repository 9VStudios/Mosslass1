import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.*;


class SimpleFacade {
    private static Serializer serializer = new Persister();

    public static <T> T read(Class<T> rootClass, String filename) {
        T root = null;

        try (Reader reader = new BufferedReader(new FileReader(filename))) {
            root = serializer.read(rootClass, reader);
        } catch (Exception e) {
            // Empty catch statement
        }

        return root;
    }

    public static boolean write(Progress root, String filename) {
        boolean isWritten = false;

        try (Writer writer = new BufferedWriter(new FileWriter(filename))) {
            serializer.write(root, writer);
            isWritten = true;
        } catch (Exception e) {
            // Empty catch statement
        }

        return isWritten;
    }
}
