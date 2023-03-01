public class Q4 {

   public static void calC_row(int[][] arr){
       System.out.println("RowWise Sum is :-") ;

       for(int i = 0 ; i < arr.length ; i++){
           int sum = 0 ;
           for(int j = 0 ; j < arr[0].length ; j++){
               sum += arr[i][j] ;
           }
           System.out.println("Sum Of Row " + i +"is " +sum) ;
       }

       System.out.println("ColWise Sum is :-") ;
       for(int i = 0 ; i < arr[0].length ; i++){
           int sum = 0 ;
           for(int j = 0 ; j < arr.length ; j++){
               sum += arr[j][i] ;
           }
           System.out.println("Sum Of col " + i +"is " +sum) ;
       }


   }

    public static void main(String[] args) {
        int [][] arr = new int[][]{ {1,2} , {3,4} , {5,6} } ;

        calC_row(arr);

    }
}
