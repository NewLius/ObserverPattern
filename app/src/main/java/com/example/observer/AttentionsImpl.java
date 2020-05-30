package com.example.observer;

public class AttentionsImpl extends Attentions{
    @Override
    public void notifyObservers() {
        //遍历观察者集合
        for(Observer observer: mObsevers){
            observer.update();
        }
    }
}
