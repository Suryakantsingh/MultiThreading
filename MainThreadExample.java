package multithreading;

public class MainThreadExample {

    public static void main(String[] args) {

        System.out.println("Main started");
        Thread th = Thread.currentThread();
        ThreadGroup tg = th.getThreadGroup();
        System.out.println(th.getId() + "\t" + th.getName() + "\t" + tg.getName());

        for (int i = 0; i < args.length; i++) {
            String st = args[i];
            System.out.println(th.getId() + "\t" + th.getName() + "\t" + tg.getName() + "\t" + st);
        }
        System.out.println("main completed");
    }
}
