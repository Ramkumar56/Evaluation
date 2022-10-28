import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        HashMap<String, Integer> map= new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                char[] ch = str.substring(i, j+1).toCharArray();
                Arrays.sort(ch);
                String val = new String(ch);
                if (map.containsKey(val))
                    map.put(val, map.get(val)+1);
                else
                    map.put(val, 1);
            }
        }
        System.out.println(map);
        int count = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            count += (n * (n-1))/2;
        }
        System.out.println(count);
    }
}
