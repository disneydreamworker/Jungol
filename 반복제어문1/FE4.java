package 반복제어문1;

import java.util.Scanner;

public class FE4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int cnt=0;
            while (true) {
                int num = sc.nextInt();
                if (num == 0) break;
                if ((num%3!=0 && num%5!=0)) cnt++;
            }
            System.out.println(cnt);
        }
}

