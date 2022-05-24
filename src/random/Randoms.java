package random;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer>{
    protected Random random;
    private  int min;
    private int max;

    public Randoms(int min, int max) {
      this.min = min;
      this.max = max;


    }

    @Override
    public Iterator<Integer> iterator() {
        int diff = max - min;
        random = new Random();
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {

                return random.nextInt(diff + 1) + min;
            }

        };
    }
}
