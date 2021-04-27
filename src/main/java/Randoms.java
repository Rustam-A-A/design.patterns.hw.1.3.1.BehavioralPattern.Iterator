import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer>{
    public List<Integer> randoms = new ArrayList<>();
    protected int min;
    protected int max;
    protected int exit;

    Random random = new Random();

    public Randoms(int min, int max, int exit){
        this.min = min;
        this.max = max;
        this.exit = exit;
        while(true){
            int x = random.nextInt((max - min)) + min + 1;
            randoms.add(x);
            if (x == exit){
                break;
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                    return next < randoms.size();
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
