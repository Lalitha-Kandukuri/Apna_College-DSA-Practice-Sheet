import java.util.Arrays;

public class findMissingAndRepeatedValues {
    public int[] sol(int[][] grid) {
        int n = grid.length;
        int total = n*n;
        boolean[] seen = new boolean[total+1];
        int repeat = -1;
        int miss = -1;

        // Repeat
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                int val = grid[i][j];
                if (seen[val]) {
                    repeat = val;
                } else {
                    seen[val] = true;
                }
            }
        }

        // Miss
        for (int num=1; num<=total; num++) {
            if (!seen[num]) {
                miss = num;
                break;
            }
        }

        return new int[]{repeat, miss};
    }
    public static void main(String args[]) {
        findMissingAndRepeatedValues obj = new findMissingAndRepeatedValues();
        int[][] grid = {{9,1,7}, {8,9,2}, {3,4,6}};
        int[] res = obj.sol(grid);
        System.out.println(Arrays.toString(res));
    }
}
