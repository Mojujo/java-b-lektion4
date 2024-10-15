import se.oscar.dependency.Messenger;

public class TestMessenger implements Messenger {
    private String lastMessage;
    private String lastRecipient;

    @Override
    public void sendMessage(String recipient, String message) {
        this.lastRecipient = recipient;
        this.lastMessage = message;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getLastRecipient() {
        return lastRecipient;
    }
}
