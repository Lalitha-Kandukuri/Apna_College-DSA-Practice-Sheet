public class majorityElement {
    public static void main (String args[]) {
        majorityElement obj = new majorityElement();
        int nums[] = {3,2,3};
        int res = obj.majority(nums);
        System.out.println(res);
    }

    public int majority(int nums[]) {
        int ele;
        int freq = 1;
        ele = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (freq == 0) {
                ele = nums[i];
                freq++;
            } else if (ele == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        return ele;
    }
}