/**
 * program
 */
public class Program {

    public static void main(String[] args) {

        System.out.println("Primitive type decimal in Java - User Entry:\t");

        byte bt = (byte) 255;
        short sh = 32767;
        var it = 2147483647;
        var lng = 9223372036854775807L;
        var fl_e = 2.7F;
        var db_pi = 3.1415D;

        char ch = 'c';
        var bl = true;

        System.out.println(getType(bt));
        System.out.println(getType(sh));
        System.out.println(getType(it));
        System.out.println(getType(lng));
        System.out.println(getType(fl_e));
        System.out.println(getType(db_pi));
        System.out.println(getType(ch));
        System.out.println(getType(bl));
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}