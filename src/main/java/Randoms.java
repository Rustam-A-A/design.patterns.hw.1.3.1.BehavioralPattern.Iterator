import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    public List<Integer> randoms= new ArrayList<>();
    protected int max;
    protected int min;
    protected Random random;
    Iterator iterator = randoms.iterator();

    //формирование коллекции
    public Randoms(int min, int max) {
        Random random = new Random();
        this.max = max;
        this.min = min;
        while(true){
            int x = random.nextInt((max - min)) + min + 1;
            randoms.add(x);
            if (x == 100) {
                break;
            }
        }
    }

    //итератор
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                if (next < randoms.size()) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                if (next < randoms.size()){
                    Integer element = randoms.get(next);
                    next++;
                    return element;
                }
                return null;
            }
        };
    }



}