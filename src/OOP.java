abstract class Animal{
    abstract void sound();
    void prop(){
        System.out.println("The little guy is sleeping");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog is making the sound");
    }
}

class Person{
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class OOP {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound(); //dog class method implementation
        a1.prop(); //specific abstract class method implementation
    }
}
