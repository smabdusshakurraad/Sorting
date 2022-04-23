public class SelectionSort {

    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void selection (int[] arr)  //selection
    {

        //for n elements of an array
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;// selecting the first value as smallest

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j; //switching the index of smallest element
                }
            }
            int temp = arr[smallest]; //swappig the smallest element
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        //printArray(a);
    }


    public static void main(String[] args){
        int arr[] = {7, 8, 3, 1, 2};

        selection(arr);// calling selectio sort function

        printArray(arr);//printing the array
    }
}
