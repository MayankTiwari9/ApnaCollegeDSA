package Array.Medium;

// import java.util.*;

public class Three3Sum {
    public static int threeSum(int[] nums){
        //Using HashMap
        // int n = nums.length;
        // Arrays.sort(nums);
        
        // List<List<Integer>> ans = new ArrayList<>();
        
        // if(n < 3){
        //     return ans;
        // }
        
        // if(nums[0] > 0){
        //     return ans;
        // }
        
        // HashMap<Integer, Integer> map = new HashMap<>();
        
        // for(int i = 0; i < n; ++i){
        //     map.put(nums[i], i);
        // }
        
        // for(int i = 0; i < n-2 ; ++i){
        //     if(nums[i] > 0){
        //         break;
        //     }
            
        //     for(int j = i + 1; j < n - 1; ++j){
        //         int req = -1 * (nums[i] + nums[j]);
        //         if(map.containsKey(req) && map.get(req) > j){
        //             ans.add(Arrays.asList(nums[i], nums[j], req));
        //         }
        //         j = map.get(nums[j]);
        //     }
        //     i = map.get(nums[i]);
        // }
        // return ans;

        //Using Two Pointers Appproach
        // int n = nums.length;
        // Arrays.sort(nums);
        
        // List<List<Integer>> ans = new ArrayList<>();
        
        // if(n < 3){
        //     return ans;
        // }
        
        // for(int i = 0; i < n; ++i){
        //     if(nums[i] > 0)
        //         break;
            
        //     if(i > 0 && nums[i] == nums[i - 1])
        //         continue;
            
        //     int low = i + 1, high = n - 1;
            
        //     while(low < high){
        //         int sum = nums[i] + nums[low] +  nums[high];
                
        //         if(sum > 0)
        //             high--;
        //         else if(sum < 0)
        //             low++;
        //         else{
        //             ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
        //             int lowLastOcc = nums[low];
        //             int highLastOcc = nums[high];
                    
        //             while(low < high && nums[low] == lowLastOcc)
        //                 low++;
                    
        //             while(low < high && nums[high] == highLastOcc)
        //                 high--;
        //         }
        //     }
        // }
        // return ans;

        return 0;
    }
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(nums));
    }
}