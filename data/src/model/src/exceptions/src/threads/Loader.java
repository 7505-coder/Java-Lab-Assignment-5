package threads;

public class Loader implements Runnable {
    private String action;
    public Loader(String action) { this.action = action; }

    @Override
    public void run() {
        System.out.print(action + " ");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(250);
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            System.out.println(" interrupted");
        }
        System.out.println();
    }
}
