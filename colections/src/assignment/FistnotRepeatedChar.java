package assignment;

public class FistnotRepeatedChar {
	
		public static void main(String[] args) {
			// to print a first non repeating character of a string
			// input : himani output : h
			String input = "himani";
			for (int i=0; i< input.length();i++) {
				boolean nonRepeated = true;
				
			for ( int j=0;j<input.length();j++) {
				if(i != j && input.charAt(i)== input.charAt(j)) {
					nonRepeated = false;
					break;
				}
			}
			if(nonRepeated==true ) {
				System.out.println(" Non repeated first character is : " + input.charAt(i));
				break;
			}
			}
		}
		

}
