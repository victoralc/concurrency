package bathroom;

public class BathroomExampleMain {

    public static void main(String[] args) {
        Bathroom bathroom = new Bathroom();

        Thread guest1 = new Thread(new GuestPeeingTask(bathroom), "Victor");
        Thread guest2 = new Thread(new GuestPoopingTask(bathroom), "Joao");
        Thread cleanService = new Thread(new CleanBathroomTask(bathroom), "Clean Service");
        cleanService.setDaemon(true);

        guest1.start();
        guest2.start();
        cleanService.start();
    }
}
