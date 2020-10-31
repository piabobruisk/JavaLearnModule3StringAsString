package by.epam.pia.learning.string.stringasstring;

//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Task4 {

    private static final String string = "информатика";

    public static void main(String[] args) {

        System.out.println(string.substring(7,8)+string.substring(3,5)+string.substring(7,8));
    }
}
