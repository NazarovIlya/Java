// Задание 2.1.
// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        String nString = iScanner.nextLine();
        int n = Integer.parseInt(nString);
        System.out.printf("Введите символ c1: ");
        String c1 = iScanner.nextLine();
        System.out.printf("Введите символ c2: ");
        String c2 = iScanner.nextLine();
        iScanner.close();

        StringBuilder sres = new StringBuilder();
        sres.append((c1 + c2).repeat(Math.max(0, n / 2)));
        System.out.println(sres);

        // for (int i = 1; i <= n; i++) {
        // if (i%2 == 0){
        // sres.append(c1);
        // } else {
        // sres.append(c2);
        // }
        // }

        // for (int i = 1; i <= n/2; i++) {
        // sres.append(c1+c2);
        // }
        //
        // System.out.println(sres);

    }
}
