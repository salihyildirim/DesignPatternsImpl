package BehavioralPatterns.ObserverDesignPattern.ConcreteObserver;

import BehavioralPatterns.ObserverDesignPattern.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this); // nesne yaratılır yaratılmaz observerable'a ekleniyor.
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
