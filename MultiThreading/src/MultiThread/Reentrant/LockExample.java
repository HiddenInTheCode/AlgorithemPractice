package MultiThread.Reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Java.util.concurrent包下的ReentrantLock锁
 */
public class LockExample {
    Lock lock=new ReentrantLock();
    public void func(){
        lock.lock();
        try{
            for(int i=0;i<10;i++){
                System.out.print(i+" ");
            }
        }finally {
            lock.unlock();
        }
    }
}
