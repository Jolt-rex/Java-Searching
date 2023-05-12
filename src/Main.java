public class Main {
    public static void main(String[] args) {
        int[] items = { 9, 18, 24, 25 };

        System.out.println("Start search");

        var searcher = new Search();
        System.out.println(searcher.ternarySearch(items, 2));
    }
}