/**
 * Created by Lidia on 30.08.2020.
 */
public class Incremenator extends Thread{
    private volatile boolean mIsIncrement = true;

    public void changeAction(){
        mIsIncrement = !mIsIncrement;
    }
    @Override
    public void run(){
        do {
            if (!Thread.interrupted()){
                if (mIsIncrement)Solution.value++;
                else Solution.value--;
                System.out.print(Solution.value + " ");
            }
            else
                return;
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                return;
            }
        }
        while (true);
    }
}
