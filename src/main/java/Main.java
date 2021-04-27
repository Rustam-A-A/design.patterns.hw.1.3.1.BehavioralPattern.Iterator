public class Main {
    final static int MAX = 100;
    final static int MIN = 90;
    final static int EXIT = 100;

    public static void main(String[] args) {
        for(int r: new Randoms(MIN, MAX)) {
            System.out.println("Случайное число: " + r);
            if (r == EXIT){
                System.out.printf("Выпало число %d, давайте на этом закончим", EXIT);
                break;
            }
        }
    }
}
