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

public class SingleNumberII {

	public static void main(String[] args) {
		System.out.println(logic());
	}

	public static int logic() {

		int[] nums = {0,1,0,1,0,1,99};
		
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
		}
		
		for(int i : mp.keySet()) {
			if(mp.get(i)==1) {
				return i;
			}
		}
		return 0;
		

	}

}