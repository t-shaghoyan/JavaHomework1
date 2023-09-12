public class rotate {
    public static void main(String[] args) {
                 
			int[][] arr = new int[4][4];
            int[][] arr1 = new int[4][4];
                
            int count=0;
                      
					 for(int i = 0;i < arr.length; i++) {

                            for(int j = 0;j < arr[i].length; j++) {
                                        arr[i][j] =++count;
                                        }
                                }
                              
                                
                                
                        for(int k=0;k<arr1.length;k++){
                                    
                              for(int i=0;i<arr.length;i++){
                                    arr1[k][i]=arr[arr.length-1-i][k];
                                		}
                                }
       
                               
                        for (int i = 0; i < arr1.length; i++) {
                        
								for (int j = 0; j < arr1[i].length; j++) {
                                	 System.out.print(arr1[i][j] + " ");
                                    }
            System.out.println();
            
        				} 
        				System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("[");
                        for (int j = 0; j < arr1[i].length; j++) {
                                 System.out.print(arr1[i][j] + ", ");
                                    }
                                    System.out.print("]");
                                    System.out.print(",");
                                    
            
            
        }
        System.out.print("]");

        }
}
