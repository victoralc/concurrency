package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExampleMain {

    public static void main(String[] args) throws InterruptedException {
        //MyList list = new MyList();

        //ArrayList is not thread safe
        //List<String> list = new ArrayList<>();

        List<String> list = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            final var thread = new Thread(new AddItemTask(list, i));
            thread.start();
        }

        Thread.sleep(2000);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }
    }
}
