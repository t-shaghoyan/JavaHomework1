

public class sortString1 {
    public static void main(String[] args) {
         String str1="hello";
       String str2="lehlo";
      StringBuilder sb1 = new StringBuilder(str1);
      StringBuilder sb2 = new StringBuilder(str2);
       
       if(sb1.length() != sb2.length()){
             System.out.println("false");
                return;
       }else{
        for(int i=0;i<sb1.length()-1;i++){
           int j=i;
           char tmp=sb1.charAt(i);
           char tmp1=sb2.charAt(j);
           if(sb1.charAt(i)>sb1.charAt(i+1)){
               tmp = sb1.charAt(i+1);
               sb1.setCharAt(i+1,sb1.charAt(i));
               sb1.setCharAt(i,tmp);
               i--;
           }
           if(sb2.charAt(j)>sb2.charAt(j+1)){
               tmp1 = sb2.charAt(j+1);
               sb2.setCharAt(j+1,sb2.charAt(j));
               sb2.setCharAt(j,tmp1);
               j--;
           }
       }
    }
       
   
       
       for(int i=0;i<sb1.length();i++){
           if(sb1.charAt(i)!=sb2.charAt(i)){
                System.out.println("false");
                return;
           }
       }
       System.out.println("true");     
       
       
    }
}
