package com.example.observer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private AttentionsImpl mAttentions;
    private ObserverImpl mPerson_one;
    private ObserverImpl mPerson_two;
    private ObserverImpl mPerson_three;
    private ObserverImpl mPerson_four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAttentions = new AttentionsImpl();
        mPerson_one = new ObserverImpl("person one");
        mPerson_two = new ObserverImpl("person two");
        mPerson_three = new ObserverImpl("person three");
        mPerson_four = new ObserverImpl("person four");
        mAttentions.addObserver(mPerson_one);
        mAttentions.addObserver(mPerson_two);
        mAttentions.addObserver(mPerson_three);
        mAttentions.addObserver(mPerson_four);

    }

    public void notify(View view) {
        mAttentions.notifyObservers();
    }


    public void removeObserver(View view) {
        mAttentions.decObserver(mPerson_one);
    }
}
