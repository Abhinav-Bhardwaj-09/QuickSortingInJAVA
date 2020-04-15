package Quick_Sort;

public class MyQuickSort {

    static public void QuickSort( int arr[] , int start , int end ){
        if( start < end ){
            int pivot = partition( arr , start , end );
            QuickSort(arr,start,(pivot-1));         //for left side of pivot
            QuickSort(arr,(pivot+1),end);           //for right side of pivot
        }
    }




    static public int partition( int arr [], int P , int Q ){
        int pivot = Q;
        int i = P-1;
        for (int j = P ; j <= Q ; j++ ) {
            if(arr[j] <= arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }



    static public void display( int arr[] ){
        System.out.print("Array after sorting :  ");
        for ( int i = 0 ; i < arr.length ; i++ ){
            if (i != (arr.length-1)){
                System.out.print(arr[i] + " , ");
            }
            else
                System.out.print(arr[i]);
        }
    }



}