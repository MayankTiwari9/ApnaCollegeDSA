
public class ReverseTheArray {
    public static void reverse(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,1,2};

        reverse(arr);
    }
}
