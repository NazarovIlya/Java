// 4) Исправьте код, примените подходящие способы обработки исключений:

// public static void main(String[] args) {
//         InputStream inputStream;
//         try {
//                 String[] strings = {"apple", "orange"};
//                 String strings1 = strings[2];
//                 test();
//                 int a = 1 / 0;
//                 inputStream = new FileInputStream("/broken_reference");
//         } catch (ArithmeticException e) {
//                 e.printStackTrace();
//                 System.out.println("На ноль делить нельзя");
//         }
//         catch (Throwable e) {
//                 e.printStackTrace();
//         } catch (StackOverflowError error) {
//                 System.out.println("Что-то сломалось");
//         } finally {
//                 System.out.println("Я все равно выполнился");
//         }
//         System.out.println("Я жив!");
// }

// private static void test() throws IOException {
//         File file = new File("1");
//         file.createNewFile();
//         FileReader reader = new FileReader(file);
//         reader.read();
//         test();
// } 

import java.io.*;

public class main {

    public static void main(String[] args) {
        main main = new main();
        main.ex1();
    }

    public void ex1() {
        try {
            String[] strings = { "sadad", "dasdadsa" };
            String strings1 = strings[1];
            test(strings1);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public void test(String str) throws IOException {
        File file = new File("1");
        if (file.createNewFile()) {
            FileWriter fw = new FileWriter(file);
            fw.append(str);
            fw.flush();
            fw.close();
        }
    }
}
