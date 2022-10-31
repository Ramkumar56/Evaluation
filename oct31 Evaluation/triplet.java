import java.util.*;

public class triplet {
    public static void main(String[] args) {
     int[] arr={-1,-1,-1,2,-1};
        Set<List<Integer>>set=new HashSet<>();
        List<Integer>a=new ArrayList<>();
        Arrays.sort(arr);
     int i=0;
         int j=i+1;
            int k=j+1;
            while (i<arr.length && j< arr.length && k< arr.length){
                 if (arr[i] + arr[j] + arr[k] == 0) {
                     a.add(arr[i]);
                     a.add(arr[j]);
                     a.add(arr[k]);
                     set.add(a);
                 }
                 a=new ArrayList<>();
                 i++;
                 j++;
                 k++;
     }
        System.out.println(set);
    }
}

