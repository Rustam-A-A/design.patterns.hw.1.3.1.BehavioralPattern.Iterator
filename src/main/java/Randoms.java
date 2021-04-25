//import java.util.List;
//import java.util.Random;
//
//public class Randoms {
////public class Randoms implements Collection {
//
//    public List<Integer> randoms;
//    protected int max;
//    protected int min;
//    protected Random random;

//    public Randoms(List<Integer> randoms, int min, int max) {
//        this.randoms = randoms;
//        this.min = min;
//        this.max = max;
//    }
//}
//    //итератор
//    public class RandomsIterator implements Iterator {
//        int next;
//
//        @Override
//        public boolean hasNext() {
//            return next < randoms.size();
//        }
//
//        @Override
//        public Integer next() {
//            if (next < randoms.size()){
//                Integer element = randoms.get(next);
//                next++;
//                return element;
//            }
//            return null;
//        }
//    }
//
//    @Override
//    public Iterator getIterator() {
//        return null;
//    }
//}