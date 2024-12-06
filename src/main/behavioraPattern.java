/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

// Subject Interface
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject
class FlightPriceTracker implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String priceUpdate;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(priceUpdate);
        }
    }

    public void setPriceUpdate(String priceUpdate) {
        this.priceUpdate = priceUpdate;
        notifyObservers();
    }
}

// Observer Interface
interface Observer {
    void update(String priceUpdate);
}

// Concrete Observer A
class MobileAppUser implements Observer {
    private String userName;

    public MobileAppUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String priceUpdate) {
        System.out.println("Notification for " + userName + ": " + priceUpdate);
    }
}

// Concrete Observer B
class EmailSubscriber implements Observer {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String priceUpdate) {
        System.out.println("Email to " + email + ": " + priceUpdate);
    }
}






