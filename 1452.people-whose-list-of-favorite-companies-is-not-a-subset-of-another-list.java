import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=1452 lang=java
 *
 * [1452] People Whose List of Favorite Companies Is Not a Subset of Another List
 */

// @lc code=start
class Solution {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        int n = favoriteCompanies.size();
        for(int i=0; i<n; i++){
            Collections.sort(favoriteCompanies.get(i));
        }
        List<Integer> res = new ArrayList<>();
        boolean[] isSubset = new boolean[n];
        Arrays.fill(isSubset,false);
        for(int i=0; i<n-1; i++){
            
            if(isSubset[i]) continue;
            for(int j=i+1; j<n;j++){
                List<String> favori = favoriteCompanies.get(i);
                List<String> favorj = favoriteCompanies.get(j);
                if(isSubset(favori, favorj)){
                    if(favori.size()<favorj.size()){
                        isSubset[i] = true;
                        break;
                    }
                    else if(favori.size()>favorj.size()){
                        isSubset[j] = true;
                    }
                    else{
                        isSubset[i] = true;
                        isSubset[j] = true;
                        break;
                    }
                }
                // System.out.print(i+" ");
                // System.out.print(j+" ");
                // System.out.print(isSubset[i]);
                // System.out.print(isSubset[j]);
                // System.out.println(isSubset(favori, favorj));
                // System.out.print(isSubset[0]);
            }
        }
        for(int idx=0; idx<n;idx++){
            if(!isSubset[idx]) res.add(idx);
            // System.out.println(isSubset[idx]);
        }
        return res;
    }
    public boolean isSubset(List<String> set1, List<String> set2){
        if(set1.size()<set2.size()){
            List<String> tmp = set2;
            set2 = set1;
            set1 = tmp;
        }
        int i1=0, i2=0;
        while(i1<set1.size() && i2<set2.size()){
            if(set1.get(i1).compareTo(set2.get(i2))==0){
                i2++;
            }
            i1++;
        }
        if(i2==set2.size()) return true;
        return false;
    }
}
// @lc code=end

