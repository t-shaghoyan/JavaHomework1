public class stringCheck {
    public static void main(String[] args) {

			String sentence="my name is Hello World";
			String word="hello";
			sentence = sentence.toLowerCase();
			word = word.toLowerCase();
			String[] arr = sentence.split(" ");
			

			for(int j=0;j<arr.length;j++){
                if(arr[j].length() >= word.length()){
                   if(arr[j].equals(word)){
                       System.out.println("contains");
                       return;
                   }
                }
            }
            System.out.println("the word NOT contains");

		}
	}
