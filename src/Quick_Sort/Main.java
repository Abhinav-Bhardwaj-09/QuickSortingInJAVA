package Quick_Sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("No. of elements in the array  :  ");
        int n = obj.nextInt();

        int [] arr = new int [n];

        System.out.print("Enter space seperated elements of array  :  ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = obj.nextInt();
        }


        System.out.println();
        System.out.println();


        System.out.print("Array before sorting  :  ");
        for(int i = 0 ; i< n ; i++){
            if(i!=(n-1)){
                System.out.print( arr[i] + " , " );
            }
            else
                System.out.print(arr[i]);
        }


        System.out.println();
        System.out.println();


        MyQuickSort.QuickSort( arr , 0,(arr.length-1));
        MyQuickSort.display(arr);


        System.out.println();
        System.out.println();
    }
}