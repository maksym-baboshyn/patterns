package observer.subscriber;

import static java.lang.String.format;

import observer.Message;
import observer.Observer;

public class John implements Observer {
    @Override
    public void update(Message m) {
        System.out.println(format("John has received message from the Publisher %s", m.getMessageContent()));
    }
}