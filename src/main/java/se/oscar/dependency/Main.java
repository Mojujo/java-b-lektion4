package se.oscar.dependency;

public class Main {
    public static void main(String[] args) {
        Messenger emailMessenger = new EmailMessenger();
        MessageService service = new MessageService(emailMessenger);

        service.send("oscar.tornqvist01@gmail.com", "This is a test");
    }
}
