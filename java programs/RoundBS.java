public class RoundBS {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int target = 8;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(search(arr, target, start, end));
    }

    static int search(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return search(arr, target, start, end = mid - 1);
            } else {
                return search(arr, target, start = mid + 1, end);
            }
        }
            if (target > arr[mid] && target <= arr[end]) {
                return search(arr, target, start = mid + 1, end);
            }
            return search(arr, target, start, end = mid - 1);
        }
    }


