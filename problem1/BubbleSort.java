package problem1;
import java.util.Scanner;

class BubbleSortEx{
        void bubbleSort(int arr[]){
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        // swap temp and arr[i]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }
 
        /* Prints the array */
        void Display(int arr[]){
            
            for (int i=0; i<arr.length; ++i){
                System.out.print(arr[i] +"\t");
            }
           
        }
        


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        BubbleSortEx bubbleobj = new BubbleSortEx();

        System.out.println("Enter the number of elements in array");
        
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at index:"+i);

            arr[i]=sc.nextInt();
        }
        sc.close();
        bubbleobj.bubbleSort(arr);
        System.out.println("Sorted array in ascending order:\n");
        bubbleobj.Display(arr);
    }
}