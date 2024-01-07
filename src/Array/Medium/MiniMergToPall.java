package Array.Medium;
public class MiniMergToPall {
    public static int miniOps(int[] arr){
        int ans = 0;

        for(int i = 0, j = arr.length - 1; i <= j;){
            if(arr[i] == arr[j]){
                i++;
                j--;
            }
            else if(arr[i] > arr[j]){
                j--;
                arr[j] += arr[j+1];
                ans++;
            }
            else{
                i++;
                arr[i] += arr[i-1];
                ans++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {11, 14, 15, 99};
        System.out.println(miniOps(arr));
    }
}
