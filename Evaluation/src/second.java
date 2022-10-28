import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< n;i++){
            arr[i]=scanner.nextInt();
        }
        int j=0;
        for(int i=1;i<arr.length;i++) {
            if(arr[j]<arr[i] ||i== arr.length-1){
                System.out.print(arr[i]+" ");
            }
            j=i;
        }
    }
}
