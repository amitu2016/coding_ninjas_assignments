 package backtracking;

public class RatInAMaze {
	
	public static boolean ratInAMaze(int maze[][]) {
		int n = maze.length;
		
		int path[][] = new int[n][n];
		
		return solveMaze(maze, 0, 0, path);
		
	}

	private static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
		
		int n = maze.length;
		
		//check if i, j cell is valid or not
		if (i < 0 || i  >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}
		
		//Include the cell in current path
		path[i][j] = 1;
		
		//If we reach the destination cell
		if(i == n -1 && j == n -1) {
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) {
					System.out.print(path[r][c]);
				}
				System.out.println();
			}
			return true;
		}
		
		//Explore in all directions
		boolean pathPossible = false;
		//TOP
		if(solveMaze(maze, i - 1, j, path)) {
			pathPossible = true;
		}
		
		//RIGHT
		if(solveMaze(maze, i, j + 1, path)) {
			pathPossible = true;
		}
		
		//DOWN
		if (solveMaze(maze, i + 1, j, path)) {
			pathPossible = true;
		}
		
		//LEFT
		if (solveMaze(maze, i, j - 1, path)) {
			pathPossible = true;
		}
		
		return pathPossible;
	}

	public static void main(String[] args) {
		int maze[][] = {{1,1,0},{1,1,0},{1,1,1}};
		boolean pathPossible = ratInAMaze(maze);
		System.out.println(pathPossible);
	}

}
