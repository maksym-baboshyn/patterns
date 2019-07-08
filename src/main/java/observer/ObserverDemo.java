package observer;

import observer.subscriber.John;
import observer.subscriber.July;
import observer.subscriber.Tom;

public class ObserverDemo {
    public static void main(String[] args) {
        final Observer tom = new Tom();
        final Observer july = new July();
        final Observer john = new John();
         
        final MessagePublisher publisher = new MessagePublisher();
         
        publisher.subscribe(tom);
        publisher.subscribe(july);
         
        publisher.notifyUpdate(new Message("First Important Message"));
         
        publisher.unsubscribe(tom);
        System.out.println("Tom was unsubscribed ...");
        publisher.subscribe(john);
         
        publisher.notifyUpdate(new Message("Second Important Message"));
    }
}