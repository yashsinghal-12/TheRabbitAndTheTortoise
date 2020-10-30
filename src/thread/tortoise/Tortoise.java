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
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak Tree!");
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    break;
            }


        }
    }
}



