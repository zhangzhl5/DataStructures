package design.pattern.single.lazy;



/**
 * Created by Tom.
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
    	LazyDoubleCheckSignleton singleton = LazyDoubleCheckSignleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
