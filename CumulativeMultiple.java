import java.util.*;
public class CumulativeMultiple {
    public static void main(String[] args){
      int cumulativeProduct;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of the  array");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Enter elements of the array");
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int[] temp=new int[n];
      temp[0]=arr[0];
      for(int i=1;i<arr.length;i++){
        try{
            cumulativeProduct=1;
            for(int j=i;j>=0;j--){
              cumulativeProduct=cumulativeProduct*arr[j];
           }
         temp[i]=cumulativeProduct;
        }catch(ArithmeticException e){
        //handle when multiply by zero(division by zero error occured)
        System.out.println("Diviosion bybzero error occured setting values to 0");
        for(int j=1;j<arr.length;j++){
          arr[j]=0;

        }
        break;
      }catch(Exception e){
        //handle other exceptions
        System.out.println("AN Exception Occured");
        for(int j=0;j<arr.length;j++){
          arr[j]=0;
        }
        break;
      }
    }
       for(int i=0;i<arr.length;i++){
        arr[i]=temp[i];
        System.out.print(arr[i]+" ");
      }
 }
}
