package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Attentions {
    //观察者列表
    protected List<Observer> mObsevers = new ArrayList<>();

    //增加观察者
    public void addObserver(Observer observer){
        mObsevers.add(observer);
    }

    //减少观察者
    public void decObserver(Observer observer){
        mObsevers.remove(observer);
    }

    //通知观察者
    public abstract void notifyObservers();
}
