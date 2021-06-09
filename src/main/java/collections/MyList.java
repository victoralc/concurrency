package collections;

public class MyList {

    private String[] items = new String[1000];
    private int index = 0;

    public synchronized void add(String item) {
        this.items[index] = item;
        this.index++;
    }

    public int size() {
        return this.items.length;
    }

    public String getItem(int position) {
        return this.items[position];
    }
}
