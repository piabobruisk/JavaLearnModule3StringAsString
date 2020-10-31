package by.epam.pia.learning.string.stringasstring;

//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {

    private static final String string = " This  is   a    test   string  ! ";

    public static void main(String[] args) {

        int maxSpaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                int count = getCountChars(i);
                if (count > maxSpaces) {
                    maxSpaces = count;
                }
            }
        }
        System.out.println("Наибольшее количество подряд идущих пробелов в строке: " + maxSpaces);
    }

    private static int getCountChars(int i) {
        int count = 1;
        char find = string.charAt(i);
        i++;
        for (; i < string.length(); i++) {
            if (string.charAt(i) == find) {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }
}
