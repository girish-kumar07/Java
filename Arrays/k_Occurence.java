public class k_Occurence{
    public static int kOcc(int arr[], int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {9,7,16,16,4};
        System.out.print("Index of first occirence "+ kOcc(arr, 16));
    }
}