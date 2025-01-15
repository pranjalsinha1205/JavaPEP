class A{
    public void displayInfo() {
        System.out.println("This is class A");
    }
}
class B extends A{
    @Override
    public void displayInfo() {
        System.out.println("This is class B");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        A a1 = new A();
        a1.displayInfo();

        B b1 = new B();
        b1.displayInfo();
    }
}
