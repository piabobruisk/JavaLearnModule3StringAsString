package by.epam.pia.learning.string.stringasstring;

//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

public class Task9 {

    private static final String string = " This  is   a  Test   string  ! #ТестЕта";

    public static void main(String[] args) {

        int lowerCase = 0;
        int upperCase = 0;

        for (int i = 0; i < string.length(); i++) {
            int result = isUpperOrLower(string.charAt(i));
            if (result < 0) {
                lowerCase++;
            } else if (result > 0) {
                upperCase++;
            }
        }
        System.out.println("Строка [" + string + "] содержит английских букв: строчных - " + lowerCase + ", прописных - " + upperCase);
    }

    private static int isUpperOrLower(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return -1;
        } else if (ch >= 'A' && ch <= 'Z') {
            return 1;
        }
        return 0;
    }
}
