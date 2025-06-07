import java.util.*;
import java.util.HashSet;
public class subsequences {
    public static void subseq(String str, int idx, String newStr, HashSet<String> set) {
        // Base case
        if(idx == str.length()) {
            if(set.contains(newStr)) {
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char ch = str.charAt(idx);
        subseq(str, idx+1, newStr+ch, set);//to be included
        subseq(str, idx+1, newStr, set);//not to be included
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        subseq(str, 0, "",set);
    }
}