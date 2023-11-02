class Main1 {
    static int binarySearch(int arr[], int key) {
        int l = 0;
        int h = arr.length - 1;
        int mid = 0;
        while (l <= h) {
            mid = (l + h) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                h = mid - 1;
                l = l;

            } else {12  
                l = l + 1;
                h = h;
            }
        }

        return -1;
    }
}

public class Binary {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 12, 15, 16, 18, 21 };
        int key = 18;
        System.out.println(Main1.binarySearch(arr, key));

    }
}
