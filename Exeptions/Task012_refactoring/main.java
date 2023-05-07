// Перепишите следующий код, используя ресурсный try

public class main {

    public static void main(String[] args) {
        rwLine(null, null);
    }

    private static void rwLine(Path pathRead, Path pathWrite) {
        try (BufferedReader in = Files.newBufferedReader(pathRead);
                BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
            out.write(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
