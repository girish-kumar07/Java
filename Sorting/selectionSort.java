public class selectionSort{

    public static void SelectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPosition = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPosition] > arr[j]){
                    minPosition = j;
                }
            }
            // Swap
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
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
        SelectionSort(arr);
        PrintArray(arr);
    }
}