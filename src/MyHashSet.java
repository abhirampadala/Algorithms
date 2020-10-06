import java.awt.List;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class MyHashSet {
	private int numbuckets = 7;
	LinkedList<Integer>[] buckets;
	
	private int hashfunc(int key) {
		return key % numbuckets;
	}
	Hashtable<K, V>
	
	 public MyHashSet() {
	        buckets = new LinkedList[numbuckets];
	    }
	    
	    public void add(int key) {
	        int i = hashfunc(key);
	        if(buckets[i] == null) {
	        	buckets[i] = new LinkedList<>();
	        }
	        
	        if(buckets[i].indexOf(key) == -1) {
	        	buckets[i].add(key);
	        }
	    }
	    
	    public void remove(int key) {
	    	 int i = hashfunc(key);
		        if(buckets[i] == null) {
		        	return;
		        }
		        if(buckets[i].indexOf(key) != -1) {
		        	buckets[i].remove(buckets[i].indexOf(key));
		        }
	    }
	    
	    /** Returns true if this set contains the specified element */
	    public boolean contains(int key) {
	    	int i = hashfunc(key);
	    	 if(buckets[i] == null || buckets[i].indexOf(key) == -1) {
	    		 return false;
	    	 }
	    	 
	    	 return true;
	        
	    }
}
