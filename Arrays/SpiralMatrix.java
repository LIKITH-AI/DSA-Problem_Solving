import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;

        List<Integer> ans = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // 1. Traverse right
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;

            // 2. Traverse down
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;

            // 3. Traverse left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }

            // 4. Traverse up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}