import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.tuple.Triple;

public class DungeonGame {

	public static void main(String[] args) {
		System.out.println(logic());
	}

	public static int logic() {

		int[][] dungeon = {{0,0,0},{1,1,-1}};
		
		int m = dungeon.length;
		int n = dungeon[0].length;
		
		int[][] dp = new int[m][n];
		
		
		dp[m-1][n-1] = Math.max((1-dungeon[m-1][n-1]),1);
		
		for(int i=n-2;i>=0;i--) {
			dp[m-1][i] = Math.max((dp[m-1][i+1]-dungeon[m-1][i]), 1);
		}
		
		for(int i=m-2;i>=0;i--) {
			dp[i][n-1] = Math.max((dp[i+1][n-1]-dungeon[i][n-1]), 1);
		}
		
		for(int i=m-2;i>=0;i--) {
			for(int j=n-2;j>=0;j--) {
				int right = Math.max((dp[i][j+1]-dungeon[i][j]), 1);
				int down = Math.max((dp[i+1][j]-dungeon[i][j]), 1);
				dp[i][j] = Math.min(right, down);
			}
		}
		
		
		return dp[0][0];
		

	}

}