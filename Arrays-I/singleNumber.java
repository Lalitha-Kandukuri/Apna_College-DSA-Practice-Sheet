import java.util.*;

public class singleNumber {

    public int single(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        singleNumber obj = new singleNumber();

        int[] nums = {4,1,2,2,1};

        int res = obj.single(nums);
        System.out.println(res);
    }
}
