package src.com.baufest.core.Random;

import resources.DataManager.DataResources;

import java.util.Random;

/**
 * Created by miguel on 17/9/17.
 */
public class GetRandom {

    Random rand = new Random();


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private static int num;

    public int randomRank(int min, int max){

        int random = rand.nextInt((max - min) + 1) + min;
        setNum(random);
        return random;
    }
}
