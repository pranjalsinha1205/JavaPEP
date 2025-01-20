import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 6, 5, 4};
        System.out.println("Original arr: " + Arrays.toString(arr));
        heapSort(arr);
        System.out.println("Heap Sort: " + Arrays.toString(arr));

        int[] a = {1, 2, 3, 9, 6, 5, 4};
        System.out.println("\nOriginal a: " + Arrays.toString(a));
        selectionSort(a);
        System.out.println("Selection sort: " + Arrays.toString(a));

        int[] b = {1, 2, 3, 9, 6, 5, 4};
        System.out.println("\nOriginal b: " + Arrays.toString(b));
        bubbleSort(b);
        System.out.println("Bubble sort: " + Arrays.toString(b));

        int[] c = {1, 2, 3, 9, 6, 5, 4};
        System.out.println("\nOriginal c: " + Arrays.toString(c));
        insertionSort(c);
        System.out.println("Insertion sort: " + Arrays.toString(c));

        int[] d = {9, 6, 5, 0, 8, 2, 4, 7};
        System.out.println("\nOriginal d: " + Arrays.toString(d));
        quickSort(d, 0, d.length - 1);
        System.out.println("Quick sort: " + Arrays.toString(d));

        int[] e = {9, 6, 5, 0, 8, 2, 4, 7};
        System.out.println("\nOriginal e: " + Arrays.toString(e));
        mergeSort(e, 0, e.length-1);
        System.out.println("Merge sort: " + Arrays.toString(e));
    }
    public static void heapSort(int[] arr){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : arr) minHeap.add(i);
        int index = 0;
        while (minHeap.peek() != null) {
            arr[index] = minHeap.poll();
            index++;
        }
    }
    public static void selectionSort(int[] arr){
        /*
            sabse pehle loop chalana hai start se second last element tak
            fir andar waale loop ko chalana hai i se last tak
            basically hmko check krna hai ki us iteration mein minimum element ka index kya hai
            jab wo minimum index mil jaaye tb hmlog ko arr[i] mein arr[min] ko store krna hai
        */
        for (int i = 0; i < arr.length - 1; i++){
            int min = i;
            for (int j = i; j < arr.length; j++) if (arr[j] < arr[min]) min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void bubbleSort(int[] arr){
        /*
            Hmlog pichhe se sort kr rhe hain
            pehla loop pichhe se first tak chalega
            doosra loop aage se outer loop k ek pehle tk chalega
            fir agar j pe element j+1 se bada hai, to hmlog swap krenge
        */
        for (int i = arr.length - 1; i >= 0; i--){
            for (int j = 0; j <= i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void insertionSort(int[] arr){
        /*
            hmlog shuruat se shuru krte hain
            fir inner loop k liye while le kar j ko i k barabar krte hain
            fir check krte hai ki kya j 0 se bada hai aur
            j-1 pe jo element hai wo j se bada h?
            agar haa to hmlog swap krte hain aur j ko decrement krte hain,
            ye tb khatam hota hai jb j 0 ho jaata hai
        */
        for (int i = 0; i < arr.length; i++){
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
    public static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        /*
            sbse pehle ek pivot element lete hai jo usually first ya last hota hai
            fir i set krte hain
            fir j ko low se high - 1 index tk chalate hain
            agar jth element pivot k chhote ya barabar hai to i ko increment aur
            ith aur jth element ko swap kr lete hain
            fir (i+1)th element ko pivot se swap krte hain
            return kr dete hain uske baad hm i+1 ko
        */
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void mergeSort(int[] arr, int low, int high){
        if (low < high){
            int mid = (high + low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1, n2 = high - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) leftArray[i] = arr[low + i];
        for (int i = 0; i < n2; i++) rightArray[i] = arr[mid + i + 1];

        int i = 0, j = 0;
        int k = low;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
