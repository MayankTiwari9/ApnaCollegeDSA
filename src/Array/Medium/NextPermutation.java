package Array.Medium;

public class NextPermutation {
    public static void permutation(int[] nums){
        int idx = -1;
        int idx2 = -1;

        for (int i = nums.length-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            reverse(nums, 0);
        }
        else{
            for (int i = nums.length-1; i >= 0; i--) {
                if(nums[i] > nums[idx]){
                    idx2 = i;
                    break;
                }
            }

            swap(nums, idx, idx2);

            reverse(nums, idx+1);
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length-1;

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;    
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 5};

        permutation(nums);
    }
}
