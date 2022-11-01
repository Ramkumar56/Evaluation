import java.util.*;

public class triplet {
    public static void main(String[] args) {
     int[] arr={-1,-1,-1,2,0,-1,1};
        Set<List<Integer>>set=new HashSet<>();
        List<Integer>a=new ArrayList<>();
        Arrays.sort(arr);
           for(int i=0;i< arr.length;i++) {
               for (int j = i + 1; j < arr.length; j++) {
                   for (int k =j+1; k < arr.length; k++) {
                       if (arr[i] + arr[j] + arr[k] == 0) {
                           a.add(arr[i]);
                           a.add(arr[j]);
                           a.add(arr[k]);
                           set.add(a);
                       }
                       a = new ArrayList<>();
                   }
               }
           }
        System.out.println(set);
    }
}

