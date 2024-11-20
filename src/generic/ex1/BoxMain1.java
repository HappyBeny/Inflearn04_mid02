package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox intBox = new IntegerBox();
        intBox.set(10);
        Integer integer = intBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
