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
        selectionSort(d);
        System.out.println("Quicksort sort: " + Arrays.toString(d));
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
    public static void quickSort(int[] arr){
        //todo
    }
}
