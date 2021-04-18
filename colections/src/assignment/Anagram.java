package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();
			String s2 =  sc.nextLine();
			
			if(s1.length() == s2.length()) {
				char[] str1 = s1.toCharArray();
				char[] str2 = s2.toCharArray();
				
				Arrays.sort(str1);
				Arrays.sort(str2);
				
				
				if(Arrays.equals(str1, str2) == true) {
					System.out.println("anagrams");
				}
				else {
					System.out.println("not anagrams");
				}
				
			}
				
}
}
