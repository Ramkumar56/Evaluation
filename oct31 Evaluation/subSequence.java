import java.util.*;

public class subSequence {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String str = "XAXAXB";  //XYBYAXBY
        String s = "";
        subsequences(str, s);
        HashMap<String, Integer> map = new HashMap<>();
        int count=0;
        HashSet<String>set=new HashSet<>();
        for(int i=0;i< list.size();i++){
            int n=list.get(i).length();
            int m=list.get(i).length()/2;
            String s1="";
            String s2="";
            if(m%2==0) {
                s1 = list.get(i).substring(0, m);
                s2 = list.get(i).substring(m, n);
            }
            else {
                s1 = list.get(i).substring(0, m+1);
                s2 = list.get(i).substring(m, n);
            }
            if(s1.equals(s2)){
                set.add(s1);
            }
        }
        System.out.println(set.size());
    }

        public static void subsequences (String str, String s){
            {
                if (str.length() == 0) {
                    if(s.length()>2)
                    list.add(s);
                    return;
                }
                subsequences(str.substring(1), s + str.charAt(0));
                subsequences(str.substring(1), s);
            }
        }
    }

