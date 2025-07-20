import lombok.Data;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Test_1 test = new Test_1(2,3);
        System.out.println(test.getA());
        test.setA(25);
        System.out.println(test.getA());
        System.out.println(test.toString());
    }
}
