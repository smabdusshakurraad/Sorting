public class InsertionSorting{

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void insertion (int[] arr)  //insertion
    {

        //for n elements of an array
        for (int i = 0; i < arr.length; i++) {
            int j = i-1;
            int current = arr[i];// selecting the first value from unsorted part of the array
            while(j>=0 && current<arr[j])//Searching for the lowest value of the sorted portio
            {
                arr[j+1] = arr[j]; //swapping
                j--;
            }
            arr[j+1] = current; //storing current element in the sorted part of the array
        }

        //printArray(a);
    }


    public static void main(String[] args){
        int[] arr= {7, 8, 3, 1, 2};

        insertion(arr);// calling insertion sort function

        printArray(arr);//printing the array
    }
}

