package Observer;

import java.util.*;

class NotificationSystem {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer) { observers.add(observer); }
    public void notifyObservers() { for (Observer o : observers) o.update(); }
}