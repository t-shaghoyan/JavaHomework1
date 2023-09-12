import java.util.*;
public class vowelCounter{
        public static  void main(String[] args){


           

                                System.out.print("please enter the string: \n");

                                Scanner scan = new Scanner(System.in);
                                String str = scan.nextLine();
								String vowel = "aeiou";
                                str = str.toLowerCase();
								int count = 0;	
								

                                for(int i=0;i<str.length();i++){
                                          for(int j=0;j<vowel.length();j++){
											if(str.charAt(i)==vowel.charAt(j)){
												count++;
												}
											}
                                        }

                      
                                         System.out.println("the sentence has " + count + "vowels");
        }
}
