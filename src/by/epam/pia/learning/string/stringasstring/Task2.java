package by.epam.pia.learning.string.stringasstring;

//2. В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {

    private static final String string = "I had toast for breakfast.";

    public static void main(String[] args) {

        System.out.print("["+string+"] -> [");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char tmp=string.charAt(i);
            result.append(tmp);
            if ( tmp== 'a') {
                result.append('b');
            }
        }
        System.out.println(result + "]");
    }
}
