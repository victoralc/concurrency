package bathroom;

public class Bathroom {

    private boolean isDirty = true;

    private void waitOutside(String name) {
        System.out.println(name + ", uuughh, toilet is dirty");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void clean(){
        String name = Thread.currentThread().getName();

        System.out.println(name + " knocking the door");

        if (!isDirty) {
            System.out.println(name + " left the bathroom because it is not dirty.");
            return;
        }

        System.out.println("Cleaning the bathroom...");
        sleep(10000);

        this.isDirty = false;
        this.notify();

        System.out.println("Quitting bathroom");
    }

    public synchronized void poop() {

        String name = Thread.currentThread().getName();

        System.out.println(name + " entering in the bathroom...");

        while(isDirty) {
            waitOutside(name);
        }

        System.out.println(name + " pooping...");
        sleep(1000);

        this.isDirty = true;

        System.out.println("Flushing...");
        System.out.println("Washing hands");
        System.out.println("Quitting bathroom");
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void pee() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entering in the bathroom...");

        while(isDirty) {
            waitOutside(name);
        }

        System.out.println(name + " peeing...");
        sleep(7000);

        this.isDirty = true;

        System.out.println("Flushing...");
        System.out.println("Washing hands");
        System.out.println("Quitting bathroom");
    }

}
