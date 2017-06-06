package com.company;

/**
 * Created by JeniaTr-SL on 06.06.2017.
 */
public class R implements Runnable {

    @Override
    public void run() {
        Singleton.getInstance();
    }
}
