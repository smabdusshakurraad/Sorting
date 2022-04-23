public class BubbleSorting {
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void bubble (int[] arr)  //bubble sorting
    {

        //for n elements of an array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //swap
                if (arr[j] > arr[j + 1]) {//checking 2 adjacency element for swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            //printArray(a);
        }
    }


    public static void main(String[] args){
        int[] arr= {7, 8, 3, 1, 2};

        bubble(arr);// calling insertion sort function

        printArray(arr);//printing the array
    }
}
