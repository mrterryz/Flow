package com.example.myapplication.flow;

public class FirstTask implements Observer {
    @Override
    public int onNext(int i) {
        System.out.println("onNext FirstTask:" + i);
        return 23232343;
    }

    @Override
    public void onCompleted() {
        System.out.println("onCompleted FirstTask");
    }

    @Override
    public void onError(Throwable t) {
        System.out.println("onError FirstTask");
    }
}
