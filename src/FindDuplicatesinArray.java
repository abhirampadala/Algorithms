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

public class FindDuplicatesinArray {

	public static void main(String[] args) {
		System.out.println(logic());
	}

	public static int logic() {

		int[] nums = {1,1,3,4,2};
		 int sol = 0;
	        int n = nums.length;
	        int num = n*(n+1)/2;
	        for(int i=0;i<nums.length;i++){
	            sol = sol+nums[i];
	        }
	        
	        return num-sol-1;

	}

}