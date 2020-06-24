/*
 * @lc app=leetcode id=1455 lang=java
 *
 * [1455] Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */

// @lc code=start
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for(int i=0; i<words.length; i++){
            if(isPrefix(searchWord, words[i])){
                return i+1;
            }
        }
        return -1;
    }

    private boolean isPrefix(String prefix, String word){
        for(int i=1; i<=word.length(); i++){
            if(prefix.compareTo(word.substring(0,i))==0){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

