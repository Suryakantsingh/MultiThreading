package multithreading;

public class ExampleOfDaemonThread {
    public static void main(String[] args) {
        Thread th1 = Thread.currentThread();
        Mythread4 th2 = new Mythread4();
        th2.start();
        for(char ch='A';ch<'L';ch++){
            System.out.println(th1.getName()+"\t"+ch+"\t"+th1.isDaemon());
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Mythread4 extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName()+"\t"+i+"\t"+isDaemon());
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
