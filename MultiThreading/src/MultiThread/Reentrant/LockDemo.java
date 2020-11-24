package MultiThread.Reentrant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ReentrantLock的demo
 *
 */
public class LockDemo {
    public static void main(String[] args) {
        LockExample lockExample=new LockExample();
        //创建线程池
        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.execute(lockExample::func);
        executorService.execute(lockExample::func);
    }
}
