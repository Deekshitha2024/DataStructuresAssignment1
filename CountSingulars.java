import java.util.Arrays;
import java.util.Scanner;
public class CountSingulars { 
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of the  array");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Enter elements of the array");
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
       Arrays.sort(arr);

        int singularCount = 0;
        int currentSockId = arr[0];
        // Start with the first sock ID in the sorted array
        int currentCount = 1;

        // Traverse through the sorted array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentSockId) {
                currentCount++; // Increment the count for the current sock ID
            } else {
                // Check if there is a pair or a singular sock for the previous sock ID
                if (currentCount % 2 == 1) {
                    singularCount++;
                }
                // Update the current sock ID and reset the count for the new sock ID
                currentSockId = arr[i];
                currentCount = 1;
            }
        }

        // Check the last sock ID in the array
        if (currentCount % 2 == 1) {
            singularCount++;
        }
        System.out.println("Singular Count is "+singularCount);
 
    
    }
}
    

