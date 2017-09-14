package lesson22;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hillel on 14.09.17.
 */
public class Main {
    //берем сет, заполняем из трех потоков, в потоки передаем строки, разбиваем по словам
    public static void main(String[] args) {
        Set<String> wordsSet = new HashSet<>();

        Class1 class1 = new Class1();

        for (String s : wordsSet) {
            class1.start();
            class1.start();
            class1.start();
        }
    }
}
