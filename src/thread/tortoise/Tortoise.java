package thread.tortoise;

public class Tortoise implements Runnable {
    private static final int MILESTONES = 5;
    private final Thread tortoise;

    public Tortoise() {
        this.tortoise = new Thread(this, "Tortoise");
    }

    public Thread getRabbit() {
        return tortoise;
    }


    @Override
    public void run() {

    }
}
