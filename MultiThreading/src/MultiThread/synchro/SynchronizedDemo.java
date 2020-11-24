package MultiThread.synchro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedDemo {
    public void func(){
        //同步一个类
        synchronized (SynchronizedDemo.class) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo=new SynchronizedDemo(); //一个对象和两个对象执行的结果不同，一个会顺序执行，两个会交叉执行
        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.execute(synchronizedDemo::func);
        executorService.execute(synchronizedDemo::func);
    }
}
