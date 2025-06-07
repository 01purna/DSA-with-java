public class soccur {
    public static int first= -1;
    public static int last = -1;
    public static void findOccurance(String str, int idx, char element){
        if(str.length( )== idx){
            System.out.println("first occurance "+ first);
            System.out.println("lasr occurance "+ last);
            return;

        }

        
        char  currentchar = str.charAt(idx);
        if(currentchar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
;           }
        }
        findOccurance(str, idx+1, element);

    }
    public static void main(String[] args) {
        String str = "abcaderaf";
        char element = 'a';
        findOccurance(str, 0, element);

        
    }
    
}
