package com.rukevwe.learn.Singleton;

import java.io.Serializable;

public class CreatingSingletons {

    // Eager Initialization
    // Here instance is created even though client application might not be using it. This can cause memory leak problem.
    private static volatile CreatingSingletons sSoleInstance = new CreatingSingletons();

    //private constructor.
    private CreatingSingletons() {
    }

    public static CreatingSingletons getInstance() {
        return sSoleInstance;
    }
}
class LazyInitializaitonSingleton {
    
    //We all know that in Java if the two objects are same then, their hash key have to be equal
    private static LazyInitializaitonSingleton sSoleInstance;

    private LazyInitializaitonSingleton(){}  //private constructor.

    public static LazyInitializaitonSingleton getInstance(){
        if (sSoleInstance == null){ //if there is no instance available... create new one
            sSoleInstance = new LazyInitializaitonSingleton();
        }

        return sSoleInstance;
    }
}

class ReflectionProofSingleton {
    
//    public class LazyInitializaitonSingletonTester {
//        public static void main(String[] args) {
//            //Create the 1st instance
//            LazyInitializaitonSingleton instance1 = LazyInitializaitonSingleton.getInstance();
//
//            //Create 2nd instance using Java Reflection API.
//            LazyInitializaitonSingleton instance2 = null;
//            try {
//                Class<LazyInitializaitonSingleton> clazz = LazyInitializaitonSingleton.class;
//                Constructor<LazyInitializaitonSingleton> cons = clazz.getDeclaredConstructor();
//                cons.setAccessible(true);
//                instance2 = cons.newInstance();
//            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
//                e.printStackTrace();
//            }
//
//            //now lets check the hash key.
//            System.out.println("Instance 1 hash:" + instance1.hashCode());
//            System.out.println("Instance 2 hash:" + instance2.hashCode());
//        }
//    }


    // Reflection allows you to change the constructor visibility as public in run-time and create new instance using the constructor
    private static ReflectionProofSingleton sSoleInstance;

    //private constructor.
    private ReflectionProofSingleton(){
        //Prevent form the reflection api.
        if (sSoleInstance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static ReflectionProofSingleton getInstance(){
        if (sSoleInstance == null){ //if there is no instance available... create new one
            sSoleInstance = new ReflectionProofSingleton();
        }

        return sSoleInstance;
    }
}

class ThreadSafeSingleton {

//    public class ReflectionProofSingletonTester {
//        public static void main(String[] args) {
//            //Thread 1
//            Thread t1 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    ReflectionProofSingleton instance1 = ReflectionProofSingleton.getInstance();
//                    System.out.println("Instance 1 hash:" + instance1.hashCode());
//                }
//            });
//
//            //Thread 2
//            Thread t2 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    ReflectionProofSingleton instance2 = ReflectionProofSingleton.getInstance();
//                    System.out.println("Instance 2 hash:" + instance2.hashCode());
//                }
//            });
//
//            //start both the threads
//            t1.start();
//            t2.start();
//        }
//    }

    private static ThreadSafeSingleton sSoleInstance;

    //private constructor.
    private ThreadSafeSingleton(){

        //Prevent form the reflection api.
        if (sSoleInstance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    // Making this method synchronized means that the second thread will have to wait until the getInstance() method is completed for the first thread
    public synchronized static ThreadSafeSingleton getInstance(){
        if (sSoleInstance == null){ //if there is no instance available... create new one
            sSoleInstance = new ThreadSafeSingleton();
        }
        return sSoleInstance;
    }
    // Disadvantages
    // 1. Slow performance because of locking overhead.
    // 2. Unnecessary synchronization that is not required once the instance variable is initialized
    // One thread always waiting for the other when the method is called.
}

class DoubleCheckLockingSingleon {
    
    // In this case, you will make the singleton class in the synchronized block if the instance is null.
    // Hence the synchronized block will be executed only when the sSoleInstance is null and prevent unnecessary synchronization
    // once the instance variable is initialized.
    private static DoubleCheckLockingSingleon sSoleInstance;

    //private constructor.
    private DoubleCheckLockingSingleon(){

        //Prevent from the reflection api.
        if (sSoleInstance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    // allows multiple threads access the getInstance method and to only wait when sSoleInstance is null.
    public static DoubleCheckLockingSingleon getInstance() {
        //Double check locking pattern
        if (sSoleInstance == null) { //Check for the first time

            synchronized (DoubleCheckLockingSingleon.class) {   //Check for the second time.
                //if there is no instance available... create new one
                if (sSoleInstance == null) sSoleInstance = new DoubleCheckLockingSingleon();
            }
        }

        return sSoleInstance;
    }
}

class VolatileKeywordSingleton {
    
    // Without volatile modifier, it’s possible for another thread in Java to see half initialized state of sSoleInstance variable, 
    // but with volatile variable guaranteeing happens-before relationship, all the write will happen on volatile sSoleInstance
    // before any read of sSoleInstance variable.
    private static volatile VolatileKeywordSingleton sSoleInstance;

    //private constructor.
    private VolatileKeywordSingleton(){

        //Prevent form the reflection api.
        if (sSoleInstance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static VolatileKeywordSingleton getInstance() {
        //Double check locking pattern
        if (sSoleInstance == null) { //Check for the first time

            synchronized (VolatileKeywordSingleton.class) {   //Check for the second time.
                //if there is no instance available... create new one
                if (sSoleInstance == null) sSoleInstance = new VolatileKeywordSingleton();
            }
        }

        return sSoleInstance;
    }
}

class SerializationSafeSingleton implements Serializable {

//    public class SingletonTester {
//        public static void main(String[] args) {
//
//            try {
//                SingletonClass instance1 = SingletonClass.getInstance();
//                ObjectOutput out = null;
//
//                out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
//                out.writeObject(instance1);
//                out.close();
//
//                //deserialize from file to object
//                ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
//                SingletonClass instance2 = (SingletonClass) in.readObject();
//                in.close();
//
//                System.out.println("instance1 hashCode=" + instance1.hashCode());
//                System.out.println("instance2 hashCode=" + instance2.hashCode());
//
//            } catch (IOException | ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//    }
    
    // The problem with above serialized singleton class is that whenever we deserialize it, it will create a new instance of the class.
    
    // To prevent creation of another instance you have to provide the implementation of readResolve() method. 
    // readResolve() replaces the object read from the stream. 
    // This ensures that nobody can create another instance by serializing and deserializing the singleton.

    private static volatile SerializationSafeSingleton sSoleInstance;

    //private constructor.
    private SerializationSafeSingleton(){

        //Prevent form the reflection api.
        if (sSoleInstance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static SerializationSafeSingleton getInstance() {
        if (sSoleInstance == null) { //if there is no instance available... create new one
            synchronized (SerializationSafeSingleton.class) {
                if (sSoleInstance == null) sSoleInstance = new SerializationSafeSingleton();
            }
        }

        return sSoleInstance;
    }

    //Make singleton from serialize and deserialize operation.
    protected SerializationSafeSingleton readResolve() {
        return getInstance();
    }
}

