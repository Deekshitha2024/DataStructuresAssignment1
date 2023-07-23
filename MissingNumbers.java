import java.util.*;
import java.util.Arrays;
public class MissingNumbers {
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
      int c=0;
      for(int i=arr[0];i<arr[n-1]+1;i++){
        if(arr[c]==i){
          c++; 
        }
        else{
              System.out.print(i+" ");
        }
      }
 
    }
    
}
