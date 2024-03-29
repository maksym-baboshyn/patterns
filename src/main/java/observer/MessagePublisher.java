package observer;

import java.util.ArrayList;
import java.util.List;
 
public class MessagePublisher implements Subject {
    private final List<Observer> observers = new ArrayList<>();
 
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }
 
    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
 
    @Override
    public void notifyUpdate(Message message) {
        observers.forEach(o -> o.update(message));
    }
}