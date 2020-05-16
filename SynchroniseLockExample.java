package multithreading;

public class SynchroniseLockExample {
    public static void main(String[] args){
        Hello h1 = new Hello();
        Hello h2 = new Hello();
        MyThreads th1 = new MyThreads(h1);
        MyThreads th2 = new MyThreads(h1);
        th1.start();
        th2.start();

    }
}
 class Hello{
   synchronized static void show(){
       Thread th = Thread.currentThread();

       for(int i=0;i<5;i++) {
           System.out.println(th.getName() + "-SHOW" + i);
           try {
               Thread.sleep(500);
           } catch (Exception ex) {
               ex.printStackTrace();
           }

       }
     }
 }
 class MyThreads extends Thread{
    Hello h = null;
    MyThreads(Hello h){
        this.h = h;
    }
    public void run(){
        h.show();
    }
 }