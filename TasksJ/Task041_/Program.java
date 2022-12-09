// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Введите выражение ");
        // String str = iScanner.nextLine();
        // iScanner.close();
        String str = "a + (d * 3)-[d + c]";
        String[] strArray = str.replaceAll(" ", "")
                .split("");
        System.out.println(Arrays.toString(strArray));

        Map<String, Integer> mapStaples = new HashMap<>();
        mapStaples.put("(", 0);
        mapStaples.put(")", 0);
        mapStaples.put("[", 0);
        mapStaples.put("]", 0);

        Stack<String> stack = new Stack<>();

        Map<String, Boolean> flag = new HashMap<>();
        flag.put("(", false);
        // flag.put(")", false);
        flag.put("[", false);
        // flag.put("]", false);

        // {} () [] <>
        boolean fl = false;
        int count = 0;
        for (String sym : strArray) {
            if (((flag.get("(") && (sym.equals(")"))) || ((flag.get("[") && (sym.equals("]")))))) {
                mapStaples.put("(", -1);
                break;
            }
            if (sym.equals("(")) {
                count = mapStaples.get("(");
                mapStaples.put("(", ++count);
                // поднять флаг (
                flag.put("(", true);
                fl = true;
                System.out.printf("(!!! %s \n", mapStaples.get("("));

            } else if (sym.equals(")")) {
                System.out.printf("fl %s\n", fl);
                System.out.printf("flag %s\n", flag.get("("));
                if (fl) {
                    if (flag.get("(")) {
                        count = mapStaples.get(")");
                        mapStaples.put(")", ++count);
                        flag.put(")", false);
                        fl = false;
                    }
                }
                // count = db.get(")");
                // db.put(")", ++count);
                // опустить флаг )
                System.out.printf("( %s \n", mapStaples.get("("));
            }

            if (sym.equals("[")) {
                count = mapStaples.get("[");
                mapStaples.put("[", ++count);
                // поднять флаг (
                flag.put("[", true);
                fl = true;
                System.out.printf("[ %s \n", mapStaples.get("["));

            } else if (sym.equals("]")) {
                System.out.printf("fl %s\n", fl);
                System.out.printf("flag %s\n", flag.get("["));
                if (fl) {
                    if (flag.get("[")) {
                        count = mapStaples.get("]");
                        mapStaples.put("]", ++count);
                        flag.put("[", false);
                        fl = false;
                    }
                }
                // count = db.get(")");
                // db.put(")", ++count);
                // опустить флаг )
                System.out.printf("[ %s \n", mapStaples.get("["));
            }
        }
        if ((mapStaples.get("(") == mapStaples.get(")")) & (mapStaples.get("[") == mapStaples.get("]"))) {
            System.out.println("True");
        } else
            System.out.println("False");
    }
}
*/
public class Program {
    public static void main(String[] args) {
        // Data input
        Scanner iScanner = new Scanner(System.in);
        String userInput = iScanner.nextLine().replaceAll(" ", "");
        iScanner.close();

        Map<String, Boolean> bracketsMap = new HashMap<>();
        bracketsMap.put("(", ")");
        bracketsMap.put("[", "]");
    }

    public static boolean 
}