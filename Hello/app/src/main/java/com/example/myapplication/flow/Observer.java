package com.example.myapplication.flow;

public interface Observer {
    void onCompleted();
    void onError(Throwable t);
    int onNext(int i);
}
