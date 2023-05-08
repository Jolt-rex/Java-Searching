public class Main {
    public static void main(String[] args) {
        int[] items = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println("Start search");

        var searcher = new Search();
        System.out.println(searcher.binarySearchIterative(items, 9));
    }
}