package leetcode;
public class Solution {
	public static int numIslands(char[][] grid) {
        int row = grid.length;
        if (row == 0) return 0;
        int col = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < row; i++) {
        	for (int j = 0; j < col; j++) {
        		if (grid[i][j] == '1') {
        			cnt++;
        			dfs(grid, row, col, i, j - 1);
        			dfs(grid, row, col, i, j + 1);
        			dfs(grid, row, col, i - 1, j);
        			dfs(grid, row, col, i + 1, j);
        		}
        	} 
        }
        return cnt;
    }
	public static void dfs(char[][] grid, int row, int col, int x, int y) {
		if (x < 0 || x == row || y < 0 || y == col || grid[x][y] == '0') return;
		grid[x][y] = '0';
		dfs(grid, row, col, x, y - 1);
		dfs(grid, row, col, x, y + 1);
		dfs(grid, row, col, x - 1, y);
		dfs(grid, row, col, x + 1, y);
	}
	public static void main(String[] args) {
		char[][] grid = {
				{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'}
		};
		char[][] grid2 = {
				{'1','1','1'},
				{'0','1','0'},
				{'1','1','1'}
		};
		System.out.println(numIslands(grid2));
	}
}
