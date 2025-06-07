import java.util.*;
public class repetstr {
    public static boolean map[]= new boolean[26];
    public static void removeduplicate(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println("removed string without any duplication is : "+newString);
            return;
        }

        char currentchar=str.charAt(idx);
        if(map[currentchar-'a']==true){
            //already presentr
            removeduplicate(str, idx+1, newString);
        }else{
            newString+=currentchar;
            map[currentchar-'a']=true;
            removeduplicate(str, idx+1, newString);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        
        String str = sc.nextLine();
       removeduplicate(str, 0, "");
    }
}