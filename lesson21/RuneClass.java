package lesson21;

public class RuneClass implements Runnable{
    @Override
    public void run(){
        System.out.println("Class: " + Main.class.getName()
                + " Thread: " + Thread.currentThread().getName());
    }
}
