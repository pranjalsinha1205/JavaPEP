public class Variables {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println("Sum: " + (a + b));

        float c = a / b;
        System.out.println("a/b: " + c);

        c = (float)a/b;
        System.out.println("a/b: " + c);

        char d = 'c';
        System.out.println("The character I wrote is: " + d);

        String s = "College";
        System.out.println("The string is: " + s);

        boolean bool = true;
        System.out.println("The boolean is: " + bool);

        if (a > 10 && b < 3)  System.out.println("Nothing");
        else System.out.println("If condition didn't work");

        countDown(10);
    }
    public static void countDown(int n){
        if (n == 0) return;
        System.out.println(n);
        countDown(n-1);
    }
}
