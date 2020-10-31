package by.epam.pia.learning.string.stringasstring;

//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".

public class Task7 {

    private static final String string = "abc cde def";

    public static void main(String[] args) {

        System.out.print("[" + string + "] -> [");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char tmp = string.charAt(i);
            if (tmp != ' ' && result.indexOf(String.valueOf(tmp)) == -1) {
                result.append(tmp);
            }
        }
        System.out.println(result + "]");
    }
}
