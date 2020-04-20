import java.util.*;

public class Messenger {

    public static List<String> messages = new ArrayList<>();

    public static boolean send(String message) {
        if (message.length() == 0) return false;
        sendToServer(message);
        return true;
    }

    public static void edit(String editedMessage, int index) {
        messages.set(index, editedMessage);
    }

    public static void delete(int index) {
        messages.remove(index);
    }

    public static int sendToServer(String message) {
        return 0;
    }
}
