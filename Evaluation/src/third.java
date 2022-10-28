import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< n;i++){
            arr[i]=scanner.nextInt();
        }
        int negativeSum=0, Index=0, positiveSum=0, count=0;
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<n; i++) {
            if(arr[i]<=0) {
                Index=i;
                negativeSum-=arr[i];
                answer.add(arr[i]);
            }
        }
        for(int i=Index+1; i<n; i++) {
            positiveSum+=arr[i];
            if(positiveSum<negativeSum) {
                answer.add(arr[i]);
            }
            else if(positiveSum==negativeSum) {
                count++;
                answer.add(arr[i]);
                break;
            }
        }
        if (count == 1) {
            System.out.println(answer.size());
        } else
            System.out.println("false");
        System.out.println(answer);
    }
}
