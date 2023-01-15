package com.company;
import java.util.Scanner;

public class cloudVADANA_assignment_3 {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter a Letter: ");
        char letter = sc.next().charAt(0);

        int index = sentence.indexOf(letter);
        if (index == -1) {
            System.out.println("The letter does not exist in the sentence");
        } else {
            String restOfSentence = sentence.substring(index + 1);
            System.out.println(restOfSentence);
        }
    }
}
