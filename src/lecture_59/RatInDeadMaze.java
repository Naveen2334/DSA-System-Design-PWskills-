package lecture_59;

public class RatInDeadMaze {
	
	public static void print(int sr,int sc,int er,int ec, String s,int maze[][],boolean[][] isVisited) {
		if(sr<0||sc<0) {
			return ;
		}
		if(sr<er||sc<ec) {
			return;
		}
		if(sr==er && sc==ec) {
			System.out.println(s);
			return;
		}
		if(maze[sr][sc]==0) return;
		if(isVisited[sr][sc]==true) return;
		isVisited[sr][sc]=true;
		print(sr, sc, er, ec, s+"R", maze, isVisited);
		print(sr, sc, er, ec, s+"D", maze, isVisited);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int rows = 3;
		int cols = 4;
		int maze[][] = {{1,0,1,1},
				{1,1,1,1},{1,1,0,1}};
		boolean[][] isVisited = new boolean[rows][cols];
		print(0,0,rows-1,cols-1,"",maze, isVisited);
	}
	
	

}
