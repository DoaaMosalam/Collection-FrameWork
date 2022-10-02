package Collection_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelLetters {
    public static int vowelLetters(StringBuilder text){
        List<Character> letters = new ArrayList<>();
        letters.add('a');
        letters.add('e');
        letters.add('i');
        letters.add('o');
        letters.add('u');
        int total=0;
        for (int s=0;s<text.length();s++){
            for (int counter=0;counter<letters.size();counter++){
                if (text.charAt(s) == letters.get(counter)){

                        total += 1;
                    }
                }
            }

        return total;

    }

    public static void displayMessage(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type here Test,Please: ");
        StringBuilder sb = new StringBuilder();
        sb.append(input.nextLine());
        System.out.println("count Letters vowels in your text is: " + vowelLetters(sb));

    }
}
