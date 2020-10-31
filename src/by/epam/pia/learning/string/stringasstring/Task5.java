package by.epam.pia.learning.string.stringasstring;

//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task5 {

    private static final String string = "I had toast for breakfast.";

    public static void main(String[] args) {

        System.out.print("В строке ["+string+"] буква 'а' встречается раз: ");

        int count = 0;

        for (int i = 0; i < string.length(); i++) {

            if ( string.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
