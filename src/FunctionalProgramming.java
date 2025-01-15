class Calculate{
    String op_name;
    void set_op(String op_n){
        this.op_name = op_n;
    }
    String get_op(){
        return op_name;
    }
}
public class FunctionalProgramming {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        c1.set_op("Sum");
        System.out.println("The C1 object is: " + c1.get_op());
    }
}
