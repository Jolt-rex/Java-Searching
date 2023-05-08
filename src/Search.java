public class Search {

    public int linearSearch(int[] items, int target) {
        for(int i = 0; i < items.length; i++)
            if(items[i] == target)
                return i;

        return -1;
    }

    public int binarySearchRecursion(int[] items, int target) {
        return binarySearchRecursion(items, target, 0, items.length - 1);
    }

    private int binarySearchRecursion(int[] items, int target, int left, int right) {
        int middle = (left + right) / 2;
        if(items[middle] == target)
            return middle;

        if(left >= right)
            return -1;

        if(target < items[middle])
            return binarySearchRecursion(items, target, left, middle - 1);

        return binarySearchRecursion(items, target, middle + 1, right);
    }

    public int binarySearchIterative(int[] items, int target) {
        int middle, left = 0, right = items.length - 1;

        while(left <= right) {
            middle = (left + right) / 2;
            if(items[middle] == target)
                return middle;

            if(target < items[middle])
                right = middle -1;
            else
                left = middle + 1;
        }

        return -1;
    }
}
