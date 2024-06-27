

import java.util.List;

public class Exercicios_Dois {
    public static void main(String[] args) {

        List<Character> charList = List.of('a', 'n', 'i', 'l', 'i', 'n', 'a');

        int left = 0;
        int right = charList.size() - 1;
        boolean isPalindrome = true;


        while (left < right) {

            if (charList.get(left) != charList.get(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("A lista de caracteres é um palíndromo? " + isPalindrome);
    }
}
