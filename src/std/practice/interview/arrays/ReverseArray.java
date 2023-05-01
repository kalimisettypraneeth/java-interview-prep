package std.practice.interview.arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("The reversed array is");
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            //swapping ith and jth index elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        //displaying the array
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
