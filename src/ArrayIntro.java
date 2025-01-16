import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] a = {1,3,4};
        System.out.println("Og array a: " + Arrays.toString(a));

        int[] b = new int[4];
        System.out.println("Og array b: " + Arrays.toString(b));
        b = a;
        System.out.println("New array b: " + Arrays.toString(b));

        //let's say we want to insert 2 between 1 and 3
        System.out.println("Inserting 2 between 1 and 3");

        int insertIndex = 1;
        int value = 2;
        int[] newArr = new int[4];

        for (int i = 0; i < newArr.length; i++){
            if (i < insertIndex) newArr[i] = b[i];
            else if (i == insertIndex) newArr[i] = value;
            else newArr[i] = b[i-1];
        }

        b = newArr;
        System.out.println("New array b after insertion: " + Arrays.toString(b));
    }
}
