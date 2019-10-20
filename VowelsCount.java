import java.util.Scanner;

public class VowelsCount {

    public static void countOfVowels(Scanner scanner) {
        String input = scanner.nextLine();
        int countVowel = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i'
                    || currentChar == 'o' || currentChar == 'u' || currentChar == 'A' || currentChar == 'E' || currentChar == 'I'
                    || currentChar == 'O' || currentChar == 'U') {
                ++countVowel;
            }
        }
        System.out.println(countVowel);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        countOfVowels(scanner);

    }
}
