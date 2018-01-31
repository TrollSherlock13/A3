package a3;
import java.util.Scanner;
/**
 * A collection of methods for the third assignment of CS 1410
 * @author Hoang Nguyen uID: u1134317
 */
public class LoopPatterns {
	/**
	 * main() performs a series of method calls to complete task according to the method call
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The smallest postive number is " + findSmallestPositiveNumber("-2 -4 5 3 -2 -7 1 9"));
		System.out.println("The smallest Positive number is " + findSmallestPositiveNumber("2 0 -3 -32"));	
		System.out.println("Can the word be the same reversed? " + isPalindrome("hannah"));
		System.out.println("Can the word be the same reversed? " + isPalindrome("reversible"));
		System.out.println("Does the numbers have more even? " + hasMoreEvenThanOdd("1 5 4 6 -8"));
		System.out.println(camelCase("may the force be with you"));
		System.out.println("The lowest alphabetically is " + lowestAlphabetically("dog apple cat fish"));
		System.out.println(timesTable(3,3));
		System.out.println(timesTable(4,4));				
	}
	/**
	 * findSmallestPositiveNumber() finds the smallest positive number in the given string and return the value
	 * @param s
	 * @return smallest
	 */
	public static int findSmallestPositiveNumber(String s){
		Scanner s1 = new Scanner (s);
		int smallest = 0;
		String newNumber1 = "";
		while (s1.hasNext()) {
			String number = s1.next();
			int newNumber11 = Integer.parseInt(number);
			if (newNumber11 >= 0)
				newNumber1 += newNumber11 + " ";	
		}
		Scanner something = new Scanner (newNumber1);
		String number = something.next();
		smallest = Integer.parseInt(number);
		while (something.hasNext()) {
			number = something.next();
			int value = Integer.parseInt(number);
			if (smallest > value)
				smallest = value;
		}
		return smallest;
	}
	/**
	 * isPalindrome() return true for the word that reads the same forward and back ward, otherwise return false
	 * @param word
	 * @return true or false
	 */
	public static boolean isPalindrome(String word) {
		Scanner test = new Scanner (word);
		int s = 0;
		int a = 0;
		int i = word.length() - 1;
		while (test.hasNext()) {
			if (word.charAt(s) == word.charAt(i)) {
				a++;
				if (a == word.length()/2)
					return true;
			}
			else {
				return false;
			}
			i--;
			s++;
		}
		return true;
	}
	/**
	 * hasMoreEvenThanOdd() return true if the string has more even numbers than odd numbers, otherwise return false
	 * @param number
	 * @return
	 */
	public static boolean hasMoreEvenThanOdd(String number) {
		Scanner evenAndOdd = new Scanner(number);
		int i = 0;
		int s = 0;
		while (evenAndOdd.hasNext()) {
			String number1 = evenAndOdd.next();
			int value = Integer.parseInt(number1);
			value = value % 2;
			if (value == 0)
				i++;
			if (value == 1)
				s++;
		}
		if (i > s)
			return true;
		else
			return false;
	}
	/**
	 * camelCase() returns a string of words in camelCase form
	 * @param letters
	 * @return s1
	 */
	public static String camelCase(String letters) {
		Scanner s = new Scanner(letters);
		String s1 = "";
		String token = s.next();
		s1 = token;
		while (s.hasNext()) {
			token = s.next();
			char c = token.charAt(0);	
			 s1 += Character.toUpperCase(c) + token.substring(1, token.length()) ;
			}
		return s1;
	}
	/**
	 * lowestAphabetically() return a string of lowest alphabetical word
	 * @param lowest
	 * @return lowestWord
	 */
	public static String lowestAlphabetically(String lowest) {
		Scanner newWords = new Scanner(lowest);
		String lowestWord = "";
		String stringWord = newWords.next();
		lowestWord = stringWord;
		while (newWords.hasNext()) {
			stringWord = newWords.next();
			int value = lowestWord.compareTo(stringWord);
			if (value >= 0)
				lowestWord = stringWord;
		}
		return lowestWord;
	}
	/**
	 * the method returns a string of timesTable
	 * @param row
	 * @param column
	 * @return s1 + "\n" + z1
	 */
	public static String timesTable(int row, int column) {
		String s1 = "   "; // number
		int s = 1;
		for (int i = 1; i <= column; i++) {
			while (s < column) {
				s1 += " ";
				s++;
			}
			s = 1;
			s1 += i;
		}
		int i1 = 0; // '-' symbol
		String s2 = "   ";
		while (i1 < column*column) {
			s2 += "-";
			i1++;
		}
		s1 += "\n" + s2;
		int z = 1;
		String z1 = "";
		for (int i = 1; i <= row; i++) {
			z1 += i + "| ";
			for (int j = 1; j <= column; j++) {
				if (j*i < 10) {
					while (z < column) {
						z1 += " ";
						z++;
					}
					z = 1;
					z1 += j * i;
				}
				else {
					while (z < column - 1) {
						z1 += " ";
						z++;
					}
					z = 1;
					z1 += j*i; 
				}
			}
			z1 += "\n";
		}
		return s1 + "\n" + z1;
	}
}