package src.com.baufest.core.Random;

import java.util.Random;

/**
 * Created by miguel on 17/9/17.
 */
public class GetRandom {
    Random rand = new Random();

    public int randomRank(int min, int max){

        int random = rand.nextInt((max - min) + 1) + min;

        return random;
    }
}
