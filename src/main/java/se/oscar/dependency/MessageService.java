package se.oscar.dependency;

public class MessageService {
    private final Messenger messenger;

    public MessageService(Messenger messenger) {
        this.messenger = messenger;
    }

    public void send(String recipient, String message) {
        messenger.sendMessage(recipient, message);
    }
}
