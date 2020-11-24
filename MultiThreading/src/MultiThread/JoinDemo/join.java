package MultiThread.JoinDemo;

/**
 * 多线程中join的使用：在线程中执行另一个线程的join()方法，可以在当前线程执行完成后执行另一个线程
 */
public class join {
    public class A extends Thread{
        @Override
        public void run() {
            System.out.print("A");
        }
    }

    public class B extends Thread{
        private A a;

        B(A a){
            this.a=a;
        }
        @Override
        public void run() {
            try{
                a.join();
                System.out.print("B");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void test(){
        A a=new A();
        B b=new B(a);

        a.start();
        b.start();
    }

    public static void main(String[] args) {
        join join=new join();
        join.test();
    }
}
