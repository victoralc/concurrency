package search;

public class SearchMain {

    public static void main(String[] args) {

        String name = "mart";

        Thread searchText1 = new Thread(new SearchTask(name, "assinaturas1.txt"));
        Thread searchText2 = new Thread(new SearchTask(name, "assinaturas2.txt"));
        Thread searchText3 = new Thread(new SearchTask(name, "autores.txt"));

        searchText1.start();
        searchText2.start();
        searchText3.start();
    }

}
