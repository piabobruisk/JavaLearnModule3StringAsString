package by.epam.pia.learning.string.stringasstring;

//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
// восклицательным или вопросительным знаком. Определить количество предложений в строке X.
public class Task10 {

    private static final String string = "!!!!!! This  is   a  Test   string  ! ТестЕта. Понятно? !";

    public static void main(String[] args) {

        int sentence = 0;

        for (int i = 0; i < string.length(); i++) {
            if (isSentenceEnd(i)) {
                sentence++;
            }
        }
        System.out.println("Строка [" + string + "] содержит предложений: " + sentence);
    }

    private static boolean isSentenceEnd(int i) {

        if (i != 0) { //если строка начинается с .?! то за предложение не считаем.
            char ch = string.charAt(i);
            if (ch == '.' || ch == '?' || ch == '!') {//так же не считаем за предложение два идущих подряд символа .?!
                ch = string.charAt(i - 1);
                return (ch != '.' && ch != '?' && ch != '!');
            }
        }
        return false;
    }
}
