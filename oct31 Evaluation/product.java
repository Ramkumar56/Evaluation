import java.util.Arrays;
import java.util.HashMap;

public class product {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] ans=new int[arr.length];
        int product=1;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(i!=j)
                    product =product*arr[j];
            }
            ans[i]=product;
            product=1;
        }
        System.out.println(Arrays.toString(ans));
    }
}
