import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        /*4.1.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("4.1\nВведите строку:");
        String str = scanner.nextLine();
        System.out.println("Введите подстроку:");
        String subStr = scanner.nextLine();
        int subStrLenght = subStr.length();

        int index = str.indexOf(subStr);
        int count = 0;

        while (index<= str.length()&& index !=-1){
            index = str.indexOf(subStr, index+subStrLenght);
            count+=1;
        }

        System.out.printf("Подстрока встречается в строке %d раз(а)\n", count);

        /*4.2*/
        System.out.println("4.2\nВведите строку: ");
        String str1 = scanner.nextLine();
        String replStr = str1.replace("бяка","вырезано цензурой");
        replStr = replStr.replace("кака","вырезано цензурой");
        System.out.println(replStr);

        /*4.3*/
        System.out.println("4.3\nВведите дату в формате 'дд.мм.гггг': ");
        String date = scanner.nextLine();
        String pattern = "\\d{2}.\\d{2}.\\d{4}";
        if (date.matches(pattern)) {
            String[] parts = date.split("\\.");
            System.out.println(parts[2] + "-" + parts[1] + "-" + parts[0]);
        } else {
            System.out.println("Неправильно введена дата");
        }
        /*4.4*/
        System.out.println("4.4");
        SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
        Date parsingDate = ft.parse(date);
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(ft1.format(parsingDate));
        scanner.close();
    }

}