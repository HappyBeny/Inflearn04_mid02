package generic.equal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        Book bookA = new Book("소년이 온다", "한강");
        Book bookB = new Book("소년이 온다", "한강");
        Book bookC = new Book("채식주의자", "한강");

        System.out.println("args = " + Arrays.toString(args));
    }
}
