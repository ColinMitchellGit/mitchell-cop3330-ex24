/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex24;
import java.util.Scanner;
import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.print("Enter the first string: ");
        String word1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String word2 = input.nextLine();

        printResults(isAnagram(word1,word2), word1, word2);
    }

    public static boolean isAnagram(String word1,String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        boolean result;

        if(word1.length() == word2.length()) {

            // convert strings to char array
            char[] charArray1 = word1.toCharArray();
            char[] charArray2 = word2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            result = Arrays.equals(charArray1, charArray2);
        }
        else {
            result = false;
        }

        return result;
    }

    public static void printResults(boolean result, String word1, String word2) {
        if(result) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        }
        else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }
    }
}