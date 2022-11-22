/**
 * program
 */
public class Program {
        public static void main(String[] args) {

                System.out.println("Primitive type decimal in Java - User Entry:");

                byte bt = (byte) 255;
                short sh = 32767;
                var it = 2147483647;

                var lng = 9223372036854775807L;
                var fl_e = 2.7F;
                var db_pi = 3.1415D;

                char ch = 'c';
                var bl = true;

                String formatInt = "\n%s | type: %s | minValue: %d | maxValue: %d";
                String formatFl = "\n%s | type: %s | minValue: %f | maxValue: %f";
                String formatS = "\n%s | type: %s";
                System.out.printf(formatInt, "byte", getType(bt), Byte.MIN_VALUE,
                                Byte.MAX_VALUE);
                System.out.printf(formatInt, "short", getType(sh), Short.MIN_VALUE,
                                Short.MAX_VALUE);
                System.out.printf(formatInt, "int", getType(it), Integer.MIN_VALUE,
                                Integer.MAX_VALUE);
                System.out.printf(formatInt, "long", getType(lng), Long.MIN_VALUE,
                                Long.MAX_VALUE);
                System.out.printf(formatFl, "float", getType(fl_e), Float.MIN_VALUE,
                                Float.MAX_VALUE);
                System.out.printf(formatFl, "double", getType(db_pi), Double.MIN_VALUE,
                                Double.MAX_VALUE);
                System.out.printf(formatS, "char", getType(ch));
                System.out.printf(formatS, "boolean", getType(bl));
        }

        