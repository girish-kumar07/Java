public class lastOccurence_1{
    public static int lastOccur(int arr[]){
        for(int i=arr.length-1; i>=0;i--){
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int  arr[] = {0,1,0,0,0,0,1,0,1,0,1,0,1,0,1,1,1,0,0};
        System.out.print("Last occurence of 1 is "+lastOccur(arr));
    }
}