public class Q4 {
    public static void main(String args[]){
         int arr[] = {2, 4, 5, 6, 7, 8};
         int sum = 0;
         int multi = 1;
         for (int i=1; i<=arr.length; i++){
             if(i % 2==0){
                 sum = sum + arr[i];
             }
             else if(i % 2!= 0){
                   multi= multi * arr[i];
             }
         }
         System.out.println("SUM of Multiple" + sum);
        System.out.println("SUM of Multiple" + multi);

    }
}
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
// 	at Q4.main(Q4.java:8)
