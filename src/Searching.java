public class Searching {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = 6;
        System.out.println("Element found using linear search at index: " + linearSearch(arr, n));
        System.out.println("Element found using binary search at index: " + binarySearch(arr, n));
        System.out.println("Element found using recursive binary search at index: " + recursiveBinarySearch(arr, n, arr.length - 1, 0));
    }
    public static int linearSearch(int[] arr, int n){
        for (int i = 0; i < arr.length; i++) if (arr[i] == n) return i;
        return -1;
    }

    public static int binarySearch(int[] arr, int n){
        /*
            This is only applicable in sorted arrays
            Time Complexity:- O(logn)
            Space Complexity:- o(1)
        */
        int high = arr.length - 1;
        int low  = 0;
        while (low <= high){
            int mid = (high + low)/2;
            if (arr[mid] == n) return mid;
            else if (arr[mid] < n) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int n, int high, int low){
        /*
            This is only applicable in sorted arrays
            Time Complexity:- O(logn)
            Space Complexity:- o(logn)
        */
        if (low <= high) {
            int mid = low + (high - low)/2;

            if (arr[mid] == n) return mid;
            else if (arr[mid] < n) return recursiveBinarySearch(arr, n, high, mid+1);
            else return recursiveBinarySearch(arr, n, mid - 1, low);
        }
        return -1;
    }
}
