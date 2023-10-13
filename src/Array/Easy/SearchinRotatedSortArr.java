public class SearchinRotatedSortArr {
    public static int search(int arr[], int n, int target){

        //Optimised Solution -> TC O(log n) SC O(1)
        int start = 0, end = n - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            //{4,5,6,7,0,1,2}; 0
            mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && arr[mid] >= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[end] >= target && arr[mid] <= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
        
        //Naive Solution -> TC O(n) SC O(1);
        // int n = arr.length;
        // for (int i = 0; i < n; i++) {
        //     if(arr[i] == target)
        //     return i;
        // }
        // return -1;

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int n = arr.length;
        int target = 0;

        System.out.println(search(arr,n,target));
    }
}
