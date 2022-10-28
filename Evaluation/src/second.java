import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< n;i++){
            arr[i]=scanner.nextInt();
        }
        List<Integer>ans=new ArrayList<>();
        ans.add(arr[n-1]);
        int rightMax=arr[n-1];
        int j=arr.length-1;
        for(int i=arr.length-1;i>0;i--) {
            if(arr[i]>arr[j] && rightMax<arr[i]){
                ans.add(arr[i]);
            }
            rightMax=Math.max(arr[i],rightMax);
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
