package by.epam.pia.learning.string.stringasstring;

//6. Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {

    private static final String string = "I had toast for breakfast.";

    public static void main(String[] args) {

        System.out.print("["+string+"] -> [");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char tmp=string.charAt(i);
            result.append(tmp);
            result.append(tmp);
        }
        System.out.println(result + "]");
    }
}
