import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int attempts = input.nextInt();
        List<String> words = new ArrayList<>();

        while (attempts != 0){

            String word = input.next();
            words.add(abbrivation(word));
            attempts -= 1;

        }

        for (int i = 0; i < words.size(); i++){

            System.out.println(words.get(i));

        }

    }

    public static String abbrivation(String word){

        char firstChar, lastChar;
        int length;

        if (word.length() > 10){

            firstChar = word.toLowerCase().charAt(0);
            lastChar = word.toLowerCase().charAt(word.length()-1);
            length = word.length() - 2;

            return firstChar+""+length+""+lastChar;

        }else {

            return word.toLowerCase();

        }

    }

}
