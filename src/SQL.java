import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SQL {
	
public static void main(String[] args){
		
			
			int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
			int freshOrangeCount = 0;
			
			Queue<int[]> queue = new LinkedList<int[]>();
			
			for(int row=0;row<grid.length;row++) {
				for(int col=0; col<grid[row].length;col++) {
					if(grid[row][col] == 2) {
						queue.offer(new int[]{row,col});
						}
					else if(grid[row][col]==1) {
						freshOrangeCount++;
					}
				}
			}
			if(freshOrangeCount == 0) System.out.println(0);
			
			int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
			int elapsedtime = 0;
			while(!queue.isEmpty()) {
				elapsedtime++;
				int size = queue.size();
				for(int index=0;index< size;index++) {
					int[] point = queue.poll();
					for(int[] dir: dirs) {
						int x = point[0]+dir[0];
						int y = point[1]+dir[1];
						if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]==2 || grid[x][y]==0)
							continue;
						grid[x][y] = 2;
						freshOrangeCount--;
						queue.offer(new int[]{x,y});
					}
				}
					
				
			}
			if(freshOrangeCount==0) {
				System.out.println(elapsedtime);
			}
			else {
				
				
				
			}
			
}

}
