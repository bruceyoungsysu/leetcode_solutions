import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=1239 lang=java
 *
 * [1239] Maximum Length of a Concatenated String with Unique Characters
 */

// @lc code=start
class Solution {
    private int res = 0;

    public int maxLength(final List<String> arr) {
        if (arr == null || arr.size() == 0) {
            return 0;
        }

        dfs(arr, "", 0);
        return res;
    }

    private void dfs(List<String> arr, String path, int index) {
        boolean isUnique = isUnique(path);
        if (isUnique) {
            res = Math.max(res, path.length());
        }
        if (index == arr.size() || !isUnique) {
            return;
        }
        for (int i = index; i < arr.size(); i++) {
            dfs(arr, path + arr.get(i), i + 1); // trying every later coming arr[i]
        }
    }

    private boolean isUnique(String path) {
        Set<Character> seen = new HashSet<Character>();
        for (char c : path.toCharArray()) {
            if (seen.contains(c))
                return false;
            seen.add(c);
        }
        return true;
    }
}
// @lc code=end
