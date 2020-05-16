package multithreading;

public class InterfaceUsingInterface {
    public static void main(String[] args){
        MyThread1 myThread1 = new MyThread1();
        Thread th1 = new Thread(myThread1);
        Thread th2 = new Thread(myThread1);
        th1.start();
        th2.start();
        Thread t = Thread.currentThread();
        for(int i=100;i<=110;i++){
            System.out.println(t.getName()+"--Value is"+i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 implements Runnable {
    public void run() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 10; i++) {
            System.out.println(th.getName() + "--Value is:" + i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}