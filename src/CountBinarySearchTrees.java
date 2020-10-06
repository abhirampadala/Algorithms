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

public class CountBinarySearchTrees {

	public static void main(String[] args) {
		System.out.println(logic());
	}

	public static int logic() {

		int n = 3;
		
		 int[] dp = new int[n+1];
		    dp[0] = 1;
		    for (int i = 1; i <= n; i++) {
		        for (int j = 0; j < i; j++) {
		            dp[i] += dp[j] * dp[i-j-1];
		        }
		    }
		    return dp[n];

	}

}