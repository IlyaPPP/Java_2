// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого
// запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// select * from students where 'name=Ivanov' and 'country=Russia' and...

import java.util.Scanner;

/**
 * program
 */
public class task1 {

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Сколько параметров вы хотите выбрать?");
        System.out.println("name -> 1");
        System.out.println("country -> 2");
        System.out.println("city -> 3");
        System.out.println("age -> 4");
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = new String[] { "name", "Ivanov", "country", "Russia", "city", "Moscow", "age", "null" };
        Scanner scanner = new Scanner(System.in);
        int scan1 = scanner.nextInt();
        System.out.println("Какие?");
        int[] scan2 = new int[scan1];
        for (int i = 0; i < scan1; i++) {
            scan2[i] = scanner.nextInt();
        }
        for (int i = 0; i < scan2.length; i++) {
            if (scan2[i] == 1) {
                for (int j = 0; j < 2; j++) {
                    stringBuilder.append(words[j]).append(" ");
                }
            } else if (scan2[i] == 2) {
                for (int j = 2; j < 4; j++) {
                    stringBuilder.append(words[j]).append(" ");
                }
            } else if (scan2[i] == 3) {
                for (int j = 4; j < 6; j++) {
                    stringBuilder.append(words[j]).append(" ");
                }
            } else if (scan2[i] == 4) {
                for (int j = 6; j < 8; j++) {
                    stringBuilder.append(words[j]).append(" ");
                }
            }
        }
        System.out.println("select * from students where " + stringBuilder);
    }
}
