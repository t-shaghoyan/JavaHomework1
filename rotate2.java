public class rotate2 {
    
    static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print("[");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.print("]");
            System.out.println();
        }
    
    }
        static int[][] reverse(int[][] arr){
             for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length/2;j++){
                int tmp=arr[j][i];
                arr[j][i]=arr[arr.length-1-j][i];
                arr[arr.length-1-j][i]=tmp;
            }
        }
        return arr;
        }
        static int[][] swap(int[][] arr){
              for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
              int tmp=arr[j][i];
              arr[j][i]=arr[i][j];
              arr[i][j]=tmp;
            }
        }
        return arr;
        }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        print(arr);
        System.out.println();
        reverse(arr);
        print(arr);
        System.out.println();
        swap(arr);
        print(arr);
 
    }
}






