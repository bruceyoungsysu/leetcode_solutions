import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=1286 lang=java
 *
 * [1286] Iterator for Combination
 */

// @lc code=start
class CombinationIterator {
    private PriorityQueue<String> pq = new PriorityQueue<>();
    public CombinationIterator(String characters, int combinationLength) {
        // get all permutations and then sort
        //? how to generate permutation in Java?
        generateSub(characters, combinationLength, 0, new StringBuilder());
        
    }

    private void generateSub(String str, int len, int start, StringBuilder sb){
        if(len==0){
            pq.add(sb.toString());
            return;
        }
        for(int i=start; i<str.length(); i++){
            sb.append(str.charAt(i));
            generateSub(str, len-1, i+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
    
    public String next() {
        return pq.poll();
        
    }
    
    public boolean hasNext() {
        return !pq.isEmpty();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

