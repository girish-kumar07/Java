public class insertionSort{

    public static void InsertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int previous = i-1;
            // Finding out the correct position
            while(previous>= 0 && arr[previous]>current){
                arr[previous+1] = arr[previous];
                previous-- ; 
            }

            // Insertion
            arr[previous+1] = current;
        }
    }

    public static void PrintArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        InsertionSort(arr);
        PrintArray(arr);
    }
}