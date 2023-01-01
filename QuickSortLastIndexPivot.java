// quick sorting while selecting last index as pivot
public class QuickSortLastIndexPivot {
    public static int partition(int[]arr,int start, int end){
        int pivot = arr[end];
        int i = start-1;
        int temp;
        for (int j = start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
    public static void quickSorting(int[] arr, int start,int end){
        if(start<end){
            int pivotIndx = partition(arr,start,end);
            quickSorting(arr,start,pivotIndx-1);
            quickSorting(arr,pivotIndx+1,end);
        }

    }
    public static void main(String[] args){
        int[] arr = {6,3,7,8,9,1,2};
        int n = arr.length;

        quickSorting(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
