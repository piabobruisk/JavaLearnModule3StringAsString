package by.epam.pia.learning.string.stringasstring;

//8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
//Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class Task8 {

    private static final String string = "abc cde def";

    public static void main(String[] args) {

        System.out.print("[" + string + "] -> ");
        String[] words = string.split(" ");
        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > result.length()) {
                result = words[i];
            }
        }
        System.out.println("Самое длинное слово в строке: " + result);
    }
}
