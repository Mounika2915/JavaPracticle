package org.sample;

public class Singletone {
    private static volatile Singletone instance ; //PRIVATE CONSTRUCTOR and private static instance
    private final String userName ;
    private final String password ;

    private  Singletone(String userName, String password) {
        this.userName = userName;
        this.password = password;
        System.out.println("Constructor call only ones" + userName + " " + password);
    }//To access Private constructor we provide public static getInstance method.

//    public static Singletone getInstance(String userName , String password){
//        instance = new Singletone(userName, password);
//        return instance ;
//    }
    //for this how it will know it returns same instance
    //ie whenever us call getInstance() with params it comes to this method and
    //how will you guarantee weather it will return same instance .

//    public static Singletone getInstance(String userName , String password){
//        if(instance == null ){
//            instance = new Singletone(userName, password);
//        }
//        return instance ;
//    }

    //if wew were dealing with multiThreaded environment nothing in this code prevents
    //two threads accessing this piece of code at the same time .and return two different instances
    //of this same class .
    //To prevent that all we have to do is wrap the if statement with synchronized

//    public static Singletone getInstance(String userName , String password){
//        synchronized (Singletone.class){
//            if(instance == null ){
//                instance = new Singletone(userName, password);
//            }
//        }
//
//        return instance ;
//    }

    //Synchronized provide lock to each thread but here problem is, although we have created
    //instance once , multiple threads are at waiting queue. to prevent that we wrap with another
    //if block.

    public static Singletone getInstance(String userName , String password){
        if(instance == null ){
            synchronized (Singletone.class){
                if(instance == null ){
                    instance = new Singletone(userName, password);
                }
            }
        }
        return instance ;

        //consider two threads A nd B A is gone at  48 line both B also went
        //B cannot wait until A completes
        //instance is not null thorough the initialization is done.
        // a shared variable stored in memory can reference a partially constructed object.
        //To prevent that we have to put volatile in instance variable

    }
}
