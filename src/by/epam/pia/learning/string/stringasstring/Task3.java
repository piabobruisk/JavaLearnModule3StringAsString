package by.epam.pia.learning.string.stringasstring;

//3. Проверить, является ли заданное слово палиндромом.

public class Task3 {

    //private static String string = "assan";
    private static String string = "Рвал дед лавр";

    public static void main(String[] args) {

        System.out.print(string +" - ");
        String result = " является палиндромом!";
        string = string.toLowerCase();
        for (int i = 0, stringLength=string.length(); i < stringLength/2; i++) {

            if ( string.charAt(i)!= string.charAt(stringLength-i-1)) {
                result = " не является палиндромом!";
                break;
            }
        }
        System.out.println(result);
    }
}
