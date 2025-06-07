import java.util.*;
public class movex {
    public static void moveallx(String str, int idx, int count, String newStr) {
        if(idx == str.length()) {
            // Add all 'x' characters at the end
            for(int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println("all the x at last: "+newStr);
            return;
        }
        char ch = str.charAt(idx);
        if(ch == 'x'){
            count++;
        } else {
            newStr += ch;
        }

        moveallx(str, idx + 1, count, newStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        
        String str = sc.nextLine();
        moveallx(str, 0, 0, "");
    }
}