public class Sorting {

    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void insertion (int[] a)  //insertion
    {

        //for n elements of an array
        for(int i=1; i<a.length;i++){
            int current = a[i];// selecting the first element from unsorted portion of the array
            int j = i-1;// selecting the last element from the sorted part of the array

            // until the first element of unsorted array placed
            // correctly inside the sorted part
            while(j>=0 && current< a[j]){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = current;
        }

        //printArray(a);
    }


    public static void main(String[] args){
        int arr[] = {7, 8, 3, 1, 2};

        insertion(arr);// calling insertion sort function

        printArray(arr);//printing the array
    }
}
