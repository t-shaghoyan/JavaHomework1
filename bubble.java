public class bubble {
    public static void main(String[] args) {

			int[] arr={1,6,7,5,4,9,3};
			/*bubble sort	
			for(int i=0;i<arr.length;i++){
					for(int j=0;j<arr.length-1;j++){
							
							
					if(arr[j]>arr[j+1]){
						int tmp = arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=tmp;
							}
						}	
				}

			for(int i=0;i<arr.length;i++){
					System.out.print(arr[i]+",");
				}
		*/
			// unknown sort
			for(int i=0;i<arr.length-1;i++){
					int swap = arr[i];
					if(arr[i]>arr[i+1]){
					swap=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=swap;
					i=-1;
					}
				}
				
				for(int i=0;i<arr.length;i++){
					System.out.print(arr[i]+",");
				}
		}
	}
