import java.util.HashMap;
import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int k=scanner.nextInt();
        for(int i=0;i< n;i++){
            arr[i]=scanner.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=1;
        for(int i=0;i< arr.length;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i], map.get(arr[i])+1);
               if(map.get(arr[i])==k){
                   System.out.println(arr[i]);
                   break;
               }
           }
           else
               map.put(arr[i],count);
        }
    }
}
