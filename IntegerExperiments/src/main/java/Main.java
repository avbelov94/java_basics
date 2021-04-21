public class Main {

    public static void main(String[] args) {

        int sum = sumDigits(2121353524);
        System.out.println("Итоговая сумма: " + sum);
    }

  /* Задача: Реализовать метод sumDigits который возвращает сумму цифр числа до тех пор
  пока число не будет состоять из одной цифры пример:
  передано 12345, метод должен вернуть 6
  если передано null, то должен вернуть -1
   */

    public static int sumDigits(Integer number) {
        if (number == null) {
            return -1;
        }
        System.out.println("Число = " + number);
        String s = String.valueOf(number);
        System.out.println("Число как строка: " + s);
        int length = s.length();
        System.out.println("Количество знаков: " + length);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println("Сумма: " + sum);
        if (sum >= 10) {
            sum = sumDigits(sum);
        } else {
            return sum;
        }
        return sum;
    }
}