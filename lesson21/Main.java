package lesson21;

public class Main {
    public static void main(String[] args) {
        System.out.println("INSERT YOUR NAME, INSECT!");

        TrashClass trashClass = new TrashClass();
        try {
            trashClass.start();
            trashClass.join(3000);
            trashClass.interrupt();
            System.out.println(trashClass.getState());
            if (trashClass.isInterrupted()){
                System.out.println("TOO LATE, INSECT!");

            }else{
                System.out.println("NICE TO MEET YOU, " + trashClass.name + "!");
            }
        } catch (InterruptedException e) {
            System.out.println("retard");
        }
    }
}
