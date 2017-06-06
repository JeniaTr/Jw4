package com.company;

public class Singleton {
    public static int counter = 0;
    private static Object sync = new Object();
    //    public static Singleton instance = null;
    public static volatile Singleton instance = null;

    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
//            synchronized (Singleton.class) {
            synchronized (sync) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

//    public static synchronized Singleton getInstance() {
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

}
