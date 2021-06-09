package collections;

import java.util.List;

public class AddItemTask implements Runnable{

    //private MyList list;
    private List<String> list;
    private int threadNumber;

//    public AddItemTask(MyList list, int threadNumber) {
//        this.list = list;
//        this.threadNumber = threadNumber;
//    }

    public AddItemTask(List list, int threadNumber) {
        this.list = list;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.list.add("Thread " + threadNumber + " - " + i);
        }
    }
}
