// 2) Если необходимо, исправьте данный код (задание 2
// try {
//     int d = 0;
//     double catchedRes1 = intArray[8] / d;
//     System.out.println("catchedRes1 = " + catchedRes1);
//  } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
//  }

public class main {
    public static void main(String[] args) {

        int[] intArray = new int[8];
        int index = 8;
        int d = 0;

        if (d == 0) {
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
        if (index > intArray.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс выходит за пределы массива");
        }

        double catchedRes1 = intArray[index] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    }
}
