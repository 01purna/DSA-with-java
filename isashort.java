public class isashort {
    public static boolean IsShorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            //good to go
            return IsShorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,4,5,6};
        System.out.println(IsShorted(arr, 0));
    }
}
