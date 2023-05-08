public class Main {
    public static void main(String[] args) {
        int[] items = { 9, 4, 5, 2, 5, 1, 0 };

        System.out.println("Start search");

        var searcher = new Search();
        System.out.println(searcher.linearSearch(items, 0));
    }
}