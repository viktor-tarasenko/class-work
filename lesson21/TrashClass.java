package lesson21;

import java.io.InputStreamReader;
import java.util.Scanner;

public class TrashClass extends Thread {

    String name;

    @Override
    public void run() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String name = scanner.nextLine();
        scanner.close();

        this.name = name;
    }
}
