package design.pattern.single.lazy;



/**
 * Created by Tom.
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
    	LazySimpleSignleton singleton = LazySimpleSignleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
