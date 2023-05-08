public class Search {

    public int linearSearch(int[] items, int value) {
        for(int i = 0; i < items.length; i++)
            if(items[i] == value)
                return i;

        return -1;
    }

    public int binarySearchRecursion(int[] items, int target) {
        return binarySearchRecursion(items, target, 0, items.length - 1);
    }

    private int binarySearchRecursion(int[] items, int target, int start, int end) {
        int middle = (start + end) / 2;
        if(items[middle] == target)
            return middle;

        if(start >= end)
            return -1;

        if(target < items[middle])
            return binarySearchRecursion(items, target, start, middle - 1);

        return binarySearchRecursion(items, target, middle + 1, end);
    }
}
