package example;

import java.util.HashSet;
import java.util.Set;

public class Validator {

    public boolean validation(int[] guessAnswer) {
        Set<Integer> counter = new HashSet<>();
        for (int element : guessAnswer) {
            if (counter.contains(element)) {
                return false;
            } else {
                if (element < 0 || element > 9) {
                    return false;
                }
                counter.add(element);
            }
        }
        return guessAnswer.length == 4;
    }

}
