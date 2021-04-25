import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final int MAX = 100;
        final int MIN = 90;
        final int EXIT = 100;

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        //Randoms randoms = new Randoms(list ,MIN, MAX);

        while (true) {
            int element = random.nextInt((MAX - MIN)) + MIN + 1;
            list.add(element);
            System.out.println("Случайное число: " + element);
            if (element == EXIT){
                System.out.printf("Выпало число %d, давайте на этом закончим", EXIT);
                break;
            }
        }
    }
}
