public class polindrom {
    public static void main(String[] args) {
	

		 String str = "A man, a plan, a canal: Panama";
                   /* 
                    String str1 = str.replaceAll("[^a-zA-Z0-9]","");
                    str1=str1.toLowerCase();
		System.out.println(str1);
			
				for(int i=0;i<str1.length()/2;i++){
					if(str1.charAt(i) != str1.charAt(str1.length()-1-i)){
	System.out.println("not polindrom");
	return;
					
						}
				}
	System.out.println("polindrom");
*/

	    String str1 = "";
                    str = str.toLowerCase();
                    
                    for(int i=0;i<str.length();i++){
                        if((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a' && str.charAt(i)<='z')){
                            str1+=str.charAt(i);
                        }
                    }
                    

             
			for(int i=0;i<str1.length();i++){
				if(str1.charAt(i) != str1.charAt(str1.length()-1-i)){
					System.out.println("the sentence is NOT polindrom");
					return;
				}
			}
			System.out.println("the sentence is polindrom");
	}
}
