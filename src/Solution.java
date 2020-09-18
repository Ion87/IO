import java.util.Arrays;

/**
 * Created by Lidia on 26.08.2020.
 */

public class Solution {
    public static int value = 0;
    static Incremenator mInc;
    public static void main(String[] args){
        mInc = new Incremenator();

        System.out.println("Valoarea = ");

        mInc.start();

        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(i*2*1000);
            }catch (InterruptedException e){
            }
            mInc.changeAction();
        }
        mInc.interrupt();
        //comments for test on github
        //Second commit for testing
    }
}
