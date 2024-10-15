import org.junit.Test;
import se.oscar.dependency.MessageService;
import static org.junit.Assert.assertEquals;

public class MessageServiceTest {

    @Test
    public void testSend() {
        TestMessenger testMessenger = new TestMessenger();
        MessageService service = new MessageService(testMessenger);

        service.send("oscar.tornqvist01@gmail.com", "This is a test");

        assertEquals("oscar.tornqvist01@gmail.com", testMessenger.getLastRecipient());
        assertEquals("This is a test", testMessenger.getLastMessage());
    }
}
