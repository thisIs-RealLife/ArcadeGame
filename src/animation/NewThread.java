
package animation;

public class NewThread implements Runnable {

    private Thread thread;
    private NewJFrame frame;
    private int delay;
    public volatile boolean canMove;

    public void setDelay(int delay) {
        this.delay = delay;
    }


    public NewThread(NewJFrame frame, int delay) {
        thread = new Thread(this);
        this.frame = frame;
        this.delay = delay;
    }

    public void stop() {
        canMove = false;
    }

    public void start() {
        canMove = true;
        thread.setDaemon(true);
        thread.start();
    }

    @Override
    public void run() {
        try {
            while (canMove) {
                frame.moveBox();
                Thread.sleep(delay);
            }
        } catch (Exception ex) {
        }
    }
}
