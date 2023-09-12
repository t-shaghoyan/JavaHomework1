import java.util.*;
public class pangram{
	public static  void main(String[] args){
			
		
			int result = 0;
			
				System.out.print("please enter the string: \n");
			
				Scanner scan = new Scanner(System.in);
				
				String str = scan.nextLine();;	
		
			for(int i=0;i<26;i++){
					int value= 'a'+i;
					result += value;
				}
		
			int result1=0;
				str = str.toLowerCase();
		
				for(int j=0;j<str.length();j++){
						int value1=str.charAt(j);
						result1+=value1;
					}
		
			if(result<=result1){
				 System.out.println("the sentence is pangram");
				}else{
					 System.out.println("the sentence is NOT pangram");}
	}
}
