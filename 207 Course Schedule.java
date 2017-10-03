package leetcode;
import java.util.*;
public class Solution {
	public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || numCourses == 1) return true;
        int[] degree = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
        	graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
        	degree[prerequisites[i][0]] += 1;
        	graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++) {
        	if (degree[i] == 0) q.add(i);
        }
        while (!q.isEmpty()) {
        	int c = q.poll();
        	List<Integer> succ = graph.get(c);
        	for (int i = 0; i < succ.size(); i++) {
        		degree[succ.get(i)] -= 1;
        		if (degree[succ.get(i)] == 0) q.add(succ.get(i));
        	}
        }
        for (int i = 0; i < numCourses; i++) {
        	if (degree[i] != 0) return false;
        }
        return true;
    }
	public static void main(String[] args) {
		int numCourses = 4;
		int[][] prerequisites = {{1,0},{2,0},{1,2},{3,2}};
		System.out.println(canFinish(numCourses, prerequisites));
	}
}
