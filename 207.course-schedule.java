import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

// @lc code=start
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] graph = new int[numCourses][numCourses];
        int[] inDegree = new int[numCourses];

        for(int[] pres:prerequisites){
            int ready = pres[0], pre = pres[1];
            if(graph[pre][ready]==0){
                inDegree[ready]++;
            }
            graph[pre][ready] = 1;
        }

        Queue<Integer> front = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(inDegree[i]==0) front.add(i);
        }

        int courseCount = 0;
        while(!front.isEmpty()){
            int course = front.poll();
            courseCount++;
            for(int i=0; i<numCourses; i++){
                if(graph[course][i]!=0){
                    if(--inDegree[i]==0){
                        front.offer(i);
                    }
                }
            }
        }
        return courseCount == numCourses;
    }
}
// @lc code=end

