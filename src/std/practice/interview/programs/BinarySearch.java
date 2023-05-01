package std.practice.interview.programs;

import java.util.Arrays;

public class BinarySearch {

    static boolean numberExists(final int[] arr, final int left, final int right, final int num) {

        if(right >= left) {
            final int mid = left + (right - left) / 2;

            if(arr[mid] == num)
                return true;

            if(arr[mid] > num)
                return numberExists(arr, left, mid - 1, num);

            return numberExists(arr, mid + 1, right, num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {23,56, 67, 45, 34, 89, 13, 16, 37, 90};

        arr = Arrays.stream(arr).sorted().toArray();
//        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        final int left = 0;
        final int right = arr.length;

        System.out.println(numberExists(arr, left, right - 1, 90));
    }
}
