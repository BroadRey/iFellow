import java.util.ArrayList;

public class Task02 {
    public static void main(String[] args) {
        String hello = "gg oo dd rtyur";
        char[] helloCharArray = hello.toCharArray();
        ArrayList<Character> repeatingChars = new ArrayList<>();

        for (int i = 0; i < helloCharArray.length; i++) {
            for (int j = i + 1; j < helloCharArray.length; j++) {
                if (helloCharArray[j] == helloCharArray[i]) {
                    if (!repeatingChars.contains(helloCharArray[i])) {
                        repeatingChars.add(helloCharArray[i]);
                    }
                    break;
                }
            }
        }

        System.out.print("Повторяющиеся символы: ");
        for (Character symbol : repeatingChars) {
            System.out.print(symbol);
        }

    }
}
