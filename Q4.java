public class Q4 {
    public static void main(String args[]){
         int arr[] = {2, 4, 5, 6, 7, 8};
         int sum = 0;
         int multi = 0;
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
