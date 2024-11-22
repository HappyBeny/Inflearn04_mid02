package collection.list.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("n개의 정수를 입력하세요(종료 0)");
        while (true) {
            int n = sc.nextInt();
            sc.nextLine();

            if (n == 0) {
                break;
            }

            list.add(n);

        }

        int sum = 0;
        double average = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        average = (double) sum / list.size();

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);

    }
}
