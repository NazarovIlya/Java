// ДЗ 2.1.
// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.io.FileWriter;
import java.util.Arrays;

public class Program {
        public static void main(String[] args) {

                // FILTER JSON FORMATION
                StringBuilder sqlFilter = new StringBuilder()
                                .append("{\"name\":\"Ivanov\",")
                                .append("\"country\":\"Russia\",")
                                .append("\"city\":\"Moscow\",")
                                .append("\"age\":\"null\"}");
                // PARSING
                String[] unParse = sqlFilter.toString().split(",");

                String name = PrepareString(Arrays.asList(unParse[0]
                                .split(":")[1]).toString());
                String country = PrepareString(Arrays.asList(unParse[1]
                                .split(":")[1]).toString());
                String city = PrepareString(Arrays.asList(unParse[2]
                                .split(":")[1]).toString());
                String age = PrepareString(Arrays.asList(unParse[3]
                                .split(":")[1]).toString());

                // REQUEST FORMATION
                StringBuilder sqlRequest = new StringBuilder()
                                .append("SELECT * FROM students WHERE ");
                if (name != "")
                        sqlRequest.append(" and name=")
                                        .append(name);
                if (country != "")
                        sqlRequest.append(" and country=")
                                        .append(country);
                if (city != "")
                        sqlRequest.append(" and city=")
                                        .append(city);
                if (age != "")
                        sqlRequest.append(" and age=")
                                        .append(age);

                // OUTPUT RESULT REQUEST TO CONSOLE
                WriteFile(sqlRequest);
                System.out.println(sqlRequest);
        }

        public static void WriteFile(StringBuilder sqlList) {
                try (FileWriter fw = new FileWriter("SQLRequest.txt", false)) {
                        fw.write(sqlList.toString());
                        fw.write("\n");
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        public static String PrepareString(String str) {

                str = str.replace("[", "");
                str = str.replace("]", "");
                str = str.replace("{", "");
                str = str.replace("}", "");
                if (str.contains("null"))
                        str = str.replace("\"null\"", "");
                else
                        str = str.replace("\"", "\'");

                return str;
        }
}