package se.oscar.dependency;

public class EmailMessenger implements Messenger {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending message to " + recipient + ": " + message);
    }
}
