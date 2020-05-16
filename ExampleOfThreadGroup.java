package multithreading;

public class ExampleOfThreadGroup {
    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("WE");
        MyThread3 th1 = new MyThread3(tg,"JLC-Thread");
        MyThread3 th2 = new MyThread3();
        th1.start();
        th2.start();
    }
}

class MyThread3 extends Thread {

    MyThread3(ThreadGroup tg, String name) {
        super(tg, name);
    }

    MyThread3() {
    }

    public void run() {
        ThreadGroup tg = getThreadGroup();
        int pri = getPriority();
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "\t" + getName() + "\t" + tg.getName() + "\t" + pri);
        }
    }

}
