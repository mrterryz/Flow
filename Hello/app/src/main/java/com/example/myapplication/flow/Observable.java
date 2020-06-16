package com.example.myapplication.flow;

public class Observable {
    final OnSubscribe onSubscribe;
    int call1;

    private Observable(OnSubscribe onSubscribe) {
        this.onSubscribe = onSubscribe;
    }

    public static Observable create(OnSubscribe onSubscribe) {
        return new Observable(onSubscribe);
    }

    public Observable getAuth(Observer subscriber) {
        call1 = onSubscribe.call(subscriber,0);
        return this;
    }

//    public void openHd(Observer subscriber) {
//        onSubscribe2.call(subscriber,call1);
//    }

    public interface OnSubscribe {
        int call(Observer subscriber,int i);
    }

    public Observable openHd(final Transformer transformer) {
        return create(new OnSubscribe() {
            @Override
            public int call(final Observer subscriber, int i) {
                Observable.this.onSubscribe(new Observer() { // 订阅上层的Observable

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public int onNext(int i) {
                        return subscriber.onNext(i);
                    }
                });
                return 0;
            } // 生成一个桥接的Observable和 OnSubscribe

        });
    }

    private void onSubscribe(Observer observer) {
    }

    public interface Transformer<T, R> {
        R call(T from);
    }

}
