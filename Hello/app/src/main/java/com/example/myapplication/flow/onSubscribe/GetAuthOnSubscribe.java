package com.example.myapplication.flow.onSubscribe;

import com.example.myapplication.flow.Observable;
import com.example.myapplication.flow.Observer;

public class GetAuthOnSubscribe implements Observable.OnSubscribe {
//    @Override
//    public int call(Observer subscriber) {
//        subscriber.onCompleted();
//        subscriber.onError(null);
//        return subscriber.onNext(1);
//    }

    @Override
    public int call(Observer subscriber, int i) {
        subscriber.onCompleted();
        subscriber.onError(null);
        return subscriber.onNext(i);
    }
}
