import java.util.*;

public class mergeTwoArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int i=0, j=0, k=0;

        while (i<m && j<n) {
            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        while (i<m) {
            temp[k++] = nums1[i++];
        }

        while (j<n) {
            temp[k++] = nums2[j++];
        }

        for (int x=0; x<m+n; x++) {
            nums1[x] = temp[x];
        }
    }

    public static void main(String[] args) {
        mergeTwoArrays obj = new mergeTwoArrays();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,4,5};
        
        obj.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
