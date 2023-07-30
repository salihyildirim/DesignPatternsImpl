package BehavioralPatterns.ObserverDesignPattern.ConcreteObserver;

import BehavioralPatterns.ObserverDesignPattern.Subject;

public abstract class Observer {
    //Alt sınıflar, gözlemledikleri konuyu takip etmek için subject alanını kullanır.
    protected Subject subject; //gözlenecek olan.
    public abstract void update(); // gözlenecek olanın durumunda değişim olunca çalışması gereken.
    // alt sınıflar bu methodu ihtiyaclarına göre implement eder.

}
