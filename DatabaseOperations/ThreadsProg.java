class Reserve extends Thread {
    int available = 1;
    int wanted;

    public Reserve(int i) {
        wanted = i;
    }

    public void run() {
        System.out.println("Available berths = " + available);
        if (available >= wanted) {
            String name = Thread.currentThread().getName();
            System.out.println(wanted + " Berth(s) reserved for " + name);
            try {
                Thread.sleep(1500);
                available = available - wanted;
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        } else {
            System.out.println("Sorry! No berths available");
        }
    }
}

public class ThreadsProg {
    public static void main(String args[]) {
        Reserve obj = new Reserve(1);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setName("FirstPerson");
        t2.setName("SecondPerson");
        t1.start();
        t2.start();
    }
}
