package com.example.myapplication.flow.onSubscribe;

import com.example.myapplication.flow.Observable;
import com.example.myapplication.flow.Observer;

public class OpenHdOnSubscribe implements Observable.OnSubscribe {
//    @Override
//    public void call(Subscriber subscriber) {
//        subscriber.onNext();
//        subscriber.onCompleted();
//        subscriber.onError(null);
//    }

    @Override
    public int call(Observer subscriber, int i) {
        subscriber.onCompleted();
        subscriber.onError(null);
        return subscriber.onNext(i);
    }
}
