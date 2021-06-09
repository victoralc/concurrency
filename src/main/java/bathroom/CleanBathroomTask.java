package bathroom;

public class CleanBathroomTask implements Runnable{

    Bathroom bathroom;

    public CleanBathroomTask(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        while (true) {
            bathroom.clean();
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
