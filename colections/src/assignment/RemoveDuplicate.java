package assignment;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str ="himani";
		String str2="";
		for(int i=0;i<str.length();i++) {
			boolean flag =false;
			for(int j=0;j<str2.length();j++)
			{
				 
				if(str.charAt(i) == str2.charAt(j))
				{
					flag = true;
					break;
				}
			}
			
    
				
				if(flag == false)
				{
					str2 = str2.concat(String.valueOf(str.charAt(i)));
				}
			
			}
			System.out.println(str2);
		
		
	}

}
