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

    public int ternarySearch(int[] items, int target) {
        return ternarySearch(items, target, 0, items.length - 1);
    }

    private int ternarySearch(int[] items, int target, int left, int right) {
        if(left > right)
            return -1;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if(target == items[mid1]) return mid1;

        if(target == items[mid2]) return mid2;

        if(target >= items[left] && target < items[mid1])
            return ternarySearch(items, target, left, mid1 - 1);

        if(target > items[mid1] && target < items[mid2])
            return ternarySearch(items, target, mid1 + 1, mid2 - 1);

        if(target > items[mid2] && target <= items[right])
            return ternarySearch(items, target, mid2 + 1, right);

        return -1;
    }
}
