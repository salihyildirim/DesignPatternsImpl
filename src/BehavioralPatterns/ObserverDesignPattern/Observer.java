package BehavioralPatterns.ObserverDesignPattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
