import java.util.*;

public class UnstableSortExample {

    public static void main(String args[]) {

        int arr[] = {4,4,3};

        for(int i=0;i<arr.length-1;i++){

            int min=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min=j;
            }

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}