package com.example.myapplication.flow;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.myapplication.flow.onSubscribe.GetAuthOnSubscribe;

public class Test {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        Observable
                .create(new GetAuthOnSubscribe())
                .getAuth(new FirstTask())
                .openHd(new Observable.Transformer() {
                    @Override
                    public Object call(Object from) {
                        return null;
                    }
                });
//        try {
//            thenApply();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private static void thenApply() throws Exception {
//        CompletableFuture<T> future = CompletableFuture.supplyAsync(new Supplier<T>() {
//            @Override
//            public T get() {
//                long result = new Random().nextInt(100);
//                System.out.println("result1="+result);
//                return "aaaaaaaaaaaaaa";
//            }
//        }).thenApply(new Function<String, Long>() {
//            @Override
//            public Long apply(String t) {
//                System.out.println("result2="+t);
//                return 1L;
//            }
//        });
//
//        System.out.println(result);
    }
}
