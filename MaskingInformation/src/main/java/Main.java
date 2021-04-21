public class Main {

    public static void main(String[] args) {

        System.out.println(searchAndReplaceDiamonds("Номер кредитной карты <4008> 1234 <5678> 8912", "***"));
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {

        // Задача: реализовать метод, который будет скрывать конфиденциальную информацию, содержащуюся в <>
        // если в строке нет <> - вернуть строку без изменений

        boolean firstSymbol = text.contains("<");
        boolean secondSymbol = text.contains(">");
        if (firstSymbol && secondSymbol) {
            String firstSubstring = text.substring(text.indexOf("<"), (text.indexOf(">") + 1));
            String replaceFirstMask = text.replaceAll(firstSubstring, placeholder);
            boolean firstSymbolAtSubstring = replaceFirstMask.contains("<");
            boolean secondSymbolAtSubstring = replaceFirstMask.contains(">");
            for (int i = 0; i < text.length(); i++) {
                for (int a = 0; a < replaceFirstMask.length(); a++) {
                    if (firstSymbolAtSubstring && secondSymbolAtSubstring) {
                        String secondSubstring = text.substring(text.lastIndexOf("<"),
                                (text.lastIndexOf(">") + 1));
                        String replaceSecondMask = replaceFirstMask.replaceAll(secondSubstring,
                                placeholder);
                        return replaceSecondMask;
                    }
                }
                return replaceFirstMask;
            }
        }
        return text;
    }
}