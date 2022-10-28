import java.util.Arrays;
import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n=scanner.nextInt();
        System.out.println("Enter the size of second array");
        int m=scanner.nextInt();
        int[] a=new int[n];
        int[] b=new int [m];
        System.out.println("Enter the elements of first array");
        for(int i=0;i< n;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("Enter the elements of second array ");
        for(int i=0;i<m;i++){
            b[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        for(int i=0;i< a.length;i++){
          if(a[i]==b[i]){
              count++;
          }
        }
        if(count==n){
            System.out.println("Equal");
        }
        else
            System.out.println("Not Equal");
    }
}
