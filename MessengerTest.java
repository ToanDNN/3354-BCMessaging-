import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MessengerTest {

    @Test
    public void testSendEmpty() {
        assertEquals(Messenger.send(""), false);
    }

    @Test
    public void testSendNonEmpty() {
        assertEquals(Messenger.send("Non-empty String"), true);
    }

    @Test
    public void testEditSame() {
        Messenger.messages.clear();
        Messenger.messages.add("Message 1");
        Messenger.messages.add("Message 2");
        Messenger.messages.add("Message 3");
        Messenger.edit("Message 2", 1);
        assertEquals(Messenger.messages.get(1), "Message 2");
    }

    @Test
    public void testEditDifferent() {
        Messenger.messages.clear();
        Messenger.messages.add("Message 1");
        Messenger.messages.add("Message 2");
        Messenger.messages.add("Message 3");
        Messenger.edit("Message 2 edited", 1);
        assertEquals(Messenger.messages.get(1), "Message 2 edited");
    }

    @Test
    public void testDelete() {
        Messenger.messages.clear();
        Messenger.messages.add("Message 1");
        Messenger.messages.add("Message 2");
        Messenger.messages.add("Message 3");
        Messenger.delete(1);
        assertEquals(Messenger.messages.get(0), "Message 1");
        assertEquals(Messenger.messages.get(1), "Message 3");
        assertEquals(Messenger.messages.size(), 2);

    }

}
