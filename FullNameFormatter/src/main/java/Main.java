import java.util.Scanner;

public class Main {

    public static final int FIRST_SYMBOL_ALPHABET_IN_UNICODE = 1040;
    public static final int LAST_SYMBOL_ALPHABET_IN_UNICODE = 1103;
    public static final int SPACE_SYMBOL_IN_UNICODE = 32;
    public static final int DASH_SYMBOL_IN_UNICODE = 45;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //Задача: написать код который будет на входе через консоль принимать ФИО одной строкой
        //(например, «Иванов Сергей Петрович») и выводит ФИО отдельно.
        //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

        for (int i = 0; i < input.length(); i++) {
            int firstSpace = input.indexOf(' ');
            int lastSpace = input.lastIndexOf(' ');
            int occurrencesCount = input.length() - input.replace(" ", "").length();
            if (input.codePointAt(i) >= FIRST_SYMBOL_ALPHABET_IN_UNICODE
                    && input.codePointAt(i) <= LAST_SYMBOL_ALPHABET_IN_UNICODE
                    && occurrencesCount <= 2 || input.codePointAt(i) == DASH_SYMBOL_IN_UNICODE
                    || input.codePointAt(i) == SPACE_SYMBOL_IN_UNICODE) {
                if (firstSpace == -1) {
                    System.out.println("Введенная строка не является ФИО");
                    return;
                }
                String lastName = input.substring(0, firstSpace);
                System.out.println("Фамилия: " + lastName);
                String name = input.substring(firstSpace, lastSpace);
                System.out.println("Имя:" + name);
                String fatherName = input.substring(lastSpace);
                System.out.println("Отчество:" + fatherName);
                return;
            } else {
                System.out.println("Введенная строка не является ФИО");
                return;
            }
        }
    }
}