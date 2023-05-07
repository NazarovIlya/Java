public class main {

    public static void main(String[] args) {
        String[][] a = new String[][]{
                {"10", "8", "9", "1"},
                {"13", "16", "65", "24"},
                {"2", "4", "8", "7"},
                {"56", "48", "37", "95"}};

        int sum = 0;
        System.out.println("Сумма элементов правильного массива.");
        try {
            sum = calcArray(a);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        System.out.println("Sum = " + sum);


        String[][] a1 = new String[][]{
                {"10", "8", "9", "1"},
                {"13", "16", "65", "24"},
                {"2", "4", "8", "7"},
                {"56", "48", "37", "95"}};

        sum = 0;
        System.out.println("Сумма элементов массива с лишним столбцом.");
        try {
            sum = calcArray(a1);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        System.out.println(sum);


        String[][] a2 = new String[][]{
                {"10", "8", "9", "1"},
                {"13", "16", "65", "24"},};

        sum = 0;
        System.out.println("Сумма элементов массива всего с двумя строками.");
        try {
            sum = calcArray(a2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        System.out.println(sum);


        String[][] a3 = new String[][]{
                {"10", "8", "9", "1"},
                {"13", "16", "65", "24"},
                {"2", "4", "8", "7"},
                {"56", "48", "число37", "95"}};

        sum = 0;
        System.out.println("Сумма элементов массива с неверным форматом числа.");
        try {
            sum = calcArray(a3);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
    private static int calcArray(String[][] a) throws MyArraySizeException {
        if (a.length != 4) throw new MyArraySizeException("Неверное количество строк: " + a.length);

        for (int i = 0; i < a.length; i++) {
            if (a[i].length != 4) throw
                    new MyArraySizeException(String.format("Неверное количество элементов %d в %d-й" + " строке",
                            a[i].length, i));
        }

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                try {
                    sum += Integer.parseInt(a[i][j]);
                }
                catch (NumberFormatException ex)
                {
                    throw new MyArrayDataException(String.format("Неверный формат числа в позиции %d, %d: \"%s\"", i, j, a[i][j]));
                }
            }
        }

        return sum;
    }
}
