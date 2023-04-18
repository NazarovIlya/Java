public class main {
    public static void main(String[] args) {
        int sum = sum2d(new String[][] { { "1", "2", "3", "4", "j", "6" }, { "1", "w" }, { "2", "7" } });
        System.out.println(sum);
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            if (arr == null) {
                throw new NullPointerException("Null array");
            }

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].length < 5) {
                    throw new IndexOutOfBoundsException("IndexOutOfBounds");
                }

                for (int j = 0; j < 5; j++) {

                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (NullPointerException | NumberFormatException | IndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Unknown error");
        }
        return sum;
    }
}
