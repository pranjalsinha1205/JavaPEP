interface A1 {
    void displayInfo();
}

interface B1 {
    void display();
}

class C implements A1, B1{
    @Override
    public void displayInfo() {
        System.out.println("Display method from interface A1");
    }
    @Override
    public void display() {
        System.out.println("Display method from interface B1");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C c1 = new C();
        c1.displayInfo();
        c1.display();
    }
}
