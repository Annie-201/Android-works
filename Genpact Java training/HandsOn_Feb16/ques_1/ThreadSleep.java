package sample;

class Demo extends Thread {
    public void run()
    {
        try {
            Thread.sleep(2000);
            System.out.println("Succeeded");
        }
        catch (InterruptedException e) {
            throw new RuntimeException("Thread " +
                                    "interrupted");
        }
    }
    public static void main(String args[])
    {
        Demo t1 = new Demo();
        t1.start();
        try {
            t1.interrupt();
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}