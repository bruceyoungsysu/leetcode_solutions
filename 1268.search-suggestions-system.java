import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/*
 * @lc app=leetcode id=1268 lang=java
 *
 * [1268] Search Suggestions System
 */

// @lc code=start

class Solution {
    class Trie{
        Trie[] sub = new Trie[26];
        LinkedList<String> suggestions = new LinkedList<String>();
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products); // sort first
        Trie root = new Trie();
        for(String p: products){
            Trie t = root;
            for(char c: p.toCharArray()){
                if(t.sub[c-'a'] == null){
                    t.sub[c-'a'] = new Trie();
                }
                t = t.sub[c-'a'];
                if(t.suggestions.size()<3){
                    t.suggestions.offer(p);}
                
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(char c: searchWord.toCharArray()){
            if(root != null){
                root = root.sub[c-'a'];
            }
            res.add(root == null? Arrays.asList():root.suggestions);
        }
        return res;
    }
}

// @lc code=end

