package bathroom;

public class GuestPeeingTask implements Runnable {

    Bathroom bathroom;

    public GuestPeeingTask(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        this.bathroom.pee();
    }

}
