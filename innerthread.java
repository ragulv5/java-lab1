class Shared {
    private int data;
    private boolean flag = false;

    synchronized void produce(int value) {
        while (flag) { // wait if data is not yet consumed
            try { wait(); } catch (Exception e) {}
        }
        data = value;
        flag = true;
        System.out.println("Produced: " + data);
        notify();
    }

    synchronized void consume() {
        while (!flag) { // wait if data not produced yet
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Consumed: " + data);
        flag = false;
        notify();
    }
}

class Producer extends Thread {
    Shared s;
    Producer(Shared s) { this.s = s; }
    public void run() {
        for (int i = 1; i <= 5; i++) s.produce(i);
    }
}

class Consumer extends Thread {
    Shared s;
    Consumer(Shared s) { this.s = s; }
    public void run() {
        for (int i = 1; i <= 5; i++) s.consume();
    }
}

public class innerthread {
    public static void main(String[] args) {
        Shared s = new Shared();
        new Producer(s).start();
        new Consumer(s).start();
    }
}