import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int i, j, k;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }
        for (j = 0; j < arr1.size(); j++) {
            arr1.set(j, arr1.get(j) * arr1.get(j));
        }
        Collections.reverse(arr1);
        for (k = 0; k < arr2.size(); k++) {
            arr2.set(k, arr2.get(k) * arr2.get(k));
        }
        j = 0;
        k = 0;
        while (j < arr1.size() && k < arr2.size()) {
            if (arr1.get(j) <= arr2.get(k)) {
                res.add(arr1.get(j));
                j++;
            } else {
                res.add(arr2.get(k));
                k++;
            }
        }
        while (k < arr2.size()) {
            res.add(arr2.get(k));
            k++;
        }
        while (j < arr1.size()) {
            res.add(arr1.get(j));
            j++;
        }
        int[] ans = new int[res.size()];
        for (i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}