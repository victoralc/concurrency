package bathroom;

public class GuestPoopingTask implements Runnable{

    Bathroom bathroom;

    public GuestPoopingTask(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.poop();
    }

}
