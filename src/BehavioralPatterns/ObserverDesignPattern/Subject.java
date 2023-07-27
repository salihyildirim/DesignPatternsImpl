package BehavioralPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject { //gözlenen. örneğin bir.youtube kanalı (bildirimleri aç)
    private List<Observer> observers = new ArrayList<Observer>(); //gözlemciler
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) { //state değiştiğinde tüm observerlara haber ver.
        //state değiştiğinde tüm observerlar'ın update methodunu çalıştır.
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
